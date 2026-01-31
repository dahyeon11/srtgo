package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
/* loaded from: classes.dex */
abstract class AbstractC5293a {

    /* renamed from: a */
    final s f29741a;

    /* renamed from: b */
    final w f29742b;

    /* renamed from: c */
    final WeakReference f29743c;

    /* renamed from: d */
    final boolean f29744d;

    /* renamed from: e */
    final int f29745e;

    /* renamed from: f */
    final int f29746f;

    /* renamed from: g */
    final int f29747g;

    /* renamed from: h */
    final Drawable f29748h;

    /* renamed from: i */
    final String f29749i;

    /* renamed from: j */
    final Object f29750j;

    /* renamed from: k */
    boolean f29751k;

    /* renamed from: l */
    boolean f29752l;

    /* renamed from: com.squareup.picasso.a$a */
    static class C0265a extends WeakReference {

        /* renamed from: a */
        final AbstractC5293a f29753a;

        C0265a(AbstractC5293a abstractC5293a, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f29753a = abstractC5293a;
        }
    }

    AbstractC5293a(s sVar, Object obj, w wVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj2, boolean z8) {
        this.f29741a = sVar;
        this.f29742b = wVar;
        this.f29743c = obj == null ? null : new C0265a(this, obj, sVar.f29848k);
        this.f29745e = i8;
        this.f29746f = i9;
        this.f29744d = z8;
        this.f29747g = i10;
        this.f29748h = drawable;
        this.f29749i = str;
        this.f29750j = obj2 == null ? this : obj2;
    }

    void a() {
        this.f29752l = true;
    }

    String b() {
        return this.f29749i;
    }

    int c() {
        return this.f29745e;
    }

    abstract void complete(Bitmap bitmap, s.e eVar);

    int d() {
        return this.f29746f;
    }

    s e() {
        return this.f29741a;
    }

    abstract void error(Exception exc);

    s.f f() {
        return this.f29742b.priority;
    }

    w g() {
        return this.f29742b;
    }

    Object h() {
        return this.f29750j;
    }

    Object i() {
        WeakReference weakReference = this.f29743c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    boolean j() {
        return this.f29752l;
    }

    boolean k() {
        return this.f29751k;
    }
}
