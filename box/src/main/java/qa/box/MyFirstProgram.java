package qa.box;

public class MyFirstProgram {
    public static void main(String[] args) {
        first_function("мир");
        first_function("мир1");
        first_function("мир2");

        Squer v = new Squer(5);
        System.out.println("Пллощадь квадрата со стороной "+v.x+" равна "+v.second_function());

        Rectangle v1=new Rectangle(15,13);
        System.out.println("Пллощадь прямоугольника со сторонами "+v1.x1+v1.x2+" равна "+v1.second_function());

    }

    public  static void first_function(String  tekst) {
        System.out.println("Привет "+tekst);
    }


}

