package ExamplePackage;

import java.util.Date;

public class PaymentBean {
	private  String username;
	private int room_id;
	private int meal_id;
	private int vehicle_id;
	private double total;
	private Date fromDate;
	private Date toDate;
	private int payemnt_Id;
	
	
	
	
	
	
	public PaymentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentBean(String username, int room_id, int meal_id, int vehicle_id, double total, Date fromDate,
			Date toDate, int payemnt_Id) {
		super();
		this.username = username;
		this.room_id = room_id;
		this.meal_id = meal_id;
		this.vehicle_id = vehicle_id;
		this.total = total;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.payemnt_Id = payemnt_Id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getMeal_id() {
		return meal_id;
	}
	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public int getPayemnt_Id() {
		return payemnt_Id;
	}
	public void setPayemnt_Id(int payemnt_Id) {
		this.payemnt_Id = payemnt_Id;
	}
	
	
	
}
