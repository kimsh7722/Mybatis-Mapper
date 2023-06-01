package com.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class memberDto {
	private String email;
	private String password;
	private String pwdchk;
	private String memberName;
	private String year;
	private String month;
	private String day;
	
	private String tel1;
	private String tel2;
	private String tel3;
	
	private String phone1;
	private String phone2;
	private String phone3;
	
	private String emailid;
	private String subemail;
	private String emailchk;
	
	private String addr;
	private int grade;
}
