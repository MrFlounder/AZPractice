package LeetCode.Sorting;

import java.util.*;

/**
 * Created by guangshuo on 3/19/17.
 * Key problem: match two words if second can be achieved by deleting chars from first
 * Two pointers:
 * apackppslce - apple
 * i             j
 * if [i] == [j] i ++ j ++
 * if [i] != [j] i ++
 * if j hit the end before i hit the end, match! else no match
 *
 * worst case time: o(i)
 *
 * To get the longest word in lexicographical ofrder, we sort dic by longth and lexicographical first
 *
 * Input:
     s = "abpcplea", d = ["ale","apple","monkey","plea"]
     Output:
     "apple"

 */
public class LongestWordInDic524 {
    public String getWord(List<String> dic, String target) {
        sortDic(dic);
        return getFirstMatch(dic, target);
    }
    private void sortDic(List<String> dic){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                if (first.length() > second.length()) {
                    return -1;
                } else if (first.length() < second.length()) {
                    return 1;
                } else {
                    return first.compareTo(second);
                }
            }
        };
        Collections.sort(dic, comparator);
    }
    private String getFirstMatch(List<String> dic, String target) {
        for (String cur : dic) {
            if (match(target, cur)) return cur;
        }
        return "";
    }
    boolean match(String s, String w) {
        int si = 0, wi = 0;
        while (si < s.length() && wi < w.length()) {
            if (s.charAt(si) == w.charAt(wi)) {
                wi++;
                si++;
            }
            else {
                si++;
            }
        }
        return wi == w.length();
    }
    public static void main(String[] arg){
        LongestWordInDic524 ins = new LongestWordInDic524();
        List<String> test1 = new ArrayList<>();
        test1.add("aaa");
        test1.add("aa");
        test1.add("a");
        System.out.println(ins.getWord(test1, "aaa"));
    }
}
