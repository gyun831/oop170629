package com.hanbit.oop.service;

import com.hanbit.opp.domain.MemberBean;

public interface AdminService {
	public void addMember(MemberBean member);
	public MemberBean[] getMembers();
	public int countMembers();
	public MemberBean findById(String id);
	public MemberBean[] findByName(String name);
	public void updatePW(MemberBean member);
}
