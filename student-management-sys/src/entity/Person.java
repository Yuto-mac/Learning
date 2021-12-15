package entity;

public class Person {
	
	/*
	 * ĞÕÃû 
	 * ĞÔ±ğ
	 */
	private String name ;
	private String gender ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String str) {
		this.gender = str;
	}
	
	@Override
	public String toString() {
		return "Proson [name=" + name + ", gender=" + gender + "]";
	}
	

}
