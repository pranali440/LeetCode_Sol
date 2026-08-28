class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        int n=s.length();
        int k=p.length();
        List<Integer>ans=new ArrayList<>();

        int pCount[]=new int[26];
        for(char c:p.toCharArray())
        {
            pCount[c-'a']++;
        }
        for(int i=0;i<=n-k;i++)
        {
            int sCount[]=new int[26];

            for(int j=i;j<=i+k-1;j++)
            {
                sCount[s.charAt(j)-'a']++;
            }
            if(Arrays.equals(pCount,sCount))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}