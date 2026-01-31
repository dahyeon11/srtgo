package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class A {

    /* renamed from: a */
    final HandlerThread f29720a;

    /* renamed from: b */
    final F6.a f29721b;

    /* renamed from: c */
    final Handler f29722c;

    /* renamed from: d */
    long f29723d;

    /* renamed from: e */
    long f29724e;

    /* renamed from: f */
    long f29725f;

    /* renamed from: g */
    long f29726g;

    /* renamed from: h */
    long f29727h;

    /* renamed from: i */
    long f29728i;

    /* renamed from: j */
    long f29729j;

    /* renamed from: k */
    long f29730k;

    /* renamed from: l */
    int f29731l;

    /* renamed from: m */
    int f29732m;

    /* renamed from: n */
    int f29733n;

    private static class a extends Handler {

        /* renamed from: a */
        private final A f29734a;

        /* renamed from: com.squareup.picasso.A$a$a */
        class RunnableC0264a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f29735a;

            RunnableC0264a(Message message) {
                this.f29735a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f29735a.what);
            }
        }

        a(Looper looper, A a9) {
            super(looper);
            this.f29734a = a9;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 0) {
                this.f29734a.j();
                return;
            }
            if (i8 == 1) {
                this.f29734a.k();
                return;
            }
            if (i8 == 2) {
                this.f29734a.h(message.arg1);
                return;
            }
            if (i8 == 3) {
                this.f29734a.i(message.arg1);
            } else if (i8 != 4) {
                s.f29836p.post(new RunnableC0264a(message));
            } else {
                this.f29734a.l((Long) message.obj);
            }
        }
    }

    A(F6.a aVar) {
        this.f29721b = aVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f29720a = handlerThread;
        handlerThread.start();
        D.i(handlerThread.getLooper());
        this.f29722c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i8, long j8) {
        return j8 / i8;
    }

    private void m(Bitmap bitmap, int i8) {
        int iJ = D.j(bitmap);
        Handler handler = this.f29722c;
        handler.sendMessage(handler.obtainMessage(i8, iJ, 0));
    }

    F6.d a() {
        return new F6.d(this.f29721b.maxSize(), this.f29721b.size(), this.f29723d, this.f29724e, this.f29725f, this.f29726g, this.f29727h, this.f29728i, this.f29729j, this.f29730k, this.f29731l, this.f29732m, this.f29733n, System.currentTimeMillis());
    }

    void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    void d() {
        this.f29722c.sendEmptyMessage(0);
    }

    void e() {
        this.f29722c.sendEmptyMessage(1);
    }

    void f(long j8) {
        Handler handler = this.f29722c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j8)));
    }

    void h(long j8) {
        int i8 = this.f29732m + 1;
        this.f29732m = i8;
        long j9 = this.f29726g + j8;
        this.f29726g = j9;
        this.f29729j = g(i8, j9);
    }

    void i(long j8) {
        this.f29733n++;
        long j9 = this.f29727h + j8;
        this.f29727h = j9;
        this.f29730k = g(this.f29732m, j9);
    }

    void j() {
        this.f29723d++;
    }

    void k() {
        this.f29724e++;
    }

    void l(Long l8) {
        this.f29731l++;
        long jLongValue = this.f29725f + l8.longValue();
        this.f29725f = jLongValue;
        this.f29728i = g(this.f29731l, jLongValue);
    }

    void n() {
        this.f29720a.quit();
    }
}
