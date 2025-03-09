public class bt7 {
    public static void main(String[] args) {
        int[] TC1 = {2,3,4,1,6};
        int[] test = new int[TC1.length];
        int count = 0;
        for (int i = 0 ; i < TC1.length; i++) {
            if(TC1[i] %2 == 0){
                test[count]=TC1[i];
                count++;
            }
        }
        for (int i = 0 ; i < TC1.length; i++) {
            if(TC1[i] %2 != 0){
                test[count]=TC1[i];
                count++;
            }
        }
        for (int i = 0 ; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }
}
