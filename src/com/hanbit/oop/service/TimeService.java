package com.hanbit.oop.service;

import java.util.Scanner;

public class TimeService{
	public String[] execute(){
		Scanner s = new Scanner(System.in);
		int insec=0, hour=0, min=0, sec=0;
		
		System.out.print("초를입력하세요");
		insec = s.nextInt();
		String result = "";
		
		if(insec>=3600){
			hour = insec/3600;
			min = (insec%3600)/60;
			sec = insec%60;
			result = hour+"시간"+min+"분"+sec+"초";
			
		}
		else if(insec>=60){
			min = insec/60;
			sec = insec%60;
			result = hour+"시간"+min+"분"+sec+"초";
		}
		else{
			sec = insec;
			result = hour+"시간"+min+"분"+sec+"초";
		}
		System.out.print(result);
		return null;
	
		}
}
