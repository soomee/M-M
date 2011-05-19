import java.util.Scanner;

public class FSprotocol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // 입력 함수
		int p; 	// 비밀키 p, 소수
		int q; 	// 비밀키 q, 소수

		int n; 	// 공개키 n
		int s; 	// 비밀키 s
		int v; 	// 공개키 v
		int r;	//랜덤값
		int x; 	// x 값
		int y; 	// y 값
		int c; 	// challenger 값

		System.out.println("비밀키 p 를 입력하세요 p는 소수입니다.");

		p = input.nextInt();
		while (prime(p))
			p = input.nextInt();

		System.out.println("비밀키 q 를 입력하세요 q는 소수입니다.");
		
		q = input.nextInt();
		while (prime(q))
			q = input.nextInt();

		n = p * q;

		System.out.println("입려하신 수 p = " + p + " q = " + q + " p*q n의 값은" + n
				+ "입니다.");
		System.out.println(" ");
		
		System.out.println("1보다 크고 " + n + "보다 작은값 비밀키 s를입력하세요");
		

		s = input.nextInt();

		while (s(s, n))
			s = input.nextInt();
		
		v = s*s%n;	//v의 값 계산 v는 s의 제곱 mod n
		
		System.out.println("v 의 값은 "+v+" 입니다.");
		System.out.println("");
		
		System.out.println("1보다 크고 " + n + "보다 작은값  r을 입력하세요");
		
		r= input.nextInt();
		
		while(s(s,n))
			s = input.nextInt();
		
		x= r*r%n;
		
		System.out.println("x 의 값은 "+x+" 입니다.");
		System.out.println("");
		
		System.out.println("channenger 값을 0,1의 값중 하나를 입력하세요");
		
		c = input.nextInt();
		while(c!=0&&c!=1){
			System.out.println("channenger 값을 0,1의 값중 하나를 입력하세요");
			c = input.nextInt();
		}
		
		System.out.println("c의 값은"+c+"입니다.");
		
		if(c==1)
			y=r*s%n;
		else
			y=r%n;
		
		System.out.println("y의 값은"+y+"입니다.");
		System.out.println("y의 제곱근 값은"+y*y%n+" 입니다.");
		System.out.print("x* v의c승은");
		if(c==1)
			System.out.println(x*v%n+"입니다.");
		else
			System.out.println(x%n+"입니다.");
				

	}

	static boolean prime(int num) {	//소수인지 확인하는 함수
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println("입력하신 수는 소수가 아닙니다. 소수를 입력하세요");
				return true;

			}
		}
		return false;

	};

	static boolean s(int s, int n) {	//s의 값 범위를 확인하는 함수
		if (s > 1 && s < n)
			return false;
		else {
			System.out.println("입력하신수는 1보다작거나 n-1보다 큽니다.");
			System.out.println("1보다 크고 " + n + "보다 작은값 비밀키 s를입력하세요");
			return true;
		}
	}
}
