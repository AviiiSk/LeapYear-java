
// 2.write a program  to check whether  year is leap year or not. (If else stmt).



public class Question2 {

	public static void main(String[] args) {
		
		int year = 2025;
		
		if (((year % 4 == 0 ) && (year % 100!= 0)) || (year % 400 == 0))
		{
			System.out.println("Year is Leap year ");
		}
		else {
			
			System.out.println("Not a Leap Year ");
			
			
		}
		
		
	}

}
