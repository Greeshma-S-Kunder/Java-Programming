package bookSupply;
public class bookSupply{
    private String author;
    private String title; 
    private double price;
    private String publisher;
    private int stock;
    
    bookSupply(String author, String title, double price, String publisher, int stock){
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.stock = stock;
    }
    
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getStock(){
        return stock;
    }
    
    @Override
    
    public String toString(){
        return "Author :\t" + getAuthor() + "\t" + "\tTitle of the Book\t" + getTitle() + "\t" + "Price : \t" + getPrice() + "\t" + "publisher of this Book\t" + getPublisher() + "\t" + "Remaining stock\t" + getStock(); 
    }
    
    public Boolean searchBook(String author , String title){
        if(this.author.equals(author) && this.title.equals(title)){
            return true;
        }
        else {
            return false;
        }
    }

    public double getCost(int copies){
        double total_cost = 0;
        total_cost = copies * getPrice();
        return total_cost;
    }

    public int getRemainingStock(int copies){
        stock = stock - copies;
        return stock;
    }
    
    
}