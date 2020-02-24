import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=a*b;
            int max=0;
            if(a>=b){
                max=a;
            }else {
                max=b;
            }
            int result = 0;
            while (c>=max){
                if(c%a==0&&c%b==0){
                    result=c;
                }
                c--;
            }
            System.out.println(result);
        }
    }
}
