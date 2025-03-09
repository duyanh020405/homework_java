public class bt1 {
    public static void main(String[] args) {
        int[] test_case1 = {10,20,5,50,30};
        int[] test_case2 = {-1,-3,-2,-5};
        int[] test_case3 = {100};
        int max_testcase = test_case1[0];
        int max_testcase2 =test_case2[0];
        int max_testcase3 =test_case3[0];
        for(int i=1; i < test_case1.length; i++) {
            if(test_case1[i] > max_testcase) {
                max_testcase = test_case1[i];
            }
        }
        System.out.println("Max mảng 1 :" + max_testcase);

        for(int i=1; i < test_case2.length; i++) {
            if(test_case2[i] > max_testcase2) {
                max_testcase2 = test_case2[i];
            }
        }
        System.out.println("Max mảng 2 :" + max_testcase2);

        for(int i=1; i < test_case3.length; i++) {
            if(test_case3[i] > max_testcase3) {
                max_testcase3 = test_case3[i];
            }
        }
        System.out.println("Max mảng 3 :" + max_testcase3);
    }
}
