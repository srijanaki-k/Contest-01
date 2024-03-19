import java.util.HashSet;

class Sol {
    int isPossible(String S) {
        HashSet<Character> set = new HashSet<>();
        for (char c : S.toCharArray()) {
            if (!set.add(c)) // If the character already exists, remove it from the set
                set.remove(c);
        }
        return set.size() <= 1 ? 1 : 0; // Return 1 if at most one character has an odd frequency
    }
}
