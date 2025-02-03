package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.sql.exec.spi.JdbcOperationQuerySelect;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringtestApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());
		//예상 결과와 실제 결과 동일한지 테스트 asserEquals(기댓값, 실젯값)
		Question q = all.get(0);
		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고싶습니다");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링 질문입니다.");
//		q2.setContent("id는 자동 생성 되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
	}

}
