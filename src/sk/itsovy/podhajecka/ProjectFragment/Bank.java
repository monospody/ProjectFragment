package sk.itsovy.podhajecka.ProjectFragment;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }
    public double convert(double amount, String code) {

        switch(code){
            case "TRY":
                return amount*6.44;
            case "HUF":
                return amount*330.62;
            case "CHF":
                return amount*1.09;
            case "HRK":
                return amount*7.44;
            case "GBP":
                return amount*0.86;
            default:
                return -1;
        }
    }
    public static double loan (double value, double interest, int months){
        if (value <=0 || interest <=0 || months <=0) {
            return -1;
        }else {
           return (((value / 100) * interest) + value) / months;
        }
    }
}
