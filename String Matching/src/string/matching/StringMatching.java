package string.matching;

import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;
/**
 *
 * @author Vincent
 */
public class StringMatching {
    static boolean empty = true;
    
    public static void StringMatching(String T,String P){
        T=T.toLowerCase();
        P=P.toLowerCase();
        for(int i=0;i<T.length()-P.length();i++){
            int indexawal = i;
            for(int j=0;j<P.length();j++){
                    if(T.charAt(i)==P.charAt(j) && j==(P.length()-1)){
                        System.out.println("Found at index "+indexawal);
                        i=indexawal;
                        empty = false;
                    }
                    else if(T.charAt(i)==P.charAt(j)){
                            i++;
                    }
                    else{
                          i=indexawal;
                          break;
                    }
                
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
//        File file = new File("D:\\dna.txt"); 
        File file = new File("D:\\lorenipsum.txt"); 
        Scanner sc = new Scanner(file);
        String T = "";
        while (sc.hasNextLine()) 
            T+=sc.nextLine();
        
        System.out.println(T);
        String P = s.nextLine();
        
        StringMatching(T,P);
        if(empty == true){
            System.out.println("("+P+")"+" not found in text.");
        }
    }
    
}
