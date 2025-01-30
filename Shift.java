package bhagirath;

public class Shift {
    public static void main(String[] args) {
        int num = 8; 
        
        int lS = num << 2; 
        int rS = num >> 2;
        
        System.out.println("Original Number: " + num);
        System.out.println("Left Shift by 2: " + lS); 
        System.out.println("Right Shift by 2: " + rS);
    }
}
