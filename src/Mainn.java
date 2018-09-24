public class Mainn {
    public static void main(String [ ] args){
        String s = "шла саша по шоссе и сосала";
        String toFind ="шоссе";

        for (int i=0; i<s.length();i++){
            if(i+toFind.length()>s.length()){ //to prevent exit beyond the length of the S
                break;
            }
            else{
                if(toFind.equals(s.substring(i, i+toFind.length()))){ //finder: takes parts of the target strings and compares with the finding word. Taked parts are same long as the finding word.
                    System.out.println("\n"+"I found: ");
                    System.out.print(s.substring(0,i)+" ==>"+toFind+"<== "+ s.substring(i+toFind.length()));

                }
            }
        }
    }//main
}
