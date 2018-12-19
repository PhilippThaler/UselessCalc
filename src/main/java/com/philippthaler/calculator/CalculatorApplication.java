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

    System.out.println("     _        _   _                _                         ____           _                  _           _                    _   _ _ \n" +
        "    / \\      | | | |  ___    ___  | |   ___   ___   ___     / ___|   __ _  | |   ___   _   _  | |   __ _  | |_    ___    _ __  | | ( | )\n" +
        "   / _ \\     | | | | / __|  / _ \\ | |  / _ \\ / __| / __|   | |      / _` | | |  / __| | | | | | |  / _` | | __|  / _ \\  | '__| | |  V V \n" +
        "  / ___ \\    | |_| | \\__ \\ |  __/ | | |  __/ \\__ \\ \\__ \\   | |___  | (_| | | | | (__  | |_| | | | | (_| | | |_  | (_) | | |    |_|      \n" +
        " /_/   \\_\\    \\___/  |___/  \\___| |_|  \\___| |___/ |___/    \\____|  \\__,_| |_|  \\___|  \\__,_| |_|  \\__,_|  \\__|  \\___/  |_|    (_)      \n" +
        "                                                                                                                                        \n");
    Scanner scanner = new Scanner(System.in);
    int num1, num2;
    System.out.println("Dieses Programm addiert 2 Zahlen");
    System.out.println("Zahl 1: ");
    num1 = scanner.nextInt();
    System.out.println("Zahl 2: ");
    num2 = scanner.nextInt();

    System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
  }
}

