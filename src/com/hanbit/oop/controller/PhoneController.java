package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[]agrs){
	Phone phone = new Phone();
	CellPhone nokia = new CellPhone();
	IPhone iphone = new IPhone();
	AndroidPhone android = new AndroidPhone();
	
	while(true){
		switch(JOptionPane.showInputDialog("0.종료 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트")){
		case "0":
			JOptionPane.showMessageDialog(null, "종료");
			return;
		case "1":
			phone.setName(JOptionPane.showInputDialog("이름"));
			phone.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
			phone.setBrand(JOptionPane.showInputDialog("브랜드"));
			phone.setCall(JOptionPane.showInputDialog("내용"));
			JOptionPane.showMessageDialog(null, phone.toString());
			break;
		case "2":
			nokia.setName(JOptionPane.showInputDialog("이름"));
			nokia.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
			nokia.setBrand(JOptionPane.showInputDialog("브랜드"));
			nokia.setCall(JOptionPane.showInputDialog("내용"));
			nokia.setPortable(true);
			JOptionPane.showMessageDialog(null, nokia.toString());
			break;
		case "3":
			iphone.setName(JOptionPane.showInputDialog("이름"));
			iphone.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
			iphone.setData(JOptionPane.showInputDialog("문자"));
			JOptionPane.showMessageDialog(null, iphone.toString());
			break;
		case "4":
			android.setAppl(JOptionPane.showInputDialog("설치할어플"));
			android.setName(JOptionPane.showInputDialog("이름"));
			android.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
			android.setData(JOptionPane.showInputDialog("문자메시지"));
			android.setSize(JOptionPane.showInputDialog("크기"));
			JOptionPane.showMessageDialog(null, android.toString());
			break;
			
			
			
			}

		}
	
	}
	
}
