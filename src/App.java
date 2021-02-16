import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Podaj pierwszą liczbę:");
        int a= scanner.nextInt();
        System.out.println("Podaj + lub - lub % lub * lub /");
        scanner.nextLine();
        String o= scanner.nextLine(); 
        System.out.println("Podaj drugą liczbe liczbę:");
         int c= scanner.nextInt();
    

         switch (o) {
             case "+": 
             System.out.println("wynik dodawania " + (a+c));
             break;
        
          
            case "-":
            System.out.println("wynik odejmowania " + (a-c));
            break;
        
            
            case "*": 
            System.out.println("wynik mnożenia " + (a*c));
            break;
        
           
            case "/": 
            System.out.println("wynik dzielenia " + (a/c));
            break;
        
        
            case "%":
            System.out.println("wynik reszty z dzielenia " + (a%c));
            break;
        }
scanner.close();
    }
}
