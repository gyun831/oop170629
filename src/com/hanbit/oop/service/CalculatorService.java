package com.hanbit.oop.service;

public class CalculatorService {
	private String num1,num2,result,opcode;
	
	
	public void setNum1(String num1){
		this.num1 = num1;
	}
	public void setNum2(String num2){
		this.num2 = num2;
	}
	public String getNum1(){
		return num1;
	}
	public void setOpcode(String opcode){
		this.opcode = opcode;
	}
	public String getOpcode(){
		return opcode;
	}
	public void setResult(){
		if(opcode.equals("+")){
			result = String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
		}
		else if(opcode.equals("-")){
			result = String.valueOf(Integer.parseInt(num1)-Integer.parseInt(num2));
		}
		else if(opcode.equals("*")){
			result = String.valueOf(Integer.parseInt(num1)*Integer.parseInt(num2));
		}
		else if(opcode.equals("/")){
			result = String.valueOf(Integer.parseInt(num1)/Integer.parseInt(num2));
		}
	}
	public String getResult(){
		return result;
	}

	public String calcTax(String pay){
		return pay; 
	}
	public String calcTime(String sec){
		return sec;
	}
}





/*
 	public void setPlus(){
		this.plus = String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
	}
	public String getPlus(){
		return plus;
	}	
	public void setMinus(){
		this.minus = String.valueOf(Integer.parseInt(num1)-Integer.parseInt(num2));
	}
	public String getMinus(){
		return minus;
	}
	public void setDivid(){
		this.divid = String.valueOf(Integer.parseInt(num1)/Integer.parseInt(num2));
	}
	public String getDivid(){
		return divid;
	}
	public void setMulti(){
		this.multi = String.valueOf(Integer.parseInt(num1)*Integer.parseInt(num2));
	}
	public String getMulti(){
		return multi;
	}
 */
