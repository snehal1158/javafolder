class Encapsulation{
	public static void main(String[]args){
		Student obj = new Student();
		obj.setName("snehal");
		obj.setRollnum(58);
		obj.setSeatnum(86);
		obj.setBranch("ENTC");
		System.out.println("name:" +obj.getName());
		System.out.println("Roll Num :" +obj.getRollnum());
		System.out.println("Seat num:" +obj.getSeatnum());
		System.out.println("branch :" +obj.getBranch());



	}
}
class Student
{
	private static String name;
	private static int rollnum;
	private static int seatnum;
	private static String branch;


	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getRollnum(){
		return rollnum;
	}
	public void setRollnum(int rollnum){
		this.rollnum = rollnum;

	}
	public int getSeatnum(){
		return seatnum;
	}
	public void setSeatnum(int seatnum){
		this.seatnum = seatnum;
	}
	public String getBranch(){
		return branch;
	}
	public void setBranch(String branch){
		this.branch = branch;
	}

}