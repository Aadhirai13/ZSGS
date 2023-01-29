package practiceprogramms;

public class PrimeInFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=2;i<15;i++) {
			if(isPrime(i)) {
				count++;
				System.out.print("\nFibonacci series of " + i + " - ");
				for (int j = 0; j < i; j++)
					System.out.print(findFibonacci(j) + " ");
				if(count == 5)
					break;
			}
		}
	}
	
	public static boolean isPrime(int num) {
		boolean prime = true;
		
		for(int i = 2;i<Math.sqrt(num);i++) {
			if(num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	public static int findFibonacci(int num) {
		if (num <= 1)
            return num;
  
        return findFibonacci(num - 1) + findFibonacci(num - 2);
	}

}
