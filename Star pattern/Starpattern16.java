public class Solution {
    public static void alphaRamp(int n) {
       int character=65;
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print((char)character+" ");
           }
           character++;
           System.out.println();

       }
    }
}
/*
Output: 
A
B B
C C C
*/