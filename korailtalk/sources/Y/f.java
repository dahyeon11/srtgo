package Y;

import Y.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final O.f f5529a = new O.f(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f5530b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f5531c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final O.h f5532d = new O.h();

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f5534b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y.e f5535c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5536d;

        a(String str, Context context, Y.e eVar, int i8) {
            this.f5533a = str;
            this.f5534b = context;
            this.f5535c = eVar;
            this.f5536d = i8;
        }

        @Override // java.util.concurrent.Callable
        public e call() {
            return f.c(this.f5533a, this.f5534b, this.f5535c, this.f5536d);
        }
    }

    class b implements Z.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y.a f5537a;

        b(Y.a aVar) {
            this.f5537a = aVar;
        }

        @Override // Z.a
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f5537a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5538a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f5539b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y.e f5540c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5541d;

        c(String str, Context context, Y.e eVar, int i8) {
            this.f5538a = str;
            this.f5539b = context;
            this.f5540c = eVar;
            this.f5541d = i8;
        }

        @Override // java.util.concurrent.Callable
        public e call() {
            try {
                return f.c(this.f5538a, this.f5539b, this.f5540c, this.f5541d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements Z.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5542a;

        d(String str) {
            this.f5542a = str;
        }

        @Override // Z.a
        public void accept(e eVar) {
            synchronized (f.f5531c) {
                try {
                    O.h hVar = f.f5532d;
                    ArrayList arrayList = (ArrayList) hVar.get(this.f5542a);
                    if (arrayList == null) {
                        return;
                    }
                    hVar.remove(this.f5542a);
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        ((Z.a) arrayList.get(i8)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(Y.e eVar, int i8) {
        return eVar.b() + g5.e.STATE_NAME_NONE + i8;
    }

    private static int b(g.a aVar) {
        int i8 = 1;
        if (aVar.getStatusCode() != 0) {
            return aVar.getStatusCode() != 1 ? -3 : -2;
        }
        g.b[] fonts = aVar.getFonts();
        if (fonts != null && fonts.length != 0) {
            i8 = 0;
            for (g.b bVar : fonts) {
                int resultCode = bVar.getResultCode();
                if (resultCode != 0) {
                    if (resultCode < 0) {
                        return -3;
                    }
                    return resultCode;
                }
            }
        }
        return i8;
    }

    static e c(String str, Context context, Y.e eVar, int i8) {
        O.f fVar = f5529a;
        Typeface typeface = (Typeface) fVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = Y.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceCreateFromFontInfo = androidx.core.graphics.d.createFromFontInfo(context, null, aVarE.getFonts(), i8);
            if (typefaceCreateFromFontInfo == null) {
                return new e(-3);
            }
            fVar.put(str, typefaceCreateFromFontInfo);
            return new e(typefaceCreateFromFontInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, Y.e eVar, int i8, Executor executor, Y.a aVar) {
        String strA = a(eVar, i8);
        Typeface typeface = (Typeface) f5529a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f5531c) {
            try {
                O.h hVar = f5532d;
                ArrayList arrayList = (ArrayList) hVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                hVar.put(strA, arrayList2);
                c cVar = new c(strA, context, eVar, i8);
                if (executor == null) {
                    executor = f5530b;
                }
                h.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, Y.e eVar, Y.a aVar, int i8, int i9) {
        String strA = a(eVar, i8);
        Typeface typeface = (Typeface) f5529a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i9 == -1) {
            e eVarC = c(strA, context, eVar, i8);
            aVar.b(eVarC);
            return eVarC.f5543a;
        }
        try {
            e eVar2 = (e) h.d(f5530b, new a(strA, context, eVar, i8), i9);
            aVar.b(eVar2);
            return eVar2.f5543a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static void f() {
        f5529a.evictAll();
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f5543a;

        /* renamed from: b, reason: collision with root package name */
        final int f5544b;

        e(int i8) {
            this.f5543a = null;
            this.f5544b = i8;
        }

        boolean a() {
            return this.f5544b == 0;
        }

        e(Typeface typeface) {
            this.f5543a = typeface;
            this.f5544b = 0;
        }
    }
}
