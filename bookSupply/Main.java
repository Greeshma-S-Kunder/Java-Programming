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
                        
                    }
                    break;
                    
            case 2 :System.out.println("Enter the Author's name and title of the book : ");
                    
                    String auth_name = sc.nextLine();
                    String title_book = sc.nextLine();
                    boolean found = false;

                    for(bookSupply bk : book){
                        if(bk.searchBook(auth_name, title_book)){
                            found = true;
                            System.out.println("Book found\n");
                            System.out.println(bk);

                            System.out.println("How many copies do you want? :");
                            int copies = sc.nextInt();
                            sc.nextLine();
                            if(bk.getStock() < copies){
                                System.out.println("Not in stock :(");
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
                    
            default: System.out.println("default");
                    
        }
        
    }
    sc.close();
}
}
