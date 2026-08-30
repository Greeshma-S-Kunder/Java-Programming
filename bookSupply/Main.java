package bookSupply;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<bookSupply> book = new ArrayList<>();
    int choice = 0;
    while(choice != 4) {
        System.out.println("**************BOOK STORE***********");
        System.out.println("1. Add a Book");
        System.out.println("2. Find a book:");
        System.out.println("3. Remove a Book :");
        System.out.println("4. Exit");
        choice = sc.nextInt();
        sc.nextLine();
        
        switch(choice){
            case 1 :System.out.println("Enter how many books you want to add: ");
                    int items = sc.nextInt();
                    sc.nextLine();
                    
                    for(int i = 0 ; i < items; i++){
                        System.out.println("Enter the Author's name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter the title of the book: ");
                        String title = sc.nextLine();
                        System.out.println("Enter the price of the book: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Enter the name of publisher of the book: ");
                        String pub = sc.nextLine();
                        System.out.println("Enter how many copies you want to add : ");
                        int stock = sc.nextInt();
                        sc.nextLine();
                        
                        book.add(new bookSupply(name, title, price, pub, stock));
                        System.out.println("Book added successfully!!\n");
                        
                    }
                    break;
                    
            case 2 :System.out.println("Enter the Author's name and title of the book : ");
                    String auth_name = sc.nextLine();
                    String title_book = sc.nextLine();
                    boolean found = false;

                    for(bookSupply bk : book){
                       
                        if(bk.searchBook(auth_name, title_book)){
                            if(bk.getStock() == 0){
                               System.out.println("no stock!!");
                               break;
                            }
                            found = true;
                            System.out.println("Book found\n");
                            System.out.println(bk);

                            System.out.println("How many copies do you want? :");
                            int copies = sc.nextInt();
                            sc.nextLine();
                            if(bk.getStock() < copies){
                                System.out.println("required copies not in stock :(");
                                break;
                            }
                            else{
                                System.out.println("\nThe total cost for the book will be : "+ bk.getCost(copies));
                                System.out.println("\nRemaining Stock :" + bk.getRemainingStock(copies));
                    
                            }
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Book not found");
                    }
                    break;
            case 3 :System.out.println("Enter author's name and title  of the book, which you want to remove : ");
                    String author1 = sc.nextLine();
                    String title1 = sc.nextLine();
                    boolean found2 = false;  
                    //Iterator is an object that lets you move through a collection one element at a time.
                    //Think of it like a pointer/index that starts before the first element.Inorder to delete the entire book from the list we can use iterator(). 
                    Iterator<bookSupply> iterator1 = book.iterator();
                    while(iterator1.hasNext()) {
                        bookSupply bk1 = iterator1.next();
                        if(bk1.searchBook(author1, title1)) {
                            found2 = true;
                            System.out.println("Book successfully removed!!");
                            iterator1.remove();
                            break;
                        }
                        
                    }
                    if(!found2){
                        System.out.println("Book not found!!");
                    }
                    
                    break;

                    
            default: System.out.println("Thank you , please visit again!!..");
                    
        }
        
    }
    sc.close();
}
}
