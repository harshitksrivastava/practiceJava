package src.DynamicProgramming;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
        int start =0, end =0;
        for(int i=0;i<s.length();i++){

            // for odd cases "babad"
            int odd = expandFromCentre(s,i,i);

            // for even cases with no centre "baab"
            int even  = expandFromCentre(s,i,i+1);
            int len = Math.max(odd,even);
            if(end-start < len){
                end = i+len/2;

                // we do len-1 below so as to count for even case as well 3/2 => 1 2/2 => 1
                start = i-(len-1)/2;
            }

        }

        return s.substring(start,end+1);
    }

    int expandFromCentre(String st,int i, int j){
        while(i>=0 && j<st.length() && st.charAt(i)==st.charAt(j)){
            i--;
            j++;
        }

        return j-i-1;
    }
}
