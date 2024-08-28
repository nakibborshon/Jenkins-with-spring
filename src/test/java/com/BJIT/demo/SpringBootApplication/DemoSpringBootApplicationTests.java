package com.BJIT.demo.SpringBootApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.LoggerFactory;

@SpringBootTest
class DemoSpringBootApplicationTests {
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(DemoSpringBootApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("It's a logger test for CI");
		assertEquals(true, true);
	}

}
