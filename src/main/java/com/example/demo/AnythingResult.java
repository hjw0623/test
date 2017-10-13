package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnythingResult {
	private String data;
	private Headers headers;
	private Anything json;
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
    public String toString2() {
		return this.json.toString();
	}
	

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Headers getHeaders() {
		return headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public Anything getJson() {
		return json;
	}
	public void setJson(Anything json) {
		this.json = json;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	class Headers {
		@SerializedName("Accept")
		String accept;
		@SerializedName("Accept-Encoding")
		String acceptEncoding;
		@SerializedName("Accept-Language")
		String acceptLanguage;
		@SerializedName("Connection")
		String connection;
		@SerializedName("Cookie")
		String cookie;
		
		public String getAccept() {
			return accept;
		}

		public void setAccept(String accept) {
			this.accept = accept;
		}

		public String getAcceptEncoding() {
			return acceptEncoding;
		}

		public void setAcceptEncoding(String acceptEncoding) {
			this.acceptEncoding = acceptEncoding;
		}

		public String getAcceptLanguage() {
			return acceptLanguage;
		}

		public void setAcceptLanguage(String acceptLanguage) {
			this.acceptLanguage = acceptLanguage;
		}

		public String getConnection() {
			return connection;
		}

		public void setConnection(String connection) {
			this.connection = connection;
		}

		public String getCookie() {
			return cookie;
		}

		public void setCookie(String cookie) {
			this.cookie = cookie;
		}

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getReferer() {
			return referer;
		}

		public void setReferer(String referer) {
			this.referer = referer;
		}

		public String getUserAgent() {
			return userAgent;
		}

		public void setUserAgent(String userAgent) {
			this.userAgent = userAgent;
		}

		@SerializedName("Host")
		String host;
		@SerializedName("Referer")
		String referer;
		
		@SerializedName("User-Agent")
		String userAgent;
		
		Headers(){}
		



	}
}