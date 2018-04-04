package com.jedijava.base.model;

import java.io.Serializable;

/**
 * 
 * @author liukaiyang
 */
public class BaseModel implements Serializable{

	private static final long serialVersionUID = 1437450263610417315L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
