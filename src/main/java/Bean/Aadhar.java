package Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhar {
	
	@Id
	int aadharNo;
	String name;
	String city;
	
	public Aadhar() {
		super();
	}
	public Aadhar(int aadharNo, String name, String city) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.city = city;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharNo=" + aadharNo + ", name=" + name + ", city=" + city + "]";
	}
	
	
	

}
