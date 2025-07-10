import java.util.Scanner;
class Armstrong{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number:");
		int n=sc.nextInt();
		int res=0;
		int temp=n;
		while(n>0){
			int r=n%10;
			res=res+(r*r*r);
			n=n/10;
		}
		System.out.println(res);
		if(temp==res)
		{
			System.out.println("arstrong");
		}
		else{
			System.out.println("not a armstrong");
		}
	}
}