/* Reverse the elements of the original array.
Reverse the elements from 0 -> N-1.
Reverse the elements from N -> Length-1.
*/
class rotateArray{
  static void rotate_array(List<Integer> arr, int n) {
    //TODO: Write - Your - Code  
    n = n % arr.size();
    if(n < 0){
      n += arr.size();
    } 
    reverse(arr,0,arr.size()-1);
    reverse(arr,0,n-1);
    reverse(arr,n,arr.size()-1);
  }
  static void reverse(List<Integer> arr, int start, int end){
    while(start < end){
      Integer temp = arr.set(start, arr.get(end));
      arr.set(end,temp);
      start++;
      end--;
    }
  }
}  
