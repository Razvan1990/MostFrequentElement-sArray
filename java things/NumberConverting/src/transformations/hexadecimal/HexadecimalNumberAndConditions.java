package hexadecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HexadecimalNumberAndConditions {

    public String hexNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce a hex number");
        String s = scanner.nextLine();
        String sHex= s.toUpperCase();
        return sHex;
    }
    public char[] convertString(String s){
        char [] charString = s.toCharArray();
        return charString;
    }

    public int convertToAscii(char c) {
        //converts to ASCII code
        int convertedChar = (int) c;
        return convertedChar;
    }

    public List<Character> myNumberCharacters(String s) {
        HexadecimalNumberAndConditions hexadecimalNumberAndConditions = new HexadecimalNumberAndConditions();
        List<Character> numbersList = new ArrayList<>();
        String upperString = s.toUpperCase();
        char[] convertedString = hexadecimalNumberAndConditions.convertString(upperString);
        if (upperString.length() > 0 && upperString.length() < 5) {
            for (int i = 0; i < convertedString.length; i++) {
                int characterNumber = hexadecimalNumberAndConditions.convertToAscii(convertedString[i]);
                if (characterNumber >= 48 && characterNumber <= 57) {
                    numbersList.add(convertedString[i]);

                } else if (characterNumber >= 64 && characterNumber <= 70) {
                    numbersList.add(convertedString[i]);
                } else {
                    System.out.println("You have an incorrect hexadecimal digit. You will be asked to repeat the number");
                    numbersList.removeAll(numbersList);
                    return numbersList;
                }
            }
        } else {
            System.out.println("You have introduced to many or no characters. Enter 1 to 4 characters");
        }
        return numbersList;
    }
/**
             *nu merge chestia asta si nu are rost sa facem asa ca ne complicam
             */
//    public boolean isHexNumber(List<Character> charactersList) {
//        char[] hexCharacters = {'0', '2', '3', '4', '5', '6', '7', '1', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
//        Object[] vectorCharacters = charactersList.toArray();
//        boolean flag = false;
//        if (!(charactersList.isEmpty())) {
//
////
////            for (int i = 0; i < charactersList.size(); i++) {
////                outerloop:
////                for (int j = 0; j < hexCharacters.length; j++) {
////                    if (vectorCharacters[i].equals(hexCharacters[j])) {
////                        flag = true;
////                        break outerloop;
////                    }
////
////                    }
////                }
////            }
////
////
////        if(flag){
//            return true;
//        }
//        return false;
//
//    }
    public boolean isHexNumber(List<Character> characterList){
        /**
         * practic am pus sus conditia sa stearga intreaga lista daca gaseste un caracter incorect si sa returneze lista
         * Aici doar verificam ca nu e goala lista-> prima conditie de sus
         */
        if (!(characterList.isEmpty())){
            return true;
        }
        else{
            return false;
        }

    }

}

