package task_2.models;

public class Contract extends Booking {
    private int contractCode;
    private int moneyPaid;
    private int totalMoney;

    public Contract() {
    }

    public Contract(int contractCode, int moneyPaid, int totalMoney) {
        this.contractCode = contractCode;
        this.moneyPaid = moneyPaid;
        this.totalMoney = totalMoney;
    }

    public Contract(int bookingCode, int customerCode, int contractCode, int moneyPaid, int totalMoney) {
        super(bookingCode, customerCode);
        this.contractCode = contractCode;
        this.moneyPaid = moneyPaid;
        this.totalMoney = totalMoney;
    }

    public int getContractCode() {
        return contractCode;
    }

    public void setContractCode(int contractCode) {
        this.contractCode = contractCode;
    }

    public int getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(int moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractCode=" + contractCode +
                ", moneyPaid=" + moneyPaid +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
