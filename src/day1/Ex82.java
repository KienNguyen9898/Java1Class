package day1;

import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("nhập số thực a,b,c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();
        double max = a;
        if (b > max){
            max = b;
        }
        if(c > max ){
            max = c;
        }
        System.out.printf("so lon nhat la: %.1f", max);
    }
}