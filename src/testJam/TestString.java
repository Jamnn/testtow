package testJam;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import entities.person;

public class TestString {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestString.class);
	
	
	
	public static void main(String[] args) {
//		String s1 = new String("abc")l;n
		Integer i = new Integer(2);
		person p1 = new person();
		System.out.println(p1);
		logger.debug(p1);
		logger.debug(i);
		
		
	}
}
