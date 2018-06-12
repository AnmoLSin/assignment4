import java.util.Scanner;

class complex{
	int real;
	int imag;
	void display(int real,int imag)
	{
		System.out.print(real+"+"+imag+"i");
	}
}
public class Assi51 {

	public static void main(String[] args) {
		int r1,i1;
		Scanner input=new Scanner(System.in);
		r1=input.nextInt();
		i1=input.nextInt();
		complex c=new complex();
		c.display(r1,i1);	
	}

}
