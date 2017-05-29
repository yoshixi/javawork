//Kadai04c.java
//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/12

public class Kadai04c {	public static void main(String[] args){
		HealthRecord d1 = new HealthRecord(157.0,56.0);
		HealthRecord d2 = new HealthRecord(185.0);
		HealthRecord d3 = new HealthRecord("鈴木",165.5,75.5);
		HealthRecord d4 = new HealthRecord();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);	}}

/* [15D8102011G@ise43c javawork]$ java Kadai04c
データなし/157.0/56.0
データなし/185.0/60.0
鈴木/165.5/75.5
データなし/170.0/60.0 */
