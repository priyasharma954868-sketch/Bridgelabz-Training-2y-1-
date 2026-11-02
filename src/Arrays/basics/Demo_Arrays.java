package Arrays;

import java.util.HashMap;

public class Demo_Arrays {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2,3,3,4,4,5,5,6,6,8,7,7,8,9,9,2,2,5,3,4,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            System.out.println();
        }
        for(int i: arr){
            System.out.print(i+ "  ");
        }
        System.out.println("Frequency of the array : - ");
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

        for(int i : arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
