//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/19

public class Player {	
	private String name;	private int hp;
	private int level;
	
	public Player(String name, int hp, int level){		this.name = name;
		this.hp = hp;
		this.level = level;	}
	public String toString(){		return name + "/HP=" + hp + "/level=" + level;	}
	public void damage(int p){		if(p>0){			System.out.println(p+"のダメージ！");		}else{			System.out.println(name+"は身をかわした！");		}
		hp -= p;
		if(hp < 0){			hp = 0;		}	}}
