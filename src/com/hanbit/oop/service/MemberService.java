package com.hanbit.oop.service;

public class MemberService {
	private String id,pw,gender,ssn,name,login;
	private int age;
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setPw(String pw){
		this.pw = pw;
	}
	public String GetPw(){
		return pw;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setGender(){
		char ch = ssn.charAt(7); //ssn문자열에 7번째문자
		switch(ch){
			case '1': 
			case '3':
				gender = "남";
				break;
			case '2': 
			case '4':
				gender = "여";
				break;
			case '5':
				gender = "외국인(남)";
				break;
			case '6':
				gender = "외국인(여)";
				break;
			default :
				gender = "FAIL";
				break;
		}
	}
	public String getGender(){
		return gender;
	}
	public void setAge(){
		String sYear = ssn.substring(0,2);
		int year = Integer.parseInt(sYear);
		this.age = ((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1;
	}
	public int getAge(){
		return age;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setLogin(String id, String pw){
		if(!id.equals(this.id)){
			login="ID틀림";
		}
		else if(pw.equals(this.pw)){
			login=toString();
		}
		else{
			login="PW틀림";
		}
	}
	public String getLogin(){
		return login;
	}
	public String toString(){
		setAge();
		setGender();
		return "Welcome\t"+name+"("+gender+","+age+"세)";
	}

}

