/*
 * @author solomon
 * @fileName Element.java
 * @date 2013-10-09 ÏÂÎç14:11:44
 * @description 
 */

package com.viewat.iso8583;

public class Element {
	private int fieldId;
	private String value;
	private int length;
	
	public Element()
	{
		
	}
	
	public Element(int fid, String V, int len)
	{
		this.fieldId = fid;
		this.value = V;
		this.length = len;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
}
