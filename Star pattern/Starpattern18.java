public class Solution {
    public static void alphaTriangle(int n) {
        int character=65+n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)character+" ");
                character--;
            }
            character=65+n-1;
            System.out.println();
        }
    }
}