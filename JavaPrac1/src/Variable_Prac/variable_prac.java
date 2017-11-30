package Variable_Prac;

public class variable_prac {
	public static void main(String[] args) {
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
		
		bool = true;			//true or false
		character = 'A';		//0 ~ (2^16)-1
		byteType = 127;			//-128 ~ 127
		shortInt = 1;			//-(2^15) ~ (2^15)-1
		integerNumber = 1;		//-(2^31) ~ (2^31)-1
		longInt = 1;			//-(2^63) ~ (2^63)-1
		floatNumber = 0.1f;		//1.4E-45 ~ 3.40282235E38
		doubleNumber = 0.1f;	//4.9E-324 ~ 1.7976931348623157E308
		
		System.out.println("bool : "+bool+"\ncharacter : "+character+"\nbyte : "+byteType);
		System.out.println("shortInt : "+shortInt+"\nintegerNumber : "+integerNumber+"\nlongInt : "+longInt);
		System.out.println("floatNumber : "+floatNumber+"\ndoubleNumber : "+doubleNumber);
		
		System.out.println("Earth radius in Km : "+ EARTH_RADIUS_KM+"KM");
	}
}
