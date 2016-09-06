package org.xs.dntown.wx.core.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * sha-1编码
 */
public class Encodes {
	
	public static String Encrypt(String strSrc) {
		MessageDigest md = null;
		String strDes = null;
		
		byte[] bt = strSrc.getBytes();
		try {
			md = MessageDigest.getInstance("SHA-1");
			md.update(bt);
			strDes = bytes2Hex(md.digest());
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Invalid algorithm.");  
			return null;  
		}
		return strDes;
	}
	
	public static String bytes2Hex(byte[] bts) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < bts.length; i++) {
			tmp = (Integer.toHexString(bts[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
        }
		return des;
	}
}
