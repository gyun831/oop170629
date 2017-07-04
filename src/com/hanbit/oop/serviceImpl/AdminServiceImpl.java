package com.hanbit.oop.serviceImpl;

import java.nio.channels.MembershipKey;

import com.hanbit.oop.service.AdminService;
import com.hanbit.opp.domain.MemberBean;

public class AdminServiceImpl implements AdminService{
	int cnt;
	MemberBean member;
	MemberBean[] members;
	public AdminServiceImpl(String sCount){
		cnt = 0;
		member = new MemberBean();
		members = new MemberBean[Integer.parseInt(sCount)];
		
	}
	@Override
	public void addMember(MemberBean member) {
		members[cnt] = member;
		//for(int i=0;i<(cnt+1);i++){
			//System.out.println(members[i].toString());
		//}
		cnt++;
	}
	@Override
	public MemberBean[] getMembers(){
		return members;

	}
	@Override
	public int countMembers() {
		return cnt;
	}
	@Override
	public MemberBean findById(String id) {
		member = new MemberBean();
		for(int i=0; i<cnt; i++){
			if(id.equals(members[i].getId())){
				member = members[i];
			}
			break;
		}
		return member;
	}
	@Override
	public MemberBean[] findByName(String name) {
		int j=0;
		for(int i=0;i<cnt;i++){
			if(name.equals(members[i].getName()))
			j++;
		}
		MemberBean[] find = new MemberBean[j];
		int k=0;
		for(int i=0;i<cnt;i++){
			if(name.equals(members[i].getName())){
				find[k]=members[i];
				k++;
				}
			if(j==k){
				break;
			}
		}
		return find;
	}
	@Override
	public void updatePW(MemberBean member) {
		for(int i=0; i<cnt;i++){
			if(member.getId().equals(members[i].getId())){
				members[i].setPw(member.getPw());
				break;
			}
		}
	}
}
