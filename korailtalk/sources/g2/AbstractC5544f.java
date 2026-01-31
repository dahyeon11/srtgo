package g2;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.ActivityC1010e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC1103b;
import com.google.android.gms.common.api.internal.C1106d;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.common.util.VisibleForTesting;
import f2.C5392b;
import f2.C5397g;
import g2.C5539a;
import h2.C5588e;
import h2.InterfaceC5587d;
import h2.InterfaceC5591h;
import h2.InterfaceC5594k;
import h2.T;
import i2.AbstractC5683p;
import i2.C5642A;
import i2.C5671d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: g2.f */
/* loaded from: classes.dex */
public abstract class AbstractC5544f {
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* renamed from: a */
    private static final Set f31294a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: g2.f$b */
    public interface b extends InterfaceC5587d {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @Override // h2.InterfaceC5587d
        /* synthetic */ void onConnected(Bundle bundle);

        @Override // h2.InterfaceC5587d
        /* synthetic */ void onConnectionSuspended(int i8);
    }

    /* renamed from: g2.f$c */
    public interface c extends InterfaceC5591h {
        @Override // h2.InterfaceC5591h
        /* synthetic */ void onConnectionFailed(C5392b c5392b);
    }

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Set<AbstractC5544f> set = f31294a;
        synchronized (set) {
            try {
                String strConcat = String.valueOf(str).concat("  ");
                int i8 = 0;
                for (AbstractC5544f abstractC5544f : set) {
                    printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i8);
                    abstractC5544f.dump(strConcat, fileDescriptor, printWriter, strArr);
                    i8++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Set<AbstractC5544f> getAllClients() {
        Set<AbstractC5544f> set = f31294a;
        synchronized (set) {
        }
        return set;
    }

    public abstract C5392b blockingConnect();

    public abstract C5392b blockingConnect(long j8, TimeUnit timeUnit);

    public abstract AbstractC5547i clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i8) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public <A extends C5539a.b, R extends n, T extends AbstractC1103b> T enqueue(T t8) {
        throw new UnsupportedOperationException();
    }

    public <A extends C5539a.b, T extends AbstractC1103b> T execute(T t8) {
        throw new UnsupportedOperationException();
    }

    public <C extends C5539a.f> C getClient(C5539a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public abstract C5392b getConnectionResult(C5539a c5539a);

    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    public boolean hasApi(C5539a c5539a) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(C5539a c5539a);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(b bVar);

    public abstract boolean isConnectionFailedListenerRegistered(c cVar);

    public boolean maybeSignIn(InterfaceC5594k interfaceC5594k) {
        throw new UnsupportedOperationException();
    }

    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(b bVar);

    public abstract void registerConnectionFailedListener(c cVar);

    public <L> C1106d registerListener(L l8) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(ActivityC1010e activityC1010e);

    public abstract void unregisterConnectionCallbacks(b bVar);

    public abstract void unregisterConnectionFailedListener(c cVar);

    public void zao(j0 j0Var) {
        throw new UnsupportedOperationException();
    }

    public void zap(j0 j0Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g2.f$a */
    public static final class a {

        /* renamed from: a */
        private Account f31295a;

        /* renamed from: b */
        private final Set f31296b;

        /* renamed from: c */
        private final Set f31297c;

        /* renamed from: d */
        private int f31298d;

        /* renamed from: e */
        private View f31299e;

        /* renamed from: f */
        private String f31300f;

        /* renamed from: g */
        private String f31301g;

        /* renamed from: h */
        private final Map f31302h;

        /* renamed from: i */
        private final Context f31303i;

        /* renamed from: j */
        private final Map f31304j;

        /* renamed from: k */
        private C5588e f31305k;

        /* renamed from: l */
        private int f31306l;

        /* renamed from: m */
        private c f31307m;

        /* renamed from: n */
        private Looper f31308n;

        /* renamed from: o */
        private C5397g f31309o;

        /* renamed from: p */
        private C5539a.AbstractC0301a f31310p;

        /* renamed from: q */
        private final ArrayList f31311q;

        /* renamed from: r */
        private final ArrayList f31312r;

        public a(Context context) {
            this.f31296b = new HashSet();
            this.f31297c = new HashSet();
            this.f31302h = new O.a();
            this.f31304j = new O.a();
            this.f31306l = -1;
            this.f31309o = C5397g.getInstance();
            this.f31310p = F2.d.zac;
            this.f31311q = new ArrayList();
            this.f31312r = new ArrayList();
            this.f31303i = context;
            this.f31308n = context.getMainLooper();
            this.f31300f = context.getPackageName();
            this.f31301g = context.getClass().getName();
        }

        private final void a(C5539a c5539a, C5539a.d dVar, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((C5539a.e) AbstractC5683p.checkNotNull(c5539a.zac(), "Base client builder must not be null")).getImpliedScopes(dVar));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.f31302h.put(c5539a, new C5642A(hashSet));
        }

        public a addApi(C5539a c5539a) {
            AbstractC5683p.checkNotNull(c5539a, "Api must not be null");
            this.f31304j.put(c5539a, null);
            List<Scope> impliedScopes = ((C5539a.e) AbstractC5683p.checkNotNull(c5539a.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.f31297c.addAll(impliedScopes);
            this.f31296b.addAll(impliedScopes);
            return this;
        }

        public <O extends C5539a.d.InterfaceC0302a> a addApiIfAvailable(C5539a c5539a, O o8, Scope... scopeArr) {
            AbstractC5683p.checkNotNull(c5539a, "Api must not be null");
            AbstractC5683p.checkNotNull(o8, "Null options are not permitted for this Api");
            this.f31304j.put(c5539a, o8);
            a(c5539a, o8, scopeArr);
            return this;
        }

        public a addConnectionCallbacks(b bVar) {
            AbstractC5683p.checkNotNull(bVar, "Listener must not be null");
            this.f31311q.add(bVar);
            return this;
        }

        public a addOnConnectionFailedListener(c cVar) {
            AbstractC5683p.checkNotNull(cVar, "Listener must not be null");
            this.f31312r.add(cVar);
            return this;
        }

        public a addScope(Scope scope) {
            AbstractC5683p.checkNotNull(scope, "Scope must not be null");
            this.f31296b.add(scope);
            return this;
        }

        public AbstractC5544f build() {
            AbstractC5683p.checkArgument(!this.f31304j.isEmpty(), "must call addApi() to add at least one API");
            C5671d c5671dZaa = zaa();
            Map<C5539a, C5642A> mapZad = c5671dZaa.zad();
            O.a aVar = new O.a();
            O.a aVar2 = new O.a();
            ArrayList arrayList = new ArrayList();
            C5539a c5539a = null;
            boolean z8 = false;
            for (C5539a c5539a2 : this.f31304j.keySet()) {
                Object obj = this.f31304j.get(c5539a2);
                boolean z9 = mapZad.get(c5539a2) != null;
                aVar.put(c5539a2, Boolean.valueOf(z9));
                T t8 = new T(c5539a2, z9);
                arrayList.add(t8);
                C5539a.AbstractC0301a abstractC0301a = (C5539a.AbstractC0301a) AbstractC5683p.checkNotNull(c5539a2.zaa());
                C5539a.f fVarBuildClient = abstractC0301a.buildClient(this.f31303i, this.f31308n, c5671dZaa, obj, (b) t8, (c) t8);
                aVar2.put(c5539a2.zab(), fVarBuildClient);
                if (abstractC0301a.getPriority() == 1) {
                    z8 = obj != null;
                }
                if (fVarBuildClient.providesSignIn()) {
                    if (c5539a != null) {
                        String strZad = c5539a2.zad();
                        String strZad2 = c5539a.zad();
                        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 21 + String.valueOf(strZad2).length());
                        sb.append(strZad);
                        sb.append(" cannot be used with ");
                        sb.append(strZad2);
                        throw new IllegalStateException(sb.toString());
                    }
                    c5539a = c5539a2;
                }
            }
            if (c5539a != null) {
                if (z8) {
                    String strZad3 = c5539a.zad();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZad3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(strZad3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
                AbstractC5683p.checkState(this.f31295a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c5539a.zad());
                AbstractC5683p.checkState(this.f31296b.equals(this.f31297c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c5539a.zad());
            }
            K k8 = new K(this.f31303i, new ReentrantLock(), this.f31308n, c5671dZaa, this.f31309o, this.f31310p, aVar, this.f31311q, this.f31312r, aVar2, this.f31306l, K.zad(aVar2.values(), true), arrayList);
            synchronized (AbstractC5544f.f31294a) {
                AbstractC5544f.f31294a.add(k8);
            }
            if (this.f31306l >= 0) {
                s0.zaa(this.f31305k).zad(this.f31306l, k8, this.f31307m);
            }
            return k8;
        }

        public a enableAutoManage(ActivityC1010e activityC1010e, int i8, c cVar) {
            C5588e c5588e = new C5588e((Activity) activityC1010e);
            AbstractC5683p.checkArgument(i8 >= 0, "clientId must be non-negative");
            this.f31306l = i8;
            this.f31307m = cVar;
            this.f31305k = c5588e;
            return this;
        }

        public a setAccountName(String str) {
            this.f31295a = str == null ? null : new Account(str, "com.google");
            return this;
        }

        public a setGravityForPopups(int i8) {
            this.f31298d = i8;
            return this;
        }

        public a setHandler(Handler handler) {
            AbstractC5683p.checkNotNull(handler, "Handler must not be null");
            this.f31308n = handler.getLooper();
            return this;
        }

        public a setViewForPopups(View view) {
            AbstractC5683p.checkNotNull(view, "View must not be null");
            this.f31299e = view;
            return this;
        }

        public a useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        @VisibleForTesting
        public final C5671d zaa() {
            F2.a aVar = F2.a.zaa;
            Map map = this.f31304j;
            C5539a c5539a = F2.d.zag;
            if (map.containsKey(c5539a)) {
                aVar = (F2.a) this.f31304j.get(c5539a);
            }
            return new C5671d(this.f31295a, this.f31296b, this.f31302h, this.f31298d, this.f31299e, this.f31300f, this.f31301g, aVar, false);
        }

        public a enableAutoManage(ActivityC1010e activityC1010e, c cVar) {
            enableAutoManage(activityC1010e, 0, cVar);
            return this;
        }

        public <T> a addApiIfAvailable(C5539a c5539a, Scope... scopeArr) {
            AbstractC5683p.checkNotNull(c5539a, "Api must not be null");
            this.f31304j.put(c5539a, null);
            a(c5539a, null, scopeArr);
            return this;
        }

        public <O extends C5539a.d.InterfaceC0302a> a addApi(C5539a c5539a, O o8) {
            AbstractC5683p.checkNotNull(c5539a, "Api must not be null");
            AbstractC5683p.checkNotNull(o8, "Null options are not permitted for this Api");
            this.f31304j.put(c5539a, o8);
            List<Scope> impliedScopes = ((C5539a.e) AbstractC5683p.checkNotNull(c5539a.zac(), "Base client builder must not be null")).getImpliedScopes(o8);
            this.f31297c.addAll(impliedScopes);
            this.f31296b.addAll(impliedScopes);
            return this;
        }

        public a(Context context, b bVar, c cVar) {
            this(context);
            AbstractC5683p.checkNotNull(bVar, "Must provide a connected listener");
            this.f31311q.add(bVar);
            AbstractC5683p.checkNotNull(cVar, "Must provide a connection failed listener");
            this.f31312r.add(cVar);
        }
    }
}
