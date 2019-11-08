public class SecondIteration{
    //argument to be passed in
    private static int Arg1;
    //use of a try catch to catch if the code is recieving a valid integer.
    public static void main(String args[]) throws Exception {
        if (args.length > 0) {
            try{
                Arg1 = Integer.parseInt(args[0]);
            } 
            catch (NumberFormatException e){
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        else if (args.length == 0) {
                //ask the user to fix their mistake, close the program.
        	System.err.println("No input provided. You must enter an integer argument!");
        	System.exit(0);      
        }
        
        converter(Arg1);
    }

    //Create a new class to convert a decimal into hexadecimal     
    public static String converter(int decimal){
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem; 
        int num;
	num = decimal;
	String hex=""; 
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0){
	    rem=num%16;
	    hex= ch[rem] + hex;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hex);
        return hex;
       }
}
