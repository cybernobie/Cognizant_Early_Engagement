import java.util.*;
class Authority{
     public static void main (String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Inmate's name:");
        String name=kb.nextLine();
        System.out.print("\nInmate's father's name:");
    
        String fname=kb.nextLine();
        boolean g=true;
        String[] s="@#$1234567890%^&*".split("");
        for(int i=0;i<s.length;i++){
            if(name.contains(s[i]) || fname.contains(s[i])){
                g=false;
                break;
            }
        }
        if(g==true){
            String m=" "+fname;
            String str=name.concat(m);
            System.out.println("\n"+str.toUpperCase());
        }
        else{
            System.out.println("\n Invalid name");
        }
    }
}