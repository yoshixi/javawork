//15D8102011G Masubuchi Yoshiki
import java.util.Scanner;
import java.io.*;

public class Ex01e {
  public static void main (String[] args) throws Exception{

    Scanner sc = new Scanner(new File("pro_input.dat"), "UTF-8");
    String search_str = "プログラム";
    int len = search_str.length();

    while(sc.hasNextLine()){
      String str = sc.nextLine();
      int idx1 = str.indexOf(search_str);
      if(idx1>=0){
        StringBuffer sb = new StringBuffer(str);
        sb.replace(idx1, idx1+len, "program");
        System.out.println(sb);
      }
    }
    sc.close();
  }
}

