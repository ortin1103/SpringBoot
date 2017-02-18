package my.com;


public class TwoWorldException extends Exception {

    String otvet;

    public String getOtvet() {
        return getMessage()+otvet;
    }


    public TwoWorldException(String message, String otvet) {
        super(message);
        this.otvet=otvet;

    }
}
