package com.hanbit.oop.serviceImpl;

public class BmiService{
	private double height,weight,bmi;
	private String state;
	public void setHeight(double height){
		this.height = height;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setBmi(){
		this.bmi = weight/(height*height);
	}
	public void setState(){
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
	}
	public double getHeight(){
		return this.height;
	}
	public double getWeight(){
		return this.weight;
	}
	public double getBmi(){
		return this.bmi;
	}
	public String getState(){
		return state;
	}

}

	
