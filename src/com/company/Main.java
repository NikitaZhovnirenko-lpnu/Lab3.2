// Lab_03_3
// Жовніренко Нікіта
// Лабораторна робота No 3.3
// Розгалуження, задане графіком функції.
// Варіант 5

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    double a;
    double x;
    double b;
    double c;
    double F;

        System.out.println("Введіть значення для а: ");
        a = sc.nextDouble();

        System.out.println("Введіть значення для b: ");
        b = sc.nextDouble();

        System.out.println("Введіть значення для c: ");
        c = sc.nextDouble();

        System.out.println("Введіть значення для x: ");
        x = sc.nextDouble();


// спосіб 1: розгалуження в скороченій формі
    if (x < 0 && b != 0)
    {
        F = a - x/(10 + b);
    }

    else if (x > 0 && b == 0)
    {
        F = (x-a)/(x-c);
    }

    else
        F = 3 * x + 2 / c;

        System.out.println("1) При даних значеннях, функція набуває значення: " + F);

// спосіб 2: розгалуження в повній формі

        if(x < 0)
        {
            if (b != 0)
            {
                F = a - x/(10 + b);
            }
            else
            {
                if (x > 0)
                {
                    if (b == 0)
                    {
                        F = (x-a)/(x-c);
                    }
                }
            }

        }
        else
        {
            F = 3 * x + 2 / c;
        }
        System.out.println("2) При даних значеннях, функція набуває значення: " + F);
    }




}
