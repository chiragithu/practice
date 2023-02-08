package in.chira.jrtp.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Password {
	
	public String encode(String en) {
		int a=0;
		int b=0;
		Encoder encodeed = Base64.getEncoder();
		String value = encodeed.encodeToString(en.getBytes());
		return value;
		
	}
	public String decode(String de) {
		Decoder decoded = Base64.getDecoder();
		byte[] value1 = decoded.decode(de);
		//git branch practical
				int a=0;
		return new String(value1);
		
	}

}
