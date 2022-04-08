package com.ict.persistence;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.domain.BoardVO;
import com.ict.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	//@Test
	public void testgetList() {
		List<BoardVO> result = boardMapper.getList();  	
		log.info("저장된 게시물 정보 : " + result);
	}
	
	// insert를 실행할 테스트코드를 하단에 작성해보겠습니다.
	//@Test
	public void testInsert() {
		// 글 입력을 위해서 BoardVO 타입을 매개로 사용함
		// 따라서 BoardVO를 만들어놓고
		// setter로 글제목, 글본문, 글쓴이 만 저장해둔 채로
		// mapper.insert(vo); 를 호출해서 실행여부를 확인하면 됨.
		// 위 설명을 토대로 아래 vo에 6번글에 대한 제목 본문 글쓴이를 넣고
		// 호출해주신 다음 실제로 DB에 글이 들어갔는지 확인해주세요.
		
		// vo를 입력받는 insert 메서드 특성상
		// title, content, writer가 채워진 vo를 먼저 생성해야 합니다.
		BoardVO vo = new BoardVO();
		log.info("채워넣긴 전 : " + vo);// 디버깅
		
		// 입력할 글에 대한 제목, 글쓴이, 본문을 vo에 넣어줍니다.
		vo.setTitle("새로넣는글");
		vo.setContent("새로넣는본문");
		vo.setWriter("새로넣는글쓴이");
		
		log.info("채워넣은 후 : " + vo);
		// vo내부에 데이터가 바인딩된걸 확인했으니 메서드 호출
		boardMapper.insert(vo);
		
	    }
		
		// select메서드에 대한 테스트 코드 작성
	    //@Test
		public void getSelect() {
			// 가져오기 (글번호는 두 번째로 큰 번호로 해주세요.)
			BoardVO vo = boardMapper.select(5);  	
			// 로그 찍기
			//log.info(vo);
		}
		
		// delete 메서드에 대한 테스트 코드 작성 후
		// 삭제여부를 sqldeveloper나 상단의 getAllList()로 확인해보세요.
		//@Test
		public void testDelete() {
			boardMapper.delete(1);
		}
		
		// update 메서드에 대한 테스트 코드를 작성해주신 다음
		// 수정여부를 getAllList()로 확인해보세요.
		//@Test
		public void testUpdate() {
			BoardVO vo = new BoardVO();
			log.info("전달 데이터 아직 입력 안됨 vo : " + vo);
			
	     	vo.setTitle("범칙금");
			vo.setContent("아 돈날렸다고~");
			vo.setBno(3);
			
			log.info("전달 데이터가 입력된 vo : " + vo);
			boardMapper.update(vo);
		}
		
		@Test
		public void testUpdate2() {
			boardMapper.update2("up2로 바꾼제목","up2로 바꾼본문", 2);
		}
		
	

}
