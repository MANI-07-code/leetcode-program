class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        int c=0;
        while(i<j)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1==c2)
            {
            i++;
            j--;
            }
            else
            {
                if(c==1)return false;
                if(pali(s,i+1,j)||pali(s, i, j - 1))return true;
                return false;
            }
        }
      return true;
    }
     private boolean pali(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
     }
}