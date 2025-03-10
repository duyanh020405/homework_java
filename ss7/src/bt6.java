public class bt6 {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String textToAppend = " World";

        long startTime1 = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str = str + textToAppend;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(" String: " + (endTime1 - startTime1) + "ms");

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(textToAppend);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(" StringBuilder: " + (endTime2 - startTime2) + "ms");

        long startTime3 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < iterations; i++) {
            sbf.append(textToAppend);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime3 - startTime3) + "ms");
    }
}
