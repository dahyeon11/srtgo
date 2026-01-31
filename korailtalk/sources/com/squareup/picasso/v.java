package com.squareup.picasso;

import android.app.Notification;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.squareup.picasso.s;

/* loaded from: classes.dex */
abstract class v extends AbstractC5293a {

    /* renamed from: m */
    final RemoteViews f29879m;

    /* renamed from: n */
    final int f29880n;

    /* renamed from: o */
    private c f29881o;

    static class a extends v {

        /* renamed from: p */
        private final int[] f29882p;

        a(s sVar, w wVar, RemoteViews remoteViews, int i8, int[] iArr, int i9, int i10, String str, Object obj, int i11, F6.b bVar) {
            super(sVar, wVar, remoteViews, i8, i11, i9, i10, obj, str, bVar);
            this.f29882p = iArr;
        }

        @Override // com.squareup.picasso.AbstractC5293a
        /* bridge */ /* synthetic */ Object i() {
            return super.l();
        }

        @Override // com.squareup.picasso.v
        void n() {
            AppWidgetManager.getInstance(this.f29741a.f29842e).updateAppWidget(this.f29882p, this.f29879m);
        }
    }

    static class b extends v {

        /* renamed from: p */
        private final int f29883p;

        /* renamed from: q */
        private final String f29884q;

        /* renamed from: r */
        private final Notification f29885r;

        b(s sVar, w wVar, RemoteViews remoteViews, int i8, int i9, Notification notification, String str, int i10, int i11, String str2, Object obj, int i12, F6.b bVar) {
            super(sVar, wVar, remoteViews, i8, i12, i10, i11, obj, str2, bVar);
            this.f29883p = i9;
            this.f29884q = str;
            this.f29885r = notification;
        }

        @Override // com.squareup.picasso.AbstractC5293a
        /* bridge */ /* synthetic */ Object i() {
            return super.l();
        }

        @Override // com.squareup.picasso.v
        void n() {
            ((NotificationManager) D.o(this.f29741a.f29842e, "notification")).notify(this.f29884q, this.f29883p, this.f29885r);
        }
    }

    static class c {

        /* renamed from: a */
        final RemoteViews f29886a;

        /* renamed from: b */
        final int f29887b;

        c(RemoteViews remoteViews, int i8) {
            this.f29886a = remoteViews;
            this.f29887b = i8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f29887b == cVar.f29887b && this.f29886a.equals(cVar.f29886a);
        }

        public int hashCode() {
            return (this.f29886a.hashCode() * 31) + this.f29887b;
        }
    }

    v(s sVar, w wVar, RemoteViews remoteViews, int i8, int i9, int i10, int i11, Object obj, String str, F6.b bVar) {
        super(sVar, null, wVar, i10, i11, i9, null, str, obj, false);
        this.f29879m = remoteViews;
        this.f29880n = i8;
    }

    @Override // com.squareup.picasso.AbstractC5293a
    void a() {
        super.a();
    }

    @Override // com.squareup.picasso.AbstractC5293a
    void complete(Bitmap bitmap, s.e eVar) {
        this.f29879m.setImageViewBitmap(this.f29880n, bitmap);
        n();
    }

    @Override // com.squareup.picasso.AbstractC5293a
    public void error(Exception exc) {
        int i8 = this.f29747g;
        if (i8 != 0) {
            m(i8);
        }
    }

    c l() {
        if (this.f29881o == null) {
            this.f29881o = new c(this.f29879m, this.f29880n);
        }
        return this.f29881o;
    }

    void m(int i8) {
        this.f29879m.setImageViewResource(this.f29880n, i8);
        n();
    }

    abstract void n();
}
