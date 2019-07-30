package com.kraska;

public class Main {

    public static void main(String[] args) {
      Calculator calculator = new Calculator();
        calculator.secondNumber = 200;
        calculator.firstNumber = 100;
        System.out.println(calculator.adding());
    }
}
