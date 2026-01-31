package L1;

import H1.C;
import H1.d2;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC5125zi;
import com.google.android.gms.internal.ads.HandlerC1634Mh0;
import com.kakao.sdk.auth.Constants;
import f2.C5398h;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y1.C6526g;
import y1.C6528i;
import y1.C6529j;
import z1.AbstractC6617c;
import z1.C6616b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private float f3015a = -1.0f;
    public static final Handler zza = new HandlerC1634Mh0(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f3009b = C6529j.class.getName();

    /* renamed from: c */
    private static final String f3010c = M1.a.class.getName();

    /* renamed from: d */
    private static final String f3011d = C6616b.class.getName();

    /* renamed from: e */
    private static final String f3012e = AbstractC6617c.class.getName();

    /* renamed from: f */
    private static final String f3013f = W1.c.class.getName();

    /* renamed from: g */
    private static final String f3014g = C6526g.class.getName();

    private static String a(String str, String str2) throws NoSuchAlgorithmException {
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray b(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void c(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(zzi((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(b((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(f((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void d(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzt)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzi((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), b((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, b(Arrays.asList((Object[]) obj)));
            return;
        }
        int i8 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i8 < length) {
                    numArr2[i8] = Integer.valueOf(iArr[i8]);
                    i8++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, f(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i8 < length2) {
                    dArr3[i8] = Double.valueOf(dArr2[i8]);
                    i8++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, f(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i8 < length3) {
                    lArr2[i8] = Long.valueOf(jArr[i8]);
                    i8++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, f(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i8 < length4) {
                boolArr2[i8] = Boolean.valueOf(zArr[i8]);
                i8++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, f(boolArr));
    }

    private static final void e(ViewGroup viewGroup, d2 d2Var, String str, int i8, int i9) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i8);
        textView.setBackgroundColor(i9);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i8);
        int iZzy = zzy(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(d2Var.zzf - iZzy, d2Var.zzc - iZzy, 17));
        viewGroup.addView(frameLayout, d2Var.zzf, d2Var.zzc);
    }

    public static int zza(Context context, int i8) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i9 = configuration.orientation;
        if (i8 == 0) {
            i8 = i9;
        }
        return i8 == i9 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static ActivityManager.MemoryInfo zzc(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    public static C6528i zzd(Context context, int i8, int i9, int i10) {
        int iZza = zza(context, i10);
        if (iZza == -1) {
            return C6528i.INVALID;
        }
        return new C6528i(i8, Math.max(Math.min(i8 > 655 ? Math.round((i8 / 728.0f) * 90.0f) : i8 > 632 ? 81 : i8 > 526 ? Math.round((i8 / 468.0f) * 60.0f) : i8 > 432 ? 68 : Math.round((i8 / 320.0f) * 50.0f), Math.min(90, Math.round(iZza * 0.15f))), 50));
    }

    public static String zze() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static String zzf(String str) {
        return a(str, "MD5");
    }

    public static String zzg(String str) {
        return a(str, Constants.CODE_CHALLENGE_ALGORITHM);
    }

    public static boolean zzp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) AbstractC5125zi.zzd.zze());
    }

    public static final int zzq(DisplayMetrics displayMetrics, int i8) {
        return (int) TypedValue.applyDimension(1, i8, displayMetrics);
    }

    public static final String zzr(StackTraceElement[] stackTraceElementArr, String str) {
        int i8;
        String className;
        int i9 = 0;
        while (true) {
            i8 = i9 + 1;
            if (i8 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i9];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f3009b.equalsIgnoreCase(className2) || f3010c.equalsIgnoreCase(className2) || f3011d.equalsIgnoreCase(className2) || f3012e.equalsIgnoreCase(className2) || f3013f.equalsIgnoreCase(className2) || f3014g.equalsIgnoreCase(className2))) {
                break;
            }
            i9 = i8;
        }
        className = stackTraceElementArr[i8].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i10 = 2; i10 > 0 && stringTokenizer.hasMoreElements(); i10--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean zzs() {
        boolean zBooleanValue = ((Boolean) C.zzc().zza(AbstractC4439th.zzlt)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzt(Context context, int i8) {
        return C5398h.getInstance().isGooglePlayServicesAvailable(context, i8) == 0;
    }

    public static final boolean zzu(Context context) {
        int iIsGooglePlayServicesAvailable = C5398h.getInstance().isGooglePlayServicesAvailable(context, 12451000);
        return iIsGooglePlayServicesAvailable == 0 || iIsGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzv() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzw(DisplayMetrics displayMetrics, int i8) {
        return Math.round(i8 / displayMetrics.density);
    }

    public static final void zzx(Context context, String str, String str2, Bundle bundle, boolean z8, f fVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(com.kakao.sdk.common.Constants.OS, Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = C5398h.getInstance().getApkVersion(context) + ".241806000";
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(com.kakao.sdk.common.Constants.SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(com.kakao.sdk.user.Constants.ID, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        fVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int zzy(Context context, int i8) {
        return zzq(context.getResources().getDisplayMetrics(), i8);
    }

    public static final String zzz(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzs()) {
            string = "emulator";
        }
        return a(string, "MD5");
    }

    final JSONArray f(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final int zzb(Context context, int i8) {
        if (this.f3015a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f3015a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f3015a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i8 / this.f3015a);
    }

    public final JSONObject zzi(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            d(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzj(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                d(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e8) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e8.getMessage())));
        }
    }

    public final JSONObject zzk(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzi(bundle);
        } catch (JSONException e8) {
            n.zzh("Error converting Bundle to JSON", e8);
            return null;
        }
    }

    public final void zzl(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    zzl((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void zzm(ViewGroup viewGroup, d2 d2Var, String str, String str2) {
        if (str2 != null) {
            n.zzj(str2);
        }
        e(viewGroup, d2Var, str, W.a.CATEGORY_MASK, -16777216);
    }

    public final void zzn(ViewGroup viewGroup, d2 d2Var, String str) {
        e(viewGroup, d2Var, "Ads by Google", -16777216, -1);
    }

    public final void zzo(Context context, String str, String str2, Bundle bundle, boolean z8) {
        zzx(context, str, "gmob-apps", bundle, true, new f() { // from class: L1.d
            @Override // L1.f
            public final boolean zza(String str3) {
                new e(this.zza, str3).start();
                return true;
            }
        });
    }
}
