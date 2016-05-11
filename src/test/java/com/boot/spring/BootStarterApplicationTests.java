package com.boot.spring;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.web.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class BootStarterApplicationTests {

	@LocalServerPort
	private int port;

	@Test
	public void testJspWithEl() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate()
				.getForEntity("http://localhost:" + this.port, String.class);
		Assertions.assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assertions.assertThat(entity.getBody()).contains("/resources/text.txt");
	}

}