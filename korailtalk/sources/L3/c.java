package l3;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.view.h;
import androidx.core.os.r;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1101a;
import com.google.firebase.components.ComponentDiscoveryService;
import com.kakao.sdk.common.Constants;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n3.g;
import n3.i;
import n3.m;
import n3.t;
import o2.C6031c;
import o2.n;
import o2.p;
import s3.C6214b;
import x3.C6490a;
import y3.C6534c;

/* loaded from: classes2.dex */
public class c {
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";

    /* renamed from: j */
    private static final Object f33956j = new Object();

    /* renamed from: k */
    private static final Executor f33957k = new d();

    /* renamed from: l */
    static final Map f33958l = new O.a();

    /* renamed from: a */
    private final Context f33959a;

    /* renamed from: b */
    private final String f33960b;

    /* renamed from: c */
    private final f f33961c;

    /* renamed from: d */
    private final m f33962d;

    /* renamed from: g */
    private final t f33965g;

    /* renamed from: e */
    private final AtomicBoolean f33963e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f33964f = new AtomicBoolean();

    /* renamed from: h */
    private final List f33966h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final List f33967i = new CopyOnWriteArrayList();

    public interface b {
        void onBackgroundStateChanged(boolean z8);
    }

    /* renamed from: l3.c$c */
    private static class C0345c implements ComponentCallbacks2C1101a.InterfaceC0194a {

        /* renamed from: a */
        private static AtomicReference f33968a = new AtomicReference();

        private C0345c() {
        }

        public static void b(Context context) {
            if (n.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f33968a.get() == null) {
                    C0345c c0345c = new C0345c();
                    if (h.a(f33968a, null, c0345c)) {
                        ComponentCallbacks2C1101a.initialize(application);
                        ComponentCallbacks2C1101a.getInstance().addListener(c0345c);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1101a.InterfaceC0194a
        public void onBackgroundStateChanged(boolean z8) {
            synchronized (c.f33956j) {
                try {
                    Iterator it = new ArrayList(c.f33958l.values()).iterator();
                    while (it.hasNext()) {
                        c cVar = (c) it.next();
                        if (cVar.f33963e.get()) {
                            cVar.j(z8);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class d implements Executor {

        /* renamed from: a */
        private static final Handler f33969a = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f33969a.post(runnable);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static class e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference f33970b = new AtomicReference();

        /* renamed from: a */
        private final Context f33971a;

        public e(Context context) {
            this.f33971a = context;
        }

        public static void b(Context context) {
            if (f33970b.get() == null) {
                e eVar = new e(context);
                if (h.a(f33970b, null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (c.f33956j) {
                try {
                    Iterator it = c.f33958l.values().iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            unregister();
        }

        public void unregister() {
            this.f33971a.unregisterReceiver(this);
        }
    }

    protected c(Context context, String str, f fVar) {
        this.f33959a = (Context) AbstractC5683p.checkNotNull(context);
        this.f33960b = AbstractC5683p.checkNotEmpty(str);
        this.f33961c = (f) AbstractC5683p.checkNotNull(fVar);
        List<i> listDiscover = g.forContext(context, ComponentDiscoveryService.class).discover();
        String strDetectVersion = y3.e.detectVersion();
        this.f33962d = new m(f33957k, listDiscover, n3.e.of(context, Context.class, new Class[0]), n3.e.of(this, c.class, new Class[0]), n3.e.of(fVar, f.class, new Class[0]), y3.g.create("fire-android", ""), y3.g.create("fire-core", "19.3.0"), strDetectVersion != null ? y3.g.create(Constants.SDK_TYPE_KOTLIN, strDetectVersion) : null, C6534c.component(), C6214b.component());
        this.f33965g = new t(l3.b.lambdaFactory$(this, context));
    }

    public static void clearInstancesForTest() {
        synchronized (f33956j) {
            f33958l.clear();
        }
    }

    private void e() {
        AbstractC5683p.checkState(!this.f33964f.get(), "FirebaseApp was deleted");
    }

    private static List f() {
        ArrayList arrayList = new ArrayList();
        synchronized (f33956j) {
            try {
                Iterator it = f33958l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((c) it.next()).getName());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public void g() {
        if (r.isUserUnlocked(this.f33959a)) {
            this.f33962d.initializeEagerComponents(isDefaultApp());
        } else {
            e.b(this.f33959a);
        }
    }

    public static List<c> getApps(Context context) {
        ArrayList arrayList;
        synchronized (f33956j) {
            arrayList = new ArrayList(f33958l.values());
        }
        return arrayList;
    }

    public static c getInstance() {
        c cVar;
        synchronized (f33956j) {
            try {
                cVar = (c) f33958l.get(DEFAULT_APP_NAME);
                if (cVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + p.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    static /* synthetic */ C6490a h(c cVar, Context context) {
        return new C6490a(context, cVar.getPersistenceKey(), (r3.c) cVar.f33962d.get(r3.c.class));
    }

    private static String i(String str) {
        return str.trim();
    }

    public static c initializeApp(Context context) {
        synchronized (f33956j) {
            try {
                if (f33958l.containsKey(DEFAULT_APP_NAME)) {
                    return getInstance();
                }
                f fVarFromResource = f.fromResource(context);
                if (fVarFromResource == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return initializeApp(context, fVarFromResource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(boolean z8) {
        Iterator it = this.f33966h.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
    }

    private void k() {
        Iterator it = this.f33967i.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
    }

    public void addBackgroundStateChangeListener(b bVar) {
        e();
        if (this.f33963e.get() && ComponentCallbacks2C1101a.getInstance().isInBackground()) {
            bVar.onBackgroundStateChanged(true);
        }
        this.f33966h.add(bVar);
    }

    public void addLifecycleEventListener(l3.d dVar) {
        e();
        AbstractC5683p.checkNotNull(dVar);
        this.f33967i.add(dVar);
    }

    public void delete() {
        if (this.f33964f.compareAndSet(false, true)) {
            synchronized (f33956j) {
                f33958l.remove(this.f33960b);
            }
            k();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f33960b.equals(((c) obj).getName());
        }
        return false;
    }

    public <T> T get(Class<T> cls) {
        e();
        return (T) this.f33962d.get(cls);
    }

    public Context getApplicationContext() {
        e();
        return this.f33959a;
    }

    public String getName() {
        e();
        return this.f33960b;
    }

    public f getOptions() {
        e();
        return this.f33961c;
    }

    public String getPersistenceKey() {
        return C6031c.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + C6031c.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.f33960b.hashCode();
    }

    public boolean isDataCollectionDefaultEnabled() {
        e();
        return ((C6490a) this.f33965g.get()).isEnabled();
    }

    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    public void removeBackgroundStateChangeListener(b bVar) {
        e();
        this.f33966h.remove(bVar);
    }

    public void removeLifecycleEventListener(l3.d dVar) {
        e();
        AbstractC5683p.checkNotNull(dVar);
        this.f33967i.remove(dVar);
    }

    public void setAutomaticResourceManagementEnabled(boolean z8) {
        e();
        if (this.f33963e.compareAndSet(!z8, z8)) {
            boolean zIsInBackground = ComponentCallbacks2C1101a.getInstance().isInBackground();
            if (z8 && zIsInBackground) {
                j(true);
            } else {
                if (z8 || !zIsInBackground) {
                    return;
                }
                j(false);
            }
        }
    }

    public void setDataCollectionDefaultEnabled(boolean z8) {
        e();
        ((C6490a) this.f33965g.get()).setEnabled(z8);
    }

    public String toString() {
        return AbstractC5681n.toStringHelper(this).add("name", this.f33960b).add("options", this.f33961c).toString();
    }

    public static String getPersistenceKey(String str, f fVar) {
        return C6031c.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + C6031c.encodeUrlSafeNoPadding(fVar.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public static c getInstance(String str) {
        c cVar;
        String str2;
        synchronized (f33956j) {
            try {
                cVar = (c) f33958l.get(i(str));
                if (cVar == null) {
                    List listF = f();
                    if (listF.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listF);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
            } finally {
            }
        }
        return cVar;
    }

    public static c initializeApp(Context context, f fVar) {
        return initializeApp(context, fVar, DEFAULT_APP_NAME);
    }

    public static c initializeApp(Context context, f fVar, String str) {
        c cVar;
        C0345c.b(context);
        String strI = i(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f33956j) {
            Map map = f33958l;
            AbstractC5683p.checkState(!map.containsKey(strI), "FirebaseApp name " + strI + " already exists!");
            AbstractC5683p.checkNotNull(context, "Application context cannot be null.");
            cVar = new c(context, strI, fVar);
            map.put(strI, cVar);
        }
        cVar.g();
        return cVar;
    }
}
