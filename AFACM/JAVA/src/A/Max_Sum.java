package A;

import java.util.Scanner;

public class Max_Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int T = Integer.parseInt(reader.nextLine());
        String[] an = new String[T];
        for (int n = 0; n < T; n++) {
            String[] inp = reader.nextLine().split(" ");
            int[] data = new int[Integer.parseInt(inp[0])];
            for (int i = 0; i < data.length; i++) {
                data[i] = Integer.parseInt(inp[i + 1]);

            }
            int Max = 0;
            int start = 0;
            int end = 0;
            for (int x = 0; x < data.length; x++) {
                for (int y = x; y < data.length; y++) {
                    int temp = 0;
                    for (int i = x; i <= y; i++) {
                        temp += data[i];
                        if (temp > Max) {
                            Max = temp;
                            start = x;
                            end = y;
                        } else continue;

                    }
                }
            }
            start++;
            end++;
            an[n] = Max + " " + start + " " + end;

        }
        for (int i = 0; i < T; i++) {
            int n = i + 1;
            System.out.println("Case " + n + ":");
            System.out.println(an[i]);
        }
    }
}
