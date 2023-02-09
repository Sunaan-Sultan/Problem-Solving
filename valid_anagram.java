class valid_anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

// Explanation
// In this problem, we are given two strings s and t and our task is to check if t is an anagram of s. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// To solve this problem, we can use a frequency array to store how many times each character appears in the strings. We loop through both strings and increment the frequency of the character of string s and decrement the frequency for string t. After we finish looping through both strings, we check if there are any non-zero frequencies, which would mean that the two strings are not anagrams. If all the frequencies are zero, then we know that the two strings are anagrams.