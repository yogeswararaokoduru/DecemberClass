public class Example extends BaseClassExample{


    public void m1(){
        System.out.println("sub");
    }


    public void display(){
        System.out.println("sub2");
    }
    public static void main(String[] args) {
        String s="hai";

        s.concat("yogi");
        System.out.println(s);
        BaseClassExample example=new Example();

    }

}
