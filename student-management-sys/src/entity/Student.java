package entity;

public class Student extends Person {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * ѧ����� 
	 * �������Ա�̳�person��
	 */
	private int stuId ;

	public int getstuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + "]";
	}
	
	
}
