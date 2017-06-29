package com.hanbit.oop.service;

public class BmiService{
	public String calcBMI(double height,double weight){
		double bmi = weight/(height*height);
		String state="";
		
		if(bmi>=30){
			state="비만";
		}
		else if(bmi>=25){
			state="과체중";
		}
		else if(bmi>=18.5){
			state="정상";
		}
		else{
			state="저체중";
		}
		return state;
	}
}

	
