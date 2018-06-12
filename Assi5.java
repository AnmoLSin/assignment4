import java.util.Scanner;

class rectangle{
	int l,b;
	void CalculateArea(int l,int b)
	{
		int area;
		area=l*b;
		System.out.print(area);
	}
}
public class Assi5 {

	public static void main(String[] args) {
		int l1,b1;
		Scanner input=new Scanner(System.in);
		l1=input.nextInt();
		b1=input.nextInt();
		rectangle r=new rectangle();
		r.CalculateArea(l1,b1);	
	}
}
