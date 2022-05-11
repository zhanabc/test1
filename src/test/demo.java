package test;

import java.util.ArrayList;

public class demo<AnyType>{
    private static class dd<AnyType>{
        dd<AnyType> l;
        String s;
        public dd(dd<AnyType> d) {
            l=d;
        }
        public dd(String d) {
            s=d;
        }
    }
   public void getl(){
       dd<AnyType> xsa = new dd<AnyType>("xsa");
       dd<AnyType> xs = new dd<AnyType>(xsa);
       dd l = xs.l;
       String s =l.s;
       System.out.println(s);
   }

    public static void main(String[] args) {
        demo<String> stringdemo = new demo<String>();
        stringdemo.getl();
        ArrayList<String> objects = new ArrayList<>();
        int i[]=new int[]{};
    }
}
