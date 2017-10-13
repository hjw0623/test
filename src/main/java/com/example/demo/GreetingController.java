//package com.example.demo;
//
//import java.io.BufferedInputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.Arrays;
//import java.util.concurrent.atomic.AtomicLong;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.google.gson.Gson;
//
//@RestController
//public class GreetingController {
//	private static InputStream in;
//	private static OutputStream out;
//	private static URL url;
//	private static HttpURLConnection conn;
//	private static final String template = "Hello, %s!";
//	private final AtomicLong counter = new AtomicLong();
//
//	@RequestMapping("/greeting")
//	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return new Greeting(counter.incrementAndGet(), String.format(template, name));
//	}
//
//	@GetMapping("/test")
//	public void test() {
//		String apiURL = "https://httpbin.org/anything";
//		// String ret = restTemplate
//		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//		Anything result = restTemplate.getForObject(apiURL, Anything.class);
//		Anything ret = getAnything2(apiURL);
//		System.out.println(result.toString());
//		return;
//	}
//	
//	//try3
//	@RequestMapping(value="/test3", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
//	public String  test3(Model model) {
//		
//		model.addAttribute("test");
//		return "jsonTemplate";
//	}
//
//	private static void getEmployees() {
//		final String uri ="https://httpbin.org/anything";
//		RestTemplate restTemplate = new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<Anything> entity = new HttpEntity<Anything>(headers);
//		
//		ResponseEntity<Anything> result = restTemplate.exchange(uri, HttpMethod.GET, entity, Anything.class);
//		System.out.println(result.getBody().toString());
//	}
//
//	// try 1
//	@GetMapping("/")
//	public static String getData() {
//		String apiURL = "https://httpbin.org/anything";
//
//		try {
//			url = new URL(apiURL);
//			conn = (HttpURLConnection) url.openConnection();
//			conn.setRequestMethod("GET");
//			int responseCode = conn.getResponseCode();
//			if (responseCode == 200) {
//				System.out.println("access ");
//				in = new BufferedInputStream(conn.getInputStream());
//				Anything any = getAnything(in);
//				System.out.println(any.toString());
//			} else {
//				System.out.println("fail");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return apiURL;
//
//	}
//
//	// try 1 inner class로 json 객체 받기
//	public static Anything getAnything(InputStream in) {
//		Gson gson = new Gson();
//		Anything any = gson.fromJson(new InputStreamReader(in), Anything.class);
//		System.out.println(any.getUrl());
//		return any;
//	}
//
//	public static Anything getAnything2(String apiUrl) {
//		HttpHeaders header = new HttpHeaders();
//		// RestTemplate
//
//		RestTemplate restTemplate = new RestTemplate();
//
//		try {
//			System.out.println("access try");
//			Anything responseEntity = restTemplate.getForObject(apiUrl, Anything.class);
//			System.out.println(responseEntity);
//			return responseEntity;
//		} catch (Exception e) {
//			return null;
//		}
//	}
//}
