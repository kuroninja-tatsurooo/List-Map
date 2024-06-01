package igawa.com;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    List<String> sportsNameList = List.of("soccer", "basketball", "volleyball", "tennis",
        "table tennis", "running", "snowboard", "swimming", "vase ball", "rugby", "skiing");
    for (String name : sportsNameList) {
      if (name.length() >= 8) {
        System.out.println(name);
      }
    }

    Map<Integer, String> numberListMap = Map.of(1, "one", 2, "two", 3, "three", 4, "four", 5,
        "five",
        6, "six", 7, "seven", 8, "eight", 9, "nine", 10, "ten");
    for (int key:numberListMap.keySet()) {
      if (key % 2 != 0) {
        System.out.println(numberListMap.get(key));
      }
    }
  }
}