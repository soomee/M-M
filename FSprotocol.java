import java.util.Scanner;

public class FSprotocol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // �Է� �Լ�
		int p; 	// ���Ű p, �Ҽ�
		int q; 	// ���Ű q, �Ҽ�

		int n; 	// ����Ű n
		int s; 	// ���Ű s
		int v; 	// ����Ű v
		int r;	//������
		int x; 	// x ��
		int y; 	// y ��
		int c; 	// challenger ��

		System.out.println("���Ű p �� �Է��ϼ��� p�� �Ҽ��Դϴ�.");

		p = input.nextInt();
		while (prime(p))
			p = input.nextInt();

		System.out.println("���Ű q �� �Է��ϼ��� q�� �Ҽ��Դϴ�.");
		
		q = input.nextInt();
		while (prime(q))
			q = input.nextInt();

		n = p * q;

		System.out.println("�Է��Ͻ� �� p = " + p + " q = " + q + " p*q n�� ����" + n
				+ "�Դϴ�.");
		System.out.println(" ");
		
		System.out.println("1���� ũ�� " + n + "���� ������ ���Ű s���Է��ϼ���");
		

		s = input.nextInt();

		while (s(s, n))
			s = input.nextInt();
		
		v = s*s%n;	//v�� �� ��� v�� s�� ���� mod n
		
		System.out.println("v �� ���� "+v+" �Դϴ�.");
		System.out.println("");
		
		System.out.println("1���� ũ�� " + n + "���� ������  r�� �Է��ϼ���");
		
		r= input.nextInt();
		
		while(s(s,n))
			s = input.nextInt();
		
		x= r*r%n;
		
		System.out.println("x �� ���� "+x+" �Դϴ�.");
		System.out.println("");
		
		System.out.println("channenger ���� 0,1�� ���� �ϳ��� �Է��ϼ���");
		
		c = input.nextInt();
		while(c!=0&&c!=1){
			System.out.println("channenger ���� 0,1�� ���� �ϳ��� �Է��ϼ���");
			c = input.nextInt();
		}
		
		System.out.println("c�� ����"+c+"�Դϴ�.");
		
		if(c==1)
			y=r*s%n;
		else
			y=r%n;
		
		System.out.println("y�� ����"+y+"�Դϴ�.");
		System.out.println("y�� ������ ����"+y*y%n+" �Դϴ�.");
		System.out.print("x* v��c����");
		if(c==1)
			System.out.println(x*v%n+"�Դϴ�.");
		else
			System.out.println(x%n+"�Դϴ�.");
				

	}

	static boolean prime(int num) {	//�Ҽ����� Ȯ���ϴ� �Լ�
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println("�Է��Ͻ� ���� �Ҽ��� �ƴմϴ�. �Ҽ��� �Է��ϼ���");
				return true;

			}
		}
		return false;

	};

	static boolean s(int s, int n) {	//s�� �� ������ Ȯ���ϴ� �Լ�
		if (s > 1 && s < n)
			return false;
		else {
			System.out.println("�Է��Ͻż��� 1�����۰ų� n-1���� Ů�ϴ�.");
			System.out.println("1���� ũ�� " + n + "���� ������ ���Ű s���Է��ϼ���");
			return true;
		}
	}
}
