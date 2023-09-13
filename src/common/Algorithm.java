/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author ASUS
 */
public class Algorithm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string to search");
        String sentence = in.nextLine();
        StringTokenizer st = new StringTokenizer(sentence, " ");
        Map<String, Integer> map = new TreeMap<>();
        while (st.hasMoreTokens()) {
            addWord(map, st.nextToken());
        }

        for (String key : map.keySet()) {
            System.out.print("{" + key + ":" + map.get(key) + "}");
        }

        Map<Character, Integer> map2 = new TreeMap<>();
        for (String key : map.keySet()) {
            for (int i = 0; i < key.length(); i++) {
                if (map2.containsKey(key.charAt(i))) {
                    int count = map2.get(key.charAt(i)) + 1;
                    map2.put(key.charAt(i), count);
                } else {
                    map2.put(key.charAt(i), 1);
                }
            }
        }
        System.out.println(" ");
        for (Character key : map2.keySet()) {
            System.out.print("{" + key + ":" + map2.get(key) + "}");
        }
    }

    public static void addWord(Map<String, Integer> map, String word) {
        if (map.containsKey(word)) {
            int count = map.get(word) + 1;
            map.put(word, count);
        } else {
            map.put(word, 1);
        }
    }

}
