import java.util.Scanner;

public class Assi53 {

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
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<9;i+=2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	}

