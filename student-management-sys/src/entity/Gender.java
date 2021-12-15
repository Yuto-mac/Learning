package entity;

public class Gender {
	
	/*
	 * ѧ����� 
	 * �γ̱�� 
	 * �ɼ�
	 */
	private int sid ;
	private int cid ;
	private double score ;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gender(int sid, int cid, double score) {
		super();
		this.sid = sid;
		this.cid = cid;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Gender [sid=" + sid + ", cid=" + cid + ", score=" + score + "]";
	}
	
	
}
