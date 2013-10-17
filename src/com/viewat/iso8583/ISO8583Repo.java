/*
 * @author solomon
 * @fileName Element.java
 * @date 2013-10-09 ÏÂÎç16:11:44
 * @description 
 */

package com.viewat.iso8583;

import java.util.HashMap;

public class ISO8583Repo {
	private HashMap<Integer, Element> iso8583Items = new HashMap<Integer, Element>();
	
	private static ISO8583Repo instance = null;
	
	public ISO8583Repo()
	{
		initRepo();
	}
	
	public static ISO8583Repo getInstance()
	{
		if (instance == null) {
			instance = new ISO8583Repo();
		}
		
		return instance;
	}
	
	private void initRepo()
	{
		iso8583Items.clear();
	}
	
	public void put(Element e)
	{
		iso8583Items.put(e.getFieldId(), e);
	}
	
	public Element getElement(int fieldId)
	{
		return iso8583Items.get(fieldId);
	}
}
