package com.validation.picture.entity;

import java.io.Serializable;

public class Picture implements Serializable {
	private static final long serialVersionUID = 1;
	private String name;
	private boolean isValid;
	private long size;
	
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	
	
}
