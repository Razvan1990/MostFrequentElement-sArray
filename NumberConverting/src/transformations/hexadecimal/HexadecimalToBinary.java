package transformations.hexadecimal;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class HexadecimalToBinary {

    private HexadecimalNumberAndConditions hexadecimalNumberAndConditions;
    private HexadecimalToDecimal hexadecimalToDecimal;

    public HexadecimalToBinary() {
        hexadecimalNumberAndConditions = new HexadecimalNumberAndConditions();
        hexadecimalToDecimal = new HexadecimalToDecimal();

    }

    public String convertToBinary() {
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
        //trebuie sa il facem sa citeasca pe octeti
        String binaryNumber = "";
        //ne trebuie un String in care vedem care sunt valorile
        String octet="";
        for(int i = 0;i<number.length();i++){
            char c = number.charAt(i);

            switch(c){
                case '0':
                    octet ="0000";
                    break;
                case '1':
                    octet ="0001";
                    break;
                case '2':
                    octet ="0010";
                    break;
                case '3':
                    octet ="0011";
                    break;
                case '4':
                    octet ="0100";
                    break;
                case '5':
                    octet ="0101";
                    break;
                case '6':
                    octet ="0110";
                    break;
                case '7':
                    octet ="0111";
                    break;
                case '8':
                    octet ="1000";
                    break;
                case '9':
                    octet ="1001";
                    break;
                case 'A':
                    octet ="1010";
                    break;
                case 'B':
                    octet ="1011";
                    break;
                case 'C':
                    octet ="1100";
                    break;
                case 'D':
                    octet ="1101";
                    break;
                case 'E':
                    octet ="1110";
                    break;
                case 'F':
                    octet ="1111";
                    break;
                default:
                    System.out.println("Not a valid caharacter");
                    break;
            }
            binaryNumber+=octet+" ";
        }
        return binaryNumber;

    }
}