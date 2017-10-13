package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Origin {
	private String origin;
	@Override
    public String toString() {
		return "origin  : "+origin;
	}
}
