//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Queens g=new gg();
        g.hi();
        System.out.println(g.getClass());
    }
}
class gg extends Queens{
    gg(){
//        System.out.println("hi");
    }
    public void hi (){
        System.out.println("hi in gg");
    }
    public void hello(){
        System.out.println("hello");
    }
}