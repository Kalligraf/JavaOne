package ru.ivanovkm.java.javaone.lesson6;
/*6.2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 */
public class Animal {
    protected String name;
    protected int barrierLength;
    private static int counter=0;

    public  Animal (String name, int barrierLength){
        this.name = name;
        this.barrierLength = barrierLength;
        counter++;
    }
    void toRun (){
        System.out.println(name+" пробежал "+barrierLength+" м.");
    }

    void toSwim (){
        System.out.println(name+" проплыл "+barrierLength+" м.");
    }
//6.4.* Добавить подсчет животных.
    public static int getCountAnimals() {
        return counter;
    }
}
