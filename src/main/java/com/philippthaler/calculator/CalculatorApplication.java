package com.philippthaler.calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(CalculatorApplication.class, args);
  }

  public void run(String... args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int num1, num2;
    System.out.println("A Useless Calculator!\n\n");
    System.out.println("Dieses Programm addiert 2 Zahlen");
    System.out.println("Zahl 1: ");
    num1 = scanner.nextInt();
    System.out.println("Zahl 2: ");
    num2 = scanner.nextInt();

    System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
  }
}

