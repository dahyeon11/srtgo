package com.google.android.gms.internal.ads;

import Q7.C0709m;
import ai.maum.m2u.cdk.utils.G711;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.kakao.sdk.user.Constants;
import e3.AbstractC5358c;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import maum.m2u.map.Map;

/* renamed from: com.google.android.gms.internal.ads.am0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2281am0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f18024a;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f18025b;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f18026c;

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f18027d;

    /* renamed from: e, reason: collision with root package name */
    private static HashMap f18028e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f18029f;

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f18030g;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f18031h;

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f18032i;

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f18033j;
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;

    static {
        int i8 = Build.VERSION.SDK_INT;
        zza = i8;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i8;
        zzf = new byte[0];
        f18024a = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f18025b = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f18026c = Pattern.compile("%([A-Fa-f0-9]{2})");
        f18027d = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f18029f = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", Constants.ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f18030g = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f18031h = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f18032i = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f18033j = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, Map.MapException.CALLED_INTERFACE_FIELD_NUMBER, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, G711.BIAS, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    private static int a(int i8, int i9) {
        return (char) (f18032i[i8 ^ (i9 >> 12)] ^ ((char) (i9 << 4)));
    }

    private static long b(long j8, long j9, long j10, RoundingMode roundingMode) {
        long jZzc = AbstractC4678vm0.zzc(j8, j9);
        if (jZzc != Long.MAX_VALUE && jZzc != Long.MIN_VALUE) {
            return AbstractC4678vm0.zza(jZzc, j10, roundingMode);
        }
        long jZzb = AbstractC4678vm0.zzb(Math.abs(j9), Math.abs(j10));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZza = AbstractC4678vm0.zza(j9, jZzb, roundingMode2);
        long jZza2 = AbstractC4678vm0.zza(j10, jZzb, roundingMode2);
        long jZzb2 = AbstractC4678vm0.zzb(Math.abs(j8), Math.abs(jZza2));
        long jZza3 = AbstractC4678vm0.zza(j8, jZzb2, roundingMode2);
        long jZza4 = AbstractC4678vm0.zza(jZza2, jZzb2, roundingMode2);
        long jZzc2 = AbstractC4678vm0.zzc(jZza3, jZza);
        if (jZzc2 != Long.MAX_VALUE && jZzc2 != Long.MIN_VALUE) {
            return AbstractC4678vm0.zza(jZzc2, jZza4, roundingMode);
        }
        double d9 = jZza3 * (jZza / jZza4);
        if (d9 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d9 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return AbstractC4109qm0.zza(d9, roundingMode);
    }

    private static String c(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e8) {
            AbstractC2834fc0.zzd("Util", "Failed to read system property ".concat(str), e8);
            return null;
        }
    }

    private static HashMap d() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f18029f.length;
        HashMap map = new HashMap(length + 88);
        int i8 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f18029f;
            int length3 = strArr.length;
            if (i8 >= 88) {
                return map;
            }
            map.put(strArr[i8], strArr[i8 + 1]);
            i8 += 2;
        }
    }

    public static String zzA(byte[] bArr) {
        return new String(bArr, AbstractC3647mj0.zzc);
    }

    public static String zzB(byte[] bArr, int i8, int i9) {
        return new String(bArr, i8, i9, AbstractC3647mj0.zzc);
    }

    public static String zzC(int i8) {
        switch (i8) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return com.kakao.sdk.link.Constants.VALIDATION_DEFAULT;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzD(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = AbstractC2963gj0.zza(str);
        int i8 = 0;
        String str2 = strZza.split(g5.e.STATE_NAME_NONE, 2)[0];
        if (f18028e == null) {
            f18028e = d();
        }
        String str3 = (String) f18028e.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if (!C0709m.NO.equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strZza;
        }
        while (true) {
            String[] strArr = f18030g;
            int length = strArr.length;
            if (i8 >= 18) {
                return strZza;
            }
            if (strZza.startsWith(strArr[i8])) {
                return String.valueOf(strArr[i8 + 1]).concat(String.valueOf(strZza.substring(strArr[i8].length())));
            }
            i8 += 2;
        }
    }

    public static ExecutorService zzE(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zl0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static void zzF(long[] jArr, long j8, long j9) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i8 = 0;
        if (j9 >= 1000000 && j9 % 1000000 == 0) {
            long jZza = AbstractC4678vm0.zza(j9, 1000000L, RoundingMode.UNNECESSARY);
            while (i8 < jArr.length) {
                jArr[i8] = AbstractC4678vm0.zza(jArr[i8], jZza, roundingMode);
                i8++;
            }
            return;
        }
        if (j9 < 1000000 && 1000000 % j9 == 0) {
            long jZza2 = AbstractC4678vm0.zza(1000000L, j9, RoundingMode.UNNECESSARY);
            while (i8 < jArr.length) {
                jArr[i8] = AbstractC4678vm0.zzc(jArr[i8], jZza2);
                i8++;
            }
            return;
        }
        for (int i9 = 0; i9 < jArr.length; i9++) {
            long j10 = jArr[i9];
            if (j10 != 0) {
                if (j9 >= j10 && j9 % j10 == 0) {
                    jArr[i9] = AbstractC4678vm0.zza(1000000L, AbstractC4678vm0.zza(j9, j10, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j9 >= j10 || j10 % j9 != 0) {
                    jArr[i9] = b(j10, 1000000L, j9, roundingMode);
                } else {
                    jArr[i9] = AbstractC4678vm0.zzc(1000000L, AbstractC4678vm0.zza(j10, j9, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static boolean zzG(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean zzH(SparseArray sparseArray, int i8) {
        return sparseArray.indexOfKey(i8) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4.zzJ(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzI(com.google.android.gms.internal.ads.C4099qh0 r3, com.google.android.gms.internal.ads.C4099qh0 r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zzb()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.zzc()
            int r2 = r3.zzb()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzb()
            int r0 = r0 + r0
            r4.zzE(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzM()
            int r2 = r3.zzd()
            int r3 = r3.zzb()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzM()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r4.zzc()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L4c
            r4.zzJ(r3)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            r1 = 1
            goto L6c
        L4a:
            r3 = move-exception
            goto L68
        L4c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L6c
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L59
            goto L6c
        L59:
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L31
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.zzE(r0)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            goto L31
        L68:
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2281am0.zzI(com.google.android.gms.internal.ads.qh0, com.google.android.gms.internal.ads.qh0, java.util.zip.Inflater):boolean");
    }

    public static boolean zzJ(Context context) {
        return zza >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean zzK(int i8) {
        return i8 == 3 || i8 == 2 || i8 == 268435456 || i8 == 21 || i8 == 1342177280 || i8 == 22 || i8 == 1610612736 || i8 == 4;
    }

    public static boolean zzL(Context context) {
        int i8 = zza;
        if (i8 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i8 != 30) {
            return false;
        }
        String str = zzd;
        return AbstractC2963gj0.zzc(str, "moto g(20)") || AbstractC2963gj0.zzc(str, "rmx3231");
    }

    public static boolean zzM(int i8) {
        return i8 == 10 || i8 == 13;
    }

    public static boolean zzN(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzO(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Object[] zzP(Object[] objArr, int i8) {
        F10.zzd(i8 <= objArr.length);
        return Arrays.copyOf(objArr, i8);
    }

    public static int zza(long[] jArr, long j8, boolean z8, boolean z9) {
        int i8;
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i8 = iBinarySearch + 1;
            if (i8 >= jArr.length || jArr[i8] != j8) {
                break;
            }
            iBinarySearch = i8;
        }
        return !z8 ? i8 : iBinarySearch;
    }

    public static int zzb(int[] iArr, int i8, boolean z8, boolean z9) {
        int i9;
        int i10;
        int iBinarySearch = Arrays.binarySearch(iArr, i8);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i9 = iBinarySearch - 1;
                if (i9 < 0 || iArr[i9] != i8) {
                    break;
                }
                iBinarySearch = i9;
            }
            i10 = z8 ? iBinarySearch : i9;
        }
        return z9 ? Math.max(0, i10) : i10;
    }

    public static int zzc(long[] jArr, long j8, boolean z8, boolean z9) {
        int i8;
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            i8 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i9 = iBinarySearch - 1;
                if (i9 < 0 || jArr[i9] != j8) {
                    break;
                }
                iBinarySearch = i9;
            }
            i8 = iBinarySearch;
        }
        return z9 ? Math.max(0, i8) : i8;
    }

    public static int zzd(byte[] bArr, int i8, int i9, int i10) {
        int iA = 65535;
        for (int i11 = 0; i11 < i9; i11++) {
            byte b9 = bArr[i11];
            iA = a(b9 & AbstractC5358c.SI, a((b9 & 255) >> 4, iA));
        }
        return iA;
    }

    public static int zze(byte[] bArr, int i8, int i9, int i10) {
        while (i8 < i9) {
            i10 = f18031h[(i10 >>> 24) ^ (bArr[i8] & 255)] ^ (i10 << 8);
            i8++;
        }
        return i10;
    }

    public static int zzf(byte[] bArr, int i8, int i9, int i10) {
        int i11 = 0;
        while (i8 < i9) {
            i11 = f18033j[i11 ^ (bArr[i8] & 255)];
            i8++;
        }
        return i11;
    }

    public static int zzg(int i8) {
        if (i8 == 20) {
            return 30;
        }
        if (i8 == 22) {
            return 31;
        }
        if (i8 == 30) {
            return 34;
        }
        switch (i8) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i8) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzh(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2281am0.zzh(int):int");
    }

    public static int zzi(ByteBuffer byteBuffer, int i8) {
        int i9 = byteBuffer.getInt(i8);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i9 : Integer.reverseBytes(i9);
    }

    public static int zzj(int i8) {
        if (i8 == 2 || i8 == 4) {
            return 6005;
        }
        if (i8 == 10) {
            return 6004;
        }
        if (i8 == 7) {
            return 6005;
        }
        if (i8 == 8) {
            return 6003;
        }
        switch (i8) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i8) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int zzk(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z8 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i8 = Integer.parseInt(str2);
            return z8 ? -i8 : i8;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int zzl(int i8) {
        if (i8 == 8) {
            return 3;
        }
        if (i8 == 16) {
            return 2;
        }
        if (i8 != 24) {
            return i8 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int zzm(int i8, int i9) {
        if (i8 != 2) {
            if (i8 == 3) {
                return i9;
            }
            if (i8 != 4) {
                if (i8 != 21) {
                    if (i8 != 22) {
                        if (i8 != 268435456) {
                            if (i8 != 1342177280) {
                                if (i8 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i9 * 3;
            }
            return i9 * 4;
        }
        return i9 + i9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzn(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L11
            java.lang.String r2 = "rtsp"
            boolean r0 = com.google.android.gms.internal.ads.AbstractC2963gj0.zzc(r2, r0)
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r1
        L11:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L19
            return r2
        L19:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L71
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.AbstractC2963gj0.zza(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L53;
                case 108321: goto L49;
                case 3242057: goto L3f;
                case 3299913: goto L35;
                default: goto L34;
            }
        L34:
            goto L5d
        L35:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r6
            goto L5e
        L3f:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r1
            goto L5e
        L49:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r4
            goto L5e
        L53:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r5
            goto L5e
        L5d:
            r0 = -1
        L5e:
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L6a
            if (r0 == r5) goto L68
            if (r0 == r1) goto L68
            r0 = r2
            goto L6d
        L68:
            r0 = r6
            goto L6d
        L6a:
            r0 = r5
            goto L6d
        L6c:
            r0 = r4
        L6d:
            if (r0 != r2) goto L70
            goto L71
        L70:
            return r0
        L71:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.AbstractC2281am0.f18027d
            java.lang.String r7 = r7.getPath()
            r7.getClass()
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L9d
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto L9c
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L93
            return r4
        L93:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L9c
            return r5
        L9c:
            return r6
        L9d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2281am0.zzn(android.net.Uri):int");
    }

    public static long zzo(long j8, int i8) {
        return zzt(j8, i8, 1000000L, RoundingMode.CEILING);
    }

    public static long zzp(long j8, float f8) {
        return f8 == 1.0f ? j8 : Math.round(j8 * f8);
    }

    public static long zzq(long j8, float f8) {
        return f8 == 1.0f ? j8 : Math.round(j8 / f8);
    }

    public static long zzr(long j8) {
        return (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? j8 : j8 * 1000;
    }

    public static long zzs(long j8, int i8) {
        return zzt(j8, 1000000L, i8, RoundingMode.FLOOR);
    }

    public static long zzt(long j8, long j9, long j10, RoundingMode roundingMode) {
        if (j8 == 0 || j9 == 0) {
            return 0L;
        }
        return (j10 < j9 || j10 % j9 != 0) ? (j10 >= j9 || j9 % j10 != 0) ? (j10 < j8 || j10 % j8 != 0) ? (j10 >= j8 || j8 % j10 != 0) ? b(j8, j9, j10, roundingMode) : AbstractC4678vm0.zzc(j9, AbstractC4678vm0.zza(j8, j10, RoundingMode.UNNECESSARY)) : AbstractC4678vm0.zza(j9, AbstractC4678vm0.zza(j10, j8, RoundingMode.UNNECESSARY), roundingMode) : AbstractC4678vm0.zzc(j8, AbstractC4678vm0.zza(j9, j10, RoundingMode.UNNECESSARY)) : AbstractC4678vm0.zza(j8, AbstractC4678vm0.zza(j10, j9, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzu(long j8) {
        return (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? j8 : j8 / 1000;
    }

    public static Point zzv(Context context) throws NumberFormatException {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzN(context)) {
            String strC = zza < 28 ? c("sys.display-size") : c("vendor.display-size");
            if (!TextUtils.isEmpty(strC)) {
                try {
                    String[] strArrSplit = strC.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i8 = Integer.parseInt(strArrSplit[0]);
                        int i9 = Integer.parseInt(strArrSplit[1]);
                        if (i8 > 0 && i9 > 0) {
                            return new Point(i8, i9);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC2834fc0.zzc("Util", "Invalid display size: ".concat(String.valueOf(strC)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat zzw(int i8, int i9, int i10) {
        return new AudioFormat.Builder().setSampleRate(i8).setChannelMask(i9).setEncoding(i10).build();
    }

    public static Handler zzx(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        F10.zzb(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    public static Looper zzy() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static Q5 zzz(int i8, int i9, int i10) {
        O4 o42 = new O4();
        o42.zzX("audio/raw");
        o42.zzy(i9);
        o42.zzY(i10);
        o42.zzR(i8);
        return o42.zzad();
    }
}
