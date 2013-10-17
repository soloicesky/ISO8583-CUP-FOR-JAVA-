/*
 * @author solomon
 * @fileName FieldAttr.java
 * @date 2013-10-09 下午14:01:44
 * @description 
 */

package com.cup.iso8583;

public class FieldAttr {

	public static final int ERR_UNPACK_LEN = -1000; /* 解包后数据长度与实际长度不符 */

	public static final int Attr_a = 0;
	public static final int Attr_b = 1;
	public static final int Attr_n = 2;
	public static final int Attr_z = 3;
	public static final int Attr_UnUsed = 4;
	public static final int Attr_Over = 5;

	public static final int Attr_var1 = 0;
	public static final int Attr_var2 = 1;
	public static final int Attr_fix = 2;
	
	
	private int eElementAttr;
	private int eLengthAttr;
	private int uiLength;
	
	public FieldAttr(int eattr, int elenattr, int len)
	{
		this.eElementAttr = eattr;
		this.eLengthAttr = elenattr;
		this.uiLength = len;
	}

	public int geteElementAttr() {
		return eElementAttr;
	}

	public void seteElementAttr(int eElementAttr) {
		this.eElementAttr = eElementAttr;
	}

	public int geteLengthAttr() {
		return eLengthAttr;
	}

	public void seteLengthAttr(int eLengthAttr) {
		this.eLengthAttr = eLengthAttr;
	}

	public int getUiLength() {
		return uiLength;
	}

	public void setUiLength(int uiLength) {
		this.uiLength = uiLength;
	}
	
	
}
