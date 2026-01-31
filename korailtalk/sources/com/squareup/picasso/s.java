package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.squareup.picasso.AbstractC5293a;
import com.squareup.picasso.v;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class s {

    /* renamed from: p */
    static final Handler f29836p = new a(Looper.getMainLooper());

    /* renamed from: q */
    static volatile s f29837q = null;

    /* renamed from: a */
    private final d f29838a;

    /* renamed from: b */
    private final g f29839b;

    /* renamed from: c */
    private final c f29840c;

    /* renamed from: d */
    private final List f29841d;

    /* renamed from: e */
    final Context f29842e;

    /* renamed from: f */
    final com.squareup.picasso.g f29843f;

    /* renamed from: g */
    final F6.a f29844g;

    /* renamed from: h */
    final A f29845h;

    /* renamed from: i */
    final Map f29846i;

    /* renamed from: j */
    final Map f29847j;

    /* renamed from: k */
    final ReferenceQueue f29848k;

    /* renamed from: l */
    final Bitmap.Config f29849l;

    /* renamed from: m */
    boolean f29850m;

    /* renamed from: n */
    volatile boolean f29851n;

    /* renamed from: o */
    boolean f29852o;

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 3) {
                AbstractC5293a abstractC5293a = (AbstractC5293a) message.obj;
                if (abstractC5293a.e().f29851n) {
                    D.u("Main", "canceled", abstractC5293a.f29742b.c(), "target got garbage collected");
                }
                abstractC5293a.f29741a.a(abstractC5293a.i());
                return;
            }
            int i9 = 0;
            if (i8 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i9 < size) {
                    RunnableC5295c runnableC5295c = (RunnableC5295c) list.get(i9);
                    runnableC5295c.f29763b.b(runnableC5295c);
                    i9++;
                }
                return;
            }
            if (i8 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i9 < size2) {
                AbstractC5293a abstractC5293a2 = (AbstractC5293a) list2.get(i9);
                abstractC5293a2.f29741a.h(abstractC5293a2);
                i9++;
            }
        }
    }

    public static class b {

        /* renamed from: a */
        private final Context f29853a;

        /* renamed from: b */
        private F6.c f29854b;

        /* renamed from: c */
        private ExecutorService f29855c;

        /* renamed from: d */
        private F6.a f29856d;

        /* renamed from: e */
        private d f29857e;

        /* renamed from: f */
        private g f29858f;

        /* renamed from: g */
        private List f29859g;

        /* renamed from: h */
        private Bitmap.Config f29860h;

        /* renamed from: i */
        private boolean f29861i;

        /* renamed from: j */
        private boolean f29862j;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f29853a = context.getApplicationContext();
        }

        public b addRequestHandler(y yVar) {
            if (yVar == null) {
                throw new IllegalArgumentException("RequestHandler must not be null.");
            }
            if (this.f29859g == null) {
                this.f29859g = new ArrayList();
            }
            if (this.f29859g.contains(yVar)) {
                throw new IllegalStateException("RequestHandler already registered.");
            }
            this.f29859g.add(yVar);
            return this;
        }

        public s build() {
            Context context = this.f29853a;
            if (this.f29854b == null) {
                this.f29854b = new r(context);
            }
            if (this.f29856d == null) {
                this.f29856d = new l(context);
            }
            if (this.f29855c == null) {
                this.f29855c = new u();
            }
            if (this.f29858f == null) {
                this.f29858f = g.IDENTITY;
            }
            A a9 = new A(this.f29856d);
            return new s(context, new com.squareup.picasso.g(context, this.f29855c, s.f29836p, this.f29854b, this.f29856d, a9), this.f29856d, this.f29857e, this.f29858f, this.f29859g, a9, this.f29860h, this.f29861i, this.f29862j);
        }

        public b defaultBitmapConfig(Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("Bitmap config must not be null.");
            }
            this.f29860h = config;
            return this;
        }

        public b downloader(F6.c cVar) {
            if (cVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f29854b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f29854b = cVar;
            return this;
        }

        public b executor(ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            }
            if (this.f29855c != null) {
                throw new IllegalStateException("Executor service already set.");
            }
            this.f29855c = executorService;
            return this;
        }

        public b indicatorsEnabled(boolean z8) {
            this.f29861i = z8;
            return this;
        }

        public b listener(d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.f29857e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.f29857e = dVar;
            return this;
        }

        public b loggingEnabled(boolean z8) {
            this.f29862j = z8;
            return this;
        }

        public b memoryCache(F6.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            }
            if (this.f29856d != null) {
                throw new IllegalStateException("Memory cache already set.");
            }
            this.f29856d = aVar;
            return this;
        }

        public b requestTransformer(g gVar) {
            if (gVar == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            }
            if (this.f29858f != null) {
                throw new IllegalStateException("Transformer already set.");
            }
            this.f29858f = gVar;
            return this;
        }
    }

    private static class c extends Thread {

        /* renamed from: a */
        private final ReferenceQueue f29863a;

        /* renamed from: b */
        private final Handler f29864b;

        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Exception f29865a;

            a(Exception exc) {
                this.f29865a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f29865a);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.f29863a = referenceQueue;
            this.f29864b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        void a() {
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC5293a.C0265a c0265a = (AbstractC5293a.C0265a) this.f29863a.remove(1000L);
                    Message messageObtainMessage = this.f29864b.obtainMessage();
                    if (c0265a != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = c0265a.f29753a;
                        this.f29864b.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e8) {
                    this.f29864b.post(new a(e8));
                    return;
                }
            }
        }
    }

    public interface d {
        void onImageLoadFailed(s sVar, Uri uri, Exception exc);
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(W.a.CATEGORY_MASK);


        /* renamed from: a */
        final int f29868a;

        e(int i8) {
            this.f29868a = i8;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {
        public static final g IDENTITY = new a();

        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.s.g
            public w transformRequest(w wVar) {
                return wVar;
            }
        }

        w transformRequest(w wVar);
    }

    s(Context context, com.squareup.picasso.g gVar, F6.a aVar, d dVar, g gVar2, List list, A a9, Bitmap.Config config, boolean z8, boolean z9) {
        this.f29842e = context;
        this.f29843f = gVar;
        this.f29844g = aVar;
        this.f29838a = dVar;
        this.f29839b = gVar2;
        this.f29849l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C5296d(context));
        arrayList.add(new n(context));
        arrayList.add(new com.squareup.picasso.e(context));
        arrayList.add(new C5294b(context));
        arrayList.add(new i(context));
        arrayList.add(new q(gVar.f29790d, a9));
        this.f29841d = Collections.unmodifiableList(arrayList);
        this.f29845h = a9;
        this.f29846i = new WeakHashMap();
        this.f29847j = new WeakHashMap();
        this.f29850m = z8;
        this.f29851n = z9;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f29848k = referenceQueue;
        c cVar = new c(referenceQueue, f29836p);
        this.f29840c = cVar;
        cVar.start();
    }

    private void d(Bitmap bitmap, e eVar, AbstractC5293a abstractC5293a, Exception exc) {
        if (abstractC5293a.j()) {
            return;
        }
        if (!abstractC5293a.k()) {
            this.f29846i.remove(abstractC5293a.i());
        }
        if (bitmap == null) {
            abstractC5293a.error(exc);
            if (this.f29851n) {
                D.u("Main", "errored", abstractC5293a.f29742b.c(), exc.getMessage());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        abstractC5293a.complete(bitmap, eVar);
        if (this.f29851n) {
            D.u("Main", "completed", abstractC5293a.f29742b.c(), "from " + eVar);
        }
    }

    public static s get() {
        if (f29837q == null) {
            synchronized (s.class) {
                try {
                    if (f29837q == null) {
                        Context context = PicassoProvider.f29740a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        f29837q = new b(context).build();
                    }
                } finally {
                }
            }
        }
        return f29837q;
    }

    public static void setSingletonInstance(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("Picasso must not be null.");
        }
        synchronized (s.class) {
            try {
                if (f29837q != null) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
                f29837q = sVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(Object obj) {
        D.c();
        AbstractC5293a abstractC5293a = (AbstractC5293a) this.f29846i.remove(obj);
        if (abstractC5293a != null) {
            abstractC5293a.a();
            this.f29843f.c(abstractC5293a);
        }
        if (obj instanceof ImageView) {
            com.squareup.picasso.f fVar = (com.squareup.picasso.f) this.f29847j.remove((ImageView) obj);
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public boolean areIndicatorsEnabled() {
        return this.f29850m;
    }

    void b(RunnableC5295c runnableC5295c) {
        AbstractC5293a abstractC5293aH = runnableC5295c.h();
        List listI = runnableC5295c.i();
        boolean z8 = (listI == null || listI.isEmpty()) ? false : true;
        if (abstractC5293aH != null || z8) {
            Uri uri = runnableC5295c.j().uri;
            Exception excK = runnableC5295c.k();
            Bitmap bitmapS = runnableC5295c.s();
            e eVarO = runnableC5295c.o();
            if (abstractC5293aH != null) {
                d(bitmapS, eVarO, abstractC5293aH, excK);
            }
            if (z8) {
                int size = listI.size();
                for (int i8 = 0; i8 < size; i8++) {
                    d(bitmapS, eVarO, (AbstractC5293a) listI.get(i8), excK);
                }
            }
            d dVar = this.f29838a;
            if (dVar == null || excK == null) {
                return;
            }
            dVar.onImageLoadFailed(this, uri, excK);
        }
    }

    void c(ImageView imageView, com.squareup.picasso.f fVar) {
        if (this.f29847j.containsKey(imageView)) {
            a(imageView);
        }
        this.f29847j.put(imageView, fVar);
    }

    public void cancelRequest(ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        a(imageView);
    }

    public void cancelTag(Object obj) {
        D.c();
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancel requests with null tag.");
        }
        ArrayList arrayList = new ArrayList(this.f29846i.values());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC5293a abstractC5293a = (AbstractC5293a) arrayList.get(i8);
            if (obj.equals(abstractC5293a.h())) {
                a(abstractC5293a.i());
            }
        }
        ArrayList arrayList2 = new ArrayList(this.f29847j.values());
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            com.squareup.picasso.f fVar = (com.squareup.picasso.f) arrayList2.get(i9);
            if (obj.equals(fVar.b())) {
                fVar.a();
            }
        }
    }

    void e(AbstractC5293a abstractC5293a) {
        Object objI = abstractC5293a.i();
        if (objI != null && this.f29846i.get(objI) != abstractC5293a) {
            a(objI);
            this.f29846i.put(objI, abstractC5293a);
        }
        i(abstractC5293a);
    }

    List f() {
        return this.f29841d;
    }

    Bitmap g(String str) {
        Bitmap bitmap = this.f29844g.get(str);
        if (bitmap != null) {
            this.f29845h.d();
        } else {
            this.f29845h.e();
        }
        return bitmap;
    }

    public F6.d getSnapshot() {
        return this.f29845h.a();
    }

    void h(AbstractC5293a abstractC5293a) {
        Bitmap bitmapG = o.a(abstractC5293a.f29745e) ? g(abstractC5293a.b()) : null;
        if (bitmapG == null) {
            e(abstractC5293a);
            if (this.f29851n) {
                D.t("Main", "resumed", abstractC5293a.f29742b.c());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        d(bitmapG, eVar, abstractC5293a, null);
        if (this.f29851n) {
            D.u("Main", "completed", abstractC5293a.f29742b.c(), "from " + eVar);
        }
    }

    void i(AbstractC5293a abstractC5293a) {
        this.f29843f.j(abstractC5293a);
    }

    public void invalidate(Uri uri) {
        if (uri != null) {
            this.f29844g.clearKeyUri(uri.toString());
        }
    }

    public boolean isLoggingEnabled() {
        return this.f29851n;
    }

    w j(w wVar) {
        w wVarTransformRequest = this.f29839b.transformRequest(wVar);
        if (wVarTransformRequest != null) {
            return wVarTransformRequest;
        }
        throw new IllegalStateException("Request transformer " + this.f29839b.getClass().getCanonicalName() + " returned null for " + wVar);
    }

    public x load(Uri uri) {
        return new x(this, uri, 0);
    }

    public void pauseTag(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("tag == null");
        }
        this.f29843f.g(obj);
    }

    public void resumeTag(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("tag == null");
        }
        this.f29843f.h(obj);
    }

    public void setIndicatorsEnabled(boolean z8) {
        this.f29850m = z8;
    }

    public void setLoggingEnabled(boolean z8) {
        this.f29851n = z8;
    }

    public void shutdown() {
        if (this == f29837q) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.f29852o) {
            return;
        }
        this.f29844g.clear();
        this.f29840c.a();
        this.f29845h.n();
        this.f29843f.z();
        Iterator it = this.f29847j.values().iterator();
        while (it.hasNext()) {
            ((com.squareup.picasso.f) it.next()).a();
        }
        this.f29847j.clear();
        this.f29852o = true;
    }

    public void invalidate(String str) {
        if (str != null) {
            invalidate(Uri.parse(str));
        }
    }

    public x load(String str) {
        if (str == null) {
            return new x(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return load(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void cancelRequest(B b9) {
        if (b9 != null) {
            a(b9);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    public void invalidate(File file) {
        if (file != null) {
            invalidate(Uri.fromFile(file));
            return;
        }
        throw new IllegalArgumentException("file == null");
    }

    public void cancelRequest(RemoteViews remoteViews, int i8) {
        if (remoteViews != null) {
            a(new v.c(remoteViews, i8));
            return;
        }
        throw new IllegalArgumentException("remoteViews cannot be null.");
    }

    public x load(File file) {
        if (file == null) {
            return new x(this, null, 0);
        }
        return load(Uri.fromFile(file));
    }

    public x load(int i8) {
        if (i8 != 0) {
            return new x(this, null, i8);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }
}
