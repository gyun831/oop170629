package com.hanbit.oop.service;

public class LeapYearService {
		public String execute(int year){
			String leapyear="";
		
			if(year%4==0 && year%100!=0) {
				leapyear="윤년";
			}
			else if(year%100==0 && year%400==0){
				leapyear="윤년";
			}
			else{
				leapyear="평년";
			}
			return leapyear;
			
		}
	}

