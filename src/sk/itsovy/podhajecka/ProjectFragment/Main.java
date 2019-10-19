package sk.itsovy.podhajecka.ProjectFragment;

public class Main {

    public static void main(String[] args){

        Fragment f1=new Fragment(8,3);
        Fragment f2=new Fragment(40,25);

        Fragment f4=f2.copy();
        Fragment f5=new Fragment(f1);

        System.out.println(f1.toString());
        // f1.changeToBasicShape();

        System.out.println(f1.toString());
        f1.opposite();

        MixedNumber mn = new MixedNumber(3,1,3);
        System.out.println(mn.toString());
        System.out.println(mn.a());

        MyMath mr = new MyMath();
        System.out.println(mr.add(f1, f2));
        System.out.println(mr.mul(f1,f2));
        System.out.println(mr.div(f1,f2));
        //MyMath.add(f1,f2);

        System.out.println(" ");

        Rectangle re = new Rectangle(12,5);
        System.out.println(re.calcDiagonal());
        re.setFill(true);
        re.showRectangle();
        re.print();

        System.out.println(" ");

        Circle ci = new Circle (5);
        System.out.println(ci.calcArea());
        System.out.println(ci.calculatePerimeter());

        System.out.println(" ");
        ci.print();

        Bank ba = new Bank("Tatrabanka");
        System.out.println(" ");
        System.out.println(ba.convert(5,"HUF"));
        System.out.println(Bank.loan(1000,4.5,20));


    }

}

