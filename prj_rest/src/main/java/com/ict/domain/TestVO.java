package com.ict.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data// @Data는 순환참조 문제가 있음
public class TestVO {
	
	private Integer mno;
	private String name;
	private Integer age;
	

}
