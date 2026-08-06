import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] foods = {"Rice", "Chicken", "Egg"};
//        for(int i = 0; i<=foods.length; i++){
//            System.out.println(foods[i]);

        System.out.print("Type what you want to print: ");
        String a = sc.nextLine();
        System.out.print("How much time you want to print it?: ");
        int b = sc.nextInt();
        for (int i = 1; i<=b; i++) {
            System.out.println(a);
        }
        }
    }
