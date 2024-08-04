import java.util.Scanner;
class task2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of subjects: ");
        int subjects=sc.nextInt();
        System.out.print("Enter maximum marks of a subject: ");
        int max_marks=sc.nextInt();
        System.out.println("Please Enter subject wise marks: ");
        float[] marks=new float[subjects];
        for(int i=1;i<subjects+1;i++){
            System.out.print("Enter subject"+i+" marks: ");
            float subject=sc.nextFloat();
            if (subject>=0 && subject<=max_marks){
               marks[i-1]=subject;
            }
            else{
                System.out.println("invalid marks");
                i--;
            }   
        }
        float total=0;
        for(int j=0;j<subjects;j++){
            total+=marks[j];
        }
        System.out.println(total);
        float percentage=((total/(subjects*max_marks))*100);
        // System.out.println(percentage);
        String grade="";

        if(percentage>=85.0 && percentage<=100.0){
            grade+="A+";
        }
        else if(percentage>=80.0 && percentage<=84.0){
            grade+="A";
        }
        else if(percentage>=75.0 &&  percentage<=79.0){
            grade+="B+";
        }
        else if(percentage>=70.0 && percentage<=74.0){
            grade+="B";
        }
        else if(percentage>=65.0 && percentage<=69.0){
            grade+="B";
        }
        else if(percentage>=60.0 && percentage<=64.0){
            grade+="C+";
        }
        else if(percentage>=55.0 && percentage<=59.0){
            grade+="C";
        }
        else if(percentage>=50.0 && percentage<=54.0){
            grade+="D+";
        }
        else if(percentage>=40.0 && percentage<=44.0){
            grade+="D";
        }
        else{
            grade+="Fail";
        }
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);
    }
}