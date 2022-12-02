import java.util.Scanner;
public class Main{
  public static void main(String []args){
      Scanner s = new Scanner (System.in);
      System.out.println("Enter your grade for a surprise:");
      int grade=s.nextInt();
      System.out.println(letter(grade));

      s.close();
  }
  public static String letter(int grade){
    
    if (grade == 100){
      return ("A+");
    }else if (grade >= 90){
      if (grade>= 97){
        return("A+");
      }else if (grade<95){
        return("A-");
      }else{
        return("A");
      }
    }else if (80 <= grade && grade < 90 ){
      if (grade>= 87){
        return("B+");
      }else if (grade<85){
        return("B-");
      }else{
        return("B");
      }
    }else if (70 <= grade && grade < 80 ){
        if (grade>= 77){
        return("C+");
      }else if (grade<75){
        return("C-");
      }else{
        return("C");
      }
    }else if (60 <= grade && grade < 70 ){
      if (grade>= 67){
        return("D+");
      }else if (grade<65){
        return("D-");
      }else{
        return("D");
      }
    }else 
      return ("F");
    
    }
  }
