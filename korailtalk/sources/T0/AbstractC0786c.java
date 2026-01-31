package T0;

import android.content.Context;
import java.io.File;

/* renamed from: T0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0786c {
    public static boolean DBG = false;
    public static final String TAG = "LOTTIE";

    /* renamed from: a, reason: collision with root package name */
    private static boolean f4784a = false;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f4785b;

    /* renamed from: c, reason: collision with root package name */
    private static long[] f4786c;

    /* renamed from: d, reason: collision with root package name */
    private static int f4787d;

    /* renamed from: e, reason: collision with root package name */
    private static int f4788e;

    /* renamed from: f, reason: collision with root package name */
    private static c1.f f4789f;

    /* renamed from: g, reason: collision with root package name */
    private static c1.e f4790g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile c1.h f4791h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile c1.g f4792i;

    /* renamed from: T0.c$a */
    class a implements c1.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f4793a;

        a(Context context) {
            this.f4793a = context;
        }

        @Override // c1.e
        public File getCacheDir() {
            return new File(this.f4793a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void beginSection(String str) {
        if (f4784a) {
            int i8 = f4787d;
            if (i8 == 20) {
                f4788e++;
                return;
            }
            f4785b[i8] = str;
            f4786c[i8] = System.nanoTime();
            androidx.core.os.q.beginSection(str);
            f4787d++;
        }
    }

    public static float endSection(String str) {
        int i8 = f4788e;
        if (i8 > 0) {
            f4788e = i8 - 1;
            return 0.0f;
        }
        if (!f4784a) {
            return 0.0f;
        }
        int i9 = f4787d - 1;
        f4787d = i9;
        if (i9 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f4785b[i9])) {
            androidx.core.os.q.endSection();
            return (System.nanoTime() - f4786c[f4787d]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f4785b[f4787d] + ".");
    }

    public static c1.g networkCache(Context context) {
        Context applicationContext = context.getApplicationContext();
        c1.g gVar = f4792i;
        if (gVar == null) {
            synchronized (c1.g.class) {
                try {
                    gVar = f4792i;
                    if (gVar == null) {
                        c1.e aVar = f4790g;
                        if (aVar == null) {
                            aVar = new a(applicationContext);
                        }
                        gVar = new c1.g(aVar);
                        f4792i = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    public static c1.h networkFetcher(Context context) {
        c1.h hVar = f4791h;
        if (hVar == null) {
            synchronized (c1.h.class) {
                try {
                    hVar = f4791h;
                    if (hVar == null) {
                        c1.g gVarNetworkCache = networkCache(context);
                        c1.f bVar = f4789f;
                        if (bVar == null) {
                            bVar = new c1.b();
                        }
                        hVar = new c1.h(gVarNetworkCache, bVar);
                        f4791h = hVar;
                    }
                } finally {
                }
            }
        }
        return hVar;
    }

    public static void setCacheProvider(c1.e eVar) {
        f4790g = eVar;
    }

    public static void setFetcher(c1.f fVar) {
        f4789f = fVar;
    }

    public static void setTraceEnabled(boolean z8) {
        if (f4784a == z8) {
            return;
        }
        f4784a = z8;
        if (z8) {
            f4785b = new String[20];
            f4786c = new long[20];
        }
    }
}
