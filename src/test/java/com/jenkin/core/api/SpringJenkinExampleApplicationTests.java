package com.jenkin.core.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class SpringJenkinExampleApplicationTests {
	public static Logger log = LoggerFactory.getLogger(SpringJenkinExampleApplicationTests.class);

	@Test
	public void contextLoads() {
		log.info("Test Case executed Successfully.....");
		log.info("Test Case executed Successfully Second time.....");
		log.info("Test Case executed Successfully Third time.....");
		log.info("Test Case executed Successfully Forth time.....");
		log.info("Test Case executed Successfully Fifth time.....");
		log.info("Test Case executed Successfully Sixth time.....");
		log.info("Test Case executed Successfully Seventh time.....");
		
		Assertions.assertEquals(true, true);
	}

}
