public class BankAccount {

    private double amountMoney = 50000;

    public double getAmountMoney() {
        return amountMoney;
    }

     boolean send(BankAccount receiver, double amount) {
        boolean received = false;
        double checkedMinus = this.amountMoney;
        double checkedPlus = receiver.amountMoney;

        if (this.amountMoney >= amount) {
            this.amountMoney = this.amountMoney - amount;
            receiver.amountMoney = receiver.amountMoney + amount;
        }
        received = (((checkedMinus - amount) == this.amountMoney) && ((checkedPlus + amount) == receiver.amountMoney));

        return received;
    }

    void withdrawMoney(double amountMoneyWithDraw) {

        if (amountMoney >= amountMoneyWithDraw) {
            amountMoney = amountMoney - amountMoneyWithDraw;
            System.out.println("Вы сняли: " + amountMoneyWithDraw);
            System.out.println("На счете: " + amountMoney);
        } else {
            System.out.println("Недостадочно средств на счете");
            System.out.println("На счете сейчас: " + amountMoney);
        }

    }

    void depositMoney(double amountMoneyToDeposit) {
        amountMoney = amountMoney + amountMoneyToDeposit;


    }
}
