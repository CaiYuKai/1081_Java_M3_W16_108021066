import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int data[]=new int[n];
        for (int i=0;i<n;i++){
            data[i]=scn.nextInt();
        }
        for (int i=0;i<data.length;i++){
            int sum;
            sum=0;
            String str=" ";
        for (int j=i;j<data.length;j++){
            sum=sum+data[j];
            str=str+data[j]+"\t";
            if (sum == 0) {
                System.out.println(str);
            }
            }
        }
    }
}
