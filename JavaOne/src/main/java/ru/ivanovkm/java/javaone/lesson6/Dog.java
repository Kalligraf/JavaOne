package ru.ivanovkm.java.javaone.lesson6;
//6.1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animal {
    private static int counter = 0;
    public Dog(String name, int barrierLength) {
        super(name, barrierLength);
        counter++;
    }

//6.3.У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    @Override
    void toRun(){
        if (barrierLength>500){
            System.out.println(name+" устал(-а) и больше не может бежать");
        }else{
            super.toRun();
        }
    }
    @Override
    void toSwim(){
        if (barrierLength>10){
            System.out.println(name+" больше не может плыть!");
        }else{
            super.toSwim();
        }
    }

//6.4.* Добавить подсчет созданных собак
    public static int getCounter() {
        return counter;
    }
}
