package Study0427;

import java.util.Scanner;

public class Study80_method_op {

	public static void main(String[] args) {
		
		OP1 op = new OP1();
		op.opp();
		
	}

}

class OP1
{
	Scanner sc = new Scanner(System.in);
	
	double cnt1;
	double cnt2;
	
	String op;
	String yn;
	
	void opp()
	{
		while(true)
		{
			System.out.print("ù��° �� : ");
			cnt1 = sc.nextDouble();
			System.out.print("�ι�° �� : ");
			cnt2 = sc.nextDouble();
		
			System.out.print("������ ����(+, -, *, /) : ");
			op = sc.next();
		
			if(op.equals("+"))
			{
				System.out.println("��� : "+(cnt1+cnt2));
			}
			else if(op.equals("-"))
			{
				System.out.println("���: " +(cnt1-cnt2));
			}
			else if(op.equals("*"))
			{
				System.out.println("���: " +(cnt1*cnt2));
			}
			else if(op.equals("/"))
			{
				System.out.println("���: " +(cnt1/cnt2));
			}
	
			System.out.print("����Ͻðڽ��ϱ�?(y,n) : ");
			yn = sc.next();
		
			if(yn.equals("y"))
			{
				System.out.println();
			}
			else if(yn.equals("n"))
			{
				System.out.println("���α׷� ����.");
				break;	
			}						
		}
	}
}
