package Study0427;

import java.util.Scanner;

public class Study84_whiletrue_ifelseif 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int kor=0;
		int eng=0;
		int math=0;
		String yn;
		
		while(true)
		{
			System.out.print("����: ");
			kor = sc.nextInt();
			System.out.print("����: ");
			eng = sc.nextInt();
			System.out.print("����: ");
			math = sc.nextInt();
			
			int sum=kor+eng+math;
			int avg = sum/3;
			String grade;
			
			System.out.println("����: "+(kor+eng+math));
			System.out.println("���: "+avg);
			
			if(avg>=90 && avg<=100)
			{
				grade = "A";
				System.out.println("���� : "+grade);
			}
			else if(avg>=80 && avg<90)
			{
				System.out.println("���� : B ");
			}
			else if(avg>=70 && avg<80)
			{
				System.out.println("���� : C ");
			}
			else if(avg<70)
			{
				System.out.println("���� : F ");
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
