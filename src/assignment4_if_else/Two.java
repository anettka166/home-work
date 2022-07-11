package assignment4_if_else;

public class Two {
    public static void main(String[] args) {

        if (true){
            System.out.println("1st if block");
            if (false){
                System.out.println("2nd if block");
            }else{
                System.out.println("2nd else block");
                if (false){
                    System.out.println("3rd if block");
                }else{
                    System.out.println("3rd else block");
                    if (true){
                        System.out.println("4th if block");
                    }
                    if (true){
                        System.out.println("4th if block");
                        if (false){
                            System.out.println("5th if block");
                        }else{
                            System.out.println("5th else block");
                        }
                    }
                }
            }
        }else {
            System.out.println("1st else block");
        }
    }
}
