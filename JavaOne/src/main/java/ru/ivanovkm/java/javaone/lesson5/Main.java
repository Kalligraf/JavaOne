package ru.ivanovkm.java.javaone.lesson5;

public class Main {
    public static void main(String[] args) {
        Person pers = new Person("Ivanov Ivan", "CEO", "ivanov_ii@mail.ru", 89191128211L,83670.57,44);
//5.3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        //Вариант 1
        pers.info();
        //Вариант 2
        System.out.println("\nВариант 2:\nФИО: "+pers.getName()+"\nДолжность: "+pers.getPosition()+"\nE-mail: "+ pers.getEmail()+"\nТелефон: "+ pers.phoneNumber+"\nЗарплата: "+pers.getSalary()+"\nВозраст: "+pers.getAge());
        System.out.println("\n5.5");
/*5.4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);*/
        Person [] persArray = new Person[5];
        persArray[0]=pers;
        persArray[1]= new Person("Elon Reeve Musk", "Engineer", "MuskER@mail.ru", 89235843377L, 105987.63, 49);
        persArray[2]= new Person("Steven Paul Jobs", "Industrial designer", "Jobs_SP@mail.ru", 89873010101L, 1, 56);
        persArray[3]= new Person("Mark Elliot Zuckerberg", "Programmer", "Zuckerberg_ME@mail.ru", 89563242568L, 22587.00, 36);
        persArray[4]= new Person("Pypkin Vasia", "Manager", "Pypkin_V@mail.ru", 89997777777L, 152000.77, 30);

//5.5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.6
        for (int i = 0; i <persArray.length ; i++) {
            if (persArray[i].age>40){
                System.out.println("\nФИО: "+persArray[i].name+"\nДолжность: "+persArray[i].position+"\nE-mail: "+persArray[i].email+"\nТелефон: "+persArray[i].phoneNumber+"\nЗарплата: "+persArray[i].salary+"\nВозраст: "+persArray[i].age);
            }
        }
    }
}
