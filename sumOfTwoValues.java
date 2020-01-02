// ret true if there's a pair that adds to target

// find_sum_of_two function return true if
// there are two values in array who
// sum to value and returns false otherwise
class findSum{
  static boolean find_sum_of_two(int[] A, int val) {
    HashSet<Integer> seen = new HashSet<>();
    for(int i = 0; i < A.length; i++){
      if(seen.contains(val - A[i])){
        return true;
      }
      seen.add(A[i]);
    }
    return false;
  }
}  
