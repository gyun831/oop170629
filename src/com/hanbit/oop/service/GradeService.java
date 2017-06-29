package com.hanbit.oop.service;

public class GradeService {
	//field
	private int kor,eng,math,total,avg;
	private String grade,name,major;
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	public int getKor(){
		return this.kor;
	}
	public int getEng(){
		return this.eng;
	}
	public int getMath(){
		return this.math;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setTotal(){
		this.total = kor+eng+math;
	}
	public int getTotal(){
		return total;
	}
	public void setAvg(){
		this.avg = total/3;
	}
	public int getAvg(){
		return avg;
	}
	public void setGrade(){
		setAvg();
		setTotal();
	switch(avg/10){
		case 10: case 9:         /*keyword*/
			this.grade = "A학점 장학금 대상입니다";
			break;
		case 8 :         /*keyword*/
			this.grade = "B학점 3학점 이수입니다. ";
			break;
		case 7 :         /*keyword*/
			this.grade = "C학점 2학점 이수입니다.";
			break;
		case 6 :         /*keyword*/
			this.grade = "D학점 1학점 이수입니다.";
			break;
		case 5 :         /*keyword*/
			this.grade = "E학점 재수강입니다.";
			break;
		default :
			this.grade ="학사 경고";
			break;
			}
	}
	public String getGrade(){
		return this.grade;
	}
	public void setMajor(String major){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	public String toString(){
		return "==================================\n"
			   +"이름     전공      성적\n"
			   +"-----------------\n"
			   +name+"\t"+major+"\t"+grade+"/n"
			   +"==================================\n";
	}
}


