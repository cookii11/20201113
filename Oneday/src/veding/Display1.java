package veding;

public class Display1 {
    public void intro() {
        System.out.println("자판기입니다. 어서오세요.");
    }
    public void showNowMoney(int nowMoney) {
        System.out.println("현재투입금액: " + nowMoney);
    }
    public void showMainMenu() {
        System.out.println("1.돈투입 2.음료선택 3.종료");
        System.out.println("메뉴입력: ");
    }
    public void showDrinkMenu() {
        System.out.println("1.커피:1200원 2.콜라:1500원 3.사이다:1300원");
        System.out.println("메뉴입력: ");
    }
    public void showNotEnoughMoney() {
        System.out.println("금액이 모자랍니다.");
    }
    public void showError() {
        System.out.println("잘못 입력하였습니다.");
    }
    public void showComplete() {
        System.out.println("맛있게 드십시오.");
    }
    public void showBye(int rest) {
        System.out.println("거스름돈은 " + rest + "원입니다.");
        System.out.println("이용해주셔서 감사합니다.");
    }
}
