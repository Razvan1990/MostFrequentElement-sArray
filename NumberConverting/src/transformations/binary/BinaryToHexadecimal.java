package transformations.binary;

public class BinaryToHexadecimal {
    public BinaryNumberAndConditions binaryNumberAndConditions;
    private BinaryToDecimal binaryToDecimal;

    public BinaryToHexadecimal(){
        binaryNumberAndConditions = new BinaryNumberAndConditions();
        binaryToDecimal = new BinaryToDecimal();
    }


       public String hexadecimalNumber() {
        int decimalNumber = binaryToDecimal.convertNumberToDecimal();
        String digits = "0123456789ABCDEF";
        int power = 1;
        String hexaNumber = " ";
        while (decimalNumber != 0) {
            int rest = decimalNumber % 16;
            hexaNumber = hexaNumber + digits.charAt(rest);//a facut practic o concatenare
            power = power * 2;
            decimalNumber /= 16;

        }
        for (int i = 0; i < hexaNumber.length(); i++) {
            int first = 0;
            int last = hexaNumber.length() - 1;

            while (first < last) {
                int temp = first;
                first = last;
                last = temp;
            }
        }
        return hexaNumber;
    }

    public String correctHexaNumber(String s) {
        String s1 ="";

        for (int i = s.length()-1;i>0;i--){
            s1 = s1 + s.charAt(i);
        }
        return s1;
    }


}
