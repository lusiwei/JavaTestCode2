package Test_Question;

/**
 * 先冒泡排序，再二分查找
 */
public class BubbleAndBinarySort {
    public static void main(String[] args) {
        int[] arr=new int[]{20,18,30,16,0,79,21};
        int[] arrSort=bubbleSort(arr);
        for (int i : arrSort) {
            System.out.print(i+",");
        }
        //查找
        System.out.println();
        System.out.println(binarySearch(arrSort,21));
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        int temp;
        //外层循环控制大的比较次数
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制每次大的循环比较次数
            for (int i1 = 0; i1 < arr.length - i - 1; i1++) {
                if (arr[i1]>arr[i1+1]){
                    temp=arr[i1];
                    arr[i1]=arr[i1+1];
                    arr[i1+1]=temp;
                }
            }
        }
        return arr;
    }


    //二分查找
    public static int binarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        int middle;
        while (high>=low){
            middle=(low+high)/2;
            if (key<arr[middle]) high=middle-1;
            else if(key>arr[middle]) low=middle+1;
            else return middle;
        }
        return -1;
    }
}
