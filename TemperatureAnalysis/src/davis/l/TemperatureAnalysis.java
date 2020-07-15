package davis.l;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;


public class TemperatureAnalysis {
	 
 
private static double calculateAverage(List <Integer> list) {
		    double sum = 0;
		    double average = 0;
	  if(!list.isEmpty()) {
		    for (Integer temp : list) {
		        sum += temp;
		    }
		    average = sum / list.size();
		    }
	        return average;
		    }
	 
	
public static void frequency(HashMap<Integer, Integer>tempMap)throws IOException {
           System.out.println("Temperature\tFrequency");
           System.out.println("***********\t*********");
    
           Scanner sc = new Scanner (Paths.get("C:\\Users\\L38sm\\Desktop\\temp.txt"));
           tempMap = new HashMap<>();
    
    
     while(sc.hasNextInt()){
           int temp = sc.nextInt();
    
	 if(tempMap.containsKey(temp)){
		   int count = tempMap.get(temp);
	       tempMap.put(temp, count + 1);
	       }else{
	       tempMap.put(temp, 1); }
          
           }
           Set<Integer> keys = tempMap.keySet();
          
           TreeSet<Integer> sortedKeys = new TreeSet<>(keys);
           for(Integer key : sortedKeys) {
           System.out.printf("%7s%14s%n" , key, tempMap.get(key));
           sc.close(); 
	       }     
           }		


public static int highestFrequency(HashMap<Integer, Integer> tempMap)throws IOException {
	      Scanner sc = new Scanner (Paths.get("C:\\Users\\L38sm\\Desktop\\temp.txt"));
          tempMap = new HashMap<>();
      while(sc.hasNextInt()){
          int temp = sc.nextInt();
      if(tempMap.containsKey(temp)){
	      int count = tempMap.get(temp);
	      tempMap.put(temp, count + 1);
	      }else{
	      tempMap.put(temp, 1); }
          }      
	      
	      int maxTemp = 0;
          int maxCount = 0;
          boolean isFirst = true;
    
      for(Map.Entry<Integer, Integer> entry : tempMap.entrySet()){
          if(isFirst){ 
    
           maxTemp = entry.getKey();
           maxCount = entry.getValue();
           isFirst = false;
           }
           else{
      if(maxCount < entry.getValue()){
           maxTemp = entry.getKey();
           maxCount = entry.getValue();
           }
           }
           }
      sc.close();
      return maxTemp;
           }
public static int leastFrequent(HashMap<Integer, Integer> tempMap)throws IOException {{
	       Scanner sc = new Scanner (Paths.get("C:\\Users\\L38sm\\Desktop\\temp.txt"));
           tempMap = new HashMap<>();
     while(sc.hasNextInt()){
           int temp = sc.nextInt();
	          
	 if(tempMap.containsKey(temp)){
	       int count = tempMap.get(temp);
	       tempMap.put(temp, count + 1);
	       }else{
	       tempMap.put(temp, 1); }// add new integer with a count of 1}
           }
	
	       int minTemp = 0;
           int minCount = 0;
           boolean isFirst = true;
           for(Map.Entry<Integer, Integer> entry : tempMap.entrySet()){
           if(isFirst){ // if this is the first temperature point then initialize min value
           minTemp = entry.getKey();
           minCount = entry.getValue();
           isFirst = false;
           }
           else{
    if(minCount > entry.getValue()){
           minTemp = entry.getKey();
           minCount = entry.getValue();
           }
           }
           }
           sc.close();
           return minTemp;
           }
           }	  
   

public static void main(String[] args) throws Exception {
         System.out.printf("Welcome to Temperature Analysis!%n%n");

         List<Integer> list = new LinkedList<Integer>();
    
         try (
        
         Scanner scanner = new Scanner(Paths.get("C:\\Users\\L38sm\\Desktop\\temp.txt"))) {
        
         while (scanner.hasNext()) {
         Integer ints = scanner.nextInt();
         list.add(ints);
         Collections.sort(list);
         }
         } 
         
         HashMap<Integer, Integer> tempMap= new HashMap<>();
  	    
         System.out.printf("The total data points are %s.%n", +list.size());
         System.out.printf("The warmest temperature is %s degrees.%n", +Collections.max(list));  
         System.out.printf("The coldest temperature is %s degrees.%n", +Collections.min(list));  
         System.out.printf("The average temperature is %.2f degrees.%n%n%n", +calculateAverage(list));
         System.out.println("Frequency of each temperature"); frequency
         ( tempMap);
         System.out.printf("The largest most frequent temperature is %d dgrees.%n", +highestFrequency(tempMap));
         System.out.printf("The smallest least frequent temperature is %d dgrees.%n%n", +leastFrequent(tempMap));
         System.out.println("Good bye!");
          
         }   
     
}    
         

 
 
 
         
