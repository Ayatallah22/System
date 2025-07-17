class Product{
    private String productid;
    private String productName;
    private double price;
    private boolean inStock;
    
    public Product(String productid,String productName,double price,boolean inStock){
        this.productid=productid;
        this.productName=productName;
        this.price=price;
        this.inStock=inStock;
    }
    public String getProductId(){
        return productid;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public boolean getInStock(){
        return inStock;
    }
    
    public void setdata(String a,String b,double c,boolean d){
        productid=a;
        productName=b;
        price=c;
        inStock=d;
    }
    public void showData(){
        System.out.println(getProductId());
        System.out.println(getProductName());
        System.out.println(getPrice());
         System.out.println(getInStock());
    }
    public void setPrice(double newprice){
        System.out.println("Old price:"+price);
        if(newprice<0){
            System.out.println("Error");
        
        }else{
            price=newprice;
            System.out.println("new price:"+newprice);
            
        }
    }
    
    public void setInStock(boolean status){
        System.out.println("old status Instock:"+inStock);
        inStock=status;
        System.out.println("New status Instock:"+inStock);
    }
}
class Main {
    public static void main(String[] args) {
     Product p1= new Product("A1","Cola",15.0,true);
     p1.showData();
      p1.setPrice(20);
      p1.setPrice(-1);
      p1.setInStock(false);
    }
}