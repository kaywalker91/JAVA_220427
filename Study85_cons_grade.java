package Study0427;

import java.util.Scanner;

public class Study85_cons_grade 
{

	public static void main(String[] args) 
	{
		
		Gradeinout gio = new Gradeinout();

	}

}

class Gradeinout
{
	Scanner sc = new Scanner(System.in);
	
	int kor=0;
	int eng=0;
	int math=0;
	String yn;
	
	int sum=kor+eng+math;
	int avg = sum/3;
	String grade;
	
	Gradeinout()
	{
		while(true)
		{
			System.out.print("국어: ");
			kor = sc.nextInt();
			System.out.print("영어: ");
			eng = sc.nextInt();
			System.out.print("수학: ");
			math = sc.nextInt();
			
			sum=kor+eng+math;
			avg = sum/3;
			
			grade = hakjum(avg);
			
			System.out.println("총점: "+(kor+eng+math));
			System.out.println("평균: "+avg);
			System.out.println("학점: "+grade);
			
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
	
	String hakjum(int avg)
	{
		
		if(avg>=90 && avg<=100)
		{
			grade = "A";
		}
		
		else if(avg>=80 && avg<90)
		{
			grade = "B";
		}
		
		else if(avg>=70 && avg<80)
		{
			grade = "C";
		}
			
		else if(avg<70)
		{
			grade = "F";
		}
		
		return grade;
	
	}
}
