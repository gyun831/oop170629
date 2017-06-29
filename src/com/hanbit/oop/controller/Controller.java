package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.BmiService;
import com.hanbit.oop.service.CalculatorService;
import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.service.LeapYearService;
import com.hanbit.oop.service.LoginService;
import com.hanbit.oop.service.TaxCalculatorService;

public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TaxCalculatorService s3 = new TaxCalculatorService();
		LeapYearService s4 = new LeapYearService();
		BmiService BmiService = new BmiService();
		CalculatorService calc = new CalculatorService();
		LoginService s6 = new LoginService();
		GradeService s7 = new GradeService();
		while (true) {
			System.out.print("0.stop||1.bmi||2.tax||3.leapyear||4.calc||5.login||6.grade");
			switch (s.next()) {
			case "0":
				System.out.print("종료\n");
				return;
			case "1":
				System.out.print("나의 체질량지수(BMI)는?\n");
				System.out.print("Height :\n");
				double height = s.nextDouble();
				BmiService.setHeight(height);
				System.out.print("Weight :\n");
				double weight = s.nextDouble();
				BmiService.setWeight(weight);
				BmiService.setBmi();
				BmiService.setState();
				System.out.println(BmiService.getState());;
				break;
			case "2":
				System.out.print("name:\n");
				String name = s.next();
				System.out.print("pay:\n");
				int pay = s.nextInt();
				double rat = s3.execute(pay);
				System.out.print("###########################################\n");
				System.out.print("이름 |   연봉   |   세율    |     납부할세금 \n");
				System.out.print("-------------------------------------------------\n");
				System.out.print(String.format("%s     %d만원   %.2f      %d만원\n",name,pay,rat,(int)(rat*pay)));
				System.out.print("###########################################\n");
				break;
			case "3":
				System.out.print("년도를 입력:");
				int year = s.nextInt();
				String leapyear = s4.execute(year);
				System.out.println(leapyear);
				break;
			case "4":
				System.out.println("Enter num1");
				String num1 = s.next();
				calc.setNum1(num1);
				System.out.println("Enter opcode");
				String opcode = s.next();
				calc.setOpcode(opcode);
				System.out.println("Enter num2");
				String num2 = s.next();
				calc.setNum2(num2);
				calc.setResult();
				System.out.println(calc.getResult());
				break;
			case "5":
				System.out.print("ID :");
				String id = s.next();
				System.out.print("PASS :");
				String pw = s.next();
				String success = s6.execute(id, pw);
				System.out.println(success);
				break;
			case "6":
				System.out.print("name :");
				String name1 = s.next();
				s7.setName(name1);
				System.out.print("major :");
				String major = s.next();
				s7.setMajor(major);
				System.out.print("kor :");
				int kor = s.nextInt();
				s7.setKor(kor);
				System.out.print("eng :");
				int eng = s.nextInt();
				s7.setEng(eng);
				System.out.print("math :");
				int math = s.nextInt();
				s7.setMath(math);
				s7.setGrade();
				System.out.println(s7.toString());
			}
		}
	
	}
}
