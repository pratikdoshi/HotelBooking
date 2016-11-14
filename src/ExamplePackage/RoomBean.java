package ExamplePackage;

public class RoomBean {
	
	

	private int room_id;
	private String room_type;
	private String rfeatures;
	private double rprice;
	private String r_image;
	private int isAvailable;
	
	public RoomBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public RoomBean(int room_id, String room_type, String rfeatures, double rprice, String r_image, int isAvailable) {
		super();
		this.room_id = room_id;
		this.room_type = room_type;
		this.rfeatures = rfeatures;
		this.rprice = rprice;
		this.r_image = r_image;
		this.isAvailable = isAvailable;
	}


	public int getRoom_id() {
		return room_id;
	}


	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}


	public String getRoom_type() {
		return room_type;
	}


	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}


	public String getRfeatures() {
		return rfeatures;
	}


	public void setRfeatures(String rfeatures) {
		this.rfeatures = rfeatures;
	}


	public double getRprice() {
		return rprice;
	}


	public void setRprice(double rprice) {
		this.rprice = rprice;
	}


	public String getR_image() {
		return r_image;
	}


	public void setR_image(String r_image) {
		this.r_image = r_image;
	}


	public int getIsAvailable() {
		return isAvailable;
	}


	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	

}
