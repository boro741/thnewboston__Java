import java.util.ArrayList;
import java.util.List;

public class ForEach{
    
    public static void main(String args[]){
        
        List<String> list = new ArrayList<String>();
        list.add("Deer");
        list.add("Beer");
        list.add("LOL");
        
        // For Each loop
        for(String s : list){
            System.out.println(s);
        }
    }
}