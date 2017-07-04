package com.hanbit.oop.service;

import com.hanbit.opp.domain.GradeBean;

public interface GradeService {
	public int calcTotal(GradeBean g);
	public int calcAvg(int total);
	public String getGrade(int avg);

}
