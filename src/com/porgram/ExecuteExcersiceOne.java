package com.porgram;

import com.exercise.ExerciseOne;

/**
 * Created by masood on 09/26/17.
 */
public class ExecuteExcersiceOne {

  public static  void main(String []args)
  {

      ExerciseOne eone=new ExerciseOne();



      eone.exNumber1(1000);



      System.out.println(eone.palindrome(1221));
      System.out.println(eone.palindrome(122));


      System.out.println("is power Of two :"+eone.ISPowerTwo(1));
      System.out.println("is power Of two :"+eone.ISPowerTwo(2));
      System.out.println("is power Of two :"+eone.ISPowerTwo(4));
      System.out.println("is power Of two :"+eone.ISPowerTwo(3));



      eone.printCharOneINBetween();

      eone.calculateCircleArea(2);

      eone.printTirangle(5);


     System.out.println(" factorial result :"+eone.factoril(3));




  }
}
