public class StartMain {

    public static void main(String[] args) {
        Woman w = new Woman();
        Man m = new Man();

        System.out.println("** 여학생 입장 **");
        w.classwork();

        System.out.println("------------------");
        System.out.println("** 남학생 입장 **");
        m.classwork();
    }
}
