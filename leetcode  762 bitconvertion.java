class Solution {
    public int countPrimeSetBits(int left, int right) {
        //Integer.BitCount(i)
        int ct=0;
        for(int i=left;i<=right;i++)
        {
            int setbit=Integer.bitCount(i);
            if(isprime(setbit))
            {
                ct++;
            }

        }
        return ct;
    }
    public boolean  isprime(int n)
    {
        if(n<2)return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
//**************** int count = 0;
        while (left <= right)
            count += 665772 >> Integer.bitCount(left++) & 1;
        return count;
***********************//
    }
}