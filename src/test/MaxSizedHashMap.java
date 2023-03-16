package test;

public class MaxSizedHashMap {
    public static void main(String[] args) {
        tools.MaxSizedHashMap<String, String> TestHM = new tools.MaxSizedHashMap<>(3);
        
        // Insert 3 elements
        for(int i = 0;i < 3;i++) {
            TestHM.put(String.valueOf(i), String.valueOf(i));
        }
        System.out.println("Full HashMap -> "+TestHM);

        // Insert the fourth element, removing the oldest one
        TestHM.put("Abdelfattah Alsisi", "2013");
        System.out.println("Removed the oldest element, and we inserted a new element -> "+TestHM);
    }
}
