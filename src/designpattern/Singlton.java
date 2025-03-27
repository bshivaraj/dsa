package designpattern;

public class Singlton {
    public static void main(String[] args) {

         Singlton obj = null;
         int count=0;

         Singlton s1=getInstance(obj,count);
         Singlton s2=getInstance(obj,count);
         Singlton s3=getInstance(obj,count);
        Singlton s4=getInstance(obj,count);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    private static Singlton getInstance(Singlton obj,int count){
        if(obj==null && count<3){
            obj=new Singlton();
            count++;
        }
        return obj;
    }
}

