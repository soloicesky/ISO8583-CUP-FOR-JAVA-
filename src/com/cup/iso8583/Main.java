/*
 * @author solomon
 * @fileName Main.java
 * @date 2013-10-09 ÏÂÎç17:01:44
 * @description 
 *  		JUST FOR TEST
 */

package com.cup.iso8583;


public class Main {
	public static void main(String[] args) {
		ISO8583Repo repo = ISO8583Repo.getInstance();
		int len = 0;
		byte[] msg = new byte[1024];
		repo.put(new Element(2, "123123123", "123123123".length()));
		ISO8583 packIso8583 = new ISO8583();

		int[] fieldSet = { 2 };
		len = packIso8583.generateISO8583Msg(msg, fieldSet);

		System.out.println("len = " + len);
		System.out.println("desmsg=" + HexStringUtil.byteArrayToHexstring(msg));

		len = packIso8583
				.parseISO8583Msg(
						HexStringUtil
								.hexStringToBytes("3020048020C08811000000000000000001000139022000376013822000594988787DB26C2C1903514D8900313233343536373831323334353637383930313233343531353606100000000000000014220000490005013532413644424543"),
						8);
		System.out.println("len = " + len);
		Element element = ISO8583Repo.getInstance().getElement(35);

		System.out.println("field35:\n" + element.getValue());
		
		len = packIso8583
				.parseISO8583Msg(
						HexStringUtil
								.hexStringToBytes("703E00810ED088131960138220005949887870000000000000000001000135112604103149121231000812345678303030303030303034383038303032303938303031323334353637383132333435363738393031323334352238383838383838383838383636363636363636363636313536061000000000000000142200004900050100034355503343333430354239"),
						8);
		System.out.println("len = " + len);
		Element element1 = ISO8583Repo.getInstance().getElement(39);

		System.out.println("field39:\n" + element1.getValue());
	}

}
