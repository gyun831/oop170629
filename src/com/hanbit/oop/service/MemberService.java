package com.hanbit.oop.service;

import com.hanbit.opp.domain.MemberBean;

public interface MemberService {
	public String getGender(MemberBean member);
	public String getAge(MemberBean member);
	public String join(MemberBean member);
	public String Login(MemberBean member);

}
