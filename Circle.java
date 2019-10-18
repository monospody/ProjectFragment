package sk.itsovy.podhajecka.ProjectFragment;

public class Circle {
    private int r;

    public Circle(int r){
        this.r=r;
    }
    public int getR() {
        return r;
    }

    public double calcArea(){ //obsah
        return Math.PI*(r*r);
    }
    public double calculatePerimeter(){ //obvod
        return 2*(Math.PI*r);
    }

    public void print(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Area is: "+calcArea()+" Perimeter is: "+calculatePerimeter();
    }



}
