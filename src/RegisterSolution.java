import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Register {
    
    private static Register register = null;
    
    private static HashMap<String, Double> registerMap = new HashMap<>();
    private double total = 0;
    
    protected static Register getInstance() {
        if(register == null) {
            register = new Register();
            registerMap.put("apple", 2.0);
            registerMap.put("mango", 1.2);
            registerMap.put("grape", 1.0);
            registerMap.put("orange", 1.5);
        }
        return register;
    }

    public double getTotalBill(Map<String,Integer> itemDetails) {

        for(Map.Entry<String,Integer> entry: itemDetails.entrySet()) {
            total += registerMap.get(entry.getKey()) * entry.getValue();
        }
        return total;

    }

}

public class RegisterSolution {
    public static void main(String[] args) throws IOException {
        
        Scanner readInput = new Scanner(System.in);        
        String[] input=readInput.nextLine().split(" ");                
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
          myItems.put(input[i],Integer.parseInt(input[i+1]));   
        }
        Register regObj = Register.getInstance();        
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();
        
    }
}