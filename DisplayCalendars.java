//U10416019鄭文琪

import java.util.*;

public class DisplayCalendars {

	//create data  field
	private GregorianCalendar gregorianCalendar;
	private int year;
	private int month;
	private int weekOfDate;
	private String monthName = "";
	
	
	//create a no-argument constructor
	DisplayCalendars(){
	}
	
	
	//create a constructor of DisplayCalendars
	DisplayCalendars(int year, int month, int day){
		this.year = year;
		this.month = month;
		gregorianCalendar = new GregorianCalendar(year, month - 1, day);
		printMonthTitle();
	    printMonthBody();
	}
	
	
	//print the month title
	public void printMonthTitle() {
	    System.out.println("         " + getMonthName() + " " + year);
	    System.out.println("-----------------------------");
	    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	//get the English name of the month
	public String getMonthName() {
		switch (month) {
		    case 1: monthName = "January"; break;
		  	case 2: monthName = "February"; break;
      		case 3: monthName = "March"; break;
	      	case 4: monthName = "April"; break;
		    case 5: monthName = "May"; break;
	    	case 6: monthName = "June"; break;
		    case 7: monthName = "July"; break;
		    case 8: monthName = "August"; break;
	    	case 9: monthName = "September"; break;
	    	case 10: monthName = "October"; break;
	    	case 11: monthName = "November"; break;
	   	 	case 12: monthName = "December";
		}
	    return monthName;
	}


	//print the month body
	public void printMonthBody() {
		//print the space before the first day of the monty
	    for (int i = 0; i < gregorianCalendar.get(GregorianCalendar.DAY_OF_WEEK) - 1; i++){
	      	System.out.print("    ");
	      	weekOfDate++;
	    }

		//print the day
	    for (int i = 1; i <= getNumberOfDaysInMonth(); i++) {
	      	System.out.printf("%4d", i);
			weekOfDate++;
			//print to the next line when the line has seven days
	    	if (weekOfDate % 7 == 0){
	        	System.out.println();
	    	}
	    }
	    System.out.println();
	}


	//get the number of days in the month
	public int getNumberOfDaysInMonth() {
	    if (month == 1 || month == 3 || month == 5 || month == 7 ||
	  	    month == 8 || month == 10 || month == 12){
	      	return 31;
	    }
		else if (month == 4 || month == 6 || month == 9 || month == 11){
	      	return 30;
	    }
		else if (month == 2){
	    	return isLeapYear() ? 29 : 28;
	    }
	    // If month is incorrect
	    return 0; 
	  }


	  //determine whether the year which the user enter is leap year
	  public boolean isLeapYear() {
	    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	  }
}