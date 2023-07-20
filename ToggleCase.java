import java.util.Scanner;

public class ToggleCase {
    public char[] toggle(char[] c,int n){
        for(int i=0;i<n;i++){
            {
                c[i]= (char) (c[i]^(1<<5));
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        char c[]=new char[n];
        for(int i=0;i<n;i++){
            c[i] =s.charAt(i);
        }
        ToggleCase sol=new ToggleCase();
        System.out.println(sol.toggle(c,n));
    }
}