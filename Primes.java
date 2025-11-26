public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primeNumbers = isPrime(n);
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++)
        {
            if (primeNumbers[i])
                {
                    System.out.println(i);
                    count++;
                }  
        }
        System.out.println("There are " + count + " primes between 2 and " + n + " (" +  (int)(((double) count /  n) * 100) + "% are primes)");
    }

    public static boolean[] isPrime(int n) {
        boolean[] primeNumbers = new boolean[n + 1];
        for (int i = 2; i <= n; i++) primeNumbers[i] = true;
        int end = (int) Math.sqrt(n);

        for (int i = 2; i <= end; i++)
        {
            if (primeNumbers[i]) 
            {
                int start = i;
                for (int j = i; j <= n; j += i)
                {
                    if (j != start) primeNumbers[j] = false;
                }
            }
                
        }
        return primeNumbers; 
    }
}