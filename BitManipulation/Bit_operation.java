public class Bit_operation {
public static int getIthBit(int n, int i){
    int bitMask= 1<<i;
    if((n & bitMask)==0){
        return 0;

    }else {
        return 1;
    }
}
public static int setIthBit(int n , int i){
    int bitMask=1<<i;
    return n | bitMask;
}
public static int clearIthBit(int n , int i){
    int bitMask= ~(1<<i);
    return n & bitMask;
}
public static int updateIthBit(int n, int i, int newBit){
    // if(newBit==0){
    //     return clearIthBit(n,i);
    // }else{
    //     return setIthBit(n, i);
    // }
    n= clearIthBit(n, i);
    int BitMask= newBit<<i;
    return n | BitMask;
}


    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
