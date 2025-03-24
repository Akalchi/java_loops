package dev.alejandra;

public class MultiplicationTable {
    private final int number;
    
    public MultiplicationTable(int number) {
        this.number = number;
    }
    
    public String[] generateTable() {
        String[] table = new String[10];
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            table[i-1] = number + " x " + i + " = " + result;
        }
        
        return table;
    }
}
