//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/28

public class Kadai03b {	public static void main(String[] args) {		double x;
		
		Triangle t = new Triangle(1,1,1);
		t.show();
		x = t.area();
		System.out.println("t.area()="+x);
		
		t.setValues(3,4,5);
		
		t.show();
		x = t.area();
		System.out.println("t.area()="+x);
		
	}} 
