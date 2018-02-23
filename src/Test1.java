/**
 * Created by modern on 2016/6/27.
 */
public class Test1 {
    public static void main(String[] args){
//        new Thread(() -> System.out.println("sdfsdf")).start();
//        move(()->System.out.println("Person is move"));

        Person person = new Person();
        person.setName("张三");
        person.setAge("23");
        person.move(()->System.out.println(person.getName()+"正在走路"));
        person.sleep(()->System.out.println(person.getName()+"正在睡觉"));
//        String food = "adasdfd";
        person.eat((String food) -> System.out.println(person.getName()+"正在吃东西"+food), "adasdfd啊手动阀手动阀");

        person.work( "成都网优力",(String company)-> System.out.println("我为"+company+"工作"));
    }

}
