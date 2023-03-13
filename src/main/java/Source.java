import javax.naming.InitialContext;

public class Source {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        new InitialContext().lookup(args[0]);
    }
}