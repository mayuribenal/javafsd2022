import java.util.Scanner;

	 public class calculator11 {
	  public static void main(String[] args) {

	    char symbol;
	    Double input1, input2, output;

	    
	    Scanner input = new Scanner(System.in);

	  
	    System.out.println("Choose an operator: +, -, *, or /");
	    symbol = input.next().charAt(0);

	    
	    System.out.println("Enter the first number");
	    input1 = input.nextDouble();

	    System.out.println("Enter the second number");
	    input2 = input.nextDouble();

	    switch (symbol) {

	      
	      case '+':output = input1 + input2;
	        System.out.println("addition is :" + output);
	        break;

	      
	      case '-':output = input1 - input2;
	        System.out.println("substraction is :" + output);
	        break;

	     
	      case '*':output= input1 * input2;
	        System.out.println("multiplication is: " + output);
	        break;

	     
	      case '/': output = input1 / input2;
	        System.out.println( "division is +:  " + output);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }
	}


