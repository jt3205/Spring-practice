public class Person1 implements Human {
    public String sayName(String name) {
        System.out.println("나의 이름은 "+name + "입니다");
        return "나는 개발자" + name + "입니다.";
    }
}
