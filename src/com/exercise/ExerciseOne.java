package com.exercise;

/**
 * Created by masood on 09/26/17.
 */
public class ExerciseOne {

    public void fibunochi(int n)
    {

        int f1=1,f2=0,f3=0;

        while(f3<n)
        {
            f3=f1+f2;

            f1=f2;
            f2=f3;
            if(f3<n)
            System.out.println(f3);

        }



    }
    public int fibunochi_R(int n)
    {

        if(n==1 || n==2) {

            return 1;
        }


        return fibunochi_R(n-1)+fibunochi_R(n-2);






    }

    public void  exNumber1(int n)
    {



        fibunochi(n);
        System.out.println("********************");

        int fibo=0;
        for(int i=1;fibo<n;i++) {

            fibo=fibunochi_R(i);
            if(fibo<n)
                System.out.println(fibo);


        }
    }
    public  boolean palindrome(int n)
    {
        boolean result=false;
        String str=new StringBuilder(String.valueOf(n)).reverse().toString();
        if(str.equals(String.valueOf(n)))
            result =true;

        return  result;
    }

    public boolean ISPowerTwo(int n)
    {
        boolean result=false;
        if( ((n & (n - 1)) == 0))
            result=true;

        return  result;
    }

    public void printCharOneINBetween()
    {
        for(int i=97;i<=122;i++)
            if(i%2!=0)
                System.out.println((char)i);

    }
    public double calculateCircleArea(double radius)
    {
        double area=0;

        area=Math.PI*Math.pow(radius,2);
        System.out.println("circle area with radius "+radius+"is :"+area);
        return area;
    }

    public  void printTirangle(int n)
    {

        int firstOfset=1;
        while (firstOfset<=n)
        {


            for(int j=0;j<firstOfset;j++)
                System.out.print("*");

            System.out.println();

            firstOfset+=2;
        }

        firstOfset=firstOfset-4;
       while (firstOfset>0)
        {

            for(int j=0;j<firstOfset;j++)
                System.out.print("*");

            System.out.println();
            firstOfset=firstOfset-2;

        }


    }
    public int factoril(int n)
    {
        if(n==0)
            return 1;

        return n*factoril(n-1);


    }

}
