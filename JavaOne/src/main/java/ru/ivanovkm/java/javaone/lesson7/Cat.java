package ru.ivanovkm.java.javaone.lesson7;

class Cat {

    private final String NAME;
    private final int APPETITE;
//3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
    private boolean satiety;

    Cat(String name, int appetite) {
        this.NAME = name;
        this.APPETITE = appetite;
        this.satiety=false;
    }

    void eat(Plate p) {
        p.decreaseFood(APPETITE);
        setSatiety();
    }

    String getName() {
        return NAME;
    }

    int getAppetite() {
        return APPETITE;
    }

    boolean getSatiety() {
        return !satiety;
    }

    void setSatiety() {
        this.satiety = true;
    }
}