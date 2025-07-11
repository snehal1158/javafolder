class Prime{
	public static void main(String[]args){
		int a=12345;
		while(a!=0){
			int r=a%10;
			if(r==2 || r==3 || r==5){
				System.out.println(r);
			}
			a=a/10;
		}
	}
}