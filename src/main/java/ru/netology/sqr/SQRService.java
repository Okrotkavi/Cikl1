package ru.netology.sqr;

public class SQRService {
    public int squareOfNumbers(int lowlimit, int highlimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowlimit && i * i <= highlimit) ;
           count = count++;
        }

        System.out.println("Количество чисел");
        return count++;
    }
}
