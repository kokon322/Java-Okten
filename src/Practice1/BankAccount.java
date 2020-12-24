package Practice1;

public class BankAccount {
    private int amountOfMoney;

    public BankAccount(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public int withdrawMoney(int amountToWithDraw) {
        return this.amountOfMoney -= amountToWithDraw;
    }
}
