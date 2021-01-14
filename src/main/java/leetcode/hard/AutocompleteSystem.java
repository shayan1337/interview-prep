package leetcode.hard;

import java.util.*;

/**
 * 642. Design Search Autocomplete System (https://leetcode.com/problems/design-search-autocomplete-system/)
 */
public class AutocompleteSystem {

    private Map<String, Integer> frequencyMap;
    private Trie trie;
    private StringBuilder prefix;

    public AutocompleteSystem(String[] sentences, int[] times) {
        frequencyMap = new HashMap<>();
        trie = new Trie();
        prefix = new StringBuilder();

        for(int i = 0; i < sentences.length; i++) {
            trie.insert(sentences[i]);
            frequencyMap.put(sentences[i], times[i]);
        }
    }

    public List<String> input(char c) {

        if (c == '#') {
            String sentence = prefix.toString();
            trie.saveSentence(sentence);
            frequencyMap.put(sentence, frequencyMap.getOrDefault(sentence, 0) + 1);
            prefix.delete(0, prefix.length());
            return new ArrayList<>();
        }

        prefix.append(c);
        List<String> topSentences = trie.prefix(prefix.toString());
        return getTop3(topSentences);
    }

    private List<String> getTop3(List<String> sentences) {
        List<String> list = new ArrayList<>();
        PriorityQueue<String> pq = new PriorityQueue<>( (a, b) -> frequencyMap.get(a) == frequencyMap.get(b)
                ? a.compareTo(b) : frequencyMap.get(b) - frequencyMap.get(a));

        pq.addAll(sentences);

        while(!pq.isEmpty() && list.size() < 3)
            list.add(pq.poll());

        return list;
    }
}

class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        int index = 0;
        while(index < word.length()) {
            char c = word.charAt(index);
            if (!current.children.containsKey(c))
                current.children.put(c, new TrieNode());

            current = current.children.get(c);
            index++;
        }
        current.isEndOfWord = true;
    }

    public List<String> prefix(String prefix) {
        List<String> list = new ArrayList<>();

        TrieNode current = root;
        int index = 0;
        while(index < prefix.length()) {
            if (!current.children.containsKey(prefix.charAt(index)))
                return list;

            current = current.children.get(prefix.charAt(index));
            index++;
        }

        System.out.println(prefix);
        prefix(current, list, new StringBuilder(prefix));

        return list;
    }

    private void prefix(TrieNode current, List<String> list, StringBuilder sentence) {
        if (current.isEndOfWord)
            list.add(sentence.toString());

        List<Character> children = new ArrayList<>(current.children.keySet());

        for(char child : children) {
            sentence.append(child);
            prefix(current.children.get(child), list, sentence);
            sentence.delete(sentence.length()-1, sentence.length());
        }
    }

    public void saveSentence(String sentence) {
        insert(sentence);
    }
}

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;
    int frequency;

    TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
        frequency = 0;
    }
}