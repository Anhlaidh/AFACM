package week1.Enumeration;
import java.util.Scanner;
public class Perfectd_cubic {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (reader.hasNextInt()) {
            int N = reader.nextInt();

            for (int a = 2;a <=N;a++){
                for (int b = 2;b<a;b++){
                    for (int c = 2;c<b;c++){
                        for (int d = 2;d<c;d++){
                            if (a*a*a == b*b*b+c*c*c+d*d*d){
                                System.out.println("Cube = ("+a+","+b+","+c+","+d+")");
                            }
                        }
                    }
                }

            }
        }

    }
}
