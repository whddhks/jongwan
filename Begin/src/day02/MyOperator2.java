package day02;

public class MyOperator2 {

	public static void main(String[] args) {
		System.out.println("4. 비트 연산자 &,^,|");
		//정수에만 사용되는 연산사
		//$ (and 연산자) : 두비트가 1일때만 1 참거짓으로 봤을때 엄격함 1참 0거짓
		//| (or 연산자) : 두비트중 한개라도 1이면 1, 모두 0이면 0  하나라도 참이면 참
		//^ (xor 연산자) : 두비트가 서로 다르면 1, 같으면0 
		
		int x=3; //0011
		int y=5; //0101
		
		//& 0001
		//^ 0110
		//| 0111
		
		
		System.out.println("x&y="+(x&y)); //1
		System.out.println("x^y="+(x^y)); //6
		System.out.println("x|y="+(x|y)); //7
		
		System.out.println("5. 논리연산자 & && | ||");
		
		int a=5;
		int b=6;
		if((a>b)& (a<0)) {
			System.out.println("Hello");
		}else if ((b>a)| (b<0)) {
			System.out.println("Hi");
		}
		
		if((a>b)&& (a<0)) {
			System.out.println("Hello");
		}else if ((b>a)|| (b<0)) {
			System.out.println("Hi");
		}
		
		/*
		
		1) &, &&
		2) |, ||

		&, | 의 경우: &,| 연산자를 사용하면 앞의 연산으로 결과를
					     알 수 있어도 (뒤의 문장까지 비교)한다.
        &&,|| 의 경우:  앞의 연산으로 결과를 알 수 있을 경우
							(뒤의 문장은 수행하지 않는다).
							예를 들어 &&의 경우, 앞의 연산결과가 false이면
							뒤의 연산을 생략.
							||의 경우 앞의 연산결과가 true이면 뒤의 연산을 생략
		*/
		//& : tt=t tf=f ft=f ff=f
		//&& : tt=t tf=f f(t생략함(스킵임 계산도안함))=f ff=f
		//| : tt=t tf=t ft=t ff=f
		//||: t(t생략)=t t(f생략)=t ft=t ff=f
		
		int i=1;
		int j=i++; //j=1 i=2
		if((i>j++) & (i++ ==j)) {
			i=i+j;
		}
		System.out.println("i="+i);
		
		
		int k=0;
		int p=1;
		if((k++ ==0)||(p++ ==2)) {
			k=42;
		}
		System.out.println("k="+k+ ", p="+p);
		
		boolean r=false;
		boolean e=false;
		boolean w=((r=true)||(e=true));
		System.out.println(r+","+e+","+w);
		// | : ttt
		// ||: tft
		
		

	}

}
