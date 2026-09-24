class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String c = strs[i];

            int[] arr = new int[26];

            for (int j = 0; j < c.length(); j++) {
                arr[c.charAt(j) - 'a']++;
            }

            String key = Arrays.toString(arr);

            if (!map.containsKey(key)) {

                List<String> list = new ArrayList<>();
                list.add(c);
                map.put(key, list);

            } else {

                List<String> list1 = map.get(key);
                list1.add(c);
            }
        }

        return new ArrayList<>(map.values());
    }
}