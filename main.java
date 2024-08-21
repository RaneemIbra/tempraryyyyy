import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class main {
    public static void main(String[] args) {
        System.out.println("KHELLO");
        JUnitCore test = new JUnitCore();
        test.addListener(new TextListener(System.out));
        test.run(tempTest.class);
    }
}
