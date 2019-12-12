package qa.box;

public class MyFirstProgram {
    public static void main(String[] args) {
        first_function("мир");
        first_function("мир1");
        first_function("мир2");

        double value=5;
        System.out.println("Пллощадь квадрата со стороной "+value+" равна "+second_function(value));

        double x1=15;
        double x2=14;
        System.out.println("Пллощадь прямоугольника со сторонами "+x1+x2+" равна "+second_function(x1,x2));

    }

    public  static void first_function(String  tekst) {
        System.out.println("Привет "+tekst);
    }
    public  static double second_function(double x) {
        return x*x;
    }
    public  static double second_function(double x1, double x2) {
        return x1 * x2;
    }
}


