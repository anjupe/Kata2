package kata2;

import java.util.*;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Juan", "Mesa", "Juan", "Paco", "Rosa", "Juan"};
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();
        
        for (String key : histogr.keySet()) {
            System.out.println(key + " --> "+ histogr.get(key));
        }  
    }    
}
