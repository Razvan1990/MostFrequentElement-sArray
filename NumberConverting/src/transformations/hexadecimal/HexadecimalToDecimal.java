package transformations.hexadecimal;

import java.util.ArrayList;
import java.util.List;

public class HexadecimalToDecimal {
    //TODO
//    public HexadecimalNumberAndConditions hexadecimalNumberAndConditions;
//
//    HexadecimalToDecimal(){
//        this.hexadecimalNumberAndConditions = new HexadecimalNumberAndConditions();
//}

   // HexadecimalNumberAndConditions hexadecimalNumberAndConditions = new HexadecimalNumberAndConditions();
   public int convertHexToDecimal(){
       HexadecimalNumberAndConditions hexadecimalNumberAndConditions = new HexadecimalNumberAndConditions();
        List<Character> digitsChars = new ArrayList<>();
    String number = hexadecimalNumberAndConditions.hexNumber();
    digitsChars = hexadecimalNumberAndConditions.myNumberCharacters(number);
    boolean isHexOk = hexadecimalNumberAndConditions.isHexNumber(digitsChars);
    while(isHexOk == false){
        System.out.println("Not an ok hexadecimal number!Watch out for size and digits");
        number = hexadecimalNumberAndConditions.hexNumber();
        digitsChars = hexadecimalNumberAndConditions.myNumberCharacters(number);
        isHexOk  = hexadecimalNumberAndConditions.isHexNumber(digitsChars);

    }
    String hexNumbers ="0123456789ABCDEF";
    int newNumber = 0;


    for(int i =0;i<number.length();i++){

        char character = number.charAt(i);
        int characterValue = hexNumbers.indexOf(character);
        newNumber =  16*newNumber +characterValue;
    }
    return newNumber;


    }
}
