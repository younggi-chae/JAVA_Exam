package miniProject;

public class Goods {  
    
    String item_name;
    int min,max; 
       
    
    public Goods(String item_name, int min, int max) {
    super();
    this.item_name = item_name;
    this.min = min;
    this.max = max;
 }

 public void show() {
       System.out.println("상품명 : " + item_name);
        System.out.println("하한가 : " + min);
       System.out.println("상한가 : " + max);
    }
    
    public Goods() {}
    
    public int getMin() {
       return min;
    }
    public void setMin(int min) {
       this.min = min;
    }
    public int getMax() {
       return max;
    }
    public void setMax(int max) {
       this.max = max;
    }
    public String getItem_name() {
       return item_name;
    }
    public void setItem_name(String item_name) {
       this.item_name = item_name;
    }
   
    @Override
    public String toString() {
       return "Goods [item_name=" + item_name  + ", min=" + min + ", max=" + max + "]";
    }

 }