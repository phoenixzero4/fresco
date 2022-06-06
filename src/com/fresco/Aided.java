package com.fresco;

public class Aided extends Student{

    @Override
    public String result(String marks){               

        int maxCredits = 0;        
        double sumGradePoints = 0.0;
        double cgpa = 0.0;

        String[] allMarks = marks.split("[|]");
        String[] subjectMarks = allMarks[0].split("[,]");
        String[] grades = null;
        int individualGrade = 0;
        int points = 0;

   
        for(int i = 0; i < subjectMarks.length; i++) {
         grades = subjectMarks[i].split("[ ]");
              points = Integer.parseInt(grades[1]);
              individualGrade = Integer.parseInt(grades[0]);
             sumGradePoints += (calcGrade(individualGrade) * points);
             maxCredits += 5;
        

        }
        for(int i = 1; i < allMarks.length; i++) {
            grades = allMarks[i].split("[,]");
                if(grades[0].equals("1")){
                     points = Integer.parseInt(grades[2]);
                     individualGrade = Integer.parseInt(grades[1]);
                     sumGradePoints += (calcGrade(individualGrade) * points); 
                    maxCredits += 5;

                }           
        }
        

    cgpa = sumGradePoints / maxCredits;
    String res = String.format("%.2f", cgpa);
    return res;

    }
}



