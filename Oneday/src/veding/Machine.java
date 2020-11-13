package veding;

import veding.Display;
import veding.Drink;
import veding.Money;

import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Money money = new Money();
        Drink drink = new Drink();
        Display display = new Display();

        display.intro();

        while(true) {
            display.showNowMoney(money.getNowMoney());
            display.showMainMenu();

            switch (sc.nextInt()) {
                case 1:
                    money.insertMoney();
                    break;
                case 2:
                    display.showDrinkMenu();

                    int price = drink.getPrice(sc.nextInt());
                    if (price == -1) {
                        display.showError();
                        continue;
                    }

                    if (money.decreaseMoney(price)) {
                        display.showComplete();
                        display.showBye(money.getNowMoney());
                    } else {
                        display.showNotEnoughMoney();
                        continue;
                    }
                    return;
                case 3:
                    display.showBye(money.getNowMoney());
                    return;
                default:
                    display.showError();
                    continue;
            }
        }
    }
}
