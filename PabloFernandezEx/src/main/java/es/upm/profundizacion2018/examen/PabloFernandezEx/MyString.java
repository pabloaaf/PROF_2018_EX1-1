package es.upm.profundizacion2018.examen.PabloFernandezEx;

public class MyString{

	public String str;	
	
	/*public int compareTo (String s1) {	
		if(str.equals(s1)){
			return str - s1;
		}
        return str.compareTo(s1);
		
	}
}*/

public int compareTo (String s1) {	    
    
	for(int i=0; i<str.length() && i<s1.length(); i++) {
        if(str.charAt(i) != s1.charAt(i))
            return str.charAt(i) < s1.charAt(i) ? -1 : 1;
    }
    return str.length() < s1.length() ? -1 : str.length() == s1.length() ? 0 : 1;

	}
}