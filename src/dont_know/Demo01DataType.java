package dont_know;

public class Demo01DataType  {
    public static void main(String[] args){
        for (int hour = 0; hour < 24; hour++ ){
            for (int minute = 0; minute <60; minute++){
                for (int second = 0; second <60; second++)
                    System.out.println(hour + "点" + minute + "分" + second +"秒");
            }
        }
    }
}
