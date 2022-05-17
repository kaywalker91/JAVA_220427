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
			System.out.print("첫번째 수 : ");
			cnt1 = sc.nextDouble();
			System.out.print("두번째 수 : ");
			cnt2 = sc.nextDouble();
		
			System.out.print("연산자 선택(+, -, *, /) : ");
			op = sc.next();
		
			if(op.equals("+"))
			{
				System.out.println("결과 : "+(cnt1+cnt2));
			}
			else if(op.equals("-"))
			{
				System.out.println("결과: " +(cnt1-cnt2));
			}
			else if(op.equals("*"))
			{
				System.out.println("결과: " +(cnt1*cnt2));
			}
			else if(op.equals("/"))
			{
				System.out.println("결과: " +(cnt1/cnt2));
			}
	
			System.out.print("계속하시겠습니까?(y,n) : ");
			yn = sc.next();
		
			if(yn.equals("y"))
			{
				System.out.println();
			}
			else if(yn.equals("n"))
			{
				System.out.println("프로그램 종료.");
				break;	
			}						
		}
	}
}
