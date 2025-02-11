// STUDENT NAME: Ethan Luong
// DATE: 2/9/2025

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int todayDateDay, todayDateMonth, todayDateYear, birthdayDay, birthdayMonth, birthdayYear;
		int JDNToday, JDNBirthday;
		int calculatedAge;
		int a, m, y;

		/***** INITIALIZATION SECTION *****/

		todayDateDay = 2;
		todayDateMonth = 2;
		todayDateYear = 2020;

		birthdayDay = 26;
		birthdayMonth = 2;
		birthdayYear = 1918;

		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/

		a = (14 - todayDateMonth) / 12;
		m = todayDateMonth + 12 * a + - 3;
		y = todayDateYear + 4800 - a;
		JDNToday = (int) (todayDateDay + (153*m + 2)/5 + 365 * y + y / 4 - y / 100 - + y / 400 - 32045); 
		a = (14 - birthdayMonth) / 12;
		m = birthdayMonth + 12 * a + - 3;
		y = birthdayYear + 4800 - a;
		JDNBirthday = (int) (birthdayDay + (153*m + 2)/5 + 365 * y + y / 4 - y / 100 - + y / 400 - 32045); 
		calculatedAge = (int) (JDNToday - JDNBirthday) / 365;
		
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date" + todayDateMonth + "/" + todayDateDay + "/" + todayDateYear + ", is " + JDNToday);
		System.out.println("Julian Day Number for birthday" + birthdayMonth + "/" + birthdayDay + "/" + birthdayYear + ", is " + JDNBirthday);
		System.out.println("The differences in days is " + (JDNToday - JDNBirthday) + " which makes you approximately " + calculatedAge + " years old!");
  }
}