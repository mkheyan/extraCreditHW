
public class ClassMain {

   static int fact(int num){
        if(num==1)
            return 1;
        return num*fact(num-1);
   }
    public static void main(String[] args) {
        Class1 class1=new Class1(1,5);
        Class2 class2=new Class2(4,6);
        Class3 class3=new Class3(0,2);
        System.out.println(class1.sum());
        System.out.println(class1.sub());
        System.out.println(class2.mult());
        System.out.println(class2.div());
        System.out.println(class3.sin());
        System.out.println(class3.cos());
        System.out.println(class3.tan());
        System.out.println(fact(7));
    }
    
}
