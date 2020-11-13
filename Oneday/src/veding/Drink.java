package veding;

public class Drink {
    private int coffee;
    private int cola;
    private int cider;

    public Drink() {
        this.coffee = 1200;
        this.cola = 1500;
        this.cider = 1100;
    }

    public int getPrice(int menu) {
        int price;
        if (menu == 1) {
            price = coffee;
        } else if (menu == 2) {
            price = cola;
        } else if (menu == 3) {
            price = cider;
        } else {
            price = -1;
        }
        return price;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    public int getCider() {
        return cider;
    }

    public void setCider(int cider) {
        this.cider = cider;
    }
}
