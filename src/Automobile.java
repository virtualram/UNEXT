
public class Automobile extends Gearshift{
	
	private Integer powercc;
	private Integer rpm;
	private Integer mileage;
	public static String geartype;
	
	static {
		
		System.out.print("Initialise static variable");
		
		geartype = "autoandmanual";
	}
	
	Automobile(){
		
		System.out.print("Default constructor");
	}
	
	
	Automobile(Integer cc ,Integer rpm,Integer mileage){
		
		this.powercc = cc;
		this.rpm = rpm;
		this.mileage = mileage;
		geartype = "Manual";
		System.out.print("This automobile features" +this.powercc +this.rpm+this.mileage);
		this.geardown(5);
	}

	public Integer getPowercc() {
		return powercc;
	}

	public void setPowercc(Integer powercc) {
		Integer zz = 0;
		this.powercc = powercc;
	}

	public Integer getRpm() {
		return rpm;
	}

	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	
    public void getobjectval() {
    	//geartype = "Automatic";
    	System.out.print("\r rpm is"+this.getRpm()+this.getGeartype());
    //	System.out.print(zz);
    	
    }

	public static String getGeartype() {
		return geartype;
	}

	public static void setGeartype(String geartype) {
		Automobile.geartype = geartype;
	}


	@Override
	public void geardown(Integer g) {
		// TODO Auto-generated method stub
		super.gearup(g);
	}
	
	
}
