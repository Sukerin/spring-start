package com.sukerin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnApplicationTests {
	@Value("${dr.test}")
	private String test;
	@Test
	public void contextLoads() {
		System.out.println(test);

	}


}
