/**
 * Created by modern on 2016/8/30.
 */
public class Person {
    private String name;
    private String age;
    private String sex;

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void move(PersonMoveInterface personMoveInterface){
        System.out.println("Person move");
        personMoveInterface.move();
    }

    public void sleep(PersonSleepInterface personSleepInterface){
        personSleepInterface.sleep();
    }

    public void eat(PersonEatInterface personEatInterface, String food){
        personEatInterface.eat(food);
    }

    public void work(String company,PersonWorkInterface personWorkInterface){
        personWorkInterface.work(company);
        System.out.println("afdwe423");
    }
}
