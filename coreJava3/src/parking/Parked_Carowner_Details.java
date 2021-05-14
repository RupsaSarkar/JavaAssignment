package parking;

import java.util.Comparator;

import ques9coll.SavingAccount;

public class Parked_Carowner_Details implements Comparable<Parked_Carowner_Details> {
	String ownerName;
	String CarModel;
	int carNo;
	long ownerMobileNo;
	String ownerAddress;
	public Parked_Carowner_Details(String ownerName, String carModel, int carNo, long ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		CarModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	@Override
	public int compareTo(Parked_Carowner_Details o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
class ParkOrder implements Comparator<Parked_Carowner_Details>{
	 @Override
	 public int compare(Parked_Carowner_Details e1, Parked_Carowner_Details e2) {
		 return e1.getOwnerName().compareTo(e2.getOwnerName());
	 }
	 }
	
