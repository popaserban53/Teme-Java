public class CallHistoryList {
    private String number;

    public CallHistoryList(String number) {
        this.number = number;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override

    public String toString() {
        return "CallHistoryList{" + "number='" + number + '\'' + '}';
    }
}
