package ru.ivanovkm.java.javaone.lesson5;

//5.1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Person {
    protected String name;
    protected String position;
    protected String email;
    protected long phoneNumber;
    protected double salary;
    protected int age;

//5.2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Person (String name,String position,String email, long phoneNumber, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
//5.3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info(){
        String personInfoValue = "Домашнее задание к уроку №5\n5.3\nВариант 1:\nФИО: "+Person.this.name+"\nДолжность: "+Person.this.position+"\nE-mail: "+Person.this.email+"\nТелефон: "+Person.this.phoneNumber+"\nЗарплата: "+Person.this.salary+"\nВозраст: "+Person.this.age;
        System.out.println(personInfoValue);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

