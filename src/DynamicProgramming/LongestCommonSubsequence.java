package src.DynamicProgramming;

public class LongestCommonSubsequence {
	 public int longestCommonSubsequence(String text1, String text2) {
	        char [] s1 = text1.toCharArray();
	        char [] s2 = text2.toCharArray();

	        int [][] temp = new int[s1.length+1][s2.length+1];
	        // to make first row all zero
	        for(int i=0;i<1;i++){
	            for(int j=0;j<temp[0].length;j++){
	                temp[i][j]=0;
	            }
	        }
	        // to make first column all zero
	        for(int i=0;i<temp[0].length;i++){
	            for(int j=0;j<1;j++){
	                temp[j][i]=0;
	            }
	        }
	        int ans =0;
	        for(int i=1;i<temp.length;i++){
	            for(int j=1;j<temp[0].length;j++){
	                if(s1[i-1]==s2[j-1])
	                    temp[i][j] = temp[i-1][j-1]+1;
	                else
	                    temp[i][j] = Math.max(temp[i-1][j],temp[i][j-1]);
	                
	                ans = Math.max(temp[i][j],ans);
	                
	            }
	        }
	        return ans;
	    }
}
