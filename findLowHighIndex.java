/* there are many duplicates in this sorted array.
   return low index of key and high index of key. binary search to find low index and binary search to find high index
*/

class findLowHigh{
  static int find_low_index(
      List<Integer> arr,
      int key) {
        int low = 0;
        int high = arr.size()-1;
        while(low <= high){
          int mid = low + (high - low)/2;
          Integer midElement = arr.get(mid);
          if(midElement >= key){
            high = mid - 1;
          }else{
            low = mid + 1;
          }
        }
        if(low < arr.size() && arr.get(low) == key){
          return low;
        }
    return -1;
  }

  static int find_high_index(
      List<Integer> arr,
      int key) {
        int low = 0;
        int high = arr.size()-1;
        while(low <= high){
          int mid = low + (high - low)/2;
          Integer midElement = arr.get(mid);
          if(midElement <= key){
            low = mid + 1;
          }else{
            high = mid -1;
          }
        }
        if(high >= 0 && arr.get(high) == key){
          return high;
        }
    return -1;
  }
} 
