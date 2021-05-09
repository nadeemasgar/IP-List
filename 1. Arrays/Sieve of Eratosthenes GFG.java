// https://www.geeksforgeeks.org/sieve-of-eratosthenes/  --> O(n * loglog n)

class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        
        boolean[] isPrime = new boolean[N+1];
        
        for(int i = 2; i <= Math.sqrt(N); i++) {
            
            if(isPrime[i] == false) {
                
                for(int j = i+i; j <= N; j+=i) {
                    isPrime[j] = true;
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 2; i <= N; i++) {
            if(isPrime[i] == false) {
                list.add(i);
            }
        }
        
        return list;
     }
}