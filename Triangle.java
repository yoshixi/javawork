//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/21

public class Triangle {
	
	public Triangle (double x, double y, double z){
		this.b = y;
		this.c = z;
	void setValues(double x, double y, double z){
		this.b = y;
		this.c = z;
	void show(){
	double area() {
		double tmp = s*(s-a)*(s-b)*(s-c);
		
		tmp = Math.sqrt(tmp);
		
		return tmp;
	}