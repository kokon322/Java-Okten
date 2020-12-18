package homeWork8;

public class MyException extends Exception{
    private String message;
    private String veryDetailMessage;

    public MyException(String message, String veryDetailMessage) {
        this.message = message;
        this.veryDetailMessage = veryDetailMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getVeryDetailMessage() {
        return veryDetailMessage;
    }
}
