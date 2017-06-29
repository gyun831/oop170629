package com.hanbit.oop.service;

public class LoginService {
		public static final String USER_ID="kim";
		public static final String USER_PASS="1";
		public String execute(String id, String pw){
			String success="";
		
			if(!id.equals(USER_ID)){
				success="ID틀림";
			}
			else if(pw.equals(USER_PASS)){
				success="로그인성공";
			}
			else{
				success="PW틀림";
			}
			return success;
		}	
	}

