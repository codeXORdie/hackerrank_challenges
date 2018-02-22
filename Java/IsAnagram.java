// solution to the challenge 
// @code_xor_die
// https://www.hackerrank.com/challenges/java-anagrams/problem

static boolean isAnagram(String a, String b) {
        boolean isAnagram = true;
        //if length of the strings are not equal, they can't be anagrams
        if(a.length() != b.length()) {
            return false;
        }
        
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        //initialize map to hold chars and their frequencies
        Map<Character, Integer> map = new HashMap<>();
        //populate the map
        for(int x=0; x<A.length(); x++) {
            char ch = A.charAt(x);
            if(!map.containsKey(ch)) map.put(ch, 1);
            else  map.put(ch, map.get(ch) + 1);
        }
        //go through the String B and decrease the frequency of matching char
        for(int x=0; x<B.length(); x++) {
            char ch = B.charAt(x);
            if(map.containsKey(ch)) map.put(ch, map.get(ch)-1);
            //if map of String A doesn't contain a char from String B, they are not anagrams
            else return false;
        }
        //check if any spare letter left after going through the String B
        for(int x : map.values()) {
            if(x != 0) return false;
        }
        return isAnagram;
    }
