package src.DynamicProgramming;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
//		either 0 or any lowest value;
        int maxProfit = Integer.MIN_VALUE;
        
//        starting value will be the minimum value
        int min =  prices[0];
        for(int i=0;i<prices.length;i++){
        	
//        	whenever we encounter a min value we update our minimum pointer
            if(min>prices[i])
                min = prices[i];
            
//            we update; if current profit is greater than prev cal profit
            else
                maxProfit= Math.max(maxProfit,prices[i]-min)  ;  
            
        }
        return maxProfit;
}
	public static void main(String[] args) {
		BestTimeToBuyAndSellStock  bestTimeToBuyAndSellStock= new BestTimeToBuyAndSellStock();

		int op =bestTimeToBuyAndSellStock.maxProfit(new int[] {2,4,1});
	System.out.println(op);
	}

}
