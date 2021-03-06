package com.ict.controller.vo;

import lombok.Data;

// 가상의 "회원 괸라용 VO"

// lombok의 @Data는 해당 VO의 setter, getter, 생성자, toString을 자동생성해줍니다.
// 단, lombok을 사용하기 위해서는 1.lombok설치 -> 2.pom.xml에 lombok관련 세팅을 해야합니다.
@Data
public class UserVO {
	
	// 유저 테이블 컬럼 5개에 대응하는 VO
	private int userNum;
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;	

}
