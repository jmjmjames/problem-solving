package com.javaps.P전화번호목록;

import java.util.Arrays;

public class Solution2 {
    public boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        boolean result = true;
        for (int i = 0; i < phoneBook.length - 1; i++) {
            if (phoneBook[i + 1].contains(phoneBook[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
