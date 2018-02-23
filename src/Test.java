import java.util.HashMap;
import java.util.Map;

/**
 * Created by modern on 2016/6/27.
 */
public class Test {
    public static void main(String[] args){
        System.out.println("这是一个测试程序".hashCode() );
        System.out.println(Integer.toBinaryString("这是一个测试程序".hashCode()));
        System.out.println("这".hashCode());
        System.out.println("18696785342".hashCode());
        System.out.println("os1".hashCode());
        System.out.println(Integer.toBinaryString("os1".hashCode()));
        System.out.println(Integer.toBinaryString(15));
        System.out.println("os1".hashCode()&15);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("os",1);

        Double c = 23.4D;
        System.out.println( 3+c.intValue());;
    }


}