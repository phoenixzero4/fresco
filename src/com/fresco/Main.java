package com.fresco;

public class Main {

    public static void main(String[] args) {
        
        String marks1="100 5,100 2,100 5|0,100,5|1,100,5";
        String marks2="67 4,34 2,54 5,100 2|1,100,5|0,100,5";
        String marks3="100 5,100 5,100 5|0,100,5|1,100,5";
        String marks4="100 5,100 2,56 5|1,100,5";
        String marks5="100 5,100 2,46 5|1,100,5";

       Student aided = new Aided();
       Student self = new SelfFinance();

       System.out.println(aided.result(marks1));
       System.out.println(aided.result(marks2));
       System.out.println(aided.result(marks3));
       System.out.println(aided.result(marks4));
       System.out.println(aided.result(marks5));


       System.out.println(self.result(marks1));
       System.out.println(self.result(marks2));
       System.out.println(self.result(marks3));
       System.out.println(self.result(marks4));
       System.out.println(self.result(marks5));

      
       
        
      
    }
}


