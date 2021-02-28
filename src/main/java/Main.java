import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input new string: ");
        String str = in.nextLine();

        Manipulation first = new Manipulation(str);
        
        int choiсe = 0;
        while (choiсe != 5)
        {
            choiсe = 0;
            while (choiсe < 1 || choiсe > 5) {
                System.out.println("\nInput your choice: ");
                System.out.println("all letters are uppercase - 1 ");
                System.out.println("all letters are lowercase - 2 ");
                System.out.println("find out the length of the string - 3 ");
                System.out.println("concatenate two string - 4 ");
                System.out.println("exit - 5 \n");
                choiсe = in.nextInt();
                System.out.flush();
            }
            switch (choiсe)
            {
                case 1: first.High(); break;
                case 2: first.Low(); break;
                case 3: first.Length(); break;
                case 4: first.Connect(); break;
                case 5: System.exit(0); break;
            }
        }
        in.close();
    }
}