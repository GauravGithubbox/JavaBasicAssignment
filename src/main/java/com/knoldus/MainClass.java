package com.knoldus;



public class MainClass {

    public static void main(String[] args) {


        System.out.println("-----------------Condtion-1-------------------");

        StudentsWithNoSubjects object = new StudentsWithNoSubjects();
        System.out.println(object.Condition());



        System.out.println("-----------------Condtion-2-------------------");

        StudentsWithparticulartRoomId object1 = new StudentsWithparticulartRoomId();

        System.out.println(object1.Condition2());






        System.out.println("-----------------Condtion-3-------------------");

        HasStudent object2 = new HasStudent();
        object2.Condition3();


    }

}


