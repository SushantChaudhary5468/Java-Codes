import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        // String str="Hello How r u";
        
        //Approach-1
        char[] a=str.toCharArray();
        int n=a.length-1;
        for(int i=n;i>=0;i--){
            System.out.print(a[i]);
        }
        System.out.println(" ");
        
        //Approach-2
        for(int i=n;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
        
        //Approach-3
        StringBuffer sb =new StringBuffer(str);
        System.out.print(sb.reverse());
        
        
        System.out.println(" ");
        //Approach-4
        StringBuilder sB =new StringBuilder(str);
        System.out.print(sB.reverse());
        
    }
}