package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 211. Design Add and Search Words Data Structure (https://leetcode.com/problems/design-add-and-search-words-data-structure/)
 */
public class WordDictionary {

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;
        int index = 0;
        while (index < word.length()) {
            char c = word.charAt(index);
            if (!current.children.containsKey(c))
                current.children.put(c, new TrieNode());

            current = current.children.get(c);
            index++;
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        return search(root, word, 0);
    }

    private boolean search(TrieNode current, String word, int index) {
        if (index == word.length())
            return current.isEndOfWord;

        char c = word.charAt(index);

        // if current character is present in map
        if (current.children.containsKey(c))
            return search(current.children.get(c), word, index + 1);

        // if current character is '.'
        if (c == '.') {
            List<TrieNode> children = new ArrayList<>(current.children.values());
            for (TrieNode child : children) {
                if (search(child, word, index + 1))
                    return true;
            }
        }

        return false;
    }
}
