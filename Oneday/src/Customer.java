public class Customer { //손님클래스

    private int stress; //스트레스수치
    private int time; //버는 돈
    private int type; //손님타입

    public Customer(int stress, int time) {
        this.stress = stress;
        this.time = time;
    }

    public int getStress() {
    return this.stress;
    }
    public int getTime() {
    return this.time;
    }
    public int getType() {
        if(this.stress > 25) { //스트레스수치 50이상일 시 타입1 아니면 타입2
            this.type = 1;
        } else {
            this.type = 2;
        }
        return this.type;
    }


}
