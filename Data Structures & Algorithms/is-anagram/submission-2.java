class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int i=0, n=sArray.length, j=0, m=tArray.length;

        if(n != m) return false;
        
        while(i<n && j<m) {
            if(sArray[i] != tArray[j]) return false; 
            i++;
            j++;
        }

        return true;
    }
}
