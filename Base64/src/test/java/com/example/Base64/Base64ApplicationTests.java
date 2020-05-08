package com.example.Base64;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.validation.constraints.Null;
import javax.xml.transform.Result;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Base64ApplicationTests {

	@Autowired
	private TestWorkflow TestWorkflow;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void getDecodeBase64LowwerTest(){
		// TestWorkflow testWorkflow = new TestWorkflow();
		// String funnyStr = null;
		// String Str = TestWorkflow.getDecodeBase64("QSBNQU4gVEhBSQ==");
		// assertEquals("A MAN THAI", testWorkflow);
			
	}

}
