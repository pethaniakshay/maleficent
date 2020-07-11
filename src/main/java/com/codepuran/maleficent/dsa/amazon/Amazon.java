package com.codepuran.maleficent.dsa.amazon;

import java.util.*;
import java.util.stream.Collectors;

public class Amazon {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        String helpText = "this is far too far too much about, my about about ?  vally far  too. get back about, get back about much me too";
        System.out.println("Result: "+ amazon.wordsToExclude(helpText, new String[]{"too,far"}));
    }

    public String wordsToExclude(String paragraph, String[] banned) {
        String[] eachWord = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s+");
        Map<String,Integer> wordOccurrence = new HashMap<>();
        for(String s : eachWord) {
            wordOccurrence.merge(s, 1, Integer::sum);
        }
        for(String excludedWord : banned) {
            wordOccurrence.remove(excludedWord);
        }
        LinkedHashMap<String,Integer> sortedMaps = wordOccurrence.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));
        List<String> entryList = new ArrayList<>(sortedMaps.keySet());
        if(!entryList.isEmpty()){
            return entryList.get(entryList.size()-1);
        }
        return null;
    }
}
