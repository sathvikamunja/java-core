package com.learning.core.day2session1;

public class D02P03_2 {

		
	    public static void printWeekday(int week) {
	        if (week == 1) {
	            System.out.println("Monday");
	        } else if (week == 2) {
	            System.out.println("Tuesday");
	        } else if (week == 3) {
	            System.out.println("Wednesday");
	        } else if (week == 4) {
	            System.out.println("Thursday");
	        } else if (week == 5) {
	            System.out.println("Friday");
	        } else if (week == 6) {
	            System.out.println("Saturday");
	        } else if (week == 7) {
	            System.out.println("Sunday");
	        } else {
	            System.out.println("Invalid Input");
	        }
	    }
	 
	    public static void main(String[] args) {
	       
	        printWeekday(2);
	        printWeekday(-4);
	        printWeekday(9);
	    }
	}


