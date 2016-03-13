//U10416019鄭文琪

import java.util.*;

public class TestDisplayCalendars {
	public static void main(String[] args){
		
		//create data field
		GregorianCalendar gregoriancalendar = new GregorianCalendar();
		DisplayCalendars displayCalendar;

		//determine the length of the argument then print the calendar which the user want
		if(args.length == 2){
			displayCalendar = new DisplayCalendars(Integer.valueOf(args[1]), Integer.valueOf(args[0]), 1);
		}
		else if(args.length == 1){
			displayCalendar = new DisplayCalendars(gregoriancalendar.get(Calendar.YEAR), Integer.valueOf(args[0]), 1);
		}
		else{
			displayCalendar = new DisplayCalendars(gregoriancalendar.get(Calendar.YEAR), gregoriancalendar.get(Calendar.MONTH) + 1, 1);
		}	
	}
}
