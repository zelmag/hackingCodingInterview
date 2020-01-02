class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || nums.length < k){
            return new int[0];
        }
        ArrayDeque<Integer> deck = new ArrayDeque<>(); //keep track of relevant indices in current window 
        int[] res = new int[nums.length - k + 1]; //max element of each window
        
        int i = 0;
        while(i < nums.length){
            //pop the element that is out of the window from the deck
            //i - k + 1  > peekFirst, then remove it bc its out of the window
            if(!deck.isEmpty() && deck.peekFirst() < i - k + 1){
                deck.pollFirst();
            }
            //delete the useless indices in current window bc they are smaller than current
            while(!deck.isEmpty() && nums[deck.peekLast()] < nums[i]){
                deck.pollLast();
            }
            deck.addLast(i);
            if(i >= k - 1){
                res[i - k + 1] = nums[deck.peekFirst()]; //first indices in deck is the current max of the window
            }
            i++;
        }
        return res;
    }
}
