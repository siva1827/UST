
import java.util.HashMap;
public class Last_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "language";
        char lastRep = Last_Rep(s);

        if (lastRep != 0) {
            System.out.println("Last repeating character: " + lastRep);
        } else {
            System.out.println("No repeating found.");
        }
		        
	}
	static char Last_Rep(String s) {
        HashMap<Character, Integer> charMap=new HashMap<>();
        char lastRepeating = 0;

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(charMap.containsKey(ch)){
                lastRepeating = ch;
            } else {
                charMap.put(ch, 1);
            }
        }

        return lastRepeating;
    }

		    
	}


