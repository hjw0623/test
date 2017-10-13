package com.example.demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestMainController {
	private static InputStream in;
	private static OutputStream out;
	private static URL url;
	private static final Logger log = LoggerFactory.getLogger(RestMainController.class);

	@RequestMapping("/greeting2")
	public static void restTemplate(RestTemplate restTemplate) throws Exception {

//		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//		log.info(quote.toString());
//		
		Origin origin = restTemplate.getForObject("https://httpbin.org/ip", Origin.class);
		log.info(origin.toString());
//		
//		Anything any = restTemplate.getForObject("https://httpbin.org/anything", Anything.class);
//		log.info(any.toString());

	}
}
