package transformations.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryNumberAndConditions {
    public int binaryNumber (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce a binary number");
        int number = scanner.nextInt();
        return number;
    }
    public List<Integer> digitList(int x){
        List<Integer> myDigits = new ArrayList<>();
        while(x!=0){
            int digit = x%10;
            myDigits.add(digit);
            x/=10;
        }
        return myDigits;
    }
    public boolean isBinaryNumber (List<Integer> list){
        for(int l:list){
            if(l>1){
                return false;
            }

        }
        return true;
    }
}
