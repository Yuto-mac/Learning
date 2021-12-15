package entity;

public class Teacher extends Person {
	
	/* 
	 * ��ʦ��� 
	 * �����̳�person��
	 * ����
	 * */
	private int teacherId ;
	private String password ;
	
	public int getTid() {
		return teacherId;
	}
	public void setTid(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTpass() {
		return password;
	}
	public void setTpass(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", password=" + password + "]";
	}
	
	
}
