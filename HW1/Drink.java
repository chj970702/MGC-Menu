package HW1;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Drink extends Menu {

    Drink(String name, String desc, int price, int num) {
        super(name, desc, price, num);
    }

    public void addDesc(Drink drink) {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(drink.name + " | " + drink.price + " | " + drink.desc);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.print("1. 확인");
        System.out.println("      2. 취소");
        System.out.println("----------------------------------------------------------------------------------------------");

    }

    public void add(Drink drink) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                Basket.basketList.add(drink);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(drink.name + "가 장바구니에 추가되었습니다.");
                System.out.println("----------------------------------------------------------------------------------------------");
                String [] a = new String[]{};
                Main.main(a);
                break;
            case 2:
                System.out.println("취소되었습니다.");
                Drink.run();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                add(drink);
                break;
        }
    }

    public void option(Drink drink) {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(drink.name + " | " + drink.price + " | " + drink.desc);
        System.out.println("위 메뉴의 어떤 옵션으로 추가하시겠습니까?");
        System.out.print("1. HOT" + "(" + drink.price + ")");
        int newPrice = drink.price + 500;
        System.out.println("      2. ICE" + "(" + newPrice + ")");
        System.out.println("----------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                drink.name = drink.name + "(HOT)";
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(drink.name + " | " + drink.price + " | " + drink.desc);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.print("1. 확인");
                System.out.println("      2. 취소");
                System.out.println("----------------------------------------------------------------------------------------------");
                break;
            case 2:
                drink.name = drink.name + "(ICE)";
                drink.price = newPrice;
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(drink.name + " | " + drink.price + " | " + drink.desc);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.print("1. 확인");
                System.out.println("      2. 취소");
                System.out.println("----------------------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                option(drink);
                break;
        }
    }

    public static void run() throws InterruptedException {
        List <Drink> drinkList = Arrays.asList(
                new Drink("아메리카노", "블렌드 원두로 추출한 스탠다드 커피", 2000, 1),
                new Drink("바닐라라떼", "바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 라떼", 3000, 1),
                new Drink("콜드브루", "차가운 물에 장시간 우려내 깔금한 목넘김을 느낄 수 있는 콜드브루", 3500, 1)
                );

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Drink 메뉴를 보고 상품을 골라 입력해주세요");
        System.out.println();
        System.out.println("[Drink Menu]");
        System.out.println("1. 아메리카노  | 2000 | 블렌드 원두로 추출한 스탠다드 커피");
        System.out.println("2. 바닐라라떼  | 3000 | 바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 라떼");
        System.out.println("3. 콜드브루    | 3500 | 차가운 물에 장시간 우려내 깔끔한 목넘김을 느낄 수 있는 콜드브루");
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
                Drink drink = drinkList.get(0);
                drink.option(drink);
                drink.add(drink);
                break;

            case 2:
                Drink drink2 = drinkList.get(1);
                drink2.option(drink2);
                drink2.add(drink2);
                break;

            case 3:
                Drink drink3 = drinkList.get(2);
                drink3.addDesc(drink3);
                drink3.add(drink3);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                Drink.run();
                break;
        }

    }
}
