package com.importsource.spring.samples;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringSamplesWebfluxApplicationTests {


	@Autowired
	private WebTestClient webClient;

	@Test
	public void testWelcome() throws Exception {
		WebTestClient.SingleValueBodySpec value= this.webClient.get().uri("/").accept(MediaType.TEXT_PLAIN).exchange()
				.expectBody(String.class).value();
		System.out.println("valuesdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdf是否水电费水电费是非颠倒方式:"+value);
		value.isEqualTo("Hello World");
	}

}
