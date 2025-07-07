package com.mengyi.tonghuashun;

public class ValidBrackets {
    public static void main(String[] args) {
        int n = 3;
        new ValidBrackets().backtrack(n, n, new StringBuilder());

    }
    private void backtrack(int left, int right, StringBuilder sb){
        if(left == 0 && right == 0){
            System.out.println(sb.toString());
            return;
        }
        if(left > 0){
            sb.append("(");
            backtrack(left - 1, right, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(right > left){
            sb.append(")");
            backtrack(left, right - 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
