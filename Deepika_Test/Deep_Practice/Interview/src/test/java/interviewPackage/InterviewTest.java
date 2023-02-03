package interviewPackage;

import org.testng.annotations.Test;

public class InterviewTest {
	@Test
	public void test1() {
		try {
			System.out.println("try");
			throw new Exception("test");
		}catch(Exception e){
			System.out.println("catch");
			System.exit(0);
		}finally{
			System.out.println("finally");
		}
	}
}
