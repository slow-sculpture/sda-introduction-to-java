package zajecia7.interfaces;

public class App {
    public static void main(String[] args) {
        Payable p = new Student();
        p.pay();

        Workable w = new Student();
        w.work();
    }
}
