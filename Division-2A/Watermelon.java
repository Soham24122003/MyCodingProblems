import java.util.Scanner;

class Watermelon
{
    public static void main(String[] args) {
        int w;
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        if (w%2==0 && w>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}



