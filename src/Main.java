import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count =0;
        System.out.print("Dizinin boyutunu giriniz:");
        int boyut=input.nextInt();
        int[] list = new int[boyut];

        for (int i=0;i<boyut;i++){
            System.out.print((i+1)+".Elemanı giriniz:");
            int eleman=input.nextInt();
            list[count++]=eleman;
        }
        Arrays.sort(list);
        System.out.print("Küçükten büyüğe sıralanmış şekli = ");
        for(int j=0;j<list.length;j++){
            System.out.print(list[j]+ " ");
        }


    }
}