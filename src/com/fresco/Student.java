package com.fresco;

import java.text.DecimalFormat;

public abstract class Student {


    
    
    public abstract String result(String MarksOfStudent);
    
    public static double calcGrade(int grade) {
         DecimalFormat df = new DecimalFormat("#.#");
        double gpa = 0.0;
        double diff = 0.0;
        
        if(grade < 40) {
            gpa = 0;
        }else if(grade < 50) {
       
            gpa = 6 + (.1 * (grade % 10));
            
        }else if(grade < 60) {

            gpa = 7 + (.1 * (grade % 10));
            
        }else if(grade < 75) {
            diff = grade - 60;
            gpa = 8 + (.1 * (diff/1.5));
            
        }else if(grade < 100) {
             diff = grade - 75;
            gpa = 9 + (.1 * (diff/2.36));
            
        }else if(grade == 100){
            return 10;
        }else{
        
            return 0;
        }

        String res = df.format(gpa);
        return Double.parseDouble(res);
    }
    
    
    public static double calculateGP(int marks){

        DecimalFormat df = new DecimalFormat("#.#");
        double res = 0;
        if(marks>=75 && marks<= 100)
        {
            double diff = marks - 75;
            int r=0;
            if(diff >= 2.36)
            {
                r = (int)(diff/2.36);
            }
            double inc = 0.1* r;
            /*double value = 0.04;
            double inc = (diff*value);
            String str = String.format("%.1f",inc);*/
            res = 9+inc;
        }
        else if(marks>=60 && marks<=74){

            int diff = marks - 60;
            int r=0;
            if(diff >= 1.5)
            {
                r = (int)(diff/1.5);
            }
            double inc = 0.1* r;
            /*double value = 0.9/14;
            double inc = (diff*value);
            String str = String.format("%.1f",inc);*/
            res = 8+inc;
        }
        else if(marks>=50 && marks<= 59){
            int diff = marks - 50;
            double value = 0.1;
            res = 7+(diff*value);
        }
        else if(marks>=40 && marks<=49)
        {
            int diff = marks - 40;
            double value = 0.1;
            res = 6+(diff*value);
        }
        else
        {
            res = 0;
        }
        df.format(res);
        return res;
    }
}


