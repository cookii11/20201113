import java.util.Scanner;

public class Japangi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int money, price, change, now = 0;
        int coffee = 1200;
        int cola = 1500;
        int cider = 1100;

        System.out.println("현재투입금액: " + now + "원입니다.");
        System.out.println("금액을 투입하세요.");
        money = sc.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("1.커피(1200원) 2.콜라(1500원) 3.사이다(1100원)");
        System.out.println("------------------------------------------");
        price = sc.nextInt();

        if(price == 1 && money > coffee) {
            change = money - coffee;
        }
        else if(price == 2 && money > cola) {
            change = money - cola;
        }
        else if(price == 3 && money > cider) {
            change = money - cider;
        }    else {
                change = money;
                System.out.println("투입금액이 모자랍니다.");
            }
        System.out.println("거스름돈은 " + change + "원입니다.");
        }
    }
