package com.example;

public class Data {
	
	private Integer id;
	private String value;
	private Integer key;
	private String keyValue;
	
	public Data(Integer id, String value, Integer key, String keyValue){
		this.id = id;
		this.value = value;
		this.key = key;
		this.keyValue = keyValue;
	}
	
	public Data(Integer id, String value){
		this.id = id;
		this.value = value;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

}
