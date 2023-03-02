package day1;

import java.util.Scanner;

public class Ex96 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print(" nhap x= ");
        int x = in.nextInt();
        in.close();
        int y;
        if(x >= 5){
            y = 2*x*x + 5*x + 9;
            System.out.printf("f(x)= %d", y);
        }
        else
            y = -2*x*x - 4*x - 9;
            System.out.printf("f(x)= %d", y);


    }
}
