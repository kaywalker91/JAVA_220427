package Study0427;

import java.util.Scanner;

public class Study83_class_method 
{

	public static void main(String[] args) 
	{
		Cal ca = new Cal();

	}

}

class Cal
{
	Scanner sc = new Scanner(System.in);
	
	int cnt1;
	int cnt2;
	double result=0;
	
	String op;
	String yn;
	
	Cal()
	{
		while(true)
		{
			System.out.print("첫번째 수 : ");
			cnt1 = sc.nextInt();
			System.out.print("두번째 수 : ");
			cnt2 = sc.nextInt();
		
			System.out.print("연산자 선택(+, -, *, /) : ");
			op = sc.next();
		
			if(op.equals("+"))
			{
				add(cnt1,cnt2);
			}
			else if(op.equals("-"))
			{
				result=cnt1-cnt2;
			}
			else if(op.equals("*"))
			{
				result=cnt1*cnt2;
			}
			else if(op.equals("/"))
			{
				result=cnt1/cnt2;
			}
		
			System.out.println("결과: " +result);
	
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
	void add(int cnt1,int cnt2)
	{
		result = (cnt1+cnt2);	
	}
}
