//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/12

public class HealthRecord {	private String name;
	private double height;
	private double weight;
	
	public HealthRecord(String name, double height, double weight){		this.name = name;
		this.height = height;
		this.weight = weight;	}
	public HealthRecord(double height, double weight){		this("データなし",height,weight);	}
	public HealthRecord(double height){		this("データなし",height,60);	}
	public HealthRecord(){		this("データなし",170,60);	}
	public String toString(){		return name + "/"+height+"/"+weight;	}}
