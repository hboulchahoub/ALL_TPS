package ma.gov.licence.pfe.entities;

public class Test {


    int add(long b1,long b2){
        System.out.println("int...");
        return 0;
    }


    public static void main(String[] args) {
        Test t1=new Test();
        t1.add(1000000,20);
    }
}
