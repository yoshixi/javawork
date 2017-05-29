//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/21

public class Kadai02d {
  public static void main(String[] args) {
    System.out.println("---wrapper クラスを利用---");
    System.out.println("byte min:"+Byte.MIN_VALUE+", max:"+Byte.MAX_VALUE);

    System.out.println("short min:"+Short.MIN_VALUE+", max:"+Short.MAX_VALUE);
    System.out.println("int min:"+Integer.MIN_VALUE+", max:"+Integer.MAX_VALUE);
    System.out.println("long min:"+Long.MIN_VALUE+", max:"+Long.MAX_VALUE);
    System.out.println("float min:"+Float.MIN_VALUE+", max:"+Float.MAX_VALUE);
    System.out.println("double min:"+Double.MIN_VALUE+", max:"+Double.MAX_VALUE);

    System.out.println("---シフト演算子を利用---");

    byte b_min = (byte)(1<<7);
    byte b_max = (byte)((1<<7)-1);

    short s_min = (short)(1<<15);
    short s_max = (short)((1<<15)-1);

    int i_min = (1<<31);
    int i_max = ((1<<21)-1);

    long l_min = (1L<<63);
    long l_max = ((1<<63)-1);

    System.out.println("byte min:"+b_min+", max:"+b_max);
    System.out.println("short min:"+s_min+", max:"+s_max);
    System.out.println("int min:"+i_min+", max:"+i_max);
    System.out.println("long min:"+l_min+", max:"+l_max);
  }
}
