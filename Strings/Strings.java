package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
         
        //getting string input----------->
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your name:-");
        //take string till first whitespace only
        String name=sc.next();
        System.out.println("Your name is:- "+name);
        System.out.println("Enter Your name:-");
        //take the full string input
        String fullname=sc.nextLine();
        System.out.println("Your name is:- "+fullname);
        sc.close();

        

        //Useful methods -------------->


        //Concatination
        String firstName="Tony";
        String lastName="Stark";
        System.out.println(firstName+" "+lastName);


        //length
        System.out.println(firstName.length());


        //charAt
        for(int i=0;i<firstName.length();i++){
            System.out.println(firstName.charAt(i));
        }


         //comparision
         //if s1>s2-->+ve value
         //if s1==s2---->0
         //if s1<s2---->-ve value
         String s1="Tony";
         String s2="Tony";
         String s3="Pony";
         String s4="tony";

         System.out.println(s1.compareTo(s2));
         System.out.println(s1.compareTo(s3));
         System.out.println(s1.compareTo(s4));


         // Note----> In java Strings get stored as objects and hence having different properties than primitive type.

         //substring----->
         String sent="My name is Tony Stark";
         String name1=sent.substring(11, 17);
         String lname=sent.substring(16);
         System.out.println(name1);
         System.out.println(lname);


         //Note------> Strings are immutable in java



    }
}
