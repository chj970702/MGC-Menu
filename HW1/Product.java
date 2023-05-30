package HW1;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Product extends Menu {

    Product(String name, String desc, int price, int num) {
        super(name, desc, price, num);
    }

    public void addDesc(Product product) {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(product.name + " | " + product.price + " | " + product.desc);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.print("1. 확인");
        System.out.println("      2. 취소");
        System.out.println("----------------------------------------------------------------------------------------------");

    }

    public void add(Product product) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                Basket.basketList.add(product);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(product.name + "가 장바구니에 추가되었습니다.");
                System.out.println("----------------------------------------------------------------------------------------------");
                String [] a = new String[]{};
                Main.main(a);
                break;
            case 2:
                System.out.println("취소되었습니다.");
                String [] b = new String[]{};
                Product.run();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                add(product);
                break;
        }
    }

    public void option(Product product) {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(product.name + " | " + product.price + " | " + product.desc);
        System.out.println("위 메뉴의 어떤 옵션으로 추가하시겠습니까?");
        System.out.print("1. M" + "(" + product.price + ")");
        int newPrice = product.price + 1000;
        System.out.println("      2. L" + "(" + newPrice + ")");
        System.out.println("----------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                product.name = product.name + "(M)";
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(product.name + " | " + product.price + " | " + product.desc);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.print("1. 확인");
                System.out.println("      2. 취소");
                System.out.println("----------------------------------------------------------------------------------------------");
                break;
            case 2:
                product.name = product.name + "(L)";
                product.price = newPrice;
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(product.name + " | " + product.price + " | " + product.desc);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.print("1. 확인");
                System.out.println("      2. 취소");
                System.out.println("----------------------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                option(product);
                break;
        }
    }

    public static void run() throws InterruptedException {
        List <Product> productList = Arrays.asList(
                new Product("텀블러", "뛰어난 보온냉력으로 하루종일 그대로, MGC 데일리 텀블러", 9000,1 ),
                new Product("캐모마일", "캐모마일의 꽃향과 싱그러운 사과를 블렌딩한 캐모마일 블렌딩 티", 7000, 1),
                new Product("머그", "일상 어디서든 활용하기 좋은 메가 MGC 대용량 머그컵", 6000, 1)
        );

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Product 메뉴를 보고 상품을 골라 입력해주세요");
        System.out.println();
        System.out.println("[Product Menu]");
        System.out.println("1. 텀블러    | 9000 | 뛰어난 보온냉력으로 하루종일 그대로, MGC 데일리 텀블러");
        System.out.println("2. 캐모마일  | 7000 | 캐모마일의 꽃향과 싱그러운 사과를 블렌딩한 캐모마일 블렌딩 티");
        System.out.println("3. 머그      | 6000 | 일상 어디서든 활용하기 좋은 메가 MGC 대용량 머그컵");
        System.out.println("----------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 0:
                String [] a = new String[]{};
                Main.main(a);
                break;
            case 1:
                Product product = productList.get(0);
                product.option(product);
                product.add(product);
                break;

            case 2:
                Product product2 = productList.get(1);
                product2.addDesc(product2);
                product2.add(product2);
                break;

            case 3:
                Product product3 = productList.get(2);
                product3.option(product3);
                product3.add(product3);
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                Product.run();
                break;
        }

    }
}
