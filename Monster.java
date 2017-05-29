//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/19

public class Monster {	
	private String name;	private int hp;;
	private int mp;
	
	public Monster(String name, int hp, int mp){		this.name = name;
		this.hp = hp;
		this.mp = mp;	}
	public Monster(int mp){		this("メタルスライム",4,mp);	}
	public Monster(){		this("スライム",4,0);	}
	public int attack(int p, double r){		if(mp>10){			return 25;		}else{			
			if(Math.random()<r){				return p;			}else{				return 0;			}		}	}
	
	public int attack(int p){		if(Math.random()<0.8){				return p;			}else{				return 0;			}	}
	
	public String toString(){		return name + "の攻撃！";	}
	public int getMp(){		return mp;	}}
