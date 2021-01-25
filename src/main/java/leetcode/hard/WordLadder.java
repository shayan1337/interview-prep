package leetcode.hard;

import java.util.*;

/**
 * 127. Word Ladder (https://leetcode.com/problems/word-ladder/)
 */
public class WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dictionary = new HashSet<>(wordList);

        Queue<Word> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new Word(beginWord, 0));

        while(!queue.isEmpty()) {
            Word word = queue.poll();

            if (word.word.equals(endWord))
                return word.distance;

            addNeighboursToQueue(queue, word, dictionary, visited);
        }

        return 0;
    }

    private static void addNeighboursToQueue(Queue<Word> queue, Word word, Set<String> dictionary, Set<String> visited) {
        char[] charArr = word.word.toCharArray();
        for(int i=0; i<word.word.length(); i++) {
            char tmp = charArr[i];
            for(int c=0; c<26; c++) {
                charArr[i] = (char)('a' + c);
                String newWord = new String(charArr);
                if (dictionary.contains(newWord) && !visited.contains(newWord)) {
                    queue.add(new Word(newWord, word.distance + 1));
                    visited.add(newWord);
                }
                charArr[i] = tmp;
            }
        }
    }
}

class Word {
    String word;
    int distance;

    Word(String _word, int _distance) {
        word = _word;
        distance = _distance;
    }
}