package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 208. Implement Trie (Prefix Tree)
 */
public class Trie {

    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
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

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current = root;
        int index = 0;
        while(index < word.length()) {
            char c = word.charAt(index);
            if (!current.children.containsKey(c))
                return false;
            current = current.children.get(c);
            index++;
        }
        return current.isEndOfWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        int index = 0;
        while(index < prefix.length()) {
            char c = prefix.charAt(index);
            if (!current.children.containsKey(c))
                return false;
            current = current.children.get(c);
            index++;
        }
        return true;
    }
}

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}
