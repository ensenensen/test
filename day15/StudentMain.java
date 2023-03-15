package day15;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// 학생정보를 관리할 Map
		Map<Long, StudentDTO> studentMap = new HashMap<>();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(1L);
		studentDTO.setStudentNumber("1111");
		studentDTO.setStudentName("김자바");
		studentDTO.setStudentMajor("컴퓨터공학");
		studentDTO.setStudentMobile("010-1111-1111");
		
		studentMap.put(studentDTO.getId(), studentDTO);
		
		StudentDTO studentDTO2 = new StudentDTO();
		studentDTO2.setId(1L);
		studentDTO2.setStudentNumber("1111");
		studentDTO2.setStudentName("김자바");
		studentDTO2.setStudentMajor("컴퓨터공학");
		studentDTO2.setStudentMobile("010-1111-1111");
		
		System.out.println(studentDTO.equals(studentDTO2));
		
		studentMap.put(studentDTO2.getId(), studentDTO2);
		
		// 반복문으로 출력
		for(Long id: studentMap.keySet()) {
			System.out.println(id);
			System.out.println(studentMap.get(id));
			// 학생의 이름만
			System.out.println(studentMap.get(id).getStudentName());
		}

	}

}
