package qa.box;

import java.util.Scanner;

public class Equation {

    private double a;
    private double b;
    private double c;
    private double D;

    private int n;

    public Equation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

        double D=b*b-4*a*c;
        if (D>0){
            n=2;
        } else {
            if (D==0){
                n=1;
            } else n=0;
        }
    }
    public int rootNumber(){
        return n;
    }

    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int a,b,c,n;
        double D;
        a=num.nextInt();
        b=num.nextInt();
        c=num.nextInt();
        D=b*b-4*a*c;
        if(D>0) { n = 2; }
        else{
            if (D==0){
                n=1; }
            else n=0;
        }
        System.out.println("Дискрименант равен = "+D);
        System.out.println(n+" решений ");
    }
}
