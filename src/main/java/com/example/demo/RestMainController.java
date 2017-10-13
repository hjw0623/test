package com.example.demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@RestController
public class RestMainController {
	private static InputStream in;
	private static OutputStream out;
	private static URL url;
	private static final Logger log = LoggerFactory.getLogger(RestMainController.class);

	@RequestMapping("/greeting2")
	public static void restTemplate() throws Exception {
		
//		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//		log.info(quote.toString());
		RestTemplate restTemplate = new RestTemplate();
		String origin = restTemplate.getForObject("https://httpbin.org/ip", String.class);
		log.info("origin : " +origin);
		Gson gson = new Gson();
		Origin ori = gson.fromJson(origin, Origin.class);
		
		//Anything inner class
		String any = restTemplate.getForObject("https://httpbin.org/anything", String.class);
		log.info("raw any : "+any);
		Anything any2 = gson.fromJson(any, Anything.class);
		log.info(any2.toString());
		
		
		log.info("=====post =====");
		String ret = restTemplate.postForObject("https://httpbin.org/post", any2.toString(), String.class);
		log.info(ret);
//		Anything any = restTemplate.getForObject("https://httpbin.org/anything", Anything.class);
//		log.info(any.toString());

	}
}
