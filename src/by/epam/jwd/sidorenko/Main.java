package by.epam.jwd.sidorenko;

import by.epam.jwd.sidorenko.launch.FunctionController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FunctionController.run(scanner.nextLine());
    }
}
