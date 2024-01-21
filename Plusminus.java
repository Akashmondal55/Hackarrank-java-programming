package Week1;

import java.util.*;
import java.text.DecimalFormat;
public class Plusminus{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size ");
        int n= Integer.parseInt(sc.nextLine());
        int arr[]=new int [n];
        for(int i=0; i<= arr.length-1;i++){

            arr[i]=sc.nextInt();
        }
        sc.close();
        double pos=0.0;
        double neg=0.0;
        double zer=0.0;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>0){
                pos=pos+1;
            }
            else if(arr[i]<0){
                neg=neg+1;

            }
            else{
                zer=zer+1;
            }
        }
        DecimalFormat df=new DecimalFormat("#000");
        System.out.println(df.format(pos/n));
        System.out.println(df.format(neg/n));
        System.out.println(df.format(zer/n));

        
    }
}