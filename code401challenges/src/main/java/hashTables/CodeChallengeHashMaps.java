package hashTables;

import java.util.HashSet;

public class CodeChallengeHashMaps {

    public String firstOccuringString(String input) {
        input = input.toLowerCase();
        String newinput = input.replaceAll(",","");
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
}
