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
	

}