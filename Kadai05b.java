//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/19
public class Kadai05b{	public static void main (String[] args){		Player t = new Player("Taro", 30, 5);
		Monster[] enemy = new Monster[4];
		int i;
		System.out.println(t);
		
		enemy[0] = new Monster();
		enemy[1] = new Monster();
		enemy[2] = new Monster(10);
		enemy[3] = new Monster("ゴーレム", 1000, 5);
		
		for(i=0;i<4;i++){			System.out.println(enemy[i]);
			if(enemy[i].getMp()>=1){				t.damage(enemy[i].attack(100, 0.2));			}else{				t.damage(enemy[i].attack(3));			}
			System.out.println(t);		}	}}
/* [15D8102011G@ise43c javawork]$ java Kadai05b
Taro/HP=30/level=5
スライムの攻撃！0
Taroは身をかわした！
Taro/HP=30/level=5
スライムの攻撃！0
Taroは身をかわした！
Taro/HP=30/level=5
メタルスライムの攻撃！10
100のダメージ！
Taro/HP=0/level=5
ゴーレムの攻撃！5
Taroは身をかわした！
Taro/HP=0/level=5
 */
