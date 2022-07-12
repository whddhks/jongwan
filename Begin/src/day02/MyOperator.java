package day02;

public class MyOperator {
	public static void main(String[] args) {
		System.out.println("1. 산술 연산자-----");
		//+덧-뻄*곱/나눔%나머지
		int a=10; // int/int는 int정수만 나옴 float/int=float byte*char=int(큰걸로 나옴)
		System.out.println(a-6);
		System.out.println(a*3);
		System.out.println(a/3);
		System.out.println(a%3);
		
		double b=10;
		System.out.println(b/3); //double/int는 double로
		
		//42 :  00000000 00000000 00000000 00101010
		System.out.println("2. Shoft연산자 << >> >>> ----");
		System.out.println(42<<3); //3칸 왼쪽으로 이동
		//101010000 28+26+24 336
		System.out.println(42>>3);
		System.out.println(42>>>3);
		/*시프트 연산자 비트바꿔서 연산수행
		 *>>오른쪽으로 비트수만큼 이동 앞의 남은 비트는 부호비트로 채운다
		 *<<왼쪽으로 비트수만큼 이동 뒤에남은 비칸은 0으로 채운다
		 *>>>오른쪽으로 비트수만큼 이동 앞의 남은 빈칸은 무조건 0으로 채운다
		 */
		//~42: 11111111 11111111 11111111 11010101 -43
		
		System.out.println(-43<<2);
		//101010100 1*22+ 1*24 26 28 4 16 64 256  -174
		System.out.println(-43>>2);
		//10101 1+ 4 -16 -11
		System.out.println(-43>>>2);
		//00111111 11111111 11110101  1073741813
		
		System.out.println("3. 비교연산자 : == != > >= < <= instanceof");
		int m=60;
		int n=160;
		/* 1) > 큰가
		 * 2) >= 크거나 같은가
		 * 3) < 작은가
		 * 4) <=작거나 같은가
		 * 5) == 같은가
		 * 6) != 다른가
		 * 7) 참조변수 instanceof 클래스명 : 참조변수가 클래스의 객체인가?
		 */
		System.out.println(m>=n);
		
		if(m>=n) 
		{System.out.println("@@@@");}
		else if(m<n) 
		{System.out.println("####");}
		
		
		
		
		
	}

}
