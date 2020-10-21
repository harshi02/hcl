import java.util.Scanner;

//Write a program called GradesAverage, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the
//grades of each of the students and saves them in an int array called grades. Your program shall
//check that the grade is between 0 and 100. A sample session is as follow:
//Enter the number of students: 3
//Enter the grade for student 1: 55
//Enter the grade for student 2: 108
//Invalid grade, try again...
//Enter the grade for student 2: 56
//Enter the grade for student 3: 57
//The average is: 56.0
public class Avg {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int n= sc.nextInt();
		float GradeAvg = 0;
		int grade[] = new int[50];
		for(int i=1;i <= n;i++) {
			boolean flag=true;
			System.out.print("Enter the grade for student "+i+":" );
			int numStudents=sc.nextInt();
			if(numStudents>100) {
				flag=false;
				System.out.println("Invalid grade, try again...");
				i = i-1;
			}
			if(flag)
				grade[i]=numStudents;
			System.out.println();
		}
		for(int i=0;i<=n;i++) {
			GradeAvg += grade[i];
		}
		System.out.println("The average is: "+GradeAvg/n);
		sc.close();
	}
			
}
