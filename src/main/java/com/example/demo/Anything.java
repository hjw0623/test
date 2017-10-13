package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Anything {
	private Object[] args;
	private Object[] files;
	private Object[] form;
	
	private String data;
	private Headers headers;
	private String json;
	private String method;
	private String origin;
	private String url;
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
	@Override
    public String toString() {

        return "[AnyThing] \n"
                + "data: " + data + "\n"
                + "method: " + method + "\n"
                + "origin: " + origin + "\n"
                + "url: " + url + "\n"
                + "  headers >> Accept: " + headers.accept + "\n"
                + "  headers >> Accept-Encoding: " + headers.acceptEncoding + "\n"
                + "  headers >> Accept-Language: " + headers.acceptLanguage + "\n"
                + "  headers >> Connection: " + headers.connection + "\n"
                + "  headers >> Cookie: " + headers.cookie + "\n"
                + "  headers >> Host: " + headers.host + "\n"
                + "  headers >> Referer: " + headers.referer + "\n"
                + "  headers >> User-Agent: " + headers.userAgent + "\n";
    }

	class Headers {
//		@SerializedName("Accept")
		String accept;
//		@SerializedName("Accept-Encoding")
		String acceptEncoding;
//		@SerializedName("Accept-Language")
		String acceptLanguage;
//		@SerializedName("Connection")
		String connection;
//		@SerializedName("Cookie")
		String cookie;
		
//		@SerializedName("Host")
		String host;
//		@SerializedName("Referer")
		String referer;
		
//		@SerializedName("User-Agent")
		String userAgent;
		
		Headers(){}
		



	}
}