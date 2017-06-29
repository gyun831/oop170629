package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.MemberService;
public class MemberController {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		MemberService memberservice = new MemberService();
		
		while(true){
			System.out.println("0.end 1.join 2.login");
			switch(s.next()){
			case "0":
				System.out.println("System 종료");
				return;
			case "1":
				System.out.println("이름:");
				String name = s.next();
				memberservice.setName(name);
				System.out.println("주민등록번호:");
				String ssn = s.next();
				memberservice.setSsn(ssn);
				System.out.println("ID:");
				String id = s.next();
				memberservice.setId(id);
				System.out.println("PW:");
				String pw = s.next();
				memberservice.setPw(pw);
				System.out.println("회원가입 축하!");
				break;
			case "2":
				System.out.println("ID:");
				String loginid = s.next();
				System.out.println("PW:");
				String loginpw = s.next();
				memberservice.setLogin(loginid, loginpw);
				System.out.println(memberservice.getLogin());

			}
		}
	}

}
