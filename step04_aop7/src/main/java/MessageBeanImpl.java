public class MessageBeanImpl implements MessageBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello," + name + " " + " !!");
    }
}
