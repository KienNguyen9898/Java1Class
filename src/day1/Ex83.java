package day1;

import java.util.Scanner;

public class Ex83 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("nhap so thuc a, b: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        in.close();
        if (a * b > 0){
            System.out.println("Hai so cung dau");
        }
        else System.out.println("Hai so khac dau");
    }
}
