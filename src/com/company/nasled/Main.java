package com.company.nasled;

import com.company.generics.Account;
import com.company.interfaces.*;
import com.company.callback.*;
import com.company.Day;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
    /*
        Printable.author("Sobornov Vladimir");

        //Преобразование типов (upcast/downcast)
        Person tom = new Person("Tom");
        tom.display();

        Employee sam = new Employee("Sam", "Oracle");
        sam.display();

        //Восходящее преобразование upcast
        Person bob = new Client(3000, "Sberbank", "Bob");
        bob.display();

        //Низходящее преобразование downcast
        Object rick = new Employee("Rick", "Rosatom");
        Employee emp = (Employee) rick;

        //Ещё низходящее преобразование
        Object kate = new Client(2000, "RosEuroBank", "Kate");
        ((Person) kate).display(); //Переменная типа Object хранит ссылку на объект Client


        //Ещё пример
        Object greg = new Client(4500, "SovkomBank", "Greg");
        if (greg instanceof Employee) {
            ((Employee) greg).display();
        } else {
            ((Client) greg).display();
        }

        //Интерфейсы
        Printable classic_book = new Book("War & Peace", "Lev Tolstoy");
        classic_book.print();

        Printable journal = new Journal("Nature");
        journal.print();
        //Интерфейс не имеет метода getName(), необходимо явное приведение
        ((Journal) journal).getName();
        journal.defaultPrint();

        Calculatable c = new Calculation();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));

        Stateable pipe = new WaterPipe();
        ((WaterPipe)pipe).setState(1);
        pipe.printState();
        Stateable pipe2 = new WaterPipe();
        ((WaterPipe)pipe2).getState();

        Book.BookPrintable system = new ChangeSystem();
        system.printSystem(1);
        system.printSystem(0);

        //Интерфейсы как результат и параметры методов
        read(new Car("BMW",4,150000));
        read(new Truck ("Mazda", 15000));

        Vechicle vechicle = createVechicle("Volvo",false);
        vechicle.print(); */
    /*Button button = new Button(new ButtonClickHandler());
    button.click();
    button.click();
    button.click();*/
    /*Day current = Day.Tuesday;
    print(current);*/

        Account<Integer> acc1 = new Account<Integer>(1,30);
        System.out.println(acc1.getId());
        Integer accId = acc1.getId();
        Account<String> acc2 = new Account<String>("acc1",30);
        System.out.println(acc2.getId());

        print("String text here");
        print(454545);

    }
    public static <T> void print(T something) {
        System.out.println(something);
    }

    static Vechicle createVechicle(String name, boolean isHeavy) {
        if(!isHeavy) {
            return new Car(name,4,100000);
        } else {
            return new Truck(name, 25000);
        }
    }

    static void read(Vechicle v) {
        v.print();
    }
}


