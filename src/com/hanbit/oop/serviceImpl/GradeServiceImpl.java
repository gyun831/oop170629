package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.service.GradeService;
import com.hanbit.opp.domain.GradeBean;

public class GradeServiceImpl implements GradeService {
	@Override
	public int calcTotal(GradeBean g) {
		return g.getKor()+g.getEng()+g.getMath();
	}
	@Override
	public int calcAvg(int total) {
		return total/3;
	}
	@Override
	public String getGrade(int avg) {
		String grade="";
	switch(avg/10){
		case 10: case 9:         /*keyword*/
			grade = "A학점 장학금 대상입니다";
			break;
		case 8 :         /*keyword*/
			grade = "B학점 3학점 이수입니다. ";
			break;
		case 7 :         /*keyword*/
			grade = "C학점 2학점 이수입니다.";
			break;
		case 6 :         /*keyword*/
			grade = "D학점 1학점 이수입니다.";
			break;
		case 5 :         /*keyword*/
			grade = "E학점 재수강입니다.";
			break;
		default :
			grade ="학사 경고";
			break;
			}
	return grade;
	}

}
