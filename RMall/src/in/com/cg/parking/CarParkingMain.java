package in.com.cg.parking;

public class CarParkingMain {

	public static void main(String[] args) {
		ParkedCarOwnerList car=new ParkedCarOwnerList();
		
		car.addNewCar(new ParkedCarOwnerDetails("mike", "Audi a8", "KA02AA1220", 5888 ,"Airoli" ));
		
		car.addNewCar(new ParkedCarOwnerDetails("jaan", "Audi q3", "KA03AA1222", 6666 ,"NaviMumbai" ));
		car.addNewCar(new ParkedCarOwnerDetails("Roger", "Volkswagen", "KA03AA5220", 5658 ,"Ghansoli" ));
		car.addNewCar(new ParkedCarOwnerDetails("rafael", "Porsche Cayman", "KA02AA1550", 5678 ,"Bengaluru" ));
		car.addNewCar(new ParkedCarOwnerDetails("djoker", "Benz c100", "KA02AA2220", 8880 ,"Bhandra" ));
		car.removeCar("KA03AA1222");
		car.Display();
		

	}

}
