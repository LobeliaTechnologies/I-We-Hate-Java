import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class test{

    static <T> T print(T s){
        System.out.println(s);
        return s;
    }

    public static void main(String[] args){
      print("Start");

      Map<String, Function<Object, Object>> map = new HashMap<String, Function<Object, Object>>(){{
          put("print", test::print);
      }};
      map.get("print").apply("print!");
      map.get("print").apply(1234567890);
      print("End");
    }
 }