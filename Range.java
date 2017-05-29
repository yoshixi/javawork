//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/04/21

public class Range {
  double min;
  double max;

  String outputRange(){
    String tmp;
    tmp = "min:"+min+" -- max:"+max;
    return tmp;
  }
  void setMin(double x){
    min = x;
  }
  void setMax(double x){
    max = x;
  }
  boolean isOK(double v){
    if(v >= min && v < max){
      return true;
    }else{
      return false;
    }
  }
}
