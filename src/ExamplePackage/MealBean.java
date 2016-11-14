package ExamplePackage;

public class MealBean {
	private int meal_id;
	private double mprice;
	private String mfeatures;
	private boolean isSelected;
	
	public MealBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MealBean(int meal_id, double mprice, String mfeatures, boolean isSelected) {
		super();
		this.meal_id = meal_id;
		this.mprice = mprice;
		this.mfeatures = mfeatures;
		this.isSelected = isSelected;
	}
	
	public int getMeal_id() {
		return meal_id;
	}
	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}
	public double getMprice() {
		return mprice;
	}
	public void setMprice(double mprice) {
		this.mprice = mprice;
	}
	public String getMfeatures() {
		return mfeatures;
	}
	public void setMfeatures(String mfeatures) {
		this.mfeatures = mfeatures;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	
	
	    

}
