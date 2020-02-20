package hashTables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class CodeChallengeHashMaps {

    public String firstOccuringString(String input) {
        input = input.toLowerCase();
        String newinput = input.replaceAll(",", "");
        String answer = "";
        System.out.println(newinput);
        HashSet<String> hs = new HashSet<>();
        String[] arr = newinput.split(" ");
        for (String word : arr) {
            if (hs.contains(word)) {
                answer = word;
                return answer;
            } else {
                hs.add(word);
            }
        }
        return answer;
    }

    public ArrayList<ArrayList<String>> leftJoin(Hashtable<String, String> ht1, Hashtable<String, String> ht2) {
        ArrayList<ArrayList<String>> resultArray = new ArrayList<>();
        ht1.forEach((k, v) -> {
            ArrayList<String> tempArray = new ArrayList<>();
            tempArray.add(k);
            tempArray.add(v);
            if(ht2.containsKey(k)){
                tempArray.add(ht2.get(k));
            }else{
                tempArray.add(null);
            }
            resultArray.add(tempArray);

        });

        return resultArray;
    }
}
