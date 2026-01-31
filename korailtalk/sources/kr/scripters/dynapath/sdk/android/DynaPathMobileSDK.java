package kr.scripters.dynapath.sdk.android;

import R6.G;
import S6.AbstractC0765i;
import S6.M;
import S6.r;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import h7.f;
import j7.l;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import x7.C6498c;
import x7.C6499d;

/* loaded from: classes3.dex */
public final class DynaPathMobileSDK {
    public static final a Companion = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static WeakReference f33812c;

    /* renamed from: d, reason: collision with root package name */
    private static DynaPathMobileSDK f33813d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f33814a;

    /* renamed from: b, reason: collision with root package name */
    private volatile b f33815b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String generate() {
            b bVar;
            b bVar2;
            if (DynaPathMobileSDK.f33813d == null) {
                throw new DynaPathException(-1002, "DynaPathMobileSDK is not initialized.");
            }
            try {
                DynaPathMobileSDK dynaPathMobileSDK = DynaPathMobileSDK.f33813d;
                if (dynaPathMobileSDK != null && (bVar2 = dynaPathMobileSDK.f33815b) != null) {
                    bVar2.action(System.currentTimeMillis());
                }
                DynaPathMobileSDK dynaPathMobileSDK2 = DynaPathMobileSDK.f33813d;
                String mobileRequestFormat = (dynaPathMobileSDK2 == null || (bVar = dynaPathMobileSDK2.f33815b) == null) ? null : bVar.toMobileRequestFormat();
                if (mobileRequestFormat != null) {
                    return mobileRequestFormat;
                }
                throw new DynaPathException(-1003, "token generate failed. ");
            } catch (Exception e8) {
                throw new DynaPathException(-1003, "token generate failed. ", e8);
            }
        }

        public final void initialize(Application application) {
            Context context;
            Intrinsics.checkNotNullParameter(application, "application");
            DynaPathMobileSDK.f33812c = new WeakReference(application.getApplicationContext());
            WeakReference weakReference = DynaPathMobileSDK.f33812c;
            if (weakReference == null || (context = (Context) weakReference.get()) == null) {
                throw new DynaPathException(-1001, "DynaPathMobileSDK Initialize Failed.");
            }
            DynaPathMobileSDK.f33813d = new DynaPathMobileSDK(context, null);
            DynaPathMobileSDK dynaPathMobileSDK = DynaPathMobileSDK.f33813d;
            if (dynaPathMobileSDK != null) {
                C6499d c6499d = C6499d.INSTANCE;
                dynaPathMobileSDK.f33815b = b.Companion.create(context, c6499d.getCurrentSignatureHashes$DynaPathMobileSDK_release(context).toString(), null, Boolean.valueOf(c6499d.isRootDetected$DynaPathMobileSDK_release(context)), Boolean.valueOf(c6499d.isDebuggingDetected$DynaPathMobileSDK_release(context)), Boolean.valueOf(c6499d.isEmulatorDetected$DynaPathMobileSDK_release()), Boolean.valueOf(c6499d.isHookingDetected$DynaPathMobileSDK_release()));
            }
            if (DynaPathMobileSDK.f33813d == null) {
                throw new DynaPathException(-1001, "DynaPathMobileSDK Initialize Failed. ");
            }
        }

        private a() {
        }
    }

    private static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f33816a;

        /* renamed from: b, reason: collision with root package name */
        private final String f33817b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33818c;

        /* renamed from: d, reason: collision with root package name */
        private final String f33819d;

        /* renamed from: e, reason: collision with root package name */
        private final Boolean f33820e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f33821f;

        /* renamed from: g, reason: collision with root package name */
        private final Boolean f33822g;

        /* renamed from: h, reason: collision with root package name */
        private Boolean f33823h;

        /* renamed from: i, reason: collision with root package name */
        private final Long f33824i;

        /* renamed from: j, reason: collision with root package name */
        private Long f33825j;

        /* renamed from: k, reason: collision with root package name */
        private Long[] f33826k;

        /* renamed from: l, reason: collision with root package name */
        private final String f33827l;

        /* renamed from: m, reason: collision with root package name */
        private final String f33828m;

        /* renamed from: n, reason: collision with root package name */
        private final String f33829n;

        /* renamed from: o, reason: collision with root package name */
        private final String f33830o;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b create(Context context, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new b(context.getPackageName(), Settings.Secure.getString(context.getContentResolver(), "android_id"), str, str2, bool, bool2, bool3, bool4, Long.valueOf(System.currentTimeMillis()), null, new Long[0], Build.VERSION.RELEASE, Build.MODEL);
            }

            private a() {
            }
        }

        public b() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        private final String a(String str) throws UnsupportedEncodingException {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            return strEncode;
        }

        public final void action(long j8) {
            synchronized (this) {
                try {
                    this.f33825j = Long.valueOf(j8);
                    Long[] lArr = this.f33826k;
                    if (lArr != null) {
                        if (lArr.length < 5) {
                            this.f33826k = (Long[]) AbstractC0765i.plus(lArr, Long.valueOf(j8));
                        } else {
                            this.f33826k = (Long[]) AbstractC0765i.plus((Long[]) AbstractC0765i.drop(lArr, 1).toArray(new Long[0]), Long.valueOf(j8));
                        }
                        G g8 = G.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final String getAppHash() {
            return this.f33819d;
        }

        public final String getAppId() {
            return this.f33816a;
        }

        public final String getAppSignature() {
            return this.f33818c;
        }

        public final Boolean getDebugger() {
            return this.f33821f;
        }

        public final String getDeviceId() {
            return this.f33817b;
        }

        public final String getDeviceModel() {
            return this.f33828m;
        }

        public final Boolean getEmulator() {
            return this.f33822g;
        }

        public final Long getInitTimestamp() {
            return this.f33824i;
        }

        public final String getOsVersion() {
            return this.f33827l;
        }

        public final Boolean getOwnedSuperuser() {
            return this.f33820e;
        }

        public final Long[] getRecentTimestamp() {
            return this.f33826k;
        }

        public final String getSdkType() {
            return this.f33829n;
        }

        public final String getSdkVersion() {
            return this.f33830o;
        }

        public final Long getTimestamp() {
            return this.f33825j;
        }

        public final Boolean isHooked() {
            return this.f33823h;
        }

        public final String queryString(Map<String, String[]> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                String key = entry.getKey();
                for (String str : entry.getValue()) {
                    arrayList.add(a(key) + '=' + a(str));
                }
            }
            return r.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null);
        }

        public final String randomAlphaNumeric(StringCompanionObject stringCompanionObject, int i8) {
            Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
            l lVar = new l(1, i8);
            ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(lVar, 10));
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                ((M) it).nextInt();
                arrayList.add(Character.valueOf(l7.r.random("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", f.Default)));
            }
            return r.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        }

        public final void setDebugger(Boolean bool) {
            this.f33821f = bool;
        }

        public final void setHooked(Boolean bool) {
            this.f33823h = bool;
        }

        public final void setRecentTimestamp(Long[] lArr) {
            this.f33826k = lArr;
        }

        public final void setTimestamp(Long l8) {
            this.f33825j = l8;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Map<java.lang.String, java.lang.String[]> toMap() {
            /*
                Method dump skipped, instructions count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kr.scripters.dynapath.sdk.android.DynaPathMobileSDK.b.toMap():java.util.Map");
        }

        public final String toMobileRequestFormat() {
            try {
                String strQueryString = queryString(toMap());
                return C6498c.primeEncode$default(C6498c.INSTANCE, strQueryString, this.f33830o + '+' + randomAlphaNumeric(StringCompanionObject.INSTANCE, 4) + '+' + this.f33825j, 0L, 4, null);
            } catch (Exception unused) {
                return null;
            }
        }

        public b(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l8, Long l9, Long[] lArr, String str5, String str6) {
            this.f33816a = str;
            this.f33817b = str2;
            this.f33818c = str3;
            this.f33819d = str4;
            this.f33820e = bool;
            this.f33821f = bool2;
            this.f33822g = bool3;
            this.f33823h = bool4;
            this.f33824i = l8;
            this.f33825j = l9;
            this.f33826k = lArr;
            this.f33827l = str5;
            this.f33828m = str6;
            this.f33829n = "Android";
            this.f33830o = "v1";
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l8, Long l9, Long[] lArr, String str5, String str6, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : bool, (i8 & 32) != 0 ? null : bool2, (i8 & 64) != 0 ? null : bool3, (i8 & 128) != 0 ? null : bool4, (i8 & 256) != 0 ? null : l8, (i8 & 512) != 0 ? null : l9, (i8 & 1024) != 0 ? null : lArr, (i8 & 2048) != 0 ? null : str5, (i8 & 4096) == 0 ? str6 : null);
        }
    }

    public /* synthetic */ DynaPathMobileSDK(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final String generate() {
        return Companion.generate();
    }

    public static final void initialize(Application application) {
        Companion.initialize(application);
    }

    private DynaPathMobileSDK(Context context) {
        this.f33814a = context;
    }
}
