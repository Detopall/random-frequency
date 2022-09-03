package main;

import java.util.*;

public class RandomFrequencyBuilder {
    public static void main(String[] args) {
        System.out.println("RANDOM FREQUENCY CHECKER (1-10) \n");
        new RandomFrequencyBuilder().run();
    }

    public Map<Integer, Integer> run() {
        List<Integer> randomArrayList = new ArrayList<>();
        Map<Integer, Integer> valueCounter = new HashMap<>();
        Map<Integer,Integer> randomFrequency = new HashMap<>();
        Set<Map.Entry<Integer, Integer>> entrySet = valueCounter.entrySet();

        int max = 10;
        int min = 1;
        for (int i = min; i <= 1000; i++) {
            randomArrayList.add((int) Math.floor(Math.random() * (max - min + 1) + min));
        }

        for(Integer rand: randomArrayList){
            Integer val = valueCounter.get(rand);
            if (val == null){
                valueCounter.put(rand, 1);
            } else {
                val++;
                valueCounter.put(rand, val);
            }
        }

        for (Map.Entry<Integer, Integer> entry: entrySet){
            randomFrequency.put(entry.getKey(), entry.getValue());
        }

        return randomFrequency;

        /* BEAUTIFY THE RESULTS
        for(Map.Entry<Integer,Integer> entry : entrySet) {
            if (entry.getValue() >= 1) {
                System.out.println("value: " + entry.getKey() + " => frequency: " + entry.getValue());
            }
        }
         */

    }

    public String toString(){
        Map<Integer, Integer> result = run();
        String data = "";
        for (Map.Entry<Integer, Integer> entry: result.entrySet()) {
            data += entry.getKey() + ", " + entry.getValue() + "\n";
        }
        return data;
    }
}
