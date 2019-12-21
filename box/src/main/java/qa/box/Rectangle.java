package qa.box;

public class Rectangle {
    public double x1;
    public double x2;

    public Rectangle (double x1 ,double x2) {
        this.x1=x1;
        this.x2=x2;
    }

    public  double second_function() {
        return  this.x1*this.x2;
    }
}
