package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UsedProduct extends Product {
	//
	private Date manufactureDate ;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	  private Calendar data = Calendar.getInstance();

	//
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	
	
	@Override
	public String toString() {
		return  name + "(used) $ " + price + " Manufactured date: " + sdf.format(manufactureDate);
	}
	

}
