class Solution {
  public:
    void printTriangle(int n) {
        // code here
        int space=n-1;
        for(int i=0;i<n;i++)
        {
            for(int s=space;s>0;s--)
            {
                cout<<" ";
            }
            space--;
            for(int j=0;j<i*2+1;j++)
            {
                cout<<"*";
            }
            cout<<"\n";
        }
    }
};
/*

     *
    ***
   *****
  *******
 *********
 
*/ 
 