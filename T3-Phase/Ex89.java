
/*
 * Aim :- Create Hashmap that stores candidate and no. of votes..
 * ------>Apply all possible methods of Hashmap.
 */
import java.util.HashMap;
import java.util.Map;

class Ex89 {
    public static void main(String[] args) {

        // Create 1st Hashmap for NDA...
        HashMap<String, Integer> nda = new HashMap<>();
        nda.put("modi", 150);
        nda.put("amit", 100);
        nda.put("yogi", 200);
        System.out.println("NDA = " + nda);

        // Create 2nd Hashmap for INDIA...
        HashMap<String, Integer> india = new HashMap<>();
        india.put("rahul", 120);
        india.put("sonia", 130);
        india.put("kj", 200);
        System.out.println("INDIA = " + india);

        // Create 3rd Hashmap for ELECTION...
        HashMap<String, Integer> election = new HashMap<>();
        election.putAll(nda);
        election.putAll(india);
        System.out.println("ELECTION = " + election);

        // 1st. method put(key, value) or putIfAbsent(key, value) it returns previous
        // value associated key...
        System.out.println(election.put("naidu", 300));
        System.out.println("ELECTION = " + election);
        System.out.println(election.put("rahul", 10));
        System.out.println("ELECTION = " + election);
        System.out.println(election.putIfAbsent("modi", 200));
        System.out.println("ELECTION = " + election);

        // 2nd. method remove(key) or remove(key, value) it remove key and value...
        System.out.println(election.remove("kj"));
        System.out.println("ELECTION = " + election);
        System.out.println(election.remove("sonia", 130));
        System.out.println("ELECTION = " + election);
        System.out.println(election.remove("modi", 10));
        System.out.println("ELECTION = " + election);

        /*
         * 3rd. method get(key)--> It returns the value to which the specified key is
         * ---- mapped.
         * 4th. method containsKey(key)--> It returns true if this map contains a
         * ---- mapping
         * 5th. method containsValue(value)--> It returns true if this map maps one or
         * ---- more keys to the specified value
         */
        System.out.println("Value Of Amit = " + election.get("amit"));
        System.out.println(election.containsKey("modi"));
        System.out.println(election.containsKey("nitish"));
        System.out.println(election.containsValue(100));
        System.out.println(election.containsValue(500));

        /*
         * Other Methods like :-
         * 1. entrySet()
         * 2. keySet()
         * 3. values()
         */
        System.out.println("-----Print Using Entery Set-----");
        for (Map.Entry m : election.entrySet()) {
            System.out.print("Key = " + m.getKey() + " --> ");
            System.out.println("Value = " + m.getValue());
        }
        System.out.println("-----Print Only Candidate Set-----");
        for (String s : election.keySet()) {
            System.out.println(s);
        }
        System.out.println("-----Print Only Values-----");
        for (Integer i : election.values()) {
            System.out.println(i);
        }
    }
}
