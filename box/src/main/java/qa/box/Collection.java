package qa.box;

import java.util.Arrays;
import java.util.List;

public class Collection {
    public  static void main(String[] args){
        String[] mass={"asdas", "asdas","asd"};

        List<String> MASS= Arrays.asList(mass);
        for (String L: MASS){
            System.out.println("тест " +L);
        }
    }
}
