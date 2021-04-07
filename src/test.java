import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class test{

    static String print(String s){
        System.out.println(s);
        return s;
    }
    public static void main(String[] args){
      print("Start");

      Map<String, Function<String, Object>> map = new HashMap<String, Function<String, Object>>(){{
          put("print", test::print);
      }};
      
      map.get("print").apply("aaa");
      print("End");
    }
 }