package BasicsOfJava;

public class Basic {

	public static void main(String[] args) {
		
		//printing something------>
		
		//print the line without new line
		System.out.print("Hello World");
		//print the line with new line
		System.out.println("Hello World!!");
		
		
		//variables------>
		
		//declaration
		int a;
		//definition
		a=50;
		
		System.out.println(a);
		
		
		//data types------->
		
		//integer types
		byte by=9; //-128 to 127
		short sh=31879;//-32768 to 32767
		int in=-2828384;// >short
		long l=-387672398789L;//>int;must get ended by L/l
		
		//decimal types
		float fl=1.234f; //upto 7 decimal;must get ended by f/F;IEEE 754 floating point
		double db=1.267868778d;//upto 16 decimal;must get ended by d/D;IEEE 754 floating point
		
		//character type
		char ch='a';//size- 16 bits;character representation of ASCII Values 0 to 256;
		
		//Boolean type
		boolean bl=false;//true/false;size-1 bit;
		
		System.out.println("byte type:"+by+" | short type:"+sh+" | integer type:"+in+" | long type:"+l+" | float type:"+fl+" | double type:"+db+" | character type:"+ch+" | boolean type:"+bl);
		
		
		//type casting------>
		
		//implicit
		int i=50;
		double d=i;//no data loss hence implicit
		System.out.println(i);
		System.out.println(d);
		
		//explicit
		double dob=50.6;
		int inti=(int)dob;//data loss hence explicit
		System.out.println(dob);
		System.out.println(inti+"\n\n");
		
		
		//Operators----->
		//operators are the symbols with the help of which we perform operations;
		
		//Unary operators
		//prefix
		int op=50;
		++op;
		System.out.println(op);
		--op;
		System.out.println(op+"\n");
		
		//postfix
		op=50;
		int x=op++; //op will get assigned to x and then value of op will increase 
		System.out.println(op);
		System.out.println(x);
		System.out.println(op);
		 //now op is at 51
		x=op--;//op will get assigned to x and then value of op will decrease 
		System.out.println(op);
		System.out.println(x);
		
		
		//Arithmetic operator
		//multiplicative
		a=4*5;//multiplication
		a=5/4;//decimal division
		a=5%4;//modulus
		//additive
		a=4+5;
		a=4-5;
		
		//shift operator
		a=4;
		a=a>>1;//right shift->division by 2 per unit
		a=a<<1;//left shift->multiplication by 2 per unit;
		
		//relational operators
		//comparision
		a=4;
		int b=2;
		System.out.println("\n\n"+(a<b)+"\n");
		System.out.println((a>b)+"\n");
		b=4;
		System.out.println((a<=b)+"\n");
		System.out.println((a>=b)+"\n");
		//equality
		System.out.println((a==b)+"\n");
		System.out.println((a!=b)+"\n");
		
		//bitwise operators
		System.out.println((4&0)+"\n");//bitwise and
		System.out.println((4|0)+"\n");//bitwise or
		System.out.println((4^4)+"\n");//bitwise and
		
		//logical operators
		boolean bool1=true;
		boolean bool2=false;
		System.out.println((bool1&&bool2)+"\n");//logical and
		System.out.println((bool1||bool2)+"\n");//logical or
		
		//ternary operator
		
		int num1 = 10;
		int num2 = 20;

		int res=(num1==num2) ? (num1+num2):(num1-num2);
		System.out.println(res);

		//assignment operators
		// =,+=,-=,/=,*=,%=,^=,|=,&=,<<=,>>=,>>>=
		
		num1+=num2;
		System.out.println(num1);
		num1=8;
		num1>>>=1;//unsigned right shift; fills with zero from left
		num1>>=1;//signed right shift; fills with sign from left
		System.out.println(num1);
		

		
		//if else------->
		
		//ladder
		int n=-63;
		if(n>0) {
			//block 1
			System.out.println("number is greater than 0");
		}
		else if(n==0) {
			//block 2
			System.out.println("number==0");
		}
		else {
			//block 3
			System.out.println("number is less than 0");
		}
		
		//nested
		if(n<0) {//outer block
			if(n>-50) {//inner block
				System.out.println("number is greater than -50 and less than 0");
			}
			else {
				System.out.println("number is less than or equals to -50");
			}
		}
		
		
		//switch ---------->
		//alternative to if else ladder
		
		n=1;
		switch(n) {
		
		case 0:
			System.out.println("case 0");
			break;
		
		case 2:
			System.out.println("case 2");
			break;
		
		case 1:
			System.out.println("case 1");
			break;
		default:
			System.out.println("default case");
		
		}
				
		
		
		//loops------------->
		//repeating same operations
		
		//start:-> initialization
		//end:-> termination
		//steps:-> jumping->increment/decrement
		
		//for loop
		for(int y=1;y<=10;y++) {
			System.out.println("Value of index is "+y);
		}
		System.out.println();
		
		//while loop
		//condition based
		//entry control loop
		int y=1;
		while(y<=10) {
			System.out.println("Value of index is "+y);
			y++;
		}
		
		System.out.println();
		//do while
		//exit control loop
		y=1;
		do {
			System.out.println("Value of index is "+y);
			y++;
		}while(y<=10);
	
		
		//for-each loop/enhanced for loop
		//to traverse array
		int nums[]= {12,13,15,14};
		int sum=0;
		for(int q:nums) {
			sum+=q;
		}
		System.out.println(sum);
		
		
		
		//break--------->
		//to break the loop at particular point
		int q=1;
		while(q>0) {
			System.out.println(q);
			if(q==5) {
				break;
			}
			q++;
		}
		
		//continue
		//to jump the particular iteration
		q=1;
		while(q<=10) {
			if(q==5) {
				q++;
				continue;
			}
			System.out.println(q);
			q++;
		}
	}

}
