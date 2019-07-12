import java.util.Scanner;
public class w3 {
	public static void main(String[] args) {
	int a;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a given number:");
	a=sc.nextInt();
	if((a%2)==0)
	{
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
	}

}
