
public class CalcMethod {
    public void sum(int a, int b) throws Exception {
        System.out.println(a + "/ " + b + " = " + ((a + b)));
    }
    public void div(int a, int b) throws Exception {
        try {
            System.out.println(a + "/ " + b + " = " + ((a / b)));
        } catch (Exception e) {
            throw new RuntimeException("0으로 나눌 수 없습니다");

        }
    }

}

