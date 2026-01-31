package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
class g {

    /* renamed from: a */
    final c f29787a;

    /* renamed from: b */
    final Context f29788b;

    /* renamed from: c */
    final ExecutorService f29789c;

    /* renamed from: d */
    final F6.c f29790d;

    /* renamed from: e */
    final Map f29791e;

    /* renamed from: f */
    final Map f29792f;

    /* renamed from: g */
    final Map f29793g;

    /* renamed from: h */
    final Set f29794h;

    /* renamed from: i */
    final Handler f29795i;

    /* renamed from: j */
    final Handler f29796j;

    /* renamed from: k */
    final F6.a f29797k;

    /* renamed from: l */
    final A f29798l;

    /* renamed from: m */
    final List f29799m;

    /* renamed from: n */
    final d f29800n;

    /* renamed from: o */
    final boolean f29801o;

    /* renamed from: p */
    boolean f29802p;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f29800n.b();
        }
    }

    private static class b extends Handler {

        /* renamed from: a */
        private final g f29804a;

        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f29805a;

            a(Message message) {
                this.f29805a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f29805a.what);
            }
        }

        b(Looper looper, g gVar) {
            super(looper);
            this.f29804a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f29804a.x((AbstractC5293a) message.obj);
                    break;
                case 2:
                    this.f29804a.q((AbstractC5293a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    s.f29836p.post(new a(message));
                    break;
                case 4:
                    this.f29804a.r((RunnableC5295c) message.obj);
                    break;
                case 5:
                    this.f29804a.w((RunnableC5295c) message.obj);
                    break;
                case 6:
                    this.f29804a.s((RunnableC5295c) message.obj, false);
                    break;
                case 7:
                    this.f29804a.p();
                    break;
                case 9:
                    this.f29804a.t((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f29804a.o(message.arg1 == 1);
                    break;
                case 11:
                    this.f29804a.u(message.obj);
                    break;
                case 12:
                    this.f29804a.v(message.obj);
                    break;
            }
        }
    }

    static class c extends HandlerThread {
        c() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class d extends BroadcastReceiver {

        /* renamed from: a */
        private final g f29807a;

        d(g gVar) {
            this.f29807a = gVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f29807a.f29801o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f29807a.f29788b.registerReceiver(this, intentFilter);
        }

        void b() {
            this.f29807a.f29788b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f29807a.b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f29807a.f(((ConnectivityManager) D.o(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    g(Context context, ExecutorService executorService, Handler handler, F6.c cVar, F6.a aVar, A a9) {
        c cVar2 = new c();
        this.f29787a = cVar2;
        cVar2.start();
        D.i(cVar2.getLooper());
        this.f29788b = context;
        this.f29789c = executorService;
        this.f29791e = new LinkedHashMap();
        this.f29792f = new WeakHashMap();
        this.f29793g = new WeakHashMap();
        this.f29794h = new LinkedHashSet();
        this.f29795i = new b(cVar2.getLooper(), this);
        this.f29790d = cVar;
        this.f29796j = handler;
        this.f29797k = aVar;
        this.f29798l = a9;
        this.f29799m = new ArrayList(4);
        this.f29802p = D.q(context);
        this.f29801o = D.p(context, "android.permission.ACCESS_NETWORK_STATE");
        d dVar = new d(this);
        this.f29800n = dVar;
        dVar.a();
    }

    private void a(RunnableC5295c runnableC5295c) {
        if (runnableC5295c.u()) {
            return;
        }
        Bitmap bitmap = runnableC5295c.f29774m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f29799m.add(runnableC5295c);
        if (this.f29795i.hasMessages(7)) {
            return;
        }
        this.f29795i.sendEmptyMessageDelayed(7, 200L);
    }

    private void k() {
        if (this.f29792f.isEmpty()) {
            return;
        }
        Iterator it = this.f29792f.values().iterator();
        while (it.hasNext()) {
            AbstractC5293a abstractC5293a = (AbstractC5293a) it.next();
            it.remove();
            if (abstractC5293a.e().f29851n) {
                D.t("Dispatcher", "replaying", abstractC5293a.g().c());
            }
            y(abstractC5293a, false);
        }
    }

    private void l(List list) {
        if (list == null || list.isEmpty() || !((RunnableC5295c) list.get(0)).q().f29851n) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RunnableC5295c runnableC5295c = (RunnableC5295c) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(D.k(runnableC5295c));
        }
        D.t("Dispatcher", "delivered", sb.toString());
    }

    private void m(AbstractC5293a abstractC5293a) {
        Object objI = abstractC5293a.i();
        if (objI != null) {
            abstractC5293a.f29751k = true;
            this.f29792f.put(objI, abstractC5293a);
        }
    }

    private void n(RunnableC5295c runnableC5295c) {
        AbstractC5293a abstractC5293aH = runnableC5295c.h();
        if (abstractC5293aH != null) {
            m(abstractC5293aH);
        }
        List listI = runnableC5295c.i();
        if (listI != null) {
            int size = listI.size();
            for (int i8 = 0; i8 < size; i8++) {
                m((AbstractC5293a) listI.get(i8));
            }
        }
    }

    void b(boolean z8) {
        Handler handler = this.f29795i;
        handler.sendMessage(handler.obtainMessage(10, z8 ? 1 : 0, 0));
    }

    void c(AbstractC5293a abstractC5293a) {
        Handler handler = this.f29795i;
        handler.sendMessage(handler.obtainMessage(2, abstractC5293a));
    }

    void d(RunnableC5295c runnableC5295c) {
        Handler handler = this.f29795i;
        handler.sendMessage(handler.obtainMessage(4, runnableC5295c));
    }

    void e(RunnableC5295c runnableC5295c) {
        Handler handler = this.f29795i;
        handler.sendMessage(handler.obtainMessage(6, runnableC5295c));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f29795i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void g(Object obj) {
        Handler handler = this.f29795i;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    void h(Object obj) {
        Handler handler = this.f29795i;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    void i(RunnableC5295c runnableC5295c) {
        Handler handler = this.f29795i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC5295c), 500L);
    }

    void j(AbstractC5293a abstractC5293a) {
        Handler handler = this.f29795i;
        handler.sendMessage(handler.obtainMessage(1, abstractC5293a));
    }

    void o(boolean z8) {
        this.f29802p = z8;
    }

    void p() {
        ArrayList arrayList = new ArrayList(this.f29799m);
        this.f29799m.clear();
        Handler handler = this.f29796j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        l(arrayList);
    }

    void q(AbstractC5293a abstractC5293a) {
        String strB = abstractC5293a.b();
        RunnableC5295c runnableC5295c = (RunnableC5295c) this.f29791e.get(strB);
        if (runnableC5295c != null) {
            runnableC5295c.f(abstractC5293a);
            if (runnableC5295c.c()) {
                this.f29791e.remove(strB);
                if (abstractC5293a.e().f29851n) {
                    D.t("Dispatcher", "canceled", abstractC5293a.g().c());
                }
            }
        }
        if (this.f29794h.contains(abstractC5293a.h())) {
            this.f29793g.remove(abstractC5293a.i());
            if (abstractC5293a.e().f29851n) {
                D.u("Dispatcher", "canceled", abstractC5293a.g().c(), "because paused request got canceled");
            }
        }
        AbstractC5293a abstractC5293a2 = (AbstractC5293a) this.f29792f.remove(abstractC5293a.i());
        if (abstractC5293a2 == null || !abstractC5293a2.e().f29851n) {
            return;
        }
        D.u("Dispatcher", "canceled", abstractC5293a2.g().c(), "from replaying");
    }

    void r(RunnableC5295c runnableC5295c) {
        if (o.b(runnableC5295c.p())) {
            this.f29797k.set(runnableC5295c.n(), runnableC5295c.s());
        }
        this.f29791e.remove(runnableC5295c.n());
        a(runnableC5295c);
        if (runnableC5295c.q().f29851n) {
            D.u("Dispatcher", "batched", D.k(runnableC5295c), "for completion");
        }
    }

    void s(RunnableC5295c runnableC5295c, boolean z8) {
        if (runnableC5295c.q().f29851n) {
            String strK = D.k(runnableC5295c);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z8 ? " (will replay)" : "");
            D.u("Dispatcher", "batched", strK, sb.toString());
        }
        this.f29791e.remove(runnableC5295c.n());
        a(runnableC5295c);
    }

    void t(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f29789c;
        if (executorService instanceof u) {
            ((u) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        k();
    }

    void u(Object obj) {
        if (this.f29794h.add(obj)) {
            Iterator it = this.f29791e.values().iterator();
            while (it.hasNext()) {
                RunnableC5295c runnableC5295c = (RunnableC5295c) it.next();
                boolean z8 = runnableC5295c.q().f29851n;
                AbstractC5293a abstractC5293aH = runnableC5295c.h();
                List listI = runnableC5295c.i();
                boolean z9 = (listI == null || listI.isEmpty()) ? false : true;
                if (abstractC5293aH != null || z9) {
                    if (abstractC5293aH != null && abstractC5293aH.h().equals(obj)) {
                        runnableC5295c.f(abstractC5293aH);
                        this.f29793g.put(abstractC5293aH.i(), abstractC5293aH);
                        if (z8) {
                            D.u("Dispatcher", "paused", abstractC5293aH.f29742b.c(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z9) {
                        for (int size = listI.size() - 1; size >= 0; size--) {
                            AbstractC5293a abstractC5293a = (AbstractC5293a) listI.get(size);
                            if (abstractC5293a.h().equals(obj)) {
                                runnableC5295c.f(abstractC5293a);
                                this.f29793g.put(abstractC5293a.i(), abstractC5293a);
                                if (z8) {
                                    D.u("Dispatcher", "paused", abstractC5293a.f29742b.c(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (runnableC5295c.c()) {
                        it.remove();
                        if (z8) {
                            D.u("Dispatcher", "canceled", D.k(runnableC5295c), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void v(Object obj) {
        if (this.f29794h.remove(obj)) {
            Iterator it = this.f29793g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                AbstractC5293a abstractC5293a = (AbstractC5293a) it.next();
                if (abstractC5293a.h().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractC5293a);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f29796j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    void w(RunnableC5295c runnableC5295c) {
        if (runnableC5295c.u()) {
            return;
        }
        boolean z8 = false;
        if (this.f29789c.isShutdown()) {
            s(runnableC5295c, false);
            return;
        }
        if (runnableC5295c.w(this.f29802p, this.f29801o ? ((ConnectivityManager) D.o(this.f29788b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (runnableC5295c.q().f29851n) {
                D.t("Dispatcher", "retrying", D.k(runnableC5295c));
            }
            if (runnableC5295c.k() instanceof q.a) {
                runnableC5295c.f29770i |= p.NO_CACHE.f29828a;
            }
            runnableC5295c.f29775n = this.f29789c.submit(runnableC5295c);
            return;
        }
        if (this.f29801o && runnableC5295c.x()) {
            z8 = true;
        }
        s(runnableC5295c, z8);
        if (z8) {
            n(runnableC5295c);
        }
    }

    void x(AbstractC5293a abstractC5293a) {
        y(abstractC5293a, true);
    }

    void y(AbstractC5293a abstractC5293a, boolean z8) {
        if (this.f29794h.contains(abstractC5293a.h())) {
            this.f29793g.put(abstractC5293a.i(), abstractC5293a);
            if (abstractC5293a.e().f29851n) {
                D.u("Dispatcher", "paused", abstractC5293a.f29742b.c(), "because tag '" + abstractC5293a.h() + "' is paused");
                return;
            }
            return;
        }
        RunnableC5295c runnableC5295c = (RunnableC5295c) this.f29791e.get(abstractC5293a.b());
        if (runnableC5295c != null) {
            runnableC5295c.b(abstractC5293a);
            return;
        }
        if (this.f29789c.isShutdown()) {
            if (abstractC5293a.e().f29851n) {
                D.u("Dispatcher", "ignored", abstractC5293a.f29742b.c(), "because shut down");
                return;
            }
            return;
        }
        RunnableC5295c runnableC5295cG = RunnableC5295c.g(abstractC5293a.e(), this, this.f29797k, this.f29798l, abstractC5293a);
        runnableC5295cG.f29775n = this.f29789c.submit(runnableC5295cG);
        this.f29791e.put(abstractC5293a.b(), runnableC5295cG);
        if (z8) {
            this.f29792f.remove(abstractC5293a.i());
        }
        if (abstractC5293a.e().f29851n) {
            D.t("Dispatcher", "enqueued", abstractC5293a.f29742b.c());
        }
    }

    void z() {
        ExecutorService executorService = this.f29789c;
        if (executorService instanceof u) {
            executorService.shutdown();
        }
        this.f29790d.shutdown();
        this.f29787a.quit();
        s.f29836p.post(new a());
    }
}
