//To remove speial Characters.
class HelloWorld {
    public static void main(String[] args) {
        
        String str="$ja!va$&st%ar";
        
        //App-1 (replaceAll() Method)
        
        String a=str.replaceAll("[^a-zA-Z0-9]","");
        
        System.out.println(a);
    }
}

//To Remove White Spaces From Given String.

class HelloWorld {
    public static void main(String[] args) {
        
        String str="ja va st ar";
        
        //App-1 (replaceAll() Method)
        
        String a=str.replaceAll("\\s","");
        
        System.out.println(a);
    }
}

// To remove Duplicate characters from a given string.("programming")

1) Using Java 8
2) Using indexof(..)
3) Using Character Array
4) Using Set interface method

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        String str="programming";
        
//App-1 
        
        StringBuilder sb=new StringBuilder();
        str.chars().distinct().forEach(c-> sb.append((char)c));
        
        System.out.println(sb);
        
        System.out.println();
        
//App-2
        
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int idx=str.indexOf(ch,i+1);
            if(idx==-1){
                sb1.append(ch);
            }
        }
        System.out.println(sb1);
        
        System.out.println();
        
//App-3
        
        char[] arr=str.toCharArray();
        StringBuilder sb2=new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            boolean repeated=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                sb2.append(arr[i]);
            }
        }
        System.out.println(sb2);
        
//App-4
        
        System.out.println();
        
        StringBuilder sb3=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        
        for(Character c:set){
            sb3.append(c);
        }
        System.out.println(sb3);
                
    }
}
