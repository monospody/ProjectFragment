package sk.itsovy.podhajecka.ProjectFragment;

public class MyMath {

    public Fragment add(Fragment a, Fragment b){

        Fragment result = new Fragment(a.getDenominator()*b.getNumerator()+b.getNumerator()*a.getDenominator(),a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment min(Fragment a, Fragment b){

        Fragment result = new Fragment(a.getNumerator()+b.getNumerator(),a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }


    public Fragment mul(Fragment a, Fragment b){ //nasobenie zlomok a zlomok

        Fragment result = new Fragment(a.getDenominator()*b.getDenominator(), a.getNumerator()*b.getNumerator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment div(Fragment a, Fragment b){

        Fragment result = new Fragment(a.getNumerator()*b.getDenominator(), a.getDenominator()*b.getNumerator());
        result.changeToBasicShape();
        return result;
    }


    public Fragment mul(int value, Fragment a){ //nasobenie cislo a zlomok == polymorfizmus

        Fragment result = new Fragment(a.getDenominator()*value, a.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment add(int value, Fragment a){
        Fragment temp = new Fragment (value, 1);
        return add(temp, a);
    }
    public MixedNumber add(MixedNumber a, MixedNumber b){
        Fragment aF = a.getFragment();
        Fragment bF = b.getFragment();
        Fragment result = add(aF, bF);
        return result.getMixedNumber();
    }
    public MixedNumber mul(MixedNumber a, MixedNumber b){
        Fragment aF = a.getFragment();
        Fragment bF = b.getFragment();
        Fragment result = mul(aF, bF);
        return result.getMixedNumber();
    }
    public MixedNumber div(MixedNumber a, MixedNumber b){
        Fragment aF = a.getFragment();
        Fragment bF = b.getFragment();
        Fragment result = div(aF, bF);
        return result.getMixedNumber();
    }
    public MixedNumber min(MixedNumber a, MixedNumber b){
        Fragment aF = a.getFragment();
        Fragment bF = b.getFragment();
        Fragment result = min(aF, bF);
        return result.getMixedNumber();
    }




//zmiesane čisla +-*/ zmiesane cislo = vyjde zmiesane



}
