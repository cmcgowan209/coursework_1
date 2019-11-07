package decimal2hex;

import java.util.Scanner;

/**
 *
 * @author Conor
 */
public class Decimal2Hex {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Decimal Number : ");
        int num = input.nextInt();
        
        int remainder;
        String result = null;
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while(num>0)
        {
            remainder=num%16;
            result=hex[remainder]+result;
            num=num/16;
        }
        System.out.println("Hexadecimal Form: "+result);
    }
    
}
