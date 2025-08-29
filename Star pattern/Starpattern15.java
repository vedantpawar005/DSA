public class Solution {
    public static void nLetterTriangle(int n) {
       for(int i=n;i>0;i--)
       {
           int character=65; //65 in ascii is A
           for(int j=1;j<=i;j++)
           {
               System.out.print((char)character+" ");
               character++;
           }
           System.out.println();
       }

    }
}

/*

A B C
A B
A
*/