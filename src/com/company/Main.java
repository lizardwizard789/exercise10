package com.company;

public class Main {

    public static void main(String[] args) {
    Contact contact1=new Contact("email1", "name1");
        Contact contact2=new Contact("email2", "name2");
        Contact contact3 =new Contact("email3", "name3");
        Contact contact4=new Contact("email4", "name4");
        Contact[] bean= new Contact[] {contact1, contact2, contact3, contact4};
        Box collectyBox=new Box(bean);
        for (Object var: collectyBox) {
            System.out.println(var.toString());
        }

    }
}
