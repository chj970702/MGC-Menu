package HW1;
import java.util.Scanner;

public class OrderCancel {
    public static void run() throws InterruptedException {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.print("1. 확인");
        System.out.println("      2. 취소");
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.print("입력: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                Basket.basketList.clear();
                // Order.waitNum -= 1;
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("진행하던 주문이 취소되었습니다.");
                String [] a = new String[]{};
                Main.main(a);
                break;
            case 2:
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("주문을 취소하지 않습니다.");
                System.out.println("----------------------------------------------------------------------------------------------");
                String [] b = new String[]{};
                Main.main(b);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                OrderCancel.run();
                break;
        }
    }
}
