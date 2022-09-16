class Product {
    private int itemno;
    private String name;
    private int price;
    private int qty;

    public Product(int i, String n){
        itemno=i;
        name=n;
    }

    public int getItemno(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int p){
        price = p;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int q){
        qty = q;
    }
}

class Customer{
    private int custId;
    private String name;
    private String address;
    private int phonenumber;

    public Customer(int c, int p, String N, String A){
        custId = c;
        name = N;
        address  = A;
        phonenumber = p;
    }
    public Customer(int c, String N){
        custId = c;
        name = N;
    }

    public int getCustId(){
        return custId;
    }
    public void setCustId(int i){
        custId = i;
    }
    public int getPhoneNumber(){
        return phonenumber;
    }
    public void setPhoneNumber(int i){
        phonenumber = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getAddress(){
       return address;
    }
    public void setAddress(String a){
        address = a;
    }
}
public class ProductOOP {
    public static void main(String[] args) {
    Product p = new Product(2, "jalkapallo");
    Customer c = new Customer(22,23,"Leevi","pitkäkatu");

    p.setPrice(2);
    p.setQty(50);
    System.out.println(p.getName());
    
    System.out.println(c.getAddress());
    
}
}