import java.util.Calendar;
import java.util.GregorianCalendar;
public class DepositCheckingAccount extends BankAccount {

    private double amountMoney = 5000;

    public double getAmountMoney() {
        return amountMoney;
    }

    void depositMoney(double amountMoneyToDeposit) {
        amountMoney = amountMoney + amountMoneyToDeposit;
    }

    void withdrawMoney(double amountMoneyWithDraw, boolean can) {

        if (can) {
            if (amountMoney >= amountMoneyWithDraw) {
                amountMoney = amountMoney - amountMoneyWithDraw;
                System.out.println("Вы сняли: " + amountMoneyWithDraw);
            } else {
                System.out.println("Недостадочно средств на счете");
            }
        } else {
            System.out.println("Должно пройти больше месяца с момента пополнения депозита чтобы можно было снять деньги");
        }
    }

    boolean canWithDraw(Calendar dateDeposit) {
        boolean can = false;
        Calendar dateWithDraw = new GregorianCalendar();
        dateDeposit.add(Calendar.MONTH, 1);
        if (dateWithDraw.after(dateDeposit)) {
            can = true;
        }
        return can;
    }

}
