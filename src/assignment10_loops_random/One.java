package assignment10_loops_random;

public class One {
    public static void main(String[] args) {
//1. Given an int array [56,12,43,98,10,5,51,99,29,4,33,98,56,65,346,23], iterate this array using any loop and while iterating
//       print the even numbers for example like this <even>56<even/> and odd numbers like this <odd>43<odd/>
        int [] nums = {56,12,43,98,10,5,51,99,29,4,33,98,56,65,346,23};

        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                System.out.println("<even>" + nums[i] + "<even/>");
            }else{
                System.out.println("<odd>" + nums[i] + "<odd/>");
            }
        }






    }
}
