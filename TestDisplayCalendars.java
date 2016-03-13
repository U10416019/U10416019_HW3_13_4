//U10416019鄭文琪

import java.util.*;

public class TestDisplayCalendars {
	public static void main(String[] args){
		
		//create data field
		GregorianCalendar gregoriancalendar = new GregorianCalendar();
		DisplayCalendars displayCalendar;
		//create variable month and year which type are int
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);


		//determine the length of the argument then print the calendar which the user want
		if(args.length == 2){
			displayCalendar = new DisplayCalendars(year, month, 1);
		}
		else if(args.length == 1){
			displayCalendar = new DisplayCalendars(gregoriancalendar.get(Calendar.YEAR), month, 1);
		}
		else{
			displayCalendar = new DisplayCalendars(gregoriancalendar.get(Calendar.YEAR), gregoriancalendar.get(Calendar.MONTH) + 1, 1);
		}






		//judge the input
//		if(args.length == 2){
//			displayCalendar = new DisplayCalendars(Integer.valueOf(args[1]), Integer.valueOf(args[0]), 1);
//		}
//		else if(args.length == 1){
//			displayCalendar = new DisplayCalendars(gregoriancalendar.get(Calendar.YEAR), Integer.valueOf(args[0]), 1);
//		}
//		else{
//			displayCalendar = new DisplayCalendars(gregoriancalendar.get(Calendar.YEAR), gregoriancalendar.get(Calendar.MONTH) + 1, 1);
//		}
		




		
	}
}
