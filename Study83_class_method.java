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
			System.out.print("ù��° �� : ");
			cnt1 = sc.nextInt();
			System.out.print("�ι�° �� : ");
			cnt2 = sc.nextInt();
		
			System.out.print("������ ����(+, -, *, /) : ");
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
		
			System.out.println("���: " +result);
	
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
	void add(int cnt1,int cnt2)
	{
		result = (cnt1+cnt2);	
	}
}
