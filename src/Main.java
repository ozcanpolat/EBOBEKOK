import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int ebob=1,ekok=1,k=1;
        Scanner klavye= new Scanner(System.in);
        System.out.print("Birinci sayıyı girin :");
        int n1=klavye.nextInt();
        System.out.print("İkinci sayiyi girin :");
        int n2=klavye.nextInt();

        if(n1<n2){
            while(k<=n1){
                if(n1%k==0 && n2%k==0){
                    ebob=k;
                }
                k++;
            }
            System.out.println("EBOB :"+ebob);
            System.out.println("EKOK :" +(n1*n2)/ebob);
        }
        if(n2<n1) {
            while(k<=n2){
                if(n1%k==0 && n2%k==0){
                    ebob=k;
                }
                k++;
            }
            System.out.println("EBOB :"+ebob);
            System.out.println("EKOK :" +(n1*n2)/ebob);
        }
    }
}
