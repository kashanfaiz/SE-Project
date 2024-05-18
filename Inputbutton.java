import java.util.*;/**
 * Button
 */
public class Inputbutton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int button = sc.nextInt();
    
    if(button == 1){
        System.out.println("Wellcome to our site");
    }
        else if(button == 2){
            System.out.println("How may i  help you dear: ");
        }
        else if(button == 3){
                System.out.println("What are requre: ");
            }else{
                System.out.println("don't waste our time please");
            }
        }
    
    }
