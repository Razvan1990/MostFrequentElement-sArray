package hexadecimal;

public class HexadecimalToBinary {

    private HexadecimalNumberAndConditions hexadecimalNumberAndConditions;
    private HexadecimalToDecimal hexadecimalToDecimal;

   public HexadecimalToBinary(){
        hexadecimalNumberAndConditions = new HexadecimalNumberAndConditions();
        hexadecimalToDecimal = new HexadecimalToDecimal();

    }
        public long convertToBinary(){
        int hexNumberConvertedInDecimal = hexadecimalToDecimal.convertHexToDecimal();
            System.out.println(hexNumberConvertedInDecimal);
        int p =1;int binaryNumber = 0;
        while (hexNumberConvertedInDecimal!=0){
            binaryNumber = binaryNumber + hexNumberConvertedInDecimal%2*p;
            p*=10;
            hexNumberConvertedInDecimal/=2;
        }
        return binaryNumber;
        }

}
