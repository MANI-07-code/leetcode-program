class Solution {
    public int fib(int n) {
        int b=0;
        if(n==1)
        return 1;
        if(n==2)
        {
            return 1;
        }
        int f=1;
        int s=1;
        int c=0;
        for(int i=3;i<=n;i++)
        {
            c=f+s;
            f=s;
            s=c;
           
        }
        return c;
    }
}