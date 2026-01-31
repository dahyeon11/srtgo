package K1;

import H1.C0591z;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.AbstractC1483In0;
import com.google.android.gms.internal.ads.AbstractC3414kh;
import com.google.android.gms.internal.ads.AbstractC3533lj0;
import com.google.android.gms.internal.ads.AbstractC3890or;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC5125zi;
import com.google.android.gms.internal.ads.C1720Oj0;
import com.google.android.gms.internal.ads.C1838Rh;
import com.google.android.gms.internal.ads.C3617mP;
import com.google.android.gms.internal.ads.C4654va0;
import com.google.android.gms.internal.ads.C4996ya0;
import com.google.android.gms.internal.ads.HandlerC1634Mh0;
import com.google.android.gms.internal.ads.InterfaceC1247Cw;
import com.google.android.gms.internal.ads.InterfaceC1655Mv;
import com.google.android.gms.internal.ads.YD0;
import com.kakao.sdk.common.Constants;
import f2.AbstractC5402l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class K0 {
    public static final HandlerC1634Mh0 zza = new HandlerC0669w0(Looper.getMainLooper());

    /* renamed from: g */
    private String f2783g;

    /* renamed from: h */
    private volatile String f2784h;

    /* renamed from: a */
    private final AtomicReference f2777a = new AtomicReference(null);

    /* renamed from: b */
    private final AtomicReference f2778b = new AtomicReference(null);

    /* renamed from: c */
    private final AtomicReference f2779c = new AtomicReference(new Bundle());

    /* renamed from: d */
    private final AtomicBoolean f2780d = new AtomicBoolean();

    /* renamed from: e */
    private boolean f2781e = true;

    /* renamed from: f */
    private final Object f2782f = new Object();

    /* renamed from: i */
    private boolean f2785i = false;

    /* renamed from: j */
    private boolean f2786j = false;

    /* renamed from: k */
    private final Executor f2787k = Executors.newSingleThreadExecutor();

    private static KeyguardManager a(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle b(Context context) {
        try {
            return q2.e.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e8) {
            AbstractC0667v0.zzb("Error getting metadata", e8);
            return null;
        }
    }

    private static String c(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static boolean d(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void e(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String f(final Context context, String str) {
        String strI;
        String str2;
        if (str == null) {
            return i();
        }
        try {
            C0654o0 c0654o0Zza = C0654o0.zza();
            if (TextUtils.isEmpty(c0654o0Zza.f2821a)) {
                if (o2.e.isPackageSide()) {
                    str2 = (String) AbstractC0648l0.zza(context, new Callable() { // from class: K1.m0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                AbstractC0667v0.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            AbstractC0667v0.zza("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            o2.q.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = AbstractC5402l.getRemoteContext(context);
                    str2 = (String) AbstractC0648l0.zza(context, new Callable() { // from class: K1.n0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z8 = false;
                            if (context2 != null) {
                                AbstractC0667v0.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                AbstractC0667v0.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z8 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                AbstractC0667v0.zza("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context3);
                                if (z8) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    AbstractC0667v0.zza("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                c0654o0Zza.f2821a = str2;
            }
            strI = c0654o0Zza.f2821a;
        } catch (Exception unused) {
            strI = null;
        }
        if (TextUtils.isEmpty(strI)) {
            strI = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strI)) {
            strI = i();
        }
        String str3 = strI + " (Mobile; " + str;
        try {
            if (q2.e.packageManager(context).isCallerInstantApp()) {
                str3 = str3 + ";aia";
            }
        } catch (Exception e8) {
            G1.u.zzo().zzw(e8, "AdUtil.getUserAgent");
        }
        return str3.concat(")");
    }

    static final String i() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(Q7.X.SPACE);
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    protected static final int[] j() {
        return new int[]{0, 0};
    }

    public static final boolean zzA(Context context, String str) {
        Context contextZza = AbstractC3890or.zza(context);
        return q2.e.packageManager(contextZza).checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean zzB(Context context) {
        try {
            return o2.j.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzC(String str) {
        if (!L1.m.zzk()) {
            return false;
        }
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeV)).booleanValue()) {
            return false;
        }
        String str2 = (String) H1.C.zzc().zza(AbstractC4439th.zzeX);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) H1.C.zzc().zza(AbstractC4439th.zzeW);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        KeyguardManager keyguardManagerA;
        return (context == null || (keyguardManagerA = a(context)) == null || !keyguardManagerA.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzE(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            L1.n.zzh("Error loading class.", th);
            G1.u.zzo().zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzF() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzG(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzH(Context context) {
        try {
            Bundle bundleB = b(context);
            String string = bundleB.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(c(bundleB))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzJ(View view, int i8, MotionEvent motionEvent) {
        String strZza;
        int i9;
        int iHeight;
        int iWidth;
        String str;
        String str2;
        C4654va0 c4654va0ZzD;
        C4996ya0 c4996ya0ZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof C3617mP) {
                childAt = ((C3617mP) childAt).getChildAt(0);
            }
            if (childAt instanceof Q1.e) {
                strZza = "NATIVE";
                i9 = 1;
            } else {
                strZza = "UNKNOWN";
                i9 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            G1.u.zzp();
            long jZzw = zzw(childAt);
            childAt.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            if (!(childAt instanceof InterfaceC1247Cw) || (c4996ya0ZzR = ((InterfaceC1247Cw) childAt).zzR()) == null) {
                str = "none";
            } else {
                String str3 = c4996ya0ZzR.zzb;
                childAt.setContentDescription(str3 + ":" + childAt.hashCode());
                str = str3;
            }
            if (!(childAt instanceof InterfaceC1655Mv) || (c4654va0ZzD = ((InterfaceC1655Mv) childAt).zzD()) == null) {
                str2 = "none";
            } else {
                strZza = C4654va0.zza(c4654va0ZzD.zzb);
                i9 = c4654va0ZzD.zzf;
                str2 = c4654va0ZzD.zzF;
            }
            L1.n.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strZza, Integer.valueOf(i9), childAt.getClass().getName(), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jZzw), Integer.toString(i8, 2)));
        } catch (Exception e8) {
            L1.n.zzh("Failure getting view location.", e8);
        }
    }

    public static final AlertDialog.Builder zzK(Context context) {
        G1.u.zzq();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzL(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new C0634e0(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzM(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) AbstractC5125zi.zzb.zze()).booleanValue()) {
                o2.h.addDynamiteErrorToDropBox(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final String zzN(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i8 = inputStreamReader.read(cArr);
            if (i8 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i8);
        }
    }

    public static final int zzO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            L1.n.zzj("Could not parse value:".concat(e8.toString()));
            return 0;
        }
    }

    public static final Map zzP(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] zzQ(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? j() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzR(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrJ = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? j() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{C0591z.zzb().zzb(activity, iArrJ[0]), C0591z.zzb().zzb(activity, iArrJ[1])};
    }

    public static final boolean zzS(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z8 = G1.u.zzp().f2781e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzn(view);
        long jZzw = zzw(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z8)) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbm)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkD)).booleanValue()) {
                    return true;
                }
                if (jZzw >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzkF)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzT(Context context, Intent intent) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkX)).booleanValue()) {
            e(context, intent);
            return;
        }
        try {
            e(context, intent);
        } catch (SecurityException e8) {
            L1.n.zzk("", e8);
            G1.u.zzo().zzw(e8, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzU(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzo(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            L1.n.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e8) {
            L1.n.zzh("No browser is found.", e8);
        }
    }

    public static final int[] zzV(Activity activity) {
        int[] iArrZzQ = zzQ(activity);
        return new int[]{C0591z.zzb().zzb(activity, iArrZzQ[0]), C0591z.zzb().zzb(activity, iArrZzQ[1])};
    }

    public static final boolean zzW(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzS(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, a(context));
    }

    public static int zza(int i8) {
        if (i8 >= 5000) {
            return i8;
        }
        if (i8 <= 0) {
            return 60000;
        }
        L1.n.zzj("HTTP timeout too low: " + i8 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static List zzd() {
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zza;
        List listZzb = H1.C.zza().zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = C1720Oj0.zzc(AbstractC3533lj0.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    AbstractC0667v0.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzn(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.K0.zzn(android.view.View):boolean");
    }

    public static final void zzo(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder(androidx.browser.customtabs.d.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzp(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return c(b(context));
    }

    public static final String zzr() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + Q7.X.SPACE + str2;
    }

    public static final Integer zzs(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzt(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final Map zzv(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i8);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e8) {
            G1.u.zzo().zzw(e8, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzw(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzx(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", G1.u.zzp().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new T(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e8) {
            L1.n.zzk("Could not fetch MRAID JS.", e8);
        }
        return null;
    }

    public static final String zzy() {
        Resources resourcesZze = G1.u.zzo().zze();
        return resourcesZze != null ? resourcesZze.getString(E1.d.f964s7) : "Test Ad";
    }

    public static final W zzz(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                L1.n.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof W ? (W) iInterfaceQueryLocalInterface : new U(iBinder);
        } catch (Exception e8) {
            G1.u.zzo().zzw(e8, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    final /* synthetic */ void h(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f2779c.set(AbstractC0633e.zzb(context, str));
    }

    public final com.google.common.util.concurrent.C zzb(final Uri uri) {
        return AbstractC1483In0.zzj(new Callable() { // from class: K1.E0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC1634Mh0 handlerC1634Mh0 = K0.zza;
                G1.u.zzp();
                return K0.zzP(uri);
            }
        }, this.f2787k);
    }

    public final String zzc(Context context, String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlk)).booleanValue()) {
            if (this.f2784h != null) {
                return this.f2784h;
            }
            this.f2784h = f(context, str);
            return this.f2784h;
        }
        synchronized (this.f2782f) {
            try {
                String str2 = this.f2783g;
                if (str2 != null) {
                    return str2;
                }
                String strF = f(context, str);
                this.f2783g = strF;
                return strF;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf(Context context, String str, boolean z8, HttpURLConnection httpURLConnection, boolean z9, int i8) {
        int iZza = zza(i8);
        L1.n.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void zzh(final Context context, final String str, String str2, Bundle bundle, boolean z8) {
        G1.u.zzp();
        bundle.putString(Constants.DEVICE, zzr());
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zza;
        bundle.putString("eids", TextUtils.join(",", H1.C.zza().zza()));
        if (bundle.isEmpty()) {
            L1.n.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) H1.C.zzc().zza(AbstractC4439th.zzkA);
            if (!this.f2780d.getAndSet(true)) {
                this.f2779c.set(AbstractC0633e.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: K1.D0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.h(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f2779c.get());
        }
        C0591z.zzb();
        L1.g.zzx(context, str, "gmob-apps", bundle, true, new L1.f() { // from class: K1.C0
            @Override // L1.f
            public final boolean zza(String str4) {
                HandlerC1634Mh0 handlerC1634Mh0 = K0.zza;
                G1.u.zzp();
                K0.zzL(context, str, str4);
                return true;
            }
        });
    }

    public final boolean zzi(String str) {
        return d(str, this.f2777a, (String) H1.C.zzc().zza(AbstractC4439th.zzab));
    }

    public final boolean zzj(String str) {
        return d(str, this.f2778b, (String) H1.C.zzc().zza(AbstractC4439th.zzac));
    }

    public final boolean zzk(Context context) {
        if (this.f2786j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC4439th.zza(context);
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkW)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new H0(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new H0(this, null), intentFilter, 4);
        }
        this.f2786j = true;
        return true;
    }

    public final boolean zzl(Context context) {
        if (this.f2785i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC4439th.zza(context);
        I0 i02 = null;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkW)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new J0(this, i02), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new J0(this, i02), intentFilter, 4);
        }
        this.f2785i = true;
        return true;
    }

    public final int zzm(Context context, Uri uri) {
        int i8;
        if (context == null) {
            AbstractC0667v0.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i8 = 0;
        } else {
            AbstractC0667v0.zza("Chrome Custom Tabs can only work with Activity context.");
            i8 = 2;
        }
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zzeC;
        Boolean bool = (Boolean) H1.C.zzc().zza(abstractC3414kh);
        AbstractC3414kh abstractC3414kh2 = AbstractC4439th.zzeD;
        if (true == bool.equals(H1.C.zzc().zza(abstractC3414kh2))) {
            i8 = 9;
        }
        if (i8 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i8;
        }
        if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
            C1838Rh c1838Rh = new C1838Rh();
            c1838Rh.zze(new F0(this, c1838Rh, context, uri));
            c1838Rh.zzb((Activity) context);
        }
        if (!((Boolean) H1.C.zzc().zza(abstractC3414kh2)).booleanValue()) {
            return 5;
        }
        androidx.browser.customtabs.d dVarBuild = new d.a().build();
        dVarBuild.intent.setPackage(YD0.zza(context));
        dVarBuild.launchUrl(context, uri);
        return 5;
    }
}
