public class Meal { //식사클래스

    private int money; //쓰는 돈
    private int stress; //스트레스 수치

    public Meal(int money, int stress) {
        this.money = money;
        this.stress = stress;
    }

    public int getMoney() {
        return money;
    }
    public int getStress() {
        return stress;
    }

}
