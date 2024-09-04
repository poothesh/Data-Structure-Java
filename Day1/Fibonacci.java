package Day1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series till " + n + " terms:");
        
        int i = 1;
        while (i <= n) {
            System.out.print(firstTerm + ", ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            
            i++;
        }
    }
}

