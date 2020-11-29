package ru.ivanovkm.java.javaone.lesson7;

public class MainClass {
//1.Расширить задачу про котов и тарелки с едой
    public static void main(String[] args) {
//5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Марсик", 200);
        cats[1] = new Cat("Мурка", 200);
        cats[2] = new Cat("Васька", 4000);
        Plate plate = new Plate(100);
        System.out.println("К миске пришло три кота: " + cats[0].getName() + ", " + cats[1].getName() + " и " + cats[2].getName());
        System.out.println("В миске " + plate.getFood() + " еды. Если коты голодны и еды хватает они будут есть\n");

        do {
            for (Cat i : cats) {
    //если кот голоден
                if (i.getSatiety()) {
//4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
    //если в миске не хватает еды, она будет добавлена
                    if (plate.checkFood(i.getAppetite())) {
                        do {
                            plate.increaseFood();
                        }while ((plate.checkFood(i.getAppetite())));
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " еды ");
                }
            }
            System.out.println("\nВ миске осталось " + plate.getFood() + " еды.\n");

        } while (cats[0].getSatiety() & cats[1].getSatiety() & cats[2].getSatiety());
    }
}