//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/19
public class Kadai05b{
		Monster[] enemy = new Monster[4];
		int i;
		System.out.println(t);
		
		enemy[0] = new Monster();
		enemy[1] = new Monster();
		enemy[2] = new Monster(10);
		enemy[3] = new Monster("ゴーレム", 1000, 5);
		
		for(i=0;i<4;i++){
			if(enemy[i].getMp()>=1){
			System.out.println(t);
/*
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
