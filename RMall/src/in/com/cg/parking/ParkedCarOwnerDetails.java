package in.com.cg.parking;

public class ParkedCarOwnerDetails {
	
	private String OwnerName;
	private String CarModel;
	private String CarNo;
	private int MobileNo;
	private String OwnerAdress;
	
		
	public ParkedCarOwnerDetails(String ownerName, String carModel, String carNo, int mobileNo, String ownerAdress) 
	{
		super();
		OwnerName = ownerName;
		CarModel = carModel;
		CarNo = carNo;
		MobileNo = mobileNo;
		OwnerAdress = ownerAdress;
	}
	
	

	public ParkedCarOwnerDetails() {
		super();
	}



	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public String getCarNo() {
		return CarNo;
	}

	public void setCarNo(String carNo) {
		CarNo = carNo;
	}

	public int getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}

	public String getOwnerAdress() {
		return OwnerAdress;
	}

	public void setOwnerAdress(String ownerAdress) {
		OwnerAdress = ownerAdress;
	}
	
		
	public String toString()//function to display
	{
		return "CarDetails :"+"\n" +"OwnerName= "+getOwnerName()+ "\n"+ "CarModel= "+ getCarModel() + "\n" + "CarNo= "+ getCarNo() + "\n" + "MobileNo= "+ getMobileNo() + "\n" + "OwnerAddress=" + getOwnerAdress()+  "\n-------------------------------------";
	}

}
