package com.exercise;
import java.util.*;

/**
 * Created by masood on 09/27/17.
 */
public class ExerciseTwo {


    public int countSyed(String[]names,String expersion)
    {
        int count=0;
        for(String name:names)
        {
            if(name.startsWith("Seyed"))
                count++;


        }

        return  count;
    }

    public boolean haveSameReverse(String str)
    {
        boolean result=false;

        String str_R=new StringBuilder(str).reverse().toString();
        if(str_R.equals(str))
            result=true;
        return  result;
    }

    public int[] sortArray(int[] numbers)
    {
        Arrays.sort(numbers);
        return  numbers;

    }

    public boolean isEqual(int[] ar1,int[]ar2)
    {
        boolean result=false;
        if(Arrays.equals(ar1,ar2))
            result=true;

        return  result;
    }

    public  Double determinal(double[][] a)
    {
        Double det=0.0;


        int n1=0,n2=0;

        if(a.length>1) {
            n1 = a[0].length;
            n2 = a[1].length;

        }
        else if(a[0].length==1)
            n1=n2=1;
        else  return null;


        if(n1==n2)
        {
            if(n1==1)
            {

                det=a[0][0];

            }
            else {
                det=0.0;

                for(int j1=0;j1<n1;j1++)
                {

                    double[][] m = new double[n1-1][n2-1];

                    for(int i=1;i<n1;i++)
                    {

                        int j2=0;

                        for(int j=0;j<n1;j++)
                        {
                            if(j==j1)
                                continue;

                            m[i-1][j2]=a[i][j];
                            j2++;


                        }

                    }

                    det+=Math.pow(-1,2+j1)*a[0][j1]*determinal(m);
                }




            }

        }


        return  det;

    }

}
