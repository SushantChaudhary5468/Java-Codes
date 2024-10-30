import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String str="rock";

        char[] a=str.toCharArray();
        int n=a.length;
        
//App-1.
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                if(a[i]>a[j]){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                
                }
            }
        }
        
        System.out.println(new String(a));
        
//App-2
        System.out.println();
        
        
        Arrays.sort(a);
        System.out.println(new String(a));
    }
}