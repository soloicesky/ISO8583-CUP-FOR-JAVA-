/*
 * @author solomon
 * @fileName ISO8583.java
 * @date 2013-10-10 下午14:01:44
 * @description 
 */
package com.viewat.iso8583;

import java.util.BitSet;
import java.util.HashMap;

public class ISO8583 {
	public static final int LEN_MSG_CODE = 4;
	public static final int LEN_BITMAP = 8;
	public static final int LEN_PAN = 19;
	public static final int LEN_PROC_CODE = 6;
	public static final int LEN_TRAN_AMT = 12;
	public static final int LEN_POS_STAN = 6;
	public static final int LEN_LOCAL_TIME = 6;
	public static final int LEN_LOCAL_DATE = 4;
	public static final int LEN_EXP_DATE = 4;
	public static final int LEN_SETTLE_DATE = 4;
	public static final int LEN_ENTRY_MODE = 4;
	public static final int LEN_PAN_SEQ_NO = 3;
	public static final int LEN_SVR_CODE = 2;
	public static final int LEN_CAPTURE_CODE = 2;
	public static final int LEN_ACQUIRER_ID = 11;
	public static final int LEN_TRACK2 = 37;
	public static final int LEN_TRACK3 = 104;
	public static final int LEN_RRN = 12;
	public static final int LEN_AUTH_CODE = 6;
	public static final int LEN_RSP_CODE = 2;
	public static final int LEN_TERM_ID = 8;
	public static final int LEN_MERCHANT_ID = 15;
	public static final int LEN_ADD_RSP_DATA = 25;
	public static final int LEN_FIELD48 = 322;
	public static final int LEN_CURRENCY_CODE = 3;
	public static final int LEN_PIN_DATA = 8;
	public static final int LEN_SECURITY_INFO = 16;
	public static final int LEN_EXT_AMOUNT = 40;
	public static final int LEN_ICC_DATA = 255;
	public static final int LEN_EP_DATA = 100;
	public static final int LEN_FIELD60 = 17;
	public static final int LEN_ORIGINAL_MSG = 29;
	public static final int LEN_FIELD62 = 512;
	public static final int LEN_FIELD63 = 163;
	public static final int LEN_MAC_DATA = 8;

	// private ArrayList<FieldAttr> FieldAttrDicts = new ArrayList<FieldAttr>();
	private HashMap<Integer, FieldAttr> FieldAttrDicts = new HashMap<Integer, FieldAttr>();

	public ISO8583() {
		FieldAttrDicts.put(1, new FieldAttr(FieldAttr.Attr_b,
				FieldAttr.Attr_fix, LEN_BITMAP)); /* 1 -- Bit Map, Extended */
		FieldAttrDicts.put(2, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_var1, LEN_PAN)); /* 2 -- Primary Account Number */
		FieldAttrDicts.put(3, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_PROC_CODE)); /* 3 -- Processing Number */
		FieldAttrDicts.put(4, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_TRAN_AMT)); /* 4 -- Amount, Transaction */
		FieldAttrDicts.put(5, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 5 -- not used */
		FieldAttrDicts.put(6, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 6 -- not used */
		FieldAttrDicts.put(7, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 7 -- not used */
		FieldAttrDicts.put(8, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 8 -- not used */
		FieldAttrDicts.put(9, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 9 -- not used */
		FieldAttrDicts.put(10, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 10 -- not used */
		FieldAttrDicts.put(11, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_POS_STAN)); /*
													 * 11 -- System Trace Audit
													 * Number
													 */
		FieldAttrDicts.put(12, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_LOCAL_TIME)); /*
													 * 12 -- Time, Local
													 * Transaction
													 */
		FieldAttrDicts.put(13, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_LOCAL_DATE)); /*
													 * 13 -- Date, Local
													 * Transaction
													 */
		FieldAttrDicts.put(14, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_EXP_DATE)); /* 14 -- Date, Expiration */
		FieldAttrDicts.put(15, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_SETTLE_DATE)); /*
														 * 15 -- Date,
														 * Settlement
														 */
		FieldAttrDicts.put(16, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 16 -- not used */
		FieldAttrDicts.put(17, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 17 -- not used */
		FieldAttrDicts.put(18, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 18 -- not used */
		FieldAttrDicts.put(19, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 19 -- not used */
		FieldAttrDicts.put(20, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 20 -- not used */
		FieldAttrDicts.put(21, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 21 -- not used */
		FieldAttrDicts.put(22, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_ENTRY_MODE)); /*
													 * 22 -- Point of Service
													 * Entry Mode
													 */
		FieldAttrDicts.put(23, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_PAN_SEQ_NO)); /*
													 * 23 -- Card Sequence
													 * Number
													 */
		FieldAttrDicts.put(24, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 24 -- NII(not used) */
		FieldAttrDicts.put(25, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_SVR_CODE)); /*
													 * 25 -- Point of Service
													 * Condition Code
													 */
		FieldAttrDicts.put(26, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_CAPTURE_CODE)); /*
														 * 26 -- Point of
														 * Service PIN Capture
														 * Code
														 */
		FieldAttrDicts.put(27, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 27 -- not used */
		FieldAttrDicts.put(28, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 28 -- not used */
		FieldAttrDicts.put(29, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 29 -- not used */
		FieldAttrDicts.put(30, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 30 -- not used */
		FieldAttrDicts.put(31, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 31 -- not used */
		FieldAttrDicts.put(32, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_var1, LEN_ACQUIRER_ID)); /*
														 * 32 -- Acquiring
														 * Institution
														 * Identification
														 * Code???
														 */
		FieldAttrDicts.put(33, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 33 -- Attr_UnUsed */
		FieldAttrDicts.put(34, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 34 -- Attr_UnUsed */
		FieldAttrDicts.put(35, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_var1, LEN_TRACK2)); /* 35 -- Track 2 Data */
		FieldAttrDicts.put(36, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_var2, LEN_TRACK3)); /* 36 -- Track 3 Data */
		FieldAttrDicts.put(37, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_fix, LEN_RRN)); /*
												 * 37 -- Retrieval Reference
												 * Number
												 */
		FieldAttrDicts.put(38, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_fix, LEN_AUTH_CODE)); /*
													 * 38 -- Authorization
													 * Identification Response
													 */
		FieldAttrDicts.put(39, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_fix, LEN_RSP_CODE)); /* 39 -- Response Code */
		FieldAttrDicts.put(40, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 40 -- not used */
		FieldAttrDicts.put(41, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_fix, LEN_TERM_ID)); /*
													 * 41 -- Card Acceptor
													 * Terminal Identification
													 */
		FieldAttrDicts.put(42, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_fix, LEN_MERCHANT_ID)); /*
														 * 42 -- Card Acceptor
														 * Identification Code
														 */
		FieldAttrDicts.put(43, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 43 -- Card Acceptor Name/Location */
		FieldAttrDicts.put(44, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_var1, LEN_ADD_RSP_DATA)); /*
														 * 44 -- putitional
														 * Response Data
														 */
		FieldAttrDicts.put(45, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 45 -- Track 1 Data(not used) */
		FieldAttrDicts.put(46, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 46 -- not used */
		FieldAttrDicts.put(47, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 47 -- not used */
		FieldAttrDicts.put(48, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_var2, LEN_FIELD48)); /*
													 * 48 -- putitional Data -
													 * Private
													 */
		FieldAttrDicts.put(49, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_fix, LEN_CURRENCY_CODE)); /*
														 * 49 -- Currency Code,
														 * Transaction
														 */
		FieldAttrDicts.put(50, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 50 -- not used */
		FieldAttrDicts.put(51, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 51 -- not used */
		FieldAttrDicts.put(52, new FieldAttr(FieldAttr.Attr_b,
				FieldAttr.Attr_fix, LEN_PIN_DATA)); /*
													 * 52 -- Personal
													 * Identification Number
													 * (PIN) Data
													 */
		FieldAttrDicts.put(53, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_fix, LEN_SECURITY_INFO)); /*
														 * 53 -- Security
														 * Related Control
														 * Information
														 */
		FieldAttrDicts.put(54, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_var2, LEN_EXT_AMOUNT)); /*
														 * 54 -- putitional
														 * Amounts
														 */// max 20
		FieldAttrDicts.put(55, new FieldAttr(FieldAttr.Attr_b,
				FieldAttr.Attr_var2, LEN_ICC_DATA)); /* 55 -- Chip Data for PBOC */
		FieldAttrDicts.put(56, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 56 -- Reserved ISO */
		FieldAttrDicts.put(57, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 57 -- Reserved National */
		FieldAttrDicts.put(58, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_var2, LEN_EP_DATA)); /* 58 -- Reserved National */
		FieldAttrDicts.put(59, new FieldAttr(FieldAttr.Attr_UnUsed,
				FieldAttr.Attr_fix, 0)); /* 59 -- Reserved National */
		FieldAttrDicts.put(60, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_var2, LEN_FIELD60)); /* 60 -- Reserved Private */// max
																				// 13
		FieldAttrDicts.put(61, new FieldAttr(FieldAttr.Attr_n,
				FieldAttr.Attr_var2, LEN_ORIGINAL_MSG)); /*
														 * 61 -- Reserved
														 * Private
														 */// max 29
		FieldAttrDicts.put(62, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_var2, LEN_FIELD62)); /* 62 -- Reserved Private */
		FieldAttrDicts.put(63, new FieldAttr(FieldAttr.Attr_a,
				FieldAttr.Attr_var2, LEN_FIELD63)); /* 63 -- Reserved Private */// max
																				// 163
		FieldAttrDicts.put(64, new FieldAttr(FieldAttr.Attr_b,
				FieldAttr.Attr_fix, LEN_MAC_DATA)); /*
													 * 64 -- Message
													 * Authentication Code Field
													 */

	}

	public int generateISO8583Msg(byte[] des8583Msg, int[] fieldIdSet,
			HashMap<Integer, FieldAttr> fieldAttrSets) {
		FieldAttrDicts.putAll(fieldAttrSets);
		return generateISO8583Msg(des8583Msg, fieldIdSet);
	}

	/**
	 * 
	 * @param des8583Msg 保存组好的消息报文
	 * @param fieldIdSet 需要组的域的集合 比如{2, 11, 35, 41,42,64}
	 * @return {@value < 0} 组包失败 , @retval > 0 消息报文长度
	 */
	public int generateISO8583Msg(byte[] des8583Msg, int[] fieldIdSet) {
		// add your to do here
		int desMsgLen = 0;
		Element field;
		FieldAttr attr;
		BitSet bs = new BitSet(64);
		int contentLen;

		if (des8583Msg == null || des8583Msg.length <= 0) {
			return -1;
		}

		for (int id : fieldIdSet) {
			if (id == 1) {
				bs = new BitSet(128);
				break;
			}
		}

		desMsgLen += bs.size() / 8;

		for (int id : fieldIdSet) {

			field = ISO8583Repo.getInstance().getElement(id);
			attr = FieldAttrDicts.get(id);

			if (attr.geteElementAttr() == FieldAttr.Attr_Over) {
				break;
			}

			if (attr.geteElementAttr() != FieldAttr.Attr_UnUsed) {

				if (0 >= id && id > 64) {
					return (0 - id);
				}

				if (field.getLength() > attr.getUiLength()) {
					return (0 - id);
				}

				bs.set(id - 1);

				if (attr.geteElementAttr() == FieldAttr.Attr_b) {
					contentLen = field.getLength() / 2;
				} else {
					contentLen = field.getLength();
				}

				switch (attr.geteLengthAttr()) {
				case FieldAttr.Attr_fix:
					if (field.getLength() != attr.getUiLength()) {
						return (0 - id);
					}

					break;
				case FieldAttr.Attr_var1:
					des8583Msg[desMsgLen++] = (byte) (((contentLen / 10) << 4) | (contentLen % 10));

					break;
				case FieldAttr.Attr_var2:
					des8583Msg[desMsgLen++] = (byte) (contentLen / 100);
					des8583Msg[desMsgLen++] = (byte) ((((contentLen / 100) / 10) << 4) | ((contentLen / 100) % 10));

					break;
				default:
					break;
				}

				switch (attr.geteElementAttr()) {
				case FieldAttr.Attr_a:
					System.arraycopy(des8583Msg, desMsgLen, field.getValue()
							.getBytes(), 0, contentLen);
					desMsgLen += contentLen;
					break;
				case FieldAttr.Attr_z:

					// break;
				case FieldAttr.Attr_n:

					// break;
				case FieldAttr.Attr_b:
					System.arraycopy(
							HexStringUtil.hexStringToBytes(field.getValue()),
							0, des8583Msg, desMsgLen, ((contentLen + 1) / 2));
					desMsgLen += ((contentLen + 1) / 2);
					break;
				default:
					break;
				}
			}
		}

		System.arraycopy(BSToByteArray(bs), 0, des8583Msg, 0, bs.size() / 8);
		return desMsgLen;
	}

	/**
	 * 
	 * @param resp8583Msg
	 *            从bitmap开始到MAC
	 * @param bitMapSize
	 *            bitmap占用的字节数
	 * @return @retval < 0 解包失败； @retval == 0 解包成功
	 */
	public int parseISO8583Msg(byte[] resp8583Msg, int bitMapSize) {
		// add your to do here
		if (resp8583Msg == null || resp8583Msg.length <= 0) {
			return -1;
		}

		byte[] bm = new byte[bitMapSize];
		System.arraycopy(resp8583Msg, 0, bm, 0, bitMapSize);
		BitSet bitmap = ByteArrayToBS(bm);
		int fieldId = 0;
		FieldAttr fdAttr;
		int cursor = bitMapSize;
		int contentLen = 0;

		for (int i = 0; i < bitmap.size(); i++) {
			if (bitmap.get(i)) {
				fieldId = i + 1;
				fdAttr = FieldAttrDicts.get(fieldId);

				if (fdAttr == null) {
					return -2;
				}

				Element e = new Element();
				e.setFieldId(fieldId);

				switch (fdAttr.geteLengthAttr()) {
				case FieldAttr.Attr_fix:
					contentLen = fdAttr.getUiLength();

					break;
				case FieldAttr.Attr_var1:
					contentLen = ((resp8583Msg[cursor] & 0xF0) >> 4) * 10
							+ (resp8583Msg[cursor] & 0x0F);
					cursor++;

					if (contentLen > fdAttr.getUiLength()) {
						return (-1000 - fieldId);
					}

					break;
				case FieldAttr.Attr_var2:
					contentLen = (resp8583Msg[cursor] & 0x0F) * 100
							+ ((resp8583Msg[cursor + 1] & 0xF0) >> 4) * 10
							+ (resp8583Msg[cursor + 1] & 0x0F);
					cursor += 2;

					if (contentLen > fdAttr.getUiLength()) {
						return (-1000 - fieldId);
					}

					break;

				default:
					break;
				}

				switch (fdAttr.geteElementAttr()) {
				case FieldAttr.Attr_a:

					e.setValue(new String(resp8583Msg, cursor, contentLen));
					e.setLength(contentLen);
					cursor += contentLen;
					break;
				case FieldAttr.Attr_n:

					// break;
				case FieldAttr.Attr_z:

					e.setValue(HexStringUtil.byteArrayToHexstring(resp8583Msg,
							cursor, cursor + ((contentLen + 1) / 2)));
					e.setLength(contentLen);

					cursor += ((contentLen + 1) / 2);

					break;
				case FieldAttr.Attr_b:

					e.setValue(HexStringUtil.byteArrayToHexstring(resp8583Msg,
							cursor, cursor + contentLen));
					e.setLength(contentLen);

					cursor += contentLen;

					break;
				default:
					break;
				}

				System.out.println("" + e.getFieldId() + " : " + e.getLength()
						+ " : " + e.getValue());
				ISO8583Repo.getInstance().put(e);
			}
		}

		return 0;
	}

	public int parseISO8583Msg(byte[] resp8583Msg, int bitMapSize,
			HashMap<Integer, FieldAttr> fieldAttrSets) {
		FieldAttrDicts.putAll(fieldAttrSets);
		return parseISO8583Msg(resp8583Msg, bitMapSize);
	}

	public byte[] BSToByteArray(BitSet bs) {
		byte[] ba = new byte[(bs.size() + 7) / 8];

		for (int i = 0; i < ba.length; i++) {
			ba[i] = 0x00;

			for (int j = 0; j < 8; j++) {
				if (bs.get(i * 8 + j)) {
					ba[i] += Math.pow(2, 7 - j);
				}
			}
		}

		return ba;
	}

	public BitSet ByteArrayToBS(byte[] ba) {
		BitSet bs = new BitSet(ba.length * 8);
		bs.clear();
		int tempb = 0;
		int base;

		for (int i = 0; i < ba.length; i++) {
			tempb = ba[i] & 0xFF;

			for (int j = 0; j < 8; j++) {
				base = (byte) Math.pow(2, 7 - j) & 0xFF;

				if (tempb >= base) {
					bs.set(i * 8 + j);
				}

				tempb %= base;
			}
		}

		return bs;
	}
}
