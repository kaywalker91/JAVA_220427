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
			System.out.print("����: ");
			kor = sc.nextInt();
			System.out.print("����: ");
			eng = sc.nextInt();
			System.out.print("����: ");
			math = sc.nextInt();
			
			sum=kor+eng+math;
			avg = sum/3;
			
			grade = hakjum(avg);
			
			System.out.println("����: "+(kor+eng+math));
			System.out.println("���: "+avg);
			System.out.println("����: "+grade);
			
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
