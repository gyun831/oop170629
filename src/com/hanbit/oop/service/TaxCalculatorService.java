package com.hanbit.oop.service;

public class TaxCalculatorService {
	public double execute(String name,int pay){
	double rat = 0;

	
	if(pay>8800){
		rat = 0.35;
	}
	else if(pay>4600){
		rat = 0.26;
	}
	else if(pay>1200){
		rat = 0.17;
	}
	else{
		rat = 0.08;
	}
	return rat;
	}
	
}
