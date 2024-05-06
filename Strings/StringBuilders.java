package Strings;


public class StringBuilders {

    
    //reverse a string using stringbuilder
    public static String reverseAString(String original){
        StringBuilder reverseStr=new StringBuilder(original);
        int i=0;
        int j=reverseStr.length()-1;
        
        while(i<j){
            char temp=reverseStr.charAt(i);
            reverseStr.setCharAt(i,reverseStr.charAt(j));
            reverseStr.setCharAt(j, temp);
            i++;
            j--;
        }
        return reverseStr.toString();
    }



    public static void main(String[] args) {
        
        //declaration and definition
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //charAt
        System.out.println(sb.charAt(0));

        //replacement
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert at a position
        sb.insert(3, 't');
        System.out.println(sb);

        //delete
        sb.delete(3,4);
        System.out.println(sb);

        //append
        sb.append(" tail");
        System.out.println(sb);

        //length
        System.out.println(sb.length());


        //reverse a string ----> see reverseAString method
        System.out.println(reverseAString("hello"));
    }


}
