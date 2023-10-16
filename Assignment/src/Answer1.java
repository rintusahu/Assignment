import java.util.Arrays;

public class Answer1 {
    public static int[] shuffle(int[] arr){
        int len = arr.length-1;
        int[] temp = new int[len];
        int x=0, y=len/2;
        int a=0;

        while (a<len){
            temp[a++]=arr[x++];
            temp[a++]=arr[y++];
        }
        return temp;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7};
        int[] shuffle = shuffle(arr);

        System.out.print(Arrays.toString(shuffle));
    }
}