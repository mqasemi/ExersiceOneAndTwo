package com.porgram;

import com.exercise.ExerciseTwo;

/**
 * Created by masood on 09/27/17.
 */
public class ExecuteExerciseTwo {

    public static  void main(String []args)
    {
        ExerciseTwo eTwo=new ExerciseTwo();
      System.out.println(  eTwo.determinal(new double[][]{
              {1, 0, 2, -1},
              {3, 0, 0, 5},
              {2, 1, 4, -3},
              {1, 0, 5, 0}
    }));

        System.out.println(  eTwo.determinal(new double[][]{
                {1, 1},
                {3, 1}

        }));

        /*
       int[] result= eTwo.sortArray(new int[]{1,5,2,3,9,8,7});

        for(int i :result)
            System.out.println(i);

            */

    }
}
