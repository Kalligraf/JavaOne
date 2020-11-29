package ru.ivanovkm.java.javaone.lesson1;


public class HomeTaskOne {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        System.out.println("\n1. Создали пустой проект в IntelliJ IDEA и прописали метод main()");

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        System.out.println("\n2. Создали переменные всех пройденных типов данных, и инициализировали их значения");
        byte bt = 10;
        short sht = 100;
        int i = 10000;
        long lg = 10000000;
        float ft = 10000.777f;
        double db = 10000.777777;
        boolean bool = false;
        char ch = 't';
        String St = "Пример переменной типа String";

        System.out.println( "Целочисленные:\nbyte = "+bt+"\nshort = "+sht+"\nint = "+i+"\nlong = "+lg+
                            "\nС плавающей точкой:\nfloat = "+ft+"\ndouble = "+db+
                            "\nЛогическая:\nboolean = "+bool+
                            "\nСимвольная:\nchar = "+ch+
                            "\nСтроковая:\nString = "+St);

    /* 3. Написали метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где
     a, b, c, d – входные параметры этого метода (метод calc)
     */
        System.out.println ("\n3. a * (b + (c / d)) = "+calc(10, 10, 10, 10));  //Выбрать любые значения переменных a, b, c,

     /* 4. Написали метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до
     20(включительно), если да – вернуть true, в противном случае – false (метод checkSumm)
     */
        System.out.println("\n4. "+checkSumm(12,10)+"\n");//Выбрать любые значения переменных x, y

     /* 5. Написали метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
      положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом (метод
      positiveOrNegative)
      */
        positiveOrNegative(0);//Выбрать любое целое число

     /* 6. Написали метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
      */
        System.out.println("\n6. "+negative(-1)+" (true если отрицательное)");//Выбрать любое целое число

    /*  7. Написали метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
      */
        System.out.println("\n7. Привет, "+whatsName("Константин")+"!");

     /* 8. Написали метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
      */
        leapYear(2020);//Выбрать любой год
    }

    public static int calc(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean checkSumm(int x, int y){
        if ((x+y)>=10&(x+y)<=20){
            return true;
        }
        else {
           return false;
        }
    }

    public static void positiveOrNegative(int x){
        if (x>=0){
            System.out.println("5. x - положительное число");
        }
        else {
            System.out.println("5. x - отрицательное число");
        }
    }

    public static boolean negative(int x){
        if (x<0) {
            return true;
        }
        return false;
    }

    public static String whatsName(String name){
        return name;
    }

    public static void leapYear(int yearCount){

        if ((yearCount % 4 ==0 & yearCount % 100 !=0)|(yearCount % 400 == 0)){
            System.out.println("\n8. Високосный год");
        }
        else {
            System.out.println("\n8. Не високосный год");
        }
    }
}
