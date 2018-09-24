import java.util.Scanner;

public class Mainn {
    public static void main(String [ ] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter text to handle");
        String s = scanner.nextLine();
        System.out.println("Enter text to find");
        String toFind = scanner.nextLine();

        if(s!=null&&toFind!=null){
            int counter=0;
            for (int i=0; i<s.length();i++){
                if(i+toFind.length()>s.length()){ //to prevent exit beyond the length of the S
                    break;
                }
                else{
                    if(toFind.equals(s.substring(i, i+toFind.length()))){ //finder: takes parts of the target strings and compares with the finding word. Taked parts are same long as the finding word.
                        System.out.println("\n"+"I found: ");
                        System.out.print("●"+s.substring(0,i)+"→"+toFind+"←"+ s.substring(i+toFind.length()));
                        counter++;
                    }
                }
            }
            if(counter>0){
                System.out.println("\n"+".......................");
                System.out.println(counter + " identities found");
            }
            else{
                System.out.println("\n"+".......................");
                System.out.println("Nothing found!");
            }
        }
        else {
            System.out.println("Fields can't be empty");
        }

    }//main
}
