package DSA;
import java.util.*;
public class lab2{
    public static void main(String[] args) {
        int arr[]={6,3,4,2,9,8};
        int n =arr.length;
    }

    static void divide(int[] arr,int si,int ei){
     if(si>=ei) {
        return;
     }
        mid=si+(ei-si)/2;
        divide=(arr,si,mid);
        divide=(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
         }

         static void conquer(int arr,int si,int mid,int ei){
         int merger[] = new int[ei-si+1];
         
         }
}