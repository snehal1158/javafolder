import java.util.*;
class OddAdd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Number: ");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++){
			if(i%2!=0){
				 sum=sum+i;
			}

		}
		
        System.out.println(sum);
	}
}