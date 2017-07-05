package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;
import com.hanbit.opp.domain.MemberBean;

public class AdminController {
	public static void main(String[]args){
		AdminService service = new AdminServiceImpl();
		MemberBean member = null;
		
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수 3.회원목록 4.회원검색(ID) 5.회원검색(이름) 6.회원수정 7.회원삭제")){
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				member=new MemberBean();
				String[] arr = JOptionPane.showInputDialog("이름/ID/PW/SSN").split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "회원가입성공!!");
				break;
			case "2":
				JOptionPane.showMessageDialog(null,service.countMembers());
				break;
			case "3":
				JOptionPane.showMessageDialog(null,service.getMembers());
				break;
			case "4":
				JOptionPane.showMessageDialog(null, service.findById(JOptionPane.showInputDialog("조회하려는 ID")));
				break;
			case "5":
				String name = JOptionPane.showInputDialog("조회하려는 이름");
				MemberBean[] members = service.findByName(name);
				String result = "";
				if(members.length==0){
					result = "조회할 이름이 없습니다.";
				}else{
					for(int i=0;i<members.length;i++){
						result+=members[i].toString();
					}
				}
				JOptionPane.showMessageDialog(null,result);
				break;
			case "6":
				member = new MemberBean();
				String ar[] = JOptionPane.showInputDialog("아이디/비밀번호").split("/");
				member.setId(ar[0]);
				member.setPw(ar[1]);
				service.updatePW(member);
				JOptionPane.showMessageDialog(null, "비밀번호 수정완료");
				break;
			case "7":
				service.delete(JOptionPane.showInputDialog("삭제하려는 ID"));
				JOptionPane.showMessageDialog(null, "삭제완료");
			default:
				break;
			}
		}
	}
}
