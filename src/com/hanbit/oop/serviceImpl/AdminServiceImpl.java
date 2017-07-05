package com.hanbit.oop.serviceImpl;

import java.nio.channels.MembershipKey;

import com.hanbit.oop.service.AdminService;
import com.hanbit.opp.domain.MemberBean;

public class AdminServiceImpl implements AdminService{
	int cnt;
	MemberBean member;
	MemberBean[] members;
	public AdminServiceImpl(){
		cnt = 0;
		member = new MemberBean();
		members = new MemberBean[cnt];
		
	}
	@Override
	public void addMember(MemberBean member) {
		if(cnt==members.length){
			MemberBean[] temp=new MemberBean[cnt+1];
			System.arraycopy(members, 0, temp, 0, cnt);
			members=temp;
		}
		members[cnt++] = member;
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
	public void updatePW(MemberBean param) {
		member = findById(param.getId());
		member.setPw(param.getPw());
	}
	@Override
	public void delete(String id) {
		for(int i=0; i<cnt;i++){
			if(id.equals(members[i].getId())){
				//for(;i<cnt-1;i++){
					//members[i]=members[i+1];
					//cnt--;
				//}
						members[i]=members[cnt-1];
						members[cnt-1]=null;
						cnt--;
					}
					break;
				}
			}
}


