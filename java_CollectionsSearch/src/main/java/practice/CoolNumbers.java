package practice;

import java.util.*;

public class CoolNumbers {
    public static List<String> coolNumbers = new ArrayList<>();

    public static List<String> generateCoolNumbers() {
        String letters = "А,В,Е,К,М,Н,О,Р,С,Т,У,Х";
        String [] letter = letters.split(",");
        for (int i = 1; i < 10; i++) {
            for (int reg = 1; reg < 199; reg++) {
                String region = Integer.toString(reg);
                if(reg < 10){
                    region = "0" + region;
                }
                for (String oneLetter: letter) {
                    for (String twoLetter: letter) {
                        for (String treeLetter: letter) {
                            String number = String.format("%s%d%d%d%s%s%s",oneLetter,i,i,i,
                                    twoLetter,treeLetter,region);
                            coolNumbers.add(number);
                        }
                    }
                }
            }
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        if (list.contains(number)){
            return true;
        }
        return false;
    }
    public static boolean binarySearchInList(List<String> sortedList, String number) {
        if (sortedList.contains(number)){
            return true;
        }
        Collections.sort(coolNumbers);
        int index = Collections.binarySearch(coolNumbers,number);
        if(index>=0) {
            return true;
        }
        return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        for (String h:hashSet) {
            if (h.contains(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        for (String t:treeSet){
            if (t.contains(number)){
                return true;
            }
        }
        return false;
    }
}
