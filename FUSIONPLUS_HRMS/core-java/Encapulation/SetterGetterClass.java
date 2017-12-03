package Encapulation;

public class SetterGetterClass {

	private int eid;
	private String ename;
	private float esal;
	
	public void setEid(int eid){
		this.eid = eid;
	}
	
	public void setEnmae(String ename){
		this.ename = ename;
	}
	
	public void setEsal(float esal){
		this.esal = esal;
	}
	
	public int getEid(){
		return eid;
	}
	
	public String getEname(){
		return ename;
	}
	
	public float getEsal(){
		return esal;
	}
	
	public static void main(String[] args) {
		SetterGetterClass obj = new SetterGetterClass();
		obj.setEid(201);
		obj.setEnmae("Ramarao");
		obj.setEsal(200.123f);
		System.out.println("E_Id: "+obj.getEid());
		System.out.println("E_Name: "+obj.getEname());
		System.out.println("E_Sal: "+obj.getEsal());
	}

}
