package ru.ivanovkm.java.javaone.lesson6;
//6.1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal {
   private static int counter = 0;
   public Cat(String name, int barrierLength) {
      super(name, barrierLength);
      counter++;
   }

//6.3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
   @Override
   void toRun(){
      if (barrierLength>200){
         System.out.println(name+" устал(-а) и больше не может бежать");
      }else{
         super.toRun();
      }
   }
   @Override
   void toSwim(){
         System.out.println(name+" не умеет плавать!");
   }

//6.4.* Добавить подсчет созданных котов.
   public static int getCounter() {
      return counter;
   }
}
