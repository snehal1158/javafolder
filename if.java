import java.util.*;
class If{
	public static void main(String[]args){
		System.out.print("enter your age:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<18){
			System.out.println("you are not adult");
		}
		else{
			System.out.println("you are adult");
		}
	}
}