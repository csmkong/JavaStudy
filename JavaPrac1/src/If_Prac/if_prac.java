package If_Prac;

public class if_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean type �ܿ� �ٸ� type�� if���� ���ǹ����� ������ Error�� ����.
		
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
		
		
		if(floatNumber == 0.1f) // ���� : float���� �ε��Ҽ��� ����� ����ϱ� ������ ���ǹ��� ����� ������ �ٸ� �� �ִ�.
			System.out.println("floatNumber : "+floatNumber+" is 0.1.");
		else
			System.out.println("floatNumber : "+floatNumber+" isn't 0.1.");
		
		
	}

}
