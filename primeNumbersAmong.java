public class primeNumbersAmong {

    public static void main(String[] args) {
        System.out.println("from 1 to 100 prime numbers:");
        for(int i=2;i<=100;i++){
            boolean prime=true;
            for (int j=2; j<i;j++){
                if (i % j == 0){
                    prime=false;
                break;
            }
            }if(prime){
                System.out.print(i+ " - ");
            }
        }
    }
}
