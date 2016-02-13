package bjs.task29;

public class Main {

    public static void main(String[] args) {
        //if (RegexTest.checkUserNameRegex("YM_02")) {
        if (RegexTest.checkUserNameNative("YM_02")) {
            System.out.println("User name is valid!");
        }
        else {
            System.out.println("User name is not valid!");
        }
    }
}
