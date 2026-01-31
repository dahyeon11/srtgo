package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.squareup.picasso.s;
import com.squareup.picasso.v;
import com.squareup.picasso.w;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class x {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f29909m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    private final s f29910a;

    /* renamed from: b, reason: collision with root package name */
    private final w.b f29911b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29912c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29913d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29914e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f29915f;

    /* renamed from: g, reason: collision with root package name */
    private int f29916g;

    /* renamed from: h, reason: collision with root package name */
    private int f29917h;

    /* renamed from: i, reason: collision with root package name */
    private int f29918i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f29919j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f29920k;

    /* renamed from: l, reason: collision with root package name */
    private Object f29921l;

    x(s sVar, Uri uri, int i8) {
        if (sVar.f29852o) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f29910a = sVar;
        this.f29911b = new w.b(uri, i8, sVar.f29849l);
    }

    private w b(long j8) {
        int andIncrement = f29909m.getAndIncrement();
        w wVarBuild = this.f29911b.build();
        wVarBuild.f29889a = andIncrement;
        wVarBuild.f29890b = j8;
        boolean z8 = this.f29910a.f29851n;
        if (z8) {
            D.u("Main", "created", wVarBuild.f(), wVarBuild.toString());
        }
        w wVarJ = this.f29910a.j(wVarBuild);
        if (wVarJ != wVarBuild) {
            wVarJ.f29889a = andIncrement;
            wVarJ.f29890b = j8;
            if (z8) {
                D.u("Main", "changed", wVarJ.c(), "into " + wVarJ);
            }
        }
        return wVarJ;
    }

    private Drawable c() {
        int i8 = this.f29915f;
        return i8 != 0 ? this.f29910a.f29842e.getDrawable(i8) : this.f29919j;
    }

    private void e(v vVar) {
        Bitmap bitmapG;
        if (o.a(this.f29917h) && (bitmapG = this.f29910a.g(vVar.b())) != null) {
            vVar.complete(bitmapG, s.e.MEMORY);
            return;
        }
        int i8 = this.f29915f;
        if (i8 != 0) {
            vVar.m(i8);
        }
        this.f29910a.e(vVar);
    }

    x a() {
        this.f29921l = null;
        return this;
    }

    public x centerCrop() {
        this.f29911b.centerCrop(17);
        return this;
    }

    public x centerInside() {
        this.f29911b.centerInside();
        return this;
    }

    public x config(Bitmap.Config config) {
        this.f29911b.config(config);
        return this;
    }

    Object d() {
        return this.f29921l;
    }

    public x error(int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.f29920k != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f29916g = i8;
        return this;
    }

    x f() {
        this.f29913d = false;
        return this;
    }

    public void fetch() {
        fetch(null);
    }

    public x fit() {
        this.f29913d = true;
        return this;
    }

    public Bitmap get() {
        long jNanoTime = System.nanoTime();
        D.d();
        if (this.f29913d) {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!this.f29911b.a()) {
            return null;
        }
        w wVarB = b(jNanoTime);
        j jVar = new j(this.f29910a, wVarB, this.f29917h, this.f29918i, this.f29921l, D.h(wVarB, new StringBuilder()));
        s sVar = this.f29910a;
        return RunnableC5295c.g(sVar, sVar.f29843f, sVar.f29844g, sVar.f29845h, jVar).t();
    }

    public void into(B b9) {
        Bitmap bitmapG;
        long jNanoTime = System.nanoTime();
        D.c();
        if (b9 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.f29913d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.f29911b.a()) {
            this.f29910a.cancelRequest(b9);
            b9.a(this.f29914e ? c() : null);
            return;
        }
        w wVarB = b(jNanoTime);
        String strG = D.g(wVarB);
        if (!o.a(this.f29917h) || (bitmapG = this.f29910a.g(strG)) == null) {
            b9.a(this.f29914e ? c() : null);
            this.f29910a.e(new C(this.f29910a, b9, wVarB, this.f29917h, this.f29918i, this.f29920k, strG, this.f29921l, this.f29916g));
        } else {
            this.f29910a.cancelRequest(b9);
            b9.b(bitmapG, s.e.MEMORY);
        }
    }

    public x memoryPolicy(o oVar, o... oVarArr) {
        if (oVar == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        this.f29917h = oVar.f29826a | this.f29917h;
        if (oVarArr == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (oVarArr.length > 0) {
            for (o oVar2 : oVarArr) {
                if (oVar2 == null) {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                this.f29917h = oVar2.f29826a | this.f29917h;
            }
        }
        return this;
    }

    public x networkPolicy(p pVar, p... pVarArr) {
        if (pVar == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        this.f29918i = pVar.f29828a | this.f29918i;
        if (pVarArr == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        if (pVarArr.length > 0) {
            for (p pVar2 : pVarArr) {
                if (pVar2 == null) {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
                this.f29918i = pVar2.f29828a | this.f29918i;
            }
        }
        return this;
    }

    public x noFade() {
        this.f29912c = true;
        return this;
    }

    public x noPlaceholder() {
        if (this.f29915f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        }
        if (this.f29919j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f29914e = false;
        return this;
    }

    public x onlyScaleDown() {
        this.f29911b.onlyScaleDown();
        return this;
    }

    public x placeholder(int i8) {
        if (!this.f29914e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i8 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.f29919j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f29915f = i8;
        return this;
    }

    public x priority(s.f fVar) {
        this.f29911b.priority(fVar);
        return this;
    }

    public x purgeable() {
        this.f29911b.purgeable();
        return this;
    }

    public x resize(int i8, int i9) {
        this.f29911b.resize(i8, i9);
        return this;
    }

    public x resizeDimen(int i8, int i9) {
        Resources resources = this.f29910a.f29842e.getResources();
        return resize(resources.getDimensionPixelSize(i8), resources.getDimensionPixelSize(i9));
    }

    public x rotate(float f8) {
        this.f29911b.rotate(f8);
        return this;
    }

    public x stableKey(String str) {
        this.f29911b.stableKey(str);
        return this;
    }

    public x tag(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        }
        if (this.f29921l != null) {
            throw new IllegalStateException("Tag already set.");
        }
        this.f29921l = obj;
        return this;
    }

    public x transform(F6.e eVar) {
        this.f29911b.transform(eVar);
        return this;
    }

    public x centerCrop(int i8) {
        this.f29911b.centerCrop(i8);
        return this;
    }

    public void fetch(F6.b bVar) {
        long jNanoTime = System.nanoTime();
        if (this.f29913d) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        }
        if (this.f29911b.a()) {
            if (!this.f29911b.b()) {
                this.f29911b.priority(s.f.LOW);
            }
            w wVarB = b(jNanoTime);
            String strH = D.h(wVarB, new StringBuilder());
            if (!o.a(this.f29917h) || this.f29910a.g(strH) == null) {
                this.f29910a.i(new h(this.f29910a, wVarB, this.f29917h, this.f29918i, this.f29921l, strH, bVar));
                return;
            }
            if (this.f29910a.f29851n) {
                D.u("Main", "completed", wVarB.f(), "from " + s.e.MEMORY);
            }
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public x rotate(float f8, float f9, float f10) {
        this.f29911b.rotate(f8, f9, f10);
        return this;
    }

    public x transform(List<? extends F6.e> list) {
        this.f29911b.transform(list);
        return this;
    }

    public x error(Drawable drawable) {
        if (drawable != null) {
            if (this.f29916g == 0) {
                this.f29920k = drawable;
                return this;
            }
            throw new IllegalStateException("Error image already set.");
        }
        throw new IllegalArgumentException("Error image may not be null.");
    }

    public x placeholder(Drawable drawable) {
        if (this.f29914e) {
            if (this.f29915f == 0) {
                this.f29919j = drawable;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalStateException("Already explicitly declared as no placeholder.");
    }

    public void into(RemoteViews remoteViews, int i8, int i9, Notification notification) {
        into(remoteViews, i8, i9, notification, null);
    }

    public void into(RemoteViews remoteViews, int i8, int i9, Notification notification, String str) {
        into(remoteViews, i8, i9, notification, str, null);
    }

    public void into(RemoteViews remoteViews, int i8, int i9, Notification notification, String str, F6.b bVar) {
        long jNanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification != null) {
            if (!this.f29913d) {
                if (this.f29919j == null && this.f29915f == 0 && this.f29920k == null) {
                    w wVarB = b(jNanoTime);
                    e(new v.b(this.f29910a, wVarB, remoteViews, i8, i9, notification, str, this.f29917h, this.f29918i, D.h(wVarB, new StringBuilder()), this.f29921l, this.f29916g, bVar));
                    return;
                }
                throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
            }
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        throw new IllegalArgumentException("Notification must not be null.");
    }

    public void into(RemoteViews remoteViews, int i8, int[] iArr) {
        into(remoteViews, i8, iArr, (F6.b) null);
    }

    public void into(RemoteViews remoteViews, int i8, int[] iArr, F6.b bVar) {
        long jNanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        }
        if (iArr != null) {
            if (!this.f29913d) {
                if (this.f29919j == null && this.f29915f == 0 && this.f29920k == null) {
                    w wVarB = b(jNanoTime);
                    e(new v.a(this.f29910a, wVarB, remoteViews, i8, iArr, this.f29917h, this.f29918i, D.h(wVarB, new StringBuilder()), this.f29921l, this.f29916g, bVar));
                    return;
                }
                throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
            }
            throw new IllegalStateException("Fit cannot be used with remote views.");
        }
        throw new IllegalArgumentException("appWidgetIds must not be null.");
    }

    public void into(ImageView imageView) {
        into(imageView, null);
    }

    public void into(ImageView imageView, F6.b bVar) {
        Bitmap bitmapG;
        long jNanoTime = System.nanoTime();
        D.c();
        if (imageView != null) {
            if (!this.f29911b.a()) {
                this.f29910a.cancelRequest(imageView);
                if (this.f29914e) {
                    t.d(imageView, c());
                    return;
                }
                return;
            }
            if (this.f29913d) {
                if (!this.f29911b.c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.f29911b.resize(width, height);
                    } else {
                        if (this.f29914e) {
                            t.d(imageView, c());
                        }
                        this.f29910a.c(imageView, new f(this, imageView, bVar));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            w wVarB = b(jNanoTime);
            String strG = D.g(wVarB);
            if (o.a(this.f29917h) && (bitmapG = this.f29910a.g(strG)) != null) {
                this.f29910a.cancelRequest(imageView);
                s sVar = this.f29910a;
                Context context = sVar.f29842e;
                s.e eVar = s.e.MEMORY;
                t.c(imageView, context, bitmapG, eVar, this.f29912c, sVar.f29850m);
                if (this.f29910a.f29851n) {
                    D.u("Main", "completed", wVarB.f(), "from " + eVar);
                }
                if (bVar != null) {
                    bVar.a();
                    return;
                }
                return;
            }
            if (this.f29914e) {
                t.d(imageView, c());
            }
            this.f29910a.e(new k(this.f29910a, imageView, wVarB, this.f29917h, this.f29918i, this.f29916g, this.f29920k, strG, this.f29921l, bVar, this.f29912c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }
}
