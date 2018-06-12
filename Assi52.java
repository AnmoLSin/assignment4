import java.util.Scanner;

public class Assi52 {

	public static void main(String[] args) {
		int a[]=new int[10];
		int temp=0;
		for(int i=0;i<10;i++)
		{
			Scanner input=new Scanner(System.in);
			a[i]=input.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print(a[1]);
	}

}
