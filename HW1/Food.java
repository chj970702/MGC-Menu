package HW1;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Food extends Menu {

    Food(String name, String desc, int price, int num) {
        super(name, desc, price, num);
    }

    public void addDesc(Food food) {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(food.name + " | " + food.price + " | " + food.desc);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.print("1. 확인");
        System.out.println("      2. 취소");
        System.out.println("----------------------------------------------------------------------------------------------");

    }

    public void add(Food food) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                Basket.basketList.add(food);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(food.name + "가 장바구니에 추가되었습니다.");
                System.out.println("----------------------------------------------------------------------------------------------");
                String [] a = new String[]{};
                Main.main(a);
                break;
            case 2:
                System.out.println("취소되었습니다.");
                Food.run();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                add(food);
                break;
        }
    }

    public static void run() throws InterruptedException {
        List <Food> foodList = Arrays.asList(
                new Food("미트파이", "풍미 가득한 치즈와 바비큐 소스로 맛을 낸 파이", 3000, 1),
                new Food("버터소금빵", "고소한 프랑스산 프레지덩 버터를 넣어 부드럽게 즐길 수 있는 베이커리", 2500, 1),
                new Food("크루아상", "바삭하고 부드러운 식감에 고소한 버터향을 담은 베이커리", 2000, 1)
        );

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Food 메뉴를 보고 상품을 골라 입력해주세요");
        System.out.println();
        System.out.println("[Food Menu]");
        System.out.println("1. 미트파이    | 3000 | 풍미 가득한 치즈와 바비큐 소스로 맛을 낸 파이");
        System.out.println("2. 버터소금빵  | 2500 | 고소한 프랑스산 프레지덩 버터를 넣어 부드럽게 즐길 수 있는 베이커리");
        System.out.println("3. 크루아상    | 2000 | 바삭하고 부드러운 식감에 고소한 버터향을 담은 베이커리");
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
                Food food = foodList.get(0);
                food.addDesc(food);
                food.add(food);
                break;
            case 2:
                Food food2 = foodList.get(1);
                food2.addDesc(food2);
                food2.add(food2);
                break;
            case 3:
                Food food3 = foodList.get(2);
                food3.addDesc(food3);
                food3.add(food3);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                Food.run();
                break;
        }

    }
}
