package com.hanbit.oop.service;

public class CalculatorService {
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
	public String calcPlus(String a, String b){
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
	}
	public String calcMinus(String a, String b){
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	public String calcDivid(String a, String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	public String calcMulti(String a, String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	public String calcTax(String pay){
		return 
	}
	public String calcTime(String sec){
		return 
	}
}
