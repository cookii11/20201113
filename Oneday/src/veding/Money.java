package veding;

public class Money {
    private int nowMoney;

    public Money() {
        this.nowMoney = 0;
    }

    public void insertMoney() {
        this.nowMoney += 1000;
        System.out.println("1000원을 투입하였습니다.");
    }

    public boolean decreaseMoney(int price) {
        if (this.nowMoney < price) {
            return false;
        } else {
            this.nowMoney -= price;
            return true;
        }
    }

    public int getNowMoney() {
        return this.nowMoney;
    }

    public void setNowMoney(int nowMoney) {
        this.nowMoney = nowMoney;
    }
}
