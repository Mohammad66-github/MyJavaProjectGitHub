import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		int numberOfPasses = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;
		
		while (studentCounter <=10)
		
		{
			
			System.out.print("Enter reult(1 = pass, 2 = failed)");
			
			result = input.nextInt();
			
			
			if (result == 1)
			
				numberOfPasses = numberOfPasses + 1;
				
			else
				failures =failures + 1;
			
			
			studentCounter = studentCounter + 1;
		}
		
		System.out.printf("Passed %d\nFailed: %d\n", numberOfPasses,failures);
		
		
		if(numberOfPasses >= 8)
			
			
			System.out.println("Bonus to Instructor");

	}

}
