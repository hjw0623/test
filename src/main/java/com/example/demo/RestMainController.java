package com.example.demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
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
		log.info("====gson=====");
		log.info(any2.toString());
		
		log.info("=====post 1=====");

//		ObjectMapper mapper = new ObjectMapper();
//		String jsonAny2 = mapper.writeValueAsString(any2);
		String jsonAny2 = gson.toJson(any2);
		log.info(jsonAny2);	
		log.info("=====post====");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String ret = restTemplate.postForObject("https://httpbin.org/post", jsonAny2, String.class);
		log.info("===post response ===");
		log.info(ret);
		
		log.info("----extra---");
		AnythingResult response = gson.fromJson(ret, AnythingResult.class);
		log.info(gson.toJson(response.getJson()));
//		String ret = restTemplate.postForObject("https://httpbin.org/post", jsonAny2.toString(), String.class);

		

	}
}
