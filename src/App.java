public class App {
    public static void main(String[] args) throws Exception {
        
        for(int num=1;num<101;num++)
        {
            if(num%3==0)
            {
                if (num%5==0) {
                    System.out.println("Fizz Buzz");
                    
                }
                else{
                    System.out.println("Fizz");
                }
                
            }
            else if(num%5==0)
            {
                System.out.println("Buzz");
            }
           
            else{
                System.out.println(num);
            }
            System.out.println();

            

        }
    }
}
