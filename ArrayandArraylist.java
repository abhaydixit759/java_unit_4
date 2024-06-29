import java.util.*;
public class arr_arrLst{
    public static void main(String args[])
    {
        int[] arr=new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        System.out.println("Array element:"+Arrays.toString(arr));
        java.util.ArrayList<Integer>arrL=new java.util.ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.add(5);
        System.out.println("ArrayList element"+arrL);
    }
}