//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/12

public class Dice2 {	static int sum = 0;	private int n;
	private String size;
	private int max;
	
	public Dice2(int n, String size, int max){		this.n = n;
		this.size = size;
		this.max = max;
		sum ++;	}
	public Dice2(int max){		this(1,"M",max);	}
	public Dice2(String size){		this(1,size,6);	}
	public Dice2(){		this(1,"M",6);	}
	public int play(){		n = (int)(Math.random()*max) + 1;
		return n;	}
	public static void showSum(){		System.out.println("作成したサイコロは"+sum+"個です");	}}
