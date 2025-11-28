import java.util.Scanner; 

class Apple{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number");
         int num=sc.nextInt();
        if (num <= 1) {
            !flag = false;  
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    
                    break;
                }
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}


