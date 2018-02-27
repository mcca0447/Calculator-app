
import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator{

	   static int selection = 0;
       static float num1 = 0;
       static float num2 = 0;
       
    static Calculator c = new Calculator();
    static Scanner scan = new Scanner(System.in);

    public static void  prompt(){
        boolean bError = true;

        while (bError){
            
                System.out.println("Enter the first value:\b");

                if(scan.hasNextFloat()){
                    num1 = scan.nextFloat();
                }

                else{
                    System.out.println("ALERT: Please make use only numerical inputs.\b");
                    System.out.println("\b");
                    System.out.println("\b");
                    scan.next();
                    continue;
                }
              

                System.out.println("Enter the second value\b");

                if(scan.hasNextFloat()){
                    num2 = scan.nextFloat();
                }

                else{
                    System.out.println("ALERT: Please use only numerical inputs and try again.\b");
                    System.out.println("\b");
                    System.out.println("\b");
                    
                    scan.next();
                    continue;
                }

                bError = false;
            
               

                }

            }



    

    public static void add(){

        prompt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2) +"\b\b\b" );
        
    }

    public static void subtract(){

        prompt();
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) +"\b\b\b" );

    }

    public static void divide(){

        prompt();
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2) +"\b\b\b");
       
    }

    public static void multiply(){

        prompt();
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2) +"\b\b\b");
    }

    public static void exponentiate(){
        prompt();

        float answer = 1;

        for(int i = 0; i < num2; i++){

            answer *= num2;
            
        }

        System.out.println(num1 + "^" + num2 + " = " + (answer) +"\b\b\b");




    }

    public static void modulate(){
        prompt();
        System.out.println(num1 + " * " + num2 + " = " + (num1%num2) +"\b\b\b");
    }

    
    public static void main(String[] args){
    	
    	System.out.println("++++CALCULATOR+++++");
    	
    	while(selection != 9) {

        System.out.println("What operation would you like to perform?\b\b\b" );
        System.out.println("1. Addition\b");
        System.out.println("2. Subtraction\b");
        System.out.println("3. Multiplication\b");
        System.out.println("4. Division\b");
        System.out.println("5. Modulate\b");
        System.out.println("6. Exponentiate\b");

        System.out.println("9. EXIT\b");
        
        selection = scan.nextInt();

        switch(selection){

            case 1: add();
                    break;
            
            case 2: subtract();
                    break;

            case 3: multiply();
                    break;

            case 4: divide();
                    break;

            case 5: modulate();
                    break;

            case 6: exponentiate();
                    break;
            
            case 9: System.exit(0);
                    


        	}
    	}
    }

    

}