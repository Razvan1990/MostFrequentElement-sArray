package transformations.decimal;

import java.util.ArrayList;
import java.util.List;

public class DecimaltoHexazecimal {
    private DecimalNumberAndConditions decimalNumberAndConditions;

    public DecimaltoHexazecimal(){
        decimalNumberAndConditions = new DecimalNumberAndConditions();
    }

    public String converNumber() {
        List<Integer> myList = new ArrayList<>();
        int number = decimalNumberAndConditions.decimalNumber();
        myList = decimalNumberAndConditions.digitDecimalList(number);
        boolean isValid = decimalNumberAndConditions.isDecimal(myList);
        while (isValid == false) {
            System.out.println("Not a decimal number");
            number = decimalNumberAndConditions.decimalNumber();
            myList = decimalNumberAndConditions.digitDecimalList(number);
            isValid = decimalNumberAndConditions.isDecimal(myList);
        }
        String hexaNumbers = "0123456789ABCDEF";
        String hexNumber = " ";
        while (number != 0) {
            int rest = number % 16;
            hexNumber = hexNumber + hexaNumbers.charAt(rest);
            number /= 16;
        }
        return hexNumber;
    }

   public char[] correctNumber(String s1) {
        char[] hexNumber = s1.toCharArray();
        //am facut un char nou cu dimensiunea arrayului.
        char[] newCorrectNumber = new char[s1.length()];

        //punem elementele unul in altul
        for (int i = 0; i < hexNumber.length; ) {
            for (int j = 0; j < newCorrectNumber.length; ) {
                //Neaparat asa-> regula de atribuire se face de la dreapta la stanga!!!!!!
                newCorrectNumber[j] = hexNumber[i];
                i++;
                j++;
            }
        }


        int first = 0;
        int last = newCorrectNumber.length - 1;

        while (first < last) {
            char c = newCorrectNumber[first];
            newCorrectNumber[first] = newCorrectNumber[last];
            newCorrectNumber[last] = c;

            first++;
            last--;


        }
        return newCorrectNumber;


    }
}
