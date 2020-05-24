package Application;

import transformations.binary.BinaryToDecimal;
import transformations.binary.BinaryToHexadecimal;
import transformations.decimal.DecimalToBinary;
import transformations.decimal.DecimaltoHexazecimal;
import transformations.hexadecimal.HexadecimalNumberAndConditions;
import transformations.hexadecimal.HexadecimalToBinary;
import transformations.hexadecimal.HexadecimalToDecimal;

import java.util.Scanner;

public class ConvertOptions {
    private BinaryToDecimal binaryToDecimal;
    private BinaryToHexadecimal binaryToHexadecimal;
    private DecimalToBinary decimalToBinary;
    private DecimaltoHexazecimal decimaltoHexazecimal;
    private HexadecimalToBinary hexadecimalToBinary;
    private HexadecimalToDecimal hexadecimalToDecimal;
    private ConvertOptions convertOptions;

    public ConvertOptions() {
        binaryToDecimal = new BinaryToDecimal();
        binaryToHexadecimal = new BinaryToHexadecimal();
        decimalToBinary = new DecimalToBinary();
        decimaltoHexazecimal = new DecimaltoHexazecimal();
        hexadecimalToBinary = new HexadecimalToBinary();
        hexadecimalToDecimal = new HexadecimalToDecimal();

    }


    public void chooseOptionOfTransformation() {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the transform number program. Please choose the number type");
            System.out.println("1. Binary");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");
            System.out.println("4. Exit program");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Choose in what type to transform the binary number");
                System.out.println("1. Binary to Decimal");
                System.out.println("2. Binary to Hexadecimal");
                System.out.println("3. I want another option");
                int optionBinary = scanner.nextInt();

                switch (optionBinary) {
                    case 1:
                        int decNumberB = binaryToDecimal.convertNumberToDecimal();
                        System.out.println("Rezultatul conversiei este " + decNumberB);
                        break;
                    case 2:
                        String hexNumber = binaryToHexadecimal.hexadecimalNumber();
                        String correctHexNumber = binaryToHexadecimal.correctHexaNumber(hexNumber);
                        System.out.println("Rezultatul conversiei este " + correctHexNumber);
                        break;
                    case 3:
                        break;

                }

            } else if (option == 2) {
                System.out.println("Choose in what type to transform the decimal number");
                System.out.println("1. Decimal to Binary");
                System.out.println("2. Decimal to Hexadecimal");
                System.out.println("3. I want another option");
                int optionDecimal = scanner.nextInt();

                switch (optionDecimal) {
                    case 1:
                        int binNumberD = decimalToBinary.convertNumberToDecimal();
                        System.out.println("Rezultatul conversiei este " + binNumberD);
                        break;
                    case 2:
                        String hexNumber = decimaltoHexazecimal.converNumber();
                        char[] newNUmber = decimaltoHexazecimal.correctNumber(hexNumber);
                        System.out.println("Rezultatul conversiei este");
                        for (char c : newNUmber) {
                            System.out.print(c);
                        }
                        break;

                    case 3:
                        break;

                }
            } else if (option == 3) {
                System.out.println("Choose in what type to transform the hexadecimal number");
                System.out.println("1. Hexadecimal to Binary");
                System.out.println("2. Hexadecimal to Decimal");
                System.out.println("3. I want another option");
                int optionHexadecimal = scanner.nextInt();

                switch (optionHexadecimal) {
                    case 1:
                        String binNumberH = hexadecimalToBinary.convertToBinary();
                        System.out.println("Rezultatul conversiei este " + binNumberH);
                        break;
                    case 2:
                        int decNumberH = hexadecimalToDecimal.convertHexToDecimal();
                        System.out.println("Rezultatul conversiei este " + decNumberH);
                        break;

                    case 3:
                        break;

                }

            } else if (option == 4) {
                running = false;
            } else {
                System.out.println("Wrong insertion");
                convertOptions.chooseOptionOfTransformation();
            }

        }
    }
}


