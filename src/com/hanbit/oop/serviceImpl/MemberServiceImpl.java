package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.service.MemberService;
import com.hanbit.opp.domain.MemberBean;

public class MemberServiceImpl implements MemberService {
	MemberBean session;
	public MemberServiceImpl(){
		session=new MemberBean();
	}
	@Override
	public String getGender(MemberBean member) {
		String gender = "";
		switch(member.getSsn().charAt(7)){
			case '1': 
			case '3':
				gender = "남";
				break;
			case '2': 
			case '4':
				gender = "여";
				break;
			case '5':
				gender = "외국인(남)";
				break;
			case '6':
				gender = "외국인(여)";
				break;
			default :
				gender = "FAIL";
				break;
		}
		return gender;
	}
	@Override
	public String getAge(MemberBean member) {
		return String.valueOf(((17-Integer.parseInt(member.getSsn().substring(0,2)))>=0)?2017-(Integer.parseInt(member.getSsn().substring(0,2))+2000)+1:2017-(Integer.parseInt(member.getSsn().substring(0,2))+1900)+1);
	}
	@Override
	public String join(MemberBean member) {
		session=member;
		return "환영합니다";
	}
	@Override
	public String Login(MemberBean member) {
		String login="";
		if(!session.getId().equals(member.getId())){
			login="ID틀림";
		}
		else if(session.getPw().equals(member.getPw())){
			login="환영합니다."+session.getName()+"("+getGender(session)+"\t"+getAge(session)+"세)";
		}
		else{
			login="PW틀림";
		}
		return login;
	}
}
