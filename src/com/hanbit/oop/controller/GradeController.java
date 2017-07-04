package com.hanbit.oop.controller;

import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.serviceImpl.GradeServiceImpl;
import com.hanbit.opp.domain.GradeBean;
import javax.swing.*;

public class GradeController {
	public static void main(String[] args) {
		GradeService grade = new GradeServiceImpl();
		GradeBean g = new GradeBean();

		while (true) {
			switch (JOptionPane.showInputDialog("0.stop 1.grade")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				g.setName(JOptionPane.showInputDialog("name"));
				g.setMajor(JOptionPane.showInputDialog("major"));
				g.setKor(Integer.parseInt(JOptionPane.showInputDialog("kor")));
				g.setEng(Integer.parseInt(JOptionPane.showInputDialog("eng")));
				g.setMath(Integer.parseInt(JOptionPane.showInputDialog("math")));
				JOptionPane.showMessageDialog(null,g.getName()+"님"+ grade.getGrade(grade.calcAvg(grade.calcTotal(g))));
				break;
			}
		}
	}
}
