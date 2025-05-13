import java.util.ArrayList;
import java.util.List;

public class oopsPractice {
    public static void main(String[] args) {
        String []ar=new String[4];
        gg.main(ar);
    }
    class MyExcep{
        public int math(int a ,int b) throws Exception{
            return a/b;
        }


    }
}
class gg{
    public static void main(String[] args) {
        oopsPractice oops=new oopsPractice();
        oopsPractice.MyExcep n= oops.new MyExcep();
        try {
            System.out.println(n.math(9,0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class MyException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }
    MyException(String m){
        super(m);
    }
}
