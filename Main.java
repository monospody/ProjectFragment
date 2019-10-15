package sk.itsovy.podhajecka.ProjectFragment;

public class Main {

    public static void main(String[] args){

    Fragment f1=new Fragment(8,3);
    Fragment f2=new Fragment(40,25);



    Fragment f4=f2.copy();
    Fragment f5=new Fragment(f1);

    System.out.println(f1.toString());
    f1.changeToBasicShape();

    System.out.println(f1.toString());
    f1.opposite();











        }








    }

