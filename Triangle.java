//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/21

public class Triangle {	double a,b,c;
	
	public Triangle (double x, double y, double z){		this.a = x;
		this.b = y;
		this.c = z;	}
	void setValues(double x, double y, double z){		this.a = x;
		this.b = y;
		this.c = z;	}
	void show(){		System.out.println("a="+ a + ", b="+ b + ", c="+ c );	}
	double area() {		double s = (a+b+c)/2;
		double tmp = s*(s-a)*(s-b)*(s-c);
		
		tmp = Math.sqrt(tmp);
		
		return tmp;
	}}
