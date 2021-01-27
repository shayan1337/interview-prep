package leetcode.hard;

import java.util.*;

public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Set<String> dictionary = new HashSet<>(wordList);
        int shortestDistance = Integer.MAX_VALUE;

        Queue<WordWithParent> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new WordWithParent(beginWord, null, 0));
        visited.add(beginWord);

        while(!queue.isEmpty()) {
            WordWithParent wordWithParent = queue.poll();

            if (wordWithParent.distance > shortestDistance)
                break;

            if (wordWithParent.word.equals(endWord)) {
                res.add(getWords(wordWithParent));
                shortestDistance = wordWithParent.distance;
            } else {
                addNeighboursToQueue(queue, wordWithParent, dictionary, visited, endWord);
            }
        }
        return res;
    }

    private List<String> getWords(WordWithParent wordWithParent) {
        WordWithParent temp = wordWithParent;
        List<String> words = new ArrayList<>();
        while(temp != null) {
            words.add(temp.word);
            temp = temp.parent;
        }
        Collections.reverse(words);
        return words;
    }

    private static void addNeighboursToQueue(Queue<WordWithParent> queue, WordWithParent wordWithParent, Set<String> dictionary, Set<String> visited, String endWord) {

        char[] charArr = wordWithParent.word.toCharArray();

        for(int i=0; i<wordWithParent.word.length(); i++) {

            char tmp = charArr[i];
            for(int c=0; c<26; c++) {

                charArr[i] = (char)('a' + c);
                String newWord = new String(charArr);

                if (dictionary.contains(newWord)) {
                    if (!visited.contains(newWord) || newWord.equals(endWord))
                        queue.add(new WordWithParent(newWord, wordWithParent, wordWithParent.distance + 1));
                    visited.add(newWord);
                }

                charArr[i] = tmp;
            }
        }
    }
}



class WordWithParent {
    String word;
    WordWithParent parent;
    int distance;

    WordWithParent(String _word, WordWithParent _parent, int _distance) {
        word = _word;
        distance = _distance;
        parent = _parent;
    }
}