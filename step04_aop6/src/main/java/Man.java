import org.springframework.stereotype.Component;

@Component
public class Man implements Person {

    public void classwork() {
        System.out.println("컴퓨터를 켜고 뉴스를 본다");
    }
}
