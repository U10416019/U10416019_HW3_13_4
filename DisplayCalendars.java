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

}