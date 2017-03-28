package laioffer;

/**
 * Created by guangshuo on 3/14/17.
 */
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int totalScore(String[] blocks, int n)
    {
        // WRITE YOUR CODE HERE
        int[] score = new int[n];
        for(int i = 0; i < blocks.length; i++) {
            if (i == 0) {
                if (blocks[i].equals("+") || blocks[i].equals("X") || blocks[i].equals("Z")) {
                    score[i] = 0;
                } else {
                    score[i] = Integer.parseInt(blocks[i]);
                }
            } else {
                if (!blocks[i].equals("+")) {
                    if (blocks[i].equals("X")) {
                        score[i] = score[i - 1] * 2;
                    } else if (blocks[i].equals("Z")) {
                        for (int j = i; j > 1; j--) {
                            score[j] = score[j - 2];
                        }
                        score[0] = 0;
                        score[1] = 0;
                    } else {
                        score[i] = Integer.parseInt(blocks[i]);
                    }
                } else {
                    if (i == 1) {
                        score[i] = 0 + score[i - 1];
                    } else {
                        score[i] = score[i - 2] + score[i - 1];
                    }
                }
            }
            System.out.println(score);
        }
        return score[n - 1];
    }

    public static void main(String[] arg) {
        totalScore(new String[]{"5","-2","4","Z","X","9","+","+"}, 8);
    }
    // METHOD SIGNATURE ENDS
}
