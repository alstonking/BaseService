package com.xinnet.core.utils;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


/**
 * Date: 2011-11-14
 *  */
public class CryptoTools {
    private final byte [] DESkey = {11,12,13,14,15,13,14,15};
    private final byte[] DESIV = {11,12,13,14,15,13,14,15};

    private AlgorithmParameterSpec iv =null;
    private Key key =null;


    public CryptoTools() throws  Exception {
         DESKeySpec keySpec = new DESKeySpec(DESkey);
         iv = new IvParameterSpec(DESIV);
         SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
         key = keyFactory.generateSecret(keySpec);

    }

    
	public String encode(String data) throws Exception {
        Cipher enCipher  =  Cipher.getInstance("DES/CBC/PKCS5Padding");
        enCipher.init(Cipher.ENCRYPT_MODE,key,iv);
        byte[] pasByte = enCipher.doFinal(data.getBytes("utf-8"));
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(pasByte);
    }

    public String decode(String data) throws Exception{
        Cipher deCipher   =  Cipher.getInstance("DES/CBC/PKCS5Padding");
        deCipher.init(Cipher.DECRYPT_MODE,key,iv);
           BASE64Decoder base64Decoder = new BASE64Decoder();

        byte[] pasByte=deCipher.doFinal(base64Decoder.decodeBuffer(data));

        return new String(pasByte,"UTF-8");
    }

    public static void main(String args[])
    {
    	try {
			CryptoTools ct = new CryptoTools();
			String aa="11111111";
			String aa1 = ct.encode(aa);
			System.out.println(aa1);
			String aa2 = ct.decode(aa1);
			System.out.println(aa2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

