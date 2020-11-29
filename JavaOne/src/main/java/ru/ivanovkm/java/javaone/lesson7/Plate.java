package ru.ivanovkm.java.javaone.lesson7;
import java.util.Scanner;

public class Plate {

    public static Scanner sc = new Scanner(System.in);
    private int food;

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }
//6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
    void increaseFood() {

        System.out.println("Сколько еды добавить еще в миску?");
        food +=sc.nextInt();
        System.out.println("В миске: "+this.food+" еды");
    }
//2.Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    boolean checkFood(int n) {
        return (food - n) < 0;
    }

    int getFood() {
        return food;
    }
}