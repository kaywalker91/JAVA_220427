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
			System.out.print("국어: ");
			kor = sc.nextInt();
			System.out.print("영어: ");
			eng = sc.nextInt();
			System.out.print("수학: ");
			math = sc.nextInt();
			
			int sum=kor+eng+math;
			int avg = sum/3;
			String grade;
			
			System.out.println("총점: "+(kor+eng+math));
			System.out.println("평균: "+avg);
			
			if(avg>=90 && avg<=100)
			{
				grade = "A";
				System.out.println("학점 : "+grade);
			}
			else if(avg>=80 && avg<90)
			{
				System.out.println("학점 : B ");
			}
			else if(avg>=70 && avg<80)
			{
				System.out.println("학점 : C ");
			}
			else if(avg<70)
			{
				System.out.println("학점 : F ");
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
