import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Операции на BankAccount");
        BankAccount bankAccount = new BankAccount();
        System.out.println("Баланс = " + bankAccount.getAmountMoney());
        bankAccount.depositMoney(10000);
        System.out.println("На счет внесли: 10000 \nБаланс счета сейчас: " + bankAccount.getAmountMoney());
        bankAccount.withdrawMoney(5000);

        System.out.println("Операции на CardAccount");
        CardAccount cardAccount = new CardAccount();
        System.out.println("Баланс = " + cardAccount.getAmountMoney());
        cardAccount.depositMoney(10000);
        System.out.println("На счет внесли: 10000 \nБаланс счета сейчас: " + cardAccount.getAmountMoney());
        cardAccount.withdrawMoney(5000);

        System.out.println("Операции на DepositChekingAccount");
        DepositCheckingAccount depositCheckingAccount = new DepositCheckingAccount();
        System.out.println("Баланс = " + depositCheckingAccount.getAmountMoney());
        depositCheckingAccount.depositMoney(10000);
        System.out.println("На счет внесли: 10000 \nБаланс счета сейчас: " + depositCheckingAccount.getAmountMoney());

        Calendar dateDeposit = new GregorianCalendar();
        boolean can = depositCheckingAccount.canWithDraw(dateDeposit);
        System.out.println("Попытка сразу снять деньги: ");
        depositCheckingAccount.withdrawMoney(5000, can);
        dateDeposit.add(Calendar.MONTH, -2);
        can = depositCheckingAccount.canWithDraw(dateDeposit);
        System.out.println("Прошел месяц:");
        depositCheckingAccount.withdrawMoney(5000, can);

        System.out.println("Переводим деньги на другой счет: ");
        BankAccount bankAccount1 = new BankAccount();

        System.out.println(bankAccount.send(bankAccount1, 10000));
        System.out.println(bankAccount.getAmountMoney());
        System.out.println(bankAccount1.getAmountMoney());

    }
}
