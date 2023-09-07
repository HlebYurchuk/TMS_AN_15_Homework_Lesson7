package com.teachmeskills.homework7;

public class Runner {
    public static void main(String[] args) {
        Phone phone1 = new Phone("3754412345678", "xiaomi", 0.5);
        Phone phone2 = new Phone("123123123", "Samsung");
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.reciveCall("Денис");
        System.out.println(phone1.GetNumber());
        phone2.reciveCall("Пётр");
        System.out.println(phone2.GetNumber());
        phone3.reciveCall("Вася");
        System.out.println(phone3.GetNumber());

        phone1.reciveCall("Денис");
        phone1.reciveCall("Пётр", "48572550722");
        phone1.reciveCall("Вася", "380123456789");

        phone1.sendMessage("3754412345678");
        phone2.sendMessage("48572550722");
        phone3.sendMessage("380123456789");
    }
}
