package Study0427;

import java.util.Scanner;

public class Study81_whiletrue_ifelseif 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double cnt1;
		double cnt2;
		double result=0;
		
		String op;
		String yn;
			
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
				result=cnt1+cnt2;
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

}
