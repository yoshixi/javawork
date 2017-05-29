//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/21

public class Kadai02b {	public static void main(String[] args) {		double x,y;
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.setValues(1,1,1);
		t2.setValues(3,4,5);
		
		t1.show();
		x = t1.area();
		System.out.println("t1.area()="+x);
		
		t2.show();
		y = t2.area();
		System.out.println("t2.area()="+y);	}} 
