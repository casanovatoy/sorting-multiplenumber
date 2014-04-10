/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th.co.geniustree.training.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
*
* @author anonymous
*/
public class Sorting {

    public static List<String> sort(List<String> numbers) {
 
        Collections.sort(numbers, new Comparator<String>() {
 
            @Override
            public int compare(String s1, String s2) {
                return multiplePointNumberCompare(s1, s2);
            }
        }); 
        return numbers;
    }
 
    public static int multiplePointNumberCompare(String str1, String str2) {
        String[] split1 = str1.split("\\.");
        String[] split2 = str2.split("\\.");
 
        int length = (split1.length > split2.length) ? split1.length : split2.length;
 
        for (int i = 0; i < length; i++) {
            int numb1;
            try {
                numb1 = Integer.parseInt(split1[i]);
            } catch (Exception ex) {
                return -1;
            }
 
            int numb2;
            try {
                numb2 = Integer.parseInt(split2[i]);
            } catch (Exception ex) {
                return 1;
            }
            if (numb1 > numb2) {
                return 1;
            }
            if (numb1 < numb2) {
                return -1;
            }
        }
        return 0;
    }
}

