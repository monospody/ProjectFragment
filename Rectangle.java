package sk.itsovy.podhajecka.ProjectFragment;

public class Rectangle {
    private int a;
    private int b;
    private char character;
    private boolean fill;

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
        character='#';
        fill= false;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setCharacter(char character) {
        this.character = character;
    }
    public void setFill(boolean fill) {
        this.fill= fill;
    }
    public int calcArea(){ //obsah
    return a*b;
    }
    public int calculatePerimeter(){ //obvod
    return 2*(a+b);
    }
    public double calcDiagonal(){ //diagonala
    return Math.sqrt(a*a+b*b);

    }
    public void showRectangle(){
        System.out.println(" ");
            for (int rows = 1; rows <= b; rows++) {
                for (int spaces = 1; spaces <= a; spaces++) {
                    if (rows == 1 || rows == b || spaces == 1 || spaces == a) {
                       System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        System.out.println(" ");
        if(fill){
            for (int rows = 1; rows <= b; rows++) {
                for (int spaces = 1; spaces <= a; spaces++) {
                    System.out.print(character);
                }
                System.out.println(" ");
            }
        }
    }

    public void print(){
        System.out.println(toString());
    }

@Override
    public String toString() {
        return "First part is: "+a+" Second part is: "+b;
    }





}
