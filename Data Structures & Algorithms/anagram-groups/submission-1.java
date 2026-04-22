class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Step 1: Create HashMap
        HashMap<String, List<String>> map = new HashMap<>();

        // Step 2: Traverse each string
        for (String str : strs) {

            // Step 3: Sort the string to create key
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // Step 4: Insert into map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        // Step 5: Return result
        return new ArrayList<>(map.values());
    }
}
