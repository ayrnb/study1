package hannota;

import java.util.Scanner;

public class homewo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入汉诺塔的高度");
        int floor=sc.nextInt();
        hnt(floor,"A","B","C");
    }
    public static void hnt(int floor, String A, String B, String C){
        if(floor==1){
            System.out.println("将第"+floor+"层从"+A+"———————>"+C);
        }
        else{
            hnt(floor-1,A,C,B);
            System.out.println("将第"+floor+"层从"+A+"———————>"+C);
                hnt(floor-1,B,A,C);
        }
    }
}
