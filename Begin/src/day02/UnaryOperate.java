package day02;

public class UnaryOperate {
	public static void main(String[] args) {
		System.out.println("1.단향연산자(부호연산자:+,-)");
		int a=9;
		System.out.println(+a);
		System.out.println(-a);
		System.out.println("2.증감연산자 :++--");
		
		int b=5;
		long c=9;
		b++; //b=b+1;
		c--; //c=c-1;
		System.out.println(b);
		System.out.println(c);
		++b;
		--c;
		System.out.println(b);
		System.out.println(c);
		//++--가 단독으로 사용될때는 변수 앞에 오나 뒤에오나 별 차이가 없다
		//다른수식과 함께사용되면 ++--가 앞에 오는 것과 뒤에오는 것은 차이가 있다.
		float d=5.3f;
		double e=7.3;
		
		System.out.println(d++); //d를 먼저 출력하고
		System.out.println("d:"+d);//더해서 나온다
		System.out.println(e--); //e를 먼저 출력하고
		System.out.println("e:"+e);
		
		System.out.println(++d); //++를 먼저 연산한 다음 d를 출력한다.
		System.out.println("d:"+d);
		
		
		int x=10;
		int y=x++;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		x=10; // 11이었는데 10으로 변경시켜줌
		int z=++x;
		System.out.println("x="+x);
		System.out.println("z="+z);
		
		System.out.println("3.비트별 cot연산자: ");
		//정수값을 비트로 바꾸고 연산을 수행하는데, 비트별 not연산자는 1은0으로 바꾸고,
		//0은 1로 바꾸는 연산자
		// 3:0011
		//~3:1100
		
		int m=3; //3 :00000000 00000000 00000000 00000011 양수
		         //~3:(11111111 11111111 11111111 11111)100 음수 -1*2^2
		         // -1*2^31 + 1*2^30 + ....... 결국 -4지만 반복되는 곳까지 지운뒤 계산
		System.out.println(m);
		System.out.println(~m);
		
		int n=0x55555551; //16진수 f 15 2진수로 바꾸면 1111나옴
		//1111 1111 1111 1111 1111 1111 1111 0001
		//0000 0000 0000 0000 0000 0000 0000 1110 
		
		//42 : 00000000 00000000 00000000  00101010
		//~42: 11111111 11111111 11111111  11010101 1010101 -64 16 4 1 -43
		System.out.println(~42);
		
		System.out.println("~n: "+(~n));
		
		System.out.println("4.논리부정 연산자 : !");
		//boolean형에만 사용가능 int형에는 사용할수없다
		//true -> false로 false->true
		boolean bo=true;
		System.out.println(bo);
		System.out.println(!bo);
		System.out.println(!(3<2));
		
		int fo=5;
		System.out.println(fo==5.0); //==등가연상자 : 기본자료형에서는 값이 같은지 비교한다.
		System.out.println(fo!=5.0); //!= : 기본자료형에서는 값이다르면 true, 같으면 false
		
		
		
		
		
		
	}

}
