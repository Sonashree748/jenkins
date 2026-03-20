package org.example;

public class HelloWorld {
    public static String testMessage(){
        return "Hello From Jenkins Pipeline";
    }
    public static void main(String[] args){
        System.out.println(testMessage());
    }
}
