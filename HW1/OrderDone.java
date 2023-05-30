package HW1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class OrderDone {
    static int allPay = 0;
    static ArrayList<Menu> sellList = new ArrayList<>();
    public static void run() throws InterruptedException {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("주문이 완료되었습니다.");
        System.out.println();
        System.out.println("대기번호는 + [" + Order.waitNum + "]번 입니다.");
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
        System.out.println("----------------------------------------------------------------------------------------------");
        // 총 판매금액 현황 계산 부분
        if (!Basket.basketList.isEmpty()) {
            for (Menu m : Basket.basketList) {
                allPay += m.price * m.num;
            }
        }
        // 총 판매상품 목록 현황 부분
        if (!Basket.basketList.isEmpty()) {
            for (Menu m : Basket.basketList) {
                sellList.add(m);
            }
        }
        Basket.basketList.clear();
        TimeUnit.SECONDS.sleep(3);
        String [] a = new String[]{};
        Main.main(a);
    }
}
