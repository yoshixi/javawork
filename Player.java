//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/19

public class Player {
	private String name;
	private int level;
	
	public Player(String name, int hp, int level){
		this.hp = hp;
		this.level = level;
	public String toString(){
	public void damage(int p){
		hp -= p;
		if(hp < 0){