package ZhiFeng;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        System.out.println("What would you like the sum of?");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("Your Sum is "+sum);
    }
}
