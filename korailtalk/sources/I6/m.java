package I6;

/* loaded from: classes.dex */
abstract class m {
    public static final int ENABLE_PUSH = 2;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_HEADER_LIST_SIZE = 6;

    public static int get(K6.i iVar, int i8) {
        return iVar.get(i8);
    }

    public static boolean isSet(K6.i iVar, int i8) {
        return iVar.isSet(i8);
    }

    public static void set(K6.i iVar, int i8, int i9) {
        iVar.set(i8, 0, i9);
    }
}
