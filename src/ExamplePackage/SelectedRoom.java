package ExamplePackage;

public class SelectedRoom {
	String roomid,fromdate,todate;
	int totalprice,mealprice,vehicleprice,roomprice;
	public String getRoomid() {
		return roomid;
	}
	
public String getFromDate() {
		return fromdate;
	}

	public void setFromDate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getToDate() {
		return todate;
	}

	public void setToDate(String todate) {
		this.todate = todate;
	}

public void setRoomid(String roomid) {
	this.roomid = roomid;
}



public int getRoomPrice() {
	return roomprice;
}

public void setRoomPrice(int roomprice) {
	this.roomprice = roomprice;
}

public int getMealprice() {
	return mealprice;
}

public void setMealprice(int mealprice) {
	this.mealprice = mealprice;
}

public int getVehicleprice() {
	return vehicleprice;
}

public void setVehicleprice(int vehicleprice) {
	this.vehicleprice = vehicleprice;
}

public int getTotalprice() {
	return this.mealprice + this.roomprice + this.vehicleprice;
	
}



}
