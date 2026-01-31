package ai.maum.m2u.cdk.grpclib.constants;

/* loaded from: classes.dex */
public class Const {
    public static String EMPTY_STRING = "";
    public static boolean EXPECT_MDOE = true;
    public static boolean HAS_NOT_REASON = false;
    public static boolean HAS_REASON = true;
    public static int MULTIMEDIA_TIMEOUT = 10000;
    public static boolean mIsSaveAudioRecord = false;

    public static boolean isEmpty(String str) {
        return str == null || str.equals(EMPTY_STRING);
    }
}
