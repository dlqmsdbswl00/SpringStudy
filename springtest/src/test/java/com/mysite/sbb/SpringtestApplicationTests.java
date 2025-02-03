package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

//		//질문 데이터 저장하기
//		// 데이터 저장 부분
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
//		
//		//질문 데이터 조회하기
//		
//		
//		//findAll 메서드
////		question 테이블에 저장된 모든 데이터 사이즈 조회
//		
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//		// 예상 결과와 실제 결과 동일한지 테스트
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
//
//		
////		findById 메서드
////		id 값으로 데이터 조회 : 리턴타입 Optionl (값이 존재하지 않을수도 있어서)
////		id가 1인 질문 검색 후 질문 제목이 맞으면 테스트 통과
//		
//		Optional<Question> oq = this.questionRepository.findById(1);
//		// id 값으로 데이터 조회
//		if (oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
//		
//		
//		
//		findBySubject 메서드
//		
//		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());
//		
//		즉, "findBy + 엔티티 속성명" 작성하면 속성 값으로 데이터 검색 가능 

////		findBySubjectAndContent 메서드
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "스프링 질문입니다.");
//		assertEquals(1, q.getId());
//		
//
////		findBySubjectLike 메서드
////		특정 문자열 포함 조회
//		
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
		
	}

}
