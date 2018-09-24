public class Mainn {
    public static void main(String [ ] args){
        String s = "шла саша по шоссе и сосала";
        String toFind ="сосала";

        for (int i=0; i<s.length();i++){
            if(i+toFind.length()>s.length()){
                break;
            }
            else{
                if(toFind.equals(s.substring(i, i+toFind.length()))){
                    System.out.println("\n"+"I found: ");
                    System.out.print(s.substring(0,i)+" ==>"+toFind+"<== "+ s.substring(i+toFind.length()));

                }
            }
        }
    }//main
}
