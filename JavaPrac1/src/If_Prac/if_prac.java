package If_Prac;

public class if_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean type 외에 다른 type을 if문의 조건문으로 넣으면 Error가 난다.
		
		boolean bool 		= true;		//1byte
		char character 		= 'A';		//2byte
		byte byteType		= 127;		//1byte
		int integerNumber 	= 10;		//4byte
		float floatNumber 	= 10.01f;	//4byte
		
		
		if(bool)
			System.out.println("bool : "+bool+" is true.");
		else
			System.out.println("bool : "+bool+" is false.");
		
		if(bool == true)
			System.out.println("bool : "+bool+" is true.");
		else
			System.out.println("bool : "+bool+" is false.");
		
		/*
		if(character) // error :Type mismatch: cannot convert from char to boolean
			System.out.println("character : "+character+" is true.");
		else
			System.out.println("character : "+character+" is false.");
		 */
		if(character == 'A') 
			System.out.println("character : "+character+" is 'A'.");
		else
			System.out.println("character : "+character+" isn't 'A'.");
		
		/*
		if(byteType) // error :Type mismatch
			System.out.println("byteType : "+byteType+" is true.");
		else
			System.out.println("byteType : "+byteType+" is false.");
		*/
		if(byteType == 0b01111111)
			System.out.println("byteType : "+byteType+" is 0b01111111.");
		else
			System.out.println("byteType : "+byteType+" isn't 0b01111111.");
		
		
		
		/*
		if(integerNumber) // error :Type mismatch
			System.out.println("integerNumber : "+integerNumber+" is true.");
		else
			System.out.println("integerNumber : "+integerNumber+" is false.");
		*/
		if(integerNumber == 1)
			System.out.println("integerNumber : "+integerNumber+" is 1.");
		else
			System.out.println("integerNumber : "+integerNumber+" isn't 1.");
		
		
		
		/*
		if(floatNumber) // error :Type mismatch
			System.out.println("floatNumber : "+floatNumber+" is true.");
		else
			System.out.println("floatNumber : "+floatNumber+" is false.");
		*/
		floatNumber = 10f;
		floatNumber = floatNumber / 100;
		
		
		if(floatNumber == 0.1f) // 주의 : float형은 부동소수점 방식을 사용하기 때문에 조건문의 결과가 생각과 다를 수 있다.
			System.out.println("floatNumber : "+floatNumber+" is 0.1.");
		else
			System.out.println("floatNumber : "+floatNumber+" isn't 0.1.");
		
		
	}

}
