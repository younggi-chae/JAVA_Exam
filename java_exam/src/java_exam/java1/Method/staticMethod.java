
package java_exam.java1.Method;

class Print{
    public String delimiter;
    public void a() {
        System.out.println(this.delimiter); //인스턴스소속
        System.out.println("a");  
        System.out.println("a");
    }
    public void b() {
        System.out.println(this.delimiter);   //인스턴스소속
        System.out.println("b");
        System.out.println("b");
         
    }
    public static void c(String delimiter) {  //클래스소속
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}
public class staticMethod {
     
    public static void main(String[] args) {
//      Print.a("-");
//      Print.b("-");
         
        // instance
        Print t1 = new Print();
        t1.delimiter = "-";
        t1.a();    //인스턴스소속, no static
        t1.b();
        Print.c("$");  //클래스소속 , static
         
         
//      Print.a("*");
//      Print.b("*");
         
        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
        t2.b();
    }
     
 
}