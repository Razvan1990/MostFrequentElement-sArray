package transformations.binary;

import java.util.ArrayList;
import java.util.List;

public class BinaryToDecimal {
    private BinaryNumberAndConditions binaryNumberAndConditions;

    public BinaryToDecimal(){
        binaryNumberAndConditions = new BinaryNumberAndConditions();
    }

   public int convertNumberToDecimal() {
        int x = binaryNumberAndConditions.binaryNumber();
        List<Integer> myList = new ArrayList<>();
        myList = binaryNumberAndConditions.digitList(x);
        boolean isOK = binaryNumberAndConditions.isBinaryNumber(myList);
        while (isOK == false) {
            System.out.println("Number is not binary. Please introduce a correct number");
            x = binaryNumberAndConditions.binaryNumber();
            myList = binaryNumberAndConditions.digitList(x);
            isOK = binaryNumberAndConditions.isBinaryNumber(myList);
        }


        int decimalNr = 0;
        int pow = 1;

        while (x != 0) {
            decimalNr = decimalNr + x % 10 * pow;
            pow *= 2;
            x /= 10;
        }
        return decimalNr;
    }
}
