import  java.io.*;
public class SayTest {
    public static void main (String []args){
        Say doSay = new Say("huanhuan");
        doSay.setWord("tom");
        String showWord = doSay.getWord();
        System.out.println(showWord);
    }
}
