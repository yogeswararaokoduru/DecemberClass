public class SubClass extends SuperClass{
    public void m1(){
        System.out.println("sub class");
    }


    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        subClass.m1();
        SuperClass superClass = new SubClass();
        superClass.m1();

        SuperClass subSuepr =new SubClass();
        subSuepr.m1();
    }
}
