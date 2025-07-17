class Obj{
	public static void main(String[]args){
		Car obj=new Car();
		obj.brand="Rolls-Royce";
		obj.name="Rolls-Royce La Rose Noire Droptail";
		obj.price=2500000000.0;
		obj.seatingCapacity=2;
		obj.displayCar();
		System.out.println("------------------");
		Car obj=new Car();



	}
}
class Car{
	static String brand;
	static String name;
	static double price;
	static int seatingCapacity;


	public static void displayCar(){
		System.out.println("car details");
		System.out.println("brand:" +brand);
		System.out.println("name:" +name);
		System.out.println("price:" +price);
		System.out.println("seatingCapacity:" +seatingCapacity);


	}
}