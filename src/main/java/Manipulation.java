import java.util.Scanner;

public class Manipulation {

    String str;

    Manipulation(String str){
        this.str = str;
    }

    public String High () { return str.toUpperCase(); }

    public String Low () { return str.toLowerCase(); }

    public int Length() { return str.length(); }

    public String Connect(String str1) { return (str + " " + str1) ; }
}