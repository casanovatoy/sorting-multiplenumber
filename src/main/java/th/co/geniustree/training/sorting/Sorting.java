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
           public int compare(String o1, String o2) {
               return multiplePointCompare(o1, o2);
           }
       });

       return numbers;
   }

   private static int multiplePointCompare(String str1, String str2) {
       return 0;
     
   }
}
