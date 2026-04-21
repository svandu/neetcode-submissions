class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> anagramMap;

        // Iterate over each string in the array
        for (string s : strs) {
            string sortedStr = s;     // Copy the string
            sort(sortedStr.begin(), sortedStr.end());  // Sort the string
            
            // Use the sorted string as the key to group anagrams
            anagramMap[sortedStr].push_back(s);
        }

        // Collect all groups of anagrams
        vector<vector<string>> result;
        for (auto& entry : anagramMap) {
            result.push_back(entry.second);
        }

        return result;
    }
};
