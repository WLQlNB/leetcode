import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Test3 {
    public static int lengthOfLongestSubstring(String s) {
        int length=0;
        int max=0;
        for (int i = 0; i <s.length(); i++) {
            for (int j = i+1; j <s.length(); j++) {
                if(s.toCharArray()[i]==s.toCharArray()[j]){

                }
            }
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        int len=lengthOfLongestSubstring("abca");
        System.out.println(len);
    }
}
