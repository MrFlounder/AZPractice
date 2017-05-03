package laioffer.hashTableAndString1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guangshuo on 3/31/17.
 */
public class Deduplication {
    public String deDup(String input) {
        if (input == null || input == "") {
            return input;
        }
        StringBuilder res = new StringBuilder();
        int pre = 0;
        int cur = 1;
        while (cur < input.length() - 1) {
            cur ++;
            if (input.charAt(cur) != input.charAt(pre)) {
                res.append(input.charAt(pre));
            }
            pre ++;
        }
        if (input.charAt(cur) != input.charAt(pre)) {
            res.append(input.charAt(pre));
            res.append(input.charAt(cur));
        } else {
            res.append(input.charAt(cur));
        }
        return res.toString();
    }
}
