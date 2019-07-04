import java.io.*;
public class Say {
    String word;
    /* 构造函数和类型的名字一样，并且开头字母大写 */
    public Say (String word) {
        System.out.println("输出的单词："+ word );
    }
    public void setWord (String sayWord) {
        word = sayWord;
    }
    /* 定义返回的数据类型 */
    public String getWord (){
        return word;
    }
}