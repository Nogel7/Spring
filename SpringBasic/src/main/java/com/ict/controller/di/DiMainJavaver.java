package com.ict.controller.di;

import com.ict.controller.di.classfile.Singer;
import com.ict.controller.di.classfile.Stage;

public class DiMainJavaver {

	public static void main(String[] args) {
		// 가수, 무대를 생성한 다음
		Singer singer = new Singer();
		Stage stage = new Stage(singer);
		
		// 무대의 공연(perform)메서드를 호출해주세요.
		stage.perform();
		// 그냥 가수가 노래하는것도 가능한지 테스트해주세요.
		//singer.sing();
	}

}
