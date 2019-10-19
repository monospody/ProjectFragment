package sk.itsovy.podhajecka.ProjectFragment;
public class Fragment {

    private int numerator;
    private int denominator;

    public Fragment(int numerator, int denominator) {
        if (numerator==0) {
            denominator=1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fragment(Fragment otherFragment) {
        numerator=otherFragment.getNumerator();
        denominator=otherFragment.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void changeToBasicShape() {
        int comDivisor=getLargestComDivisor();
        numerator=numerator/comDivisor;
        denominator=denominator/comDivisor;
        System.out.println(numerator+" / "+denominator);
    }
    public int extendFragment() {
        return 0;
    }

    public double getRealValue() {
        return (double) numerator/denominator;
    }

    public void reverse() {
        int temp=numerator;
        numerator=denominator;
        denominator=temp;
    }

    public void opposite() {
        numerator*=-1;
    }

    public Fragment copy() {
        Fragment newFragment=new Fragment(numerator, denominator);
        return newFragment;
    }

    private int getLargestComDivisor() {
        int absNumerator= Math.abs(numerator);
        int absDenominator= Math.abs(denominator);
        int comDivisor=absNumerator>absDenominator?absNumerator:absDenominator;
        while (numerator%comDivisor!=0 || denominator%comDivisor!=0) {
            comDivisor--;
        }
        return comDivisor;
    }

    public boolean isFragmentInBasicShape() {
        if (getLargestComDivisor()==1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return numerator+" / "+denominator;
    }


    public MixedNumber getMixedNumber(){
        int value = numerator/denominator;
        Fragment f = new Fragment(numerator/denominator, denominator);
        return new MixedNumber(value,f);

    }


}