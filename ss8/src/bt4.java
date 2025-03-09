public class bt4 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000);
        long startTime, endTime;

        StringBuilder sb = new StringBuilder(initialString);
        startTime = System.nanoTime();
        sb.reverse();
        endTime = System.nanoTime();
        System.out.println("StringBuilder đảo ngược: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("StringBuilder chèn: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("StringBuilder xóa: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sb.replace(300000, 300010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("StringBuilder thay thế: " + (endTime - startTime) + " ns");

        StringBuffer sf = new StringBuffer(initialString);
        startTime = System.nanoTime();
        sf.reverse();
        endTime = System.nanoTime();
        System.out.println("StringBuffer đảo ngược: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sf.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("StringBuffer chèn: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sf.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("StringBuffer xóa: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sf.replace(300000, 300010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("StringBuffer thay thế: " + (endTime - startTime) + " ns");
    }
}