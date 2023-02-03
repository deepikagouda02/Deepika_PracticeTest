package samplePackage;
import java.util.*;

public class Palin {
    public static void main(String[] args) {
        int n=121;
        int r,sum=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println(n+" number is Palindrome");
        else
           System.out.println(n+" number is not a Palindrome number");
    }
}