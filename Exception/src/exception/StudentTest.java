package exception;

import junit.framework.TestCase;
import logging.MyLogger;

public class StudentTest extends TestCase{

	public void testStudent(){

		String name = null;
		MyLogger myLogger = new MyLogger();
		
		try{
			Student student = new Student(name);
			fail();
		} catch( StudentNameFormatException e) {
			myLogger.warning(e.getMessage());
			assertEquals("name must not be null", e.getMessage());
		}
		
		try{
			Student student = new Student("a b c d");
			fail();
			
		} catch( StudentNameFormatException e) {
			assertEquals("too long", e.getMessage());
		}
	}
}
