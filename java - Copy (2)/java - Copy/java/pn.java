import java.util.*;
class pn{
	public static void main(String[]args){
		System.out.print("enter the Number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<0){
			System.out.println("negative");
		}else{
			if(a>0){
				System.out.println("positive");
			}else{
				System.out.println("neutral");
			}
		}
	}
}