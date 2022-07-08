
public class Cipher {

    public static String ciphering(String normal) {
    char[] array = normal.toCharArray();
        
        for(int i = 0; i < array.length; i++) {
            Character c = array[i];
            if(Character.isLowerCase(c)) {
                array[i] = Character.toUpperCase(c);
            }else if(Character.isUpperCase(c)) {
                array[i] = Character.toLowerCase(c);
            }
        }
        
        String string = String.valueOf(array);
        string.replace(" ",  "*");
         
        StringBuilder sb = new StringBuilder(string);        
        sb.reverse();
        
        System.err.println("sb reversed: " + sb);
        
        string = sb.toString();
        array = string.toCharArray();
        
        String ans = "";
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 1) {
                int myint = (int)array[i];
                ans += String.valueOf(myint);
            }else {
                ans+=array[i];
            }
        }
        
        ans += "3";
        
        return ans;
    }
    
    public static String deciphering(String ciphered) {
        
        
        if(ciphered.endsWith("3")){
            ciphered = ciphered.substring(0,ciphered.length()-1);
        }
        System.err.println(ciphered);
        char[] array = ciphered.toCharArray();
        String num = "";
        int value;
        String returnString = "";
        
        for(int i = 0; i < array.length; i++) {
            char c = array[i];
            
            if(Character.isDigit(c)) {
                num+=c;
              
            }else {
                if(!num.isEmpty()) {
                    try {
                    value = Integer.parseInt(num);
                    returnString+= (char)value;
                    System.err.println("adding: " + (char)value + " to returnString which is now : " + returnString);
                    num = "";
                    }catch(Exception e) {}
                   
                }                
                    returnString+=c;
                
            }
        }
        if(!num.isEmpty()) {
            value = Integer.parseInt(num);
            returnString+= (char)value;
        }
        
        returnString = returnString.replace("*",  " ");
        StringBuilder builder = new StringBuilder(returnString);
        builder.reverse();
        returnString = builder.toString();
        array = returnString.toCharArray();
        
        for(int i = 0; i < array.length; i++) {
            char opp = array[i];
            if(Character.isUpperCase(opp)) {
                array[i] = Character.toLowerCase(opp);
            }else if(Character.isLowerCase(opp)) {
                array[i] = Character.toUpperCase(opp);
            }
        }
        returnString = String.valueOf(array);
        return returnString;
        
    }
    public static void main(String[] args) {
        
        String n = "Welcome to hackerrank";
        System.out.println(ciphering(n));
        String out = ciphering(n);
        System.out.println(deciphering(out));
    
    }
}


