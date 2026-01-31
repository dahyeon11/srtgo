package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.q;
import com.squareup.picasso.s;
import com.squareup.picasso.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.c */
/* loaded from: classes.dex */
class RunnableC5295c implements Runnable {

    /* renamed from: t */
    private static final Object f29758t = new Object();

    /* renamed from: u */
    private static final ThreadLocal f29759u = new a();

    /* renamed from: v */
    private static final AtomicInteger f29760v = new AtomicInteger();

    /* renamed from: w */
    private static final y f29761w = new b();

    /* renamed from: a */
    final int f29762a = f29760v.incrementAndGet();

    /* renamed from: b */
    final s f29763b;

    /* renamed from: c */
    final g f29764c;

    /* renamed from: d */
    final F6.a f29765d;

    /* renamed from: e */
    final A f29766e;

    /* renamed from: f */
    final String f29767f;

    /* renamed from: g */
    final w f29768g;

    /* renamed from: h */
    final int f29769h;

    /* renamed from: i */
    int f29770i;

    /* renamed from: j */
    final y f29771j;

    /* renamed from: k */
    AbstractC5293a f29772k;

    /* renamed from: l */
    List f29773l;

    /* renamed from: m */
    Bitmap f29774m;

    /* renamed from: n */
    Future f29775n;

    /* renamed from: o */
    s.e f29776o;

    /* renamed from: p */
    Exception f29777p;

    /* renamed from: q */
    int f29778q;

    /* renamed from: r */
    int f29779r;

    /* renamed from: s */
    s.f f29780s;

    /* renamed from: com.squareup.picasso.c$a */
    static class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    static class b extends y {
        b() {
        }

        @Override // com.squareup.picasso.y
        public boolean canHandleRequest(w wVar) {
            return true;
        }

        @Override // com.squareup.picasso.y
        public y.a load(w wVar, int i8) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c */
    static class RunnableC0266c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RuntimeException f29781a;

        RunnableC0266c(F6.e eVar, RuntimeException runtimeException) {
            this.f29781a = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            new StringBuilder().append("Transformation ");
            throw null;
        }
    }

    RunnableC5295c(s sVar, g gVar, F6.a aVar, A a9, AbstractC5293a abstractC5293a, y yVar) {
        this.f29763b = sVar;
        this.f29764c = gVar;
        this.f29765d = aVar;
        this.f29766e = a9;
        this.f29772k = abstractC5293a;
        this.f29767f = abstractC5293a.b();
        this.f29768g = abstractC5293a.g();
        this.f29780s = abstractC5293a.f();
        this.f29769h = abstractC5293a.c();
        this.f29770i = abstractC5293a.d();
        this.f29771j = yVar;
        this.f29779r = yVar.d();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        if (list.size() <= 0) {
            return bitmap;
        }
        android.support.v4.media.session.f.a(list.get(0));
        try {
            throw null;
        } catch (RuntimeException e8) {
            s.f29836p.post(new RunnableC0266c(null, e8));
            return null;
        }
    }

    private s.f d() {
        s.f fVarF = s.f.LOW;
        List list = this.f29773l;
        boolean z8 = (list == null || list.isEmpty()) ? false : true;
        AbstractC5293a abstractC5293a = this.f29772k;
        if (abstractC5293a == null && !z8) {
            return fVarF;
        }
        if (abstractC5293a != null) {
            fVarF = abstractC5293a.f();
        }
        if (z8) {
            int size = this.f29773l.size();
            for (int i8 = 0; i8 < size; i8++) {
                s.f fVarF2 = ((AbstractC5293a) this.f29773l.get(i8)).f();
                if (fVarF2.ordinal() > fVarF.ordinal()) {
                    fVarF = fVarF2;
                }
            }
        }
        return fVarF;
    }

    static Bitmap e(P7.w wVar, w wVar2) throws IOException {
        P7.e eVarBuffer = P7.n.buffer(wVar);
        boolean zS = D.s(eVarBuffer);
        boolean z8 = wVar2.purgeable;
        BitmapFactory.Options optionsC = y.c(wVar2);
        boolean zE = y.e(optionsC);
        if (zS) {
            byte[] byteArray = eVarBuffer.readByteArray();
            if (zE) {
                BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsC);
                y.b(wVar2.targetWidth, wVar2.targetHeight, optionsC, wVar2);
            }
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsC);
        }
        InputStream inputStream = eVarBuffer.inputStream();
        if (zE) {
            m mVar = new m(inputStream);
            mVar.allowMarksToExpire(false);
            long jSavePosition = mVar.savePosition(1024);
            BitmapFactory.decodeStream(mVar, null, optionsC);
            y.b(wVar2.targetWidth, wVar2.targetHeight, optionsC, wVar2);
            mVar.reset(jSavePosition);
            mVar.allowMarksToExpire(true);
            inputStream = mVar;
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, optionsC);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static RunnableC5295c g(s sVar, g gVar, F6.a aVar, A a9, AbstractC5293a abstractC5293a) {
        w wVarG = abstractC5293a.g();
        List listF = sVar.f();
        int size = listF.size();
        for (int i8 = 0; i8 < size; i8++) {
            y yVar = (y) listF.get(i8);
            if (yVar.canHandleRequest(wVarG)) {
                return new RunnableC5295c(sVar, gVar, aVar, a9, abstractC5293a, yVar);
            }
        }
        return new RunnableC5295c(sVar, gVar, aVar, a9, abstractC5293a, f29761w);
    }

    static int l(int i8) {
        switch (i8) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int m(int i8) {
        return (i8 == 2 || i8 == 7 || i8 == 4 || i8 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z8, int i8, int i9, int i10, int i11) {
        return !z8 || (i10 != 0 && i8 > i10) || (i11 != 0 && i9 > i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.graphics.Bitmap y(com.squareup.picasso.w r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC5295c.y(com.squareup.picasso.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(w wVar) {
        String strA = wVar.a();
        StringBuilder sb = (StringBuilder) f29759u.get();
        sb.ensureCapacity(strA.length() + 8);
        sb.replace(8, sb.length(), strA);
        Thread.currentThread().setName(sb.toString());
    }

    void b(AbstractC5293a abstractC5293a) {
        boolean z8 = this.f29763b.f29851n;
        w wVar = abstractC5293a.f29742b;
        if (this.f29772k == null) {
            this.f29772k = abstractC5293a;
            if (z8) {
                List list = this.f29773l;
                if (list == null || list.isEmpty()) {
                    D.u("Hunter", "joined", wVar.c(), "to empty hunter");
                    return;
                } else {
                    D.u("Hunter", "joined", wVar.c(), D.l(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.f29773l == null) {
            this.f29773l = new ArrayList(3);
        }
        this.f29773l.add(abstractC5293a);
        if (z8) {
            D.u("Hunter", "joined", wVar.c(), D.l(this, "to "));
        }
        s.f fVarF = abstractC5293a.f();
        if (fVarF.ordinal() > this.f29780s.ordinal()) {
            this.f29780s = fVarF;
        }
    }

    boolean c() {
        Future future;
        if (this.f29772k != null) {
            return false;
        }
        List list = this.f29773l;
        return (list == null || list.isEmpty()) && (future = this.f29775n) != null && future.cancel(false);
    }

    void f(AbstractC5293a abstractC5293a) {
        boolean zRemove;
        if (this.f29772k == abstractC5293a) {
            this.f29772k = null;
            zRemove = true;
        } else {
            List list = this.f29773l;
            zRemove = list != null ? list.remove(abstractC5293a) : false;
        }
        if (zRemove && abstractC5293a.f() == this.f29780s) {
            this.f29780s = d();
        }
        if (this.f29763b.f29851n) {
            D.u("Hunter", "removed", abstractC5293a.f29742b.c(), D.l(this, "from "));
        }
    }

    AbstractC5293a h() {
        return this.f29772k;
    }

    List i() {
        return this.f29773l;
    }

    w j() {
        return this.f29768g;
    }

    Exception k() {
        return this.f29777p;
    }

    String n() {
        return this.f29767f;
    }

    s.e o() {
        return this.f29776o;
    }

    int p() {
        return this.f29769h;
    }

    s q() {
        return this.f29763b;
    }

    s.f r() {
        return this.f29780s;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.f29768g);
                        if (this.f29763b.f29851n) {
                            D.t("Hunter", "executing", D.k(this));
                        }
                        Bitmap bitmapT = t();
                        this.f29774m = bitmapT;
                        if (bitmapT == null) {
                            this.f29764c.e(this);
                        } else {
                            this.f29764c.d(this);
                        }
                    } catch (q.b e8) {
                        if (!p.isOfflineOnly(e8.f29832b) || e8.f29831a != 504) {
                            this.f29777p = e8;
                        }
                        this.f29764c.e(this);
                    } catch (Exception e9) {
                        this.f29777p = e9;
                        this.f29764c.e(this);
                    }
                } catch (IOException e10) {
                    this.f29777p = e10;
                    this.f29764c.i(this);
                }
            } catch (OutOfMemoryError e11) {
                StringWriter stringWriter = new StringWriter();
                this.f29766e.a().dump(new PrintWriter(stringWriter));
                this.f29777p = new RuntimeException(stringWriter.toString(), e11);
                this.f29764c.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    Bitmap s() {
        return this.f29774m;
    }

    Bitmap t() throws IOException {
        Bitmap bitmapY;
        if (o.a(this.f29769h)) {
            bitmapY = this.f29765d.get(this.f29767f);
            if (bitmapY != null) {
                this.f29766e.d();
                this.f29776o = s.e.MEMORY;
                if (this.f29763b.f29851n) {
                    D.u("Hunter", "decoded", this.f29768g.c(), "from cache");
                }
                return bitmapY;
            }
        } else {
            bitmapY = null;
        }
        int i8 = this.f29779r == 0 ? p.OFFLINE.f29828a : this.f29770i;
        this.f29770i = i8;
        y.a aVarLoad = this.f29771j.load(this.f29768g, i8);
        if (aVarLoad != null) {
            this.f29776o = aVarLoad.getLoadedFrom();
            this.f29778q = aVarLoad.a();
            bitmapY = aVarLoad.getBitmap();
            if (bitmapY == null) {
                P7.w source = aVarLoad.getSource();
                try {
                    bitmapY = e(source, this.f29768g);
                } finally {
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmapY != null) {
            if (this.f29763b.f29851n) {
                D.t("Hunter", "decoded", this.f29768g.c());
            }
            this.f29766e.b(bitmapY);
            if (this.f29768g.e() || this.f29778q != 0) {
                synchronized (f29758t) {
                    try {
                        if (this.f29768g.d() || this.f29778q != 0) {
                            bitmapY = y(this.f29768g, bitmapY, this.f29778q);
                            if (this.f29763b.f29851n) {
                                D.t("Hunter", "transformed", this.f29768g.c());
                            }
                        }
                        if (this.f29768g.b()) {
                            bitmapY = a(this.f29768g.transformations, bitmapY);
                            if (this.f29763b.f29851n) {
                                D.u("Hunter", "transformed", this.f29768g.c(), "from custom transformations");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmapY != null) {
                    this.f29766e.c(bitmapY);
                }
            }
        }
        return bitmapY;
    }

    boolean u() {
        Future future = this.f29775n;
        return future != null && future.isCancelled();
    }

    boolean w(boolean z8, NetworkInfo networkInfo) {
        int i8 = this.f29779r;
        if (i8 <= 0) {
            return false;
        }
        this.f29779r = i8 - 1;
        return this.f29771j.f(z8, networkInfo);
    }

    boolean x() {
        return this.f29771j.g();
    }
}
