package Casting_Prac;

public class casting_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final boolean STUDY_HARD = true;	//상수 변경 불가
		final int EARTH_RADIUS_KM = 6400;	//상수 변경 불가
		
		boolean bool;		//1byte
		char character;		//2byte
		byte byteType;		//1byte
		short shortInt;		//2byte
		int integerNumber;	//4byte
		long longInt;		//8byte
		float floatNumber;	//4byte
		double doubleNumber;//8byte
		
		bool = true;				//true or false
		character = 'A';			//0 ~ (2^16)-1
		byteType = 127;				//-128 ~ 127
		shortInt = 32767;			//-(2^15) ~ (2^15)-1
		integerNumber = 2147483647;	//-(2^31) ~ (2^31)-1
		longInt = (long)Math.pow(2,63);				//-(2^63) ~ (2^63)-1 //9223372036854775807; 
									//error: The literal 19223372036854775807 of type int is out of range
									//(long)Math.pow(2,63) != 19223372036854775808
									//(long)Math.pow(2,63) == 19223372036854775807
		floatNumber = 3.4028235E38f;//1.4E-45 ~ 3.4028235E38
		doubleNumber = 1.7976931348623157E308d;		//4.9E-324 ~ 1.7976931348623157E308
		
		
		
		System.out.println("[bool - type casting]\n original : "+bool+"\n all casting : error\n");
		System.out.println("[character - type casting]\n original : "+character+
				"\n boolean : error"+//(boolean)character+
				"\n char : "+(char)character+
				"\n byte : "+(byte)character+
				"\n int : "+(int)character+
				"\n short : "+(short)character+
				"\n long : "+(long)character+
				"\n float : "+(float)character+
				"\n double : "+(double)character+
				"\n");
		
		System.out.println("[byteType - type casting]\n original : "+byteType+
				"\n boolean : error"+//(boolean)byteType+
				"\n char : "+(char)byteType+
				"\n byte : "+(byte)byteType+
				"\n int : "+(int)byteType+
				"\n short : "+(short)byteType+
				"\n long : "+(long)byteType+
				"\n float : "+(float)byteType+
				"\n double : "+(double)byteType+
				"\n");
		
		System.out.println("[integerNumber - type casting]\n original : "+integerNumber+
				"\n boolean : error"+//(boolean)integerNumber+
				"\n char : "+(char)integerNumber+
				"\n byte : "+(byte)integerNumber+
				"\n int : "+(int)integerNumber+
				"\n short : "+(short)integerNumber+
				"\n long : "+(long)integerNumber+
				"\n float : "+(float)integerNumber+
				"\n double : "+(double)integerNumber+
				"\n");
		
		System.out.println("[shortInt - type casting]\n original : "+shortInt+
				"\n boolean : error"+//(boolean)shortInt+
				"\n char : "+(char)shortInt+
				"\n byte : "+(byte)shortInt+
				"\n int : "+(int)shortInt+
				"\n short : "+(short)shortInt+
				"\n long : "+(long)shortInt+
				"\n float : "+(float)shortInt+
				"\n double : "+(double)shortInt+
				"\n");
		
		System.out.println("[longInt - type casting]\n original : "+longInt+
				"\n boolean : error"+//(boolean)longInt+
				"\n char : "+(char)longInt+
				"\n byte : "+(byte)longInt+
				"\n int : "+(int)longInt+
				"\n short : "+(short)longInt+
				"\n long : "+(long)longInt+
				"\n float : "+(float)longInt+
				"\n double : "+(double)longInt+
				"\n");
		
		System.out.println("[floatNumber - type casting]\n original : "+floatNumber+
				"\n boolean : error"+//(boolean)floatNumber+
				"\n char : "+(char)floatNumber+
				"\n byte : "+(byte)floatNumber+
				"\n int : "+(int)floatNumber+
				"\n short : "+(short)floatNumber+
				"\n long : "+(long)floatNumber+
				"\n float : "+(float)floatNumber+
				"\n double : "+(double)floatNumber+
				"\n");
		
		System.out.println("[doubleNumber - type casting]\n original : "+doubleNumber+
				"\n boolean : error"+//(boolean)doubleNumber+
				"\n char : "+(char)doubleNumber+
				"\n byte : "+(byte)doubleNumber+
				"\n int : "+(int)doubleNumber+
				"\n short : "+(short)doubleNumber+
				"\n long : "+(long)doubleNumber+
				"\n float : "+(float)doubleNumber+
				"\n double : "+(double)doubleNumber+
				"\n");
		
		System.out.println("[final int EARTH_RADIUS_KM - type casting]\n original : "+EARTH_RADIUS_KM+
				"\n boolean : error"+//(boolean)EARTH_RADIUS_KM+
				"\n char : "+(char)EARTH_RADIUS_KM+
				"\n byte : "+(byte)EARTH_RADIUS_KM+
				"\n int : "+(int)EARTH_RADIUS_KM+
				"\n short : "+(short)EARTH_RADIUS_KM+
				"\n long : "+(long)EARTH_RADIUS_KM+
				"\n float : "+(float)EARTH_RADIUS_KM+
				"\n double : "+(double)EARTH_RADIUS_KM+
				"\n");
		
		
	}

}
