

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0;i < 10; i++) {
            map.put("LastName"+i, "FirstName"+i*2);
        }
    return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
    HashMap <String,String> copy = new HashMap<>();
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            removeItemFromMapByValue(map, pair.getValue());
        }
}

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String,String> copy = new HashMap<>();
        int count = 0;
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if ((pair.getValue().equals(value))&& count == 0) {
                count++;
            }
            else if ((pair.getValue().equals(value))&& count > 0){
                map.remove(pair.getValue());
            }
        }
    }

    public static void main(String[] args) {

    }
}
