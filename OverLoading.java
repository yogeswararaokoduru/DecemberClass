public class OverLoading {

    public void m1(int i){
        System.out.println("m1 method onr perm");
    }
    public void m1(int j,int k){
        System.out.println("m1 method two paem");
    }
    public void m1(int j,String k){
        System.out.println("m1 method two parm with string type one");
    }


    public static void main(String[] args) {
        OverLoading overLoading=new OverLoading();
        overLoading.m1(20,"yogi");
    }
}
