class Solution {
    public boolean isPalindrome(int x) {
        int rem=0,sum=0,n=x;
        if(x>=0)
        {
            while(x!=0)
            {
                rem=x%10;
                sum=sum*10+rem;
                x=x/10;
            }
            System.out.println(sum);
            if(sum==n || n==0)
                return true;
        }
    return false;
        
    }
}
