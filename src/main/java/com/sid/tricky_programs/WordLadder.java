package com.sid.tricky_programs;

/**
 * Problem Definition: Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
 * - Only one letter can be changed at a time.
 * - Each transformed word must exist in the word list.
 *
 * Time Complexity: O(M^2 * N) where M is the length of each word and N is the total number of words in the input list.
 * Space Complexity: O(M * N)
 *
 * @author Siddhant Patni
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        int result = ladderLength(beginWord, endWord, wordList);
        System.out.println("Length of shortest transformation sequence: " + result);
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int length = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                assert currentWord != null;
                char[] wordArray = currentWord.toCharArray();

                for (int j = 0; j < wordArray.length; j++) {
                    char originalChar = wordArray[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        wordArray[j] = c;
                        String newWord = String.valueOf(wordArray);

                        if (newWord.equals(endWord)) {
                            return length + 1;
                        }

                        if (wordSet.contains(newWord)) {
                            queue.add(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                    wordArray[j] = originalChar;
                }
            }
            length++;
        }
        return 0;
    }
}