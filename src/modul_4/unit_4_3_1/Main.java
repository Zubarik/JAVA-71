package modul_4.unit_4_3_1;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABC");
        int cikl = 50000;

        ciklAppend(sb,cikl);
        ciklDelete(sb,cikl);
        ciklInsert(sb,cikl);
        ciklInsertHalf(sb,cikl);
        ciklSetCharAt(sb,cikl);
        ciklRevers(sb,cikl);
    }

    private static void ciklRevers(StringBuilder sb, int cicl) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cicl; i++) {
            sb.reverse();
        }
        System.out.println("revers() "+(System.currentTimeMillis() - startTime));
    }

    private static void ciklSetCharAt(StringBuilder sb, int cicl) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cicl; i++) {
            sb.setCharAt(2,'d');
        }
        System.out.println("setCharAt(int index,char c) "+(System.currentTimeMillis() - startTime));
    }

    private static void ciklInsertHalf(StringBuilder sb, int cicl) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cicl; i++) {
            sb.insert(sb.length()/2, "ABC");
        }
        System.out.println("insert(length()/2, аргумент) "+(System.currentTimeMillis() - startTime));
    }

    private static void ciklInsert(StringBuilder sb, int cicl) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cicl; i++) {
            sb.insert(0, "ABC");
        }
        System.out.println("insert(0, аргумент) "+(System.currentTimeMillis() - startTime));
    }

    private static void ciklDelete(StringBuilder sb, int cicl) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cicl; i++) {
            sb.delete(1,6);
        }
        System.out.println("delete(1,2) "+(System.currentTimeMillis() - startTime));
    }

    public static void ciklAppend(StringBuilder sb,int cikl){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cikl; i++) {
            sb.append("ABC");
        }
        System.out.println("append( аргумент) "+(System.currentTimeMillis() - startTime));
    }
}
