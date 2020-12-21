import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numberA,numberB;
		Operations operate = new Operations();
		int exit = 0;
		Scanner input = new Scanner(System.in);
		
		
		while(exit == 0) {
		System.out.println("Enter your first number");
		numberA = input.nextDouble();
		System.out.println("Enter your second number");
		numberB = input.nextDouble();
		
		System.out.println("Select operation");
		System.out.println("1. addition" +  "\n" + "2. subtraction" + "\n" + "3. multiplication" + "\n" +"4. division");
		
		int choice = input.nextInt();
		switch(choice) {
		case 1:
			operate.addition(numberA,numberB);
			System.out.println("The awnser is " + operate.sum);
			break;
		case 2:
			operate.subtraction(numberA,numberB);
			System.out.println("The awnser is " + operate.sum);

			break;
		case 3:
			operate.multiplication(numberA,numberB);
			System.out.println("The awnser is " + operate.sum);

			break;
		case 4:
			operate.division(numberA,numberB);
			System.out.println("The awnser is " + operate.sum);

			break;
			
		
		
	}
		System.out.println("If you would like to continue press 0");
		exit = input.nextInt();
}}}
