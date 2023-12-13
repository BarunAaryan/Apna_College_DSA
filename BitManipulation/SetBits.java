public class SetBits {
    //Count Set Bits in a Number
    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n & 1) !=0){ //Check our LSB
                count++;
            }
            //right shift
            n= n>>1;
        }
         return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
