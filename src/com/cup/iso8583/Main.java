/*
 * @author solomon
 * @fileName Main.java
 * @date 2013-10-09 ����17:01:44
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
								.hexStringToBytes("012345678901234567891202003020048020C08811000000000000000001000139022000376013822000594988787DB26C2C1903514D8900313233343536373831323334353637383930313233343531353606100000000000000014220000490005013532413644424543"),
						8);
		System.out.println("len = " + len);
		Element element = ISO8583Repo.getInstance().getElement(35);

		System.out.println("field35:\n" + element.getValue());
		
		len = packIso8583
				.parseISO8583Msg(
						HexStringUtil
								.hexStringToBytes("01234567890123456789120210703E00810ED088131960138220005949887870000000000000000001000135112604103149121231000812345678303030303030303034383038303032303938303031323334353637383132333435363738393031323334352238383838383838383838383636363636363636363636313536061000000000000000142200004900050100034355503343333430354239"),
						8);
		System.out.println("len = " + len);
		Element element1 = ISO8583Repo.getInstance().getElement(39);

		System.out.println("field39:\n" + element1.getValue());
		
		//60052100006031003100010200702406C020C09A1119621226400000189946300000000000000000090000082106051000010012376212264000001899463DFF9354AB57C51402903132333435363738313233343536373839303132333435313536019C2794A09CB6C3261000000000000001239F26087D7013C90F9B688B9F2701809F101307010103A0A802010A01000000361907167E7E9F37049F0E155D9F36020795950500800400009A031310259C01009F02060000000000095F2A02015682027C009F1A0201569F03060000000000009F3303E0E1C89F34030203009F3501229F1E0831323334353637380014220001280005013037343146304245
		len = packIso8583
				.parseISO8583Msg(
						HexStringUtil
								.hexStringToBytes("60052100006031003100010200702406C020C09A1119621226400000189946300000000000000000090000082106051000010012376212264000001899463DFF9354AB57C51402903132333435363738313233343536373839303132333435313536019C2794A09CB6C3261000000000000001239F26087D7013C90F9B688B9F2701809F101307010103A0A802010A01000000361907167E7E9F37049F0E155D9F36020795950500800400009A031310259C01009F02060000000000095F2A02015682027C009F1A0201569F03060000000000009F3303E0E1C89F34030203009F3501229F1E0831323334353637380014220001280005013037343146304245"),
						8);
		System.out.println("len = " + len);
		Element element3 = ISO8583Repo.getInstance().getElement(55);

		System.out.println("field55:\n" + element3.getValue());
		//60052100006031000000000210703E02810ED08A1319621226400000189946300000000000000000090000081442091025210612310001000812345678303030303030303130363239303033313839303031323334353637383132333435363738393031323334352238383838383838383838383636363636363636363636313536261000000000000000179F36020795910A0A555EEBFC136320303000142200012800050100034355504434463631383139
		len = packIso8583
				.parseISO8583Msg(
						HexStringUtil
								.hexStringToBytes("60052100006031000000000210703E02810ED08A1319621226400000189946300000000000000000090000081442091025210612310001000812345678303030303030303130363239303033313839303031323334353637383132333435363738393031323334352238383838383838383838383636363636363636363636313536261000000000000000179F36020795910A0A555EEBFC136320303000142200012800050100034355504434463631383139"),
						8);
		System.out.println("len = " + len);
		Element element2 = ISO8583Repo.getInstance().getElement(39);

		System.out.println("field39:\n" + element2.getValue());
	}

}
