package org.example;

public class JavaConstructor {
    int a;

    //no arg constructor
    public JavaConstructor(){
        a=10;
    }
    // parameterized constructor

    public JavaConstructor(int a){
        this.a=a;
    }

    public void printa(){
        System.out.println(a);
    }
}
