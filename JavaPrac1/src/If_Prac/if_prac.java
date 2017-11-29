package If_Prac;

public class if_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean type 외에 다른 type을 if문의 조건문으로 넣으면 Error가 난다.
		
		boolean bool 		= true;		//1byte
		char character 		= 'A';		//2byte
		byte byteType		= 127;		//1byte
		int integerNumber 	= 10;	//4byte
		float floatNumber 	= 10.01f;	//4byte
		
		
		if(bool)
			System.out.println("bool : "+bool+" is true.");
		else
			System.out.println("bool : "+bool+" is false.");
		/*
		if(character) // error :Type mismatch: cannot convert from char to boolean
			System.out.println("character : "+character+" is true.");
		else
			System.out.println("character : "+character+" is false.");
		/*
		if(byteType) // error :Type mismatch
			System.out.println("byteType : "+byteType+" is true.");
		else
			System.out.println("byteType : "+byteType+" is false.");
		
		if(integerNumber) // error :Type mismatch
			System.out.println("integerNumber : "+integerNumber+" is true.");
		else
			System.out.println("integerNumber : "+integerNumber+" is false.");
		
		if(floatNumber) // error :Type mismatch
			System.out.println("floatNumber : "+floatNumber+" is true.");
		else
			System.out.println("floatNumber : "+floatNumber+" is false.");
		*/
	}

}
