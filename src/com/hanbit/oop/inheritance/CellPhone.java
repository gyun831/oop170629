package com.hanbit.oop.inheritance;

public class CellPhone extends Phone{
	protected String move;
	public final static String KIND="휴대폰";
	protected boolean portable;
	
	public void setMove(String move){
		this.move = move;
	}
	public String getMove(){
		return move;
	}
	public void setPortable(boolean portable){
		if(portable){
			this.setMove("이동 가능");
		}else{
			this.setMove("이동 불가능");
		}
		this.portable = portable;
	}
	
	@Override
	public String toString(){
		return KIND+"이기떄문에"+move+"한 상태로"+super.name+"에게"+super.phoneNo+"번호로"+super.brand+"을(를) 사용해서"+super.call+"통화했다";
	}
}
