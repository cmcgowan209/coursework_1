public class SecondIteration{
    //argument to be passed in
    private static int Arg1;
    //use of a try catch to catch if the code is recieving a valid integer.
    public static String main(String args[]) throws Exception {
		if (args.length > 0) {
			try{
				//Find out if the number is an integer by parsing it, if not, throw an error
				Arg1 = Integer.parseInt(args[0]);
			} 
			catch (NumberFormatException e){
				//inform user that this input can't be used
				System.err.println("Argument" + args[0] + " must be an integer.");
				System.exit(1);
			}
	}
		else if (args.length == 0) {
			//ask the user to fix their mistake, close the program.
			System.err.println("Please provide a suitable integer argument");
			System.exit(0);      
	}
                
	//create a array of all the characters used in hexadecimal notation. 
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem; 
        int num = 0;
	String hex=""; 
        System.out.println("Convertint to hexadecimal" + num + "To Hex...");
        //calculation for creation of the hexadecimal
        while(num != 0){
	    rem=num%16;
	    hex= ch[rem] + hex;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hex);
        return hex;   
    }
}