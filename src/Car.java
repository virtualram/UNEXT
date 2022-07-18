import java.util.HashMap;

public class Car extends Automobile implements Safety,Pollutioncontrol{
	private Integer Wheels;
	private Integer weight;
	private String condition;
	private Integer bsstandard;
	
	Car(){
		super(400,500,600);
		super.setMileage(900);
		this.Wheels = 4;
		this.setWheels(3);
	}
	   @Override
	   public void getobjectval() {
	    	//geartype = "Automatic";
	    	System.out.print("\r rpm is"+this.getRpm()+this.getGeartype()+this.getWheels());
	    //	System.out.print(zz);
	    	this.setabs(5000, "BAD");
	    	System.out.print("abs values"+this.getCondition() +this.getWeight());
	    	
	    }
	public Integer getWheels() {
		return Wheels;
	}
	public void setWheels(Integer wheels) {
		/*HashMap hp = new HashMap();
		hp.put(1, "Monday");
		hp.put(2, "Tuesday");
		System.out.print(hp);*/
		
		Wheels = wheels;
	}
	@Override
	public void setabs(Integer weight, String conditions) {
		// TODO Auto-generated method stub
	 this.setWeight(weight);
	 this.setCondition(conditions);
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	public void addBSstandard(Integer standards) {
		// TODO Auto-generated method stub
		this.setBsstandard(standards);
		
	}
	public Integer getBsstandard() {
		return bsstandard;
	}
	public void setBsstandard(Integer bsstandard) {
		this.bsstandard = bsstandard;
	}
	
	

}
