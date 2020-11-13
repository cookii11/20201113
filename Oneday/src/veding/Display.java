package veding;

public class Display {
    public void intro() {
        System.out.println("정민욱의 자판기 입니다.");
        System.out.println("비싸게 조금 팔아 부자 되겠습니다~");
        System.out.println("자판기의 음료는 매우 비싸니 부자들만 이용해 주세요.");
    }

    public void showNowMoney(int nowMoney) {
        System.out.println("현재 투입금액 : " + nowMoney);
    }

    public void showMainMenu() {
        System.out.println("1.돈투입   2.음료선택   3.종료");
        System.out.println("메뉴 선택 : ");
    }

    public void showDrinkMenu() {
        System.out.println("1.커피(1,200원)  2.콜라 (1,500원)  3.사이다(1,100원)");
        System.out.println("메뉴 선택 : ");
    }

    public void showNotEnoughMoney() {
        System.out.println("투입금액이 모자랍니다.");
    }

    public void showError() {
        System.out.println("잘못 입력하였습니다.");
    }

    public void showComplete() {
        System.out.println("맛나게 드세요.");
    }

    public void showBye(int rest) {
        System.out.println("거스름돈은 " + rest + "원입니다. 꼭 가져가세요.");
        System.out.println("이용해 주셔서 감사합니다.");
    }
}
