package HW1;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    static int waitNum = 0;

    public static void run() throws InterruptedException {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println();
        System.out.println("[Orders]");

        // 주문 갯수 기능
        for (int i = 0; i < Basket.basketList.size(); i++) {
            String check = Basket.basketList.get(i).name;
            for (int j = i+1; j < Basket.basketList.size(); j++) {
                if (check.equals(Basket.basketList.get(j).name)) {
                    Basket.basketList.remove(j);
                    Basket.basketList.get(i).num += 1;
                }
            }
        }
        
        //장바구니 리스트 정렬 출력
        for (Menu m : Basket.basketList) {
            int len = m.name.length();
            int temp = 15;
            int tempLen = temp - len * 2;
            System.out.print(m.name);
            for (int i = 0; i < tempLen; i++) {
                System.out.print(" ");
            }
            System.out.print(" | " + m.price);
            System.out.print(" | " + m.num);
            System.out.print("개 | " + m.desc);
            System.out.println();
        }
        System.out.println();
        System.out.println("[total]");
        int sum = 0;
        for (Menu m : Basket.basketList) {
            sum += m.price * m.num;
        }
        System.out.println(sum);
        System.out.println();
        System.out.print("1. 주문");
        System.out.println("      2. 메뉴판");
        System.out.println("----------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                // 장바구니가 비어있는 상황 처리
                if (!Basket.basketList.isEmpty()) {
                    Order.waitNum += 1;
                    OrderDone.run();
                }
                else {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("장바구니가 비었습니다.");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    String [] a = new String[]{};
                    Main.main(a);
                }
                break;
            case 2:
                System.out.println("----------------------------------------------------------------------------------------------");
                String [] a = new String[]{};
                Main.main(a);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                Order.run();
                break;
        }
    }
}
