package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // x - влево(вправо)
        // y - вверх(вниз)
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите a1: ");
        int a1 = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите a2: ");
        int a2 = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите a3: ");
        int a3 = in3.nextInt();

        Scanner in4 = new Scanner(System.in);
        System.out.print("Введите a4: ");
        int a4 = in4.nextInt();

        Scanner in5 = new Scanner(System.in);
        System.out.print("Введите b1: ");
        int b1 = in5.nextInt();

        Scanner in6 = new Scanner(System.in);
        System.out.print("Введите b2: ");
        int b2 = in6.nextInt();

        Scanner in7 = new Scanner(System.in);
        System.out.print("Введите b3: ");
        int b3 = in7.nextInt();

        Scanner in8 = new Scanner(System.in);
        System.out.print("Введите b4: ");
        int b4 = in8.nextInt();

        int[] mas1 = { a1, a2, a3, a4 };
        int[] mas2 = { b1, b2, b3, b4 };

        if
        ((mas2[0]>mas1[0] && mas2[0]<mas1[3]) ||
                (mas2[0]<mas1[0] && mas1[0]<mas2[3]) &&
                        (mas2[1]<mas1[1] && mas2[1]>mas1[4] ||
                                mas1[1]<mas2[1] && mas1[1]>mas2[4]))
        {
            System.out.println("пересекаються");
        }
        else
        {
            System.out.println("не пересекаються");
        }
    }
}