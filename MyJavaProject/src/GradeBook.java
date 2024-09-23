

import java.util.Scanner;


public class GradeBook 

{
	
	
	private String courseName;
	
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;
	 
	
	public GradeBook(String name)
	
	{
		courseName = name;
	
	}
	
	
	public void setCourseName(String name)
	
	{
		courseName = name;
	}
	
	
    
	public String getCourseName()
	{
		return courseName;
	}
	
	
	
	public void displayMessage()
	{
		
	System.out.printf(" Welcome to the Grade book for\n%s!\n",
			getCourseName());
	}
	
	
	
	
	
	
	public void inputGrades()
	
	{
		
	Scanner input = new Scanner(System.in);
	
	int grade;
	
	System.out.printf("%s\n%s\n     %s\n   %s\n" , 
			"Enter the interger grade in the range 0-100", 
			"Type the end of file indicator to terminate input:", 
			   "On UNix/Linux/Mac Os x typ <Ctrl> z then press Enter" );
		
		
		
		while (input.hasNext() )
		{
			
	grade = input.nextInt();
	
	total +=grade;
	++gradeCounter;
	
	incrementLetterGradeCounter(grade);
	
		}
		
	}	
	
	
		
	private void incrementLetterGradeCounter( int grade) 
	
	{



 switch (grade/10) 
 
{
 
 
 case 9:
 case 10:
 ++aCount;
 
 break;
 
 case 8:
	 ++bCount;
	 break;
	 
 case 7:
	 ++cCount;
	 break;
	 
 case 6:
	 ++dCount;
	 
	break;
	
	default:
		++fCount;
		break;
		}


}
		
    public void	displayGradeRepot()	
    
    {
    	System.out.println("\nGrade Report:");
    	
    	if(gradeCounter != 0)
    	{
    	
    		double average = (double) total / gradeCounter;
    		
    		System.out.printf("Total of the %d grade  enetrd is %d\n", gradeCounter, total);
    		
    		System.out.printf("Class average is 2f\n", average);
    		
    		System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
    				"Number of student who recieved each grade:",
    				"A: ", aCount, 
    				"B: ", bCount,
    				"C: ", cCount,
    				"D: ", dCount,
    				"F: ",fCount );
    		
    		 
    	}
    	else 
    		System.out.println("No grade were enterd");
    	}
    	
	
	public void determineClassAvrage() 
	{
		
		Scanner input = new Scanner(System.in);
		
		int total;
		int gradeCounter;
		int grade;
		double average;
		
		
		total = 0;
		gradeCounter = 0;
		
		System.out.println(" Enter grade or -1 to quit:");
		grade = input.nextInt();
		
		while (grade != -1)
		{
			
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		
	
		System.out.println(" Enter grade or -1 to quit:");
		grade = input.nextInt();
			
			
		}	
			
		if(gradeCounter != 0)
			
		{
		average = (double)total/gradeCounter;
			
		
			
		System.out.printf("\nTotal of the grades %d entered is %d\n", gradeCounter, total);
		
		System.out.printf("Class average is %.2f\n", average);
		
		
	}
		
	else

		System.out.println("No grades were enterd");
		
	}

		
	
}
	
	
	
	

	
	

		
		
		
		
	


