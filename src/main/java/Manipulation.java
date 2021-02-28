import java.util.Scanner;

public class Manipulation {

    String str;

    Manipulation(String str){
        this.str = str;
    }

    public void High () { System.out.println(str.toUpperCase()); }

    public void Low () { System.out.println(str.toLowerCase()); }

    public void Length() { System.out.printf("Length of the string - %d\n", str.length()); }

    public void Connect() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input another string: ");
        String str1 = in.nextLine();
        System.out.printf(str + " " + str1 + "\n") ;
    }
}