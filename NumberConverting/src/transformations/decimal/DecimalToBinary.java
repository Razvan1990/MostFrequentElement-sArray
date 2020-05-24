package transformations.decimal;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
    private DecimalNumberAndConditions decimalNumberAndConditions;

    public DecimalToBinary(){
        decimalNumberAndConditions = new DecimalNumberAndConditions();
    }

    public int convertNumberToDecimal(){
        List<Integer> decDigits = new ArrayList<>();
        int decNumber = decimalNumberAndConditions.decimalNumber();
        decDigits =decimalNumberAndConditions.digitDecimalList(decNumber);
        boolean isDecimal = decimalNumberAndConditions.isDecimal(decDigits);
        while(isDecimal== false){
            System.out.println("This is not a decimal number");
            decNumber = decimalNumberAndConditions.decimalNumber();
            decDigits = decimalNumberAndConditions.digitDecimalList(decNumber);
            isDecimal = decimalNumberAndConditions.isDecimal(decDigits);
        }
        int p = 1;
        int newNumber = 0;
        while(decNumber!=0){
            newNumber = newNumber + decNumber % 2 *p;
            p*=10;
            decNumber/=2;
        }
        return newNumber;
    }
}
