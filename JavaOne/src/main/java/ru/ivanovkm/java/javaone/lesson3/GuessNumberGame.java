package ru.ivanovkm.java.javaone.lesson3;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    //Метод конеца игры
    public static void gameOver (){
        System.out.println("Game Over!");
    }

    //Метод перезапуска игры
    public static void refreshGame (int oneOrZero){
        if(oneOrZero==1){
            startGame();
        }else gameOver();
    }

    //Метод игры
    private static void startGame() {
        int attemptValue=0;
        //Генерируем случайное целое число из диапазона от 0 до 9
        Random randomNumber = new Random();
        int a = randomNumber.nextInt(9);
        Scanner scnNum=new Scanner(System.in);
        System.out.println("Введите число от 0 до 9");
        Scanner scnPlayOrEndGame=new Scanner(System.in);
        //Логика угадывания числа
        do{
                int b=scnNum.nextInt();
                if(b<0 || b>9){
                    System.out.println("Вы ввели недопустимое число");
                    System.out.println("Повторите ввод");
                }
                else{
                    if(b==a){
                        System.out.println("Вы угадали число!");
                        attemptValue=3;
                    }
                    else{
                        ++attemptValue;
                        if(b<a)System.out.println("Число больше");
                        else System.out.println("Число меньше");
                    }
                }
            }
            while(attemptValue <3);

        System.out.println("Загаданное число: " + a);
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        refreshGame(Integer.parseInt(scnPlayOrEndGame.nextLine()));
    }

    public static void main(String[] args) {
        refreshGame(1);
    }
}
