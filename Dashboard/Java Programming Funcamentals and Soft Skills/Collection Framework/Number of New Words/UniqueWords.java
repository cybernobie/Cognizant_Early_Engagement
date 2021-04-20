//import the necessary packages if needed
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main (String[] args) {
       /* code */ 
        
          Scanner kb=new Scanner(System.in);
         System.out.println("Enter Student's Article");
        String m=kb.nextLine();
        
   
        String m1[]="!@#$%^&*?<,.;:".split("");
        for(String s:m1){
            m=m.replace(s,"");
        }
        m=m.toLowerCase();
        String m2[]=m.split(" ");
        Set<String> st=new HashSet<>(Arrays.asList(m2));
        ArrayList<String> ls=new ArrayList<>(st);
        Collections.sort(ls);
        System.out.println("Number of words "+m2.length);
       
        System.out.println("Number of unique words "+st.size());
        System.out.println("The words are");
        int count=0;
        for(String s:ls){
            System.out.println(count+1+". "+s);
            count+=1;
        }
}
        
}