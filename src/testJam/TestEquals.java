package testJam;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import entities.person;

public class TestEquals {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestEquals.class);
	
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		logger.debug(s1 == s2);
		logger.debug(s1.equals(s2));
		Set<String> set01 = new HashSet<String>();
		set01.add(s1);
		set01.add(s2);
		logger.debug( set01.size());

		logger.debug("===========================");
		
		person p1 = new person("abc");
		person p2 = new person("abc");
		logger.debug(p1 == p2);
		logger.debug(p1.equals(p2));
		Set<person> set02 = new HashSet<person>();
		set02.add(p1);
		set02.add(p2);
		logger.debug(set02.size());
	}
}
