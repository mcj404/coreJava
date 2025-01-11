package java8.trickyProblems;

import java.util.*;
import static java.lang.Thread.sleep;

public class IsNullAnObject {
    public static void main(String[] args) {
        IsNullAnObject isNullAnObject = new IsNullAnObject();

        Map<String, String> wordMap = new HashMap<String, String>();

        Set<Map.Entry<String, String>> set = wordMap.entrySet();
        List<Map.Entry<String, String>> listOfSet = new ArrayList<>(set);






        int[] nums = {2,7,11,15};
        int target = 9;

        int[] x = isNullAnObject.twoSum(nums, target);
        System.out.println(x.toString());
    }

    void instanceOf() {
        System.out.println(null instanceof Object);
    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap=new HashMap<>();
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl){return false;}
        for(int i=0;i<sl;i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            smap.put(t.charAt(i),smap.getOrDefault(t.charAt(i),0)-1);
        }
        for(char c:smap.keySet()){
            if(smap.get(c)!=0){return false;}
        }

        return true;
    }

    public boolean isAnagramOnlyAlphabets(String s, String t) {
        int[] alphabets = new int[26];

        for (int i=0; i<s.length(); i++) {
            alphabets[s.charAt(i) - 'a']++;
        }

        for (int i=0; i<t.length(); i++) {
            alphabets[t.charAt(i) - 'a']--;
        }

        for (int i : alphabets) {
            if(i != 0) return false;
        }

        return true;
    }

    public int[] twoSum(int[] nums, int target) {
        if(nums.length >= 2) {
            HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            for (int i=0; i<nums.length; i++) {
                if(!hashMap.isEmpty() && hashMap.containsKey(target - nums[i])) {
                    int[] k = {hashMap.get(target-nums[i]) + 1, i+1};
                    return k;
                }
                hashMap.put(nums[i],i);
            }
        }

        int[] k = {-1, -1};
        return k;
    }


}
