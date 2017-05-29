//Kadai04a.java
//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/12

public class Kadai04a {	public static void main(String[] args){
		Dice d = new Dice();
		//d.n = 1;
		//System.out.println("n="+d.n);
		d.setN(1);
		System.out.println("n="+d.getN());	}}

/*	
[15D8102011G@ise43c javawork]$ javac Kadai04a.java
Kadai04a.java:6: エラー: nはDiceでprivateアクセスされます
		d.n = 1;
		 ^
Kadai04a.java:7: エラー: nはDiceでprivateアクセスされます
		System.out.println("n="+d.n);
		                         ^
エラー2個


[15D8102011G@ise43c javawork]$ javac Kadai04a.java
[15D8102011G@ise43c javawork]$ java Kadai04a
n=1

*/
