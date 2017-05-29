//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/21

public class Dice {	private int n;
	private String size;
	
	public void play(){		n = (int)(Math.random()*6) + 1;	}
	public void setN(int m){		this.n = m;	}
	public void setSize(String s){		this.size = s;	}
	public String getSize(){		return  this.size;	}
	public int getN() {		return this.n;	}}
