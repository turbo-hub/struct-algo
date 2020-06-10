/**
 * Created by Turbo
 */
import java.math.*;
public class SortJava {


    public static void main(String[] args) {
        int[] arr = {2,3,5,1,23,6,78,34};
//        int[] arr2 = sort(arr);
        int [] arr2= insertSort(arr);
        for(int e: arr2){
            System.out.println(e);
        }
    }



    //插入排序
    public static int[] insertSort(int[] a) {



        //i表示需要插入的新数据  0~i-1都是有序部分
        for (int i = 1; i < a.length; i++) {

            int value = a[i];
            int j = i - 1;

            // 查找插入的位置
            for (; j >= 0; j--) {

                System.out.println("jnei:"+j);

                // a[j] > value 把a[j]往后挪
                if (a[j] > value) {
                    a[j+1] = a[j];
                }
                else {
                    break;
                }
            }

            //当j循环到第一个位置时此时j=-1 所以需要+1 也就是a[0] =value
            //当j循环时遇到break时j+1=i a[j+1] = a[i] =value 相当于没变
            a[j+1] = value;
        }

        return a;
    }



//    public static void main(String[] args) {
//        //n的值
//        int n =7;
//        //求得结果
//        System.out.println(getNumber(n,n).multiply(getResult(n,n)));
//    }


    private static int find(int j){
        int i = 0,num = 2;
        while(true){

            if(num%2==0 || num%3==0 || num%5==0){

                if(++i == j) return num;
            }

         num++;

        }
    }





























}
