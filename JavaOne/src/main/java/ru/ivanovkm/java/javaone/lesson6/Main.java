package ru.ivanovkm.java.javaone.lesson6;


public class Main {
    public static void main(String[] args) {

//6.1. Создать классы Собака и Кот с наследованием от класса Животное.
/*6.2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 */
        System.out.println("\nДомашнее задание к уроку №6\n6.1 - 6.3");
        Cat runingCat = new Cat("Myrsik", 210);
        Dog runingDog = new Dog ("Sharik", 510);
        Cat swimingCat = new Cat("Vaska", 5);
        Dog swimingDog = new Dog ("Reks", 11);
        runingCat.toRun();
        runingDog.toRun();
        swimingCat.toSwim();
        swimingDog.toSwim();

//6.4.* Добавить подсчет созданных котов, собак и животных.
        System.out.println("\n6.4\nКоличество животных: "+ Animal.getCountAnimals()+" шт.");
        System.out.println("Количество собак: "+Dog.getCounter()+" шт.");
        System.out.println("Количество кошек: "+Cat.getCounter()+" шт.");
    }
}
