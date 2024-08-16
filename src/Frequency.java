import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		int arr[]= {3, 4, 5, 2, 3, 4, 6, 7, 8, 5, 3, 6, 7, 8, 3};
		HashMap<Integer,Integer> hsh=new HashMap<>();
		
		for(int num:arr) {
			hsh.put(num, hsh.getOrDefault(num, 0)+1);
		}
		int maxfreq=0;
		int freqvalue=-1;
		
		for(Map.Entry<Integer,Integer> entry:hsh.entrySet()) {
			if(entry.getValue()>maxfreq) {
				maxfreq=entry.getValue();
				freqvalue=entry.getKey();
			}
			
		}
		System.out.println(freqvalue);
		

	}

}
