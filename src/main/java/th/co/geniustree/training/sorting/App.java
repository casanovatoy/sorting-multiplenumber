/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th.co.geniustree.training.sorting;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TOY
 */
public class App {

   private static final String[] question = {
       "1.",
       "2",
       "2.3.5.7",
       "6.1.2",
       "3.6",
       "0",
       "1.1.1.4",
       "11.0",
       "10.2.5"
   };

   private static void print(List<String> numbers) {
       for (String number : numbers) {
           System.out.println(number);
       }
       
       System.out.println("------------------------------------------------");
   }

   public static void main(String[] args) {
       List<String> numbers = Arrays.asList(question);
       print(numbers);
       numbers = Sorting.sort(numbers);
       print(numbers);
   }
}