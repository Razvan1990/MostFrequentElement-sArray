package transformations.decimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalNumberAndConditions {

    public int decimalNumber (){
        System.out.println("Please introduce decimal number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }

    public List<Integer> digitDecimalList (int x){
        List <Integer> myList = new ArrayList<>();

        while (x!=0){
            int digit = x%10;
            myList.add(digit);
            x/=10;
        }
        return myList;
    }

    public boolean isDecimal(List<Integer> myList){
        for (int l:myList){
            if (l>=0 && l<=9){
                return true;
            }
        }
        return false;
    }
}
