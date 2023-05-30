package HW1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println();
        System.out.println("                                     MEGA MGC COFFEE");
        System.out.println("메인 메뉴판");
        System.out.println("-----------------------------------------MENU------------------------------------------------");
        System.out.println("1. DRINK MENU   | 행복을 선사하는 다양한 음료");
        System.out.println("2. FOOD MENU    | 음료와 어울리는 다양한 디저트");
        System.out.println("3. PRODUCT MENU | MEGA DAILY GOODS");
        System.out.println();
        System.out.println("-----------------------------------------ORDER------------------------------------------------");
        System.out.println("4. Order    | 장바구니 확인 후 주문합니다.");
        System.out.println("5. Cancel   | 진행중인 주문을 취소합니다.");
        System.out.println("----------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int opt = sc.nextInt();
        switch(opt) {
            case 0:
                // 총 판매 금액 + 목록 확인
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("[총 판매 현황]");
                System.out.println("현재까지 총 판매된 금액은 [" + OrderDone.allPay + "] 입니다.");
                System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
                System.out.println();
                for (Menu m : OrderDone.sellList) {
                    int len = m.name.length();
                    int temp = 15;
                    int tempLen = temp - len * 2;
                    System.out.print(m.name);
                    for (int i = 0; i < tempLen; i++) {
                        System.out.print(" ");
                    }
                    System.out.print(" | " + m.price);
                    System.out.println();
                }
                System.out.println();
                System.out.println("1. 돌아가기");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.print("입력: ");
                int opt2 = sc.nextInt();
                switch (opt2) {
                    case 1:
                        Main.main(args);
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                Drink.run();
                break;
            case 2:
                Food.run();
                break;
            case 3:
                Product.run();
                break;
            case 4:
                Order.run();
                break;
            case 5:
                OrderCancel.run();
                break;
            default:
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("0~5번 중에 선택하세요.");
                Main.main(args);
                break;
        }
    }
}
