package DsProblem;

public class RemoveDuplicateFromSortedArray {
  public static void main(String[] args) {
    int[] array = new int[]{0,0,1,2,2,3};
    int arrayLength = array.length;
    int j= 0;
    int[] tempArr = new int[4];
    for (int i = 0 ; i < arrayLength -1  ; i++){
      if(array[i] != array[i + 1]){
          tempArr[j++] = array[i];
      }
    }
    tempArr[j++] = array[arrayLength-1];
     for (int i : tempArr){
       System.out.println(i);
     }
    }
  }

