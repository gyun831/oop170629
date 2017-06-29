package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.BmiService;
import com.hanbit.oop.service.CalculatorService;
import com.hanbit.oop.service.LeapYearService;
import com.hanbit.oop.service.LoginService;
import com.hanbit.oop.service.TaxCalculatorService;

public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TaxCalculatorService s3 = new TaxCalculatorService();
		LeapYearService s4 = new LeapYearService();
		CalculatorService s5 = new CalculatorService();
		LoginService s6 = new LoginService();
		while (true) {
			System.out.print("0.stop 1.bmi 2.tax 3.leapyear  4.calc 5.login");
			switch (s.next()) {
			case "0":
				System.out.print("종료\n");
				return;
			case "1":
				System.out.print("나의 체질량지수(BMI)는?\n");
				System.out.print("Height :\n");
				double height = s.nextDouble();
				System.out.print("Weight :\n");
				double weight = s.nextDouble();
				String state = s5.calcBMI(height,weight);
				System.out.println(state);;
				break;
			case "2":
				System.out.print("name:\n");
				String name = s.next();
				System.out.print("pay:\n");
				int pay = s.nextInt();
				double rat = s3.execute(name,pay);
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
				System.out.print("Calculator\n");
				System.out.print("Enter num1\n");
				String a = s.next();
				System.out.print("Enter num2\n");
				String b = s.next();
				break;
			case "5":
				System.out.print("ID :");
				String id = s.next();
				System.out.print("PASS :");
				String pw = s.next();
				String success = s6.execute(id, pw);
				System.out.println(success);
				break;
			}
		}
	
	}
}
