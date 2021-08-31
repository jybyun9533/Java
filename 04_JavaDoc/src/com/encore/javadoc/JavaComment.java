package com.encore.javadoc;
// Single Comment

/*
 * Multi Line Comment
 * 
 */

/**
 * 
 * @author Byun Jun young
 * @since JDK 1.8.0_241
 * @version [소스코드 버전 정보]
 */


public class JavaComment {
	
	/**
	 * 엔코아 아카데미에서 수강하는 학생의 이름
	 */
	String name;
	/**
	 * 엔코아 아카데미에서 수강하는 학생의 dkdlel
	 */
	int stuID;
	
	
	/**
	 * 
	 * @param java test score
	 * @param python test score
	 * @return 자바와 파이썬 성적의 합산으로 학생의 최종성적을 반환
	 */
	public int scoreSum(int java, int python) {
		return java + python;
	}
	

}
