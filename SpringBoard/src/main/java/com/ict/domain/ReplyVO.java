package com.ict.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class ReplyVO {
	
	private Long rno;
	private Long bno;
	private String reply;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
	// 댓글화면에서 몇번째 댓글인지 표기 하려면 추가
	private Long rownum;

}
