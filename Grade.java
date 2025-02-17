import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the score: ");
		int score = scanner.nextInt();
		char grade;
		if (score < 0 || score > 100) {
		    System.out.println("Invalid score! Please enter a number between 0 and 100.");
		}
		else {
		    switch (score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
			       grade = 'B';
    			       break;
			case 7:
			       grade = 'C';
   			        break;
			case 6:
			       grade = 'D';
			       break;
			default:
			         grade = 'F';
                                 break;
			}
		
			System.out.println("Your grade is: " + grade);
		}
	}

}


