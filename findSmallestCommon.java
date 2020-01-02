//find smallest common element in 3 sorted arrays. use 3 pointers

class leastCommonNumber{
  static Integer find_least_common_number(int[] arr1, 
                                      int[] arr2,
                                      int[] arr3) {
    int pt1 = 0;
    int pt2 = 0;
    int pt3 = 0;
    while(pt1 < arr1.length && pt2 < arr2.length && pt3 < arr3.length){
      //move the smaller < maxOf3 to the right
      int max = Math.max(arr1[pt1],Math.max(arr2[pt2],arr3[pt3]));
      if(arr1[pt1] < max){
        pt1++;
      }
      if(arr2[pt2] < max){
        pt2++;
      }
      if(arr3[pt3] < max){
        pt3++;
      }
      if(arr1[pt1] == arr2[pt2] && arr2[pt2] == arr3[pt3]){
        return arr1[pt1];
      }
    }
    return -1;
  }
}
