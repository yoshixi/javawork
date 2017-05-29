//15D8102011G Masubuchi Yoshiki 
public class Ex01a {
	public static void main(String[] args){
		ShopKeeper suzuki = new ShopKeeper("鈴木");
		CarToy car1 = new CarToy("c001",500);
		CarToy car2 = new CarToy("c002",600);
		CarToy car3 = new CarToy("c003",700);
		suzuki.checkPrice(car1,car2,car3);
	}
  String str = new String("aa");
}
/*
 鈴木が価格を確認します。
商品コード:c001の価格は500円です。
商品コード:c002の価格は600円です。
商品コード:c003の価格は700円です。

 
 */
