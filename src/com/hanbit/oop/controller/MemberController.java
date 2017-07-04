package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.MemberService;
import com.hanbit.oop.serviceImpl.MemberServiceImpl;
import com.hanbit.opp.domain.MemberBean;
import javax.swing.*;

public class MemberController {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		MemberBean member = new MemberBean();
		MemberService memberservice = new MemberServiceImpl();
		
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.회원등록 2.로그인")){
			case "0":
				JOptionPane.showMessageDialog(null,"System 종료");
				return;
			case "1":
				member.setName(JOptionPane.showInputDialog("NAME"));
				member.setSsn(JOptionPane.showInputDialog("SSN"));
				member.setId(JOptionPane.showInputDialog("ID"));
				member.setPw(JOptionPane.showInputDialog("PW"));
				JOptionPane.showMessageDialog(null, memberservice.join(member));
				break;
			case "2":
				MemberBean temp = new MemberBean();
				temp.setId(JOptionPane.showInputDialog("ID"));
				temp.setPw(JOptionPane.showInputDialog("PW"));
				JOptionPane.showMessageDialog(null,memberservice.Login(temp));
			}
		}
	}
}
