public class CardAccount extends BankAccount {

    private double amountMoney = 10000;

    public double getAmountMoney() {
        return amountMoney;
    }

    void depositMoney(double amountMoneyToDeposit) {
        amountMoney = amountMoney + amountMoneyToDeposit;
    }

    void withdrawMoney(double amountMoneyWithDraw) {

        if (amountMoney >= amountMoneyWithDraw) {
            amountMoney = amountMoney - amountMoneyWithDraw / 100 - amountMoneyWithDraw;
            System.out.println("Вы сняли: " + amountMoneyWithDraw);
            System.out.println("На карточном счете счете: " + amountMoney);
        } else {
            System.out.println("Недостадочно средств на карточном счете счете");
            System.out.println("На счете сейчас: " + amountMoney);
        }

    }
}
