package h2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import f2.C5392b;
import f2.C5394d;
import g2.C5539a;
import i2.AbstractC5670c;
import i2.AbstractC5675h;
import i2.AbstractC5683p;
import i2.InterfaceC5677j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* renamed from: h2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC5590g implements C5539a.f, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f31426a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31427b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f31428c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f31429d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5587d f31430e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f31431f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC5591h f31432g;

    /* renamed from: h, reason: collision with root package name */
    private IBinder f31433h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31434i;

    /* renamed from: j, reason: collision with root package name */
    private String f31435j;

    /* renamed from: k, reason: collision with root package name */
    private String f31436k;

    public ServiceConnectionC5590g(Context context, Looper looper, ComponentName componentName, InterfaceC5587d interfaceC5587d, InterfaceC5591h interfaceC5591h) {
        this(context, looper, null, null, componentName, interfaceC5587d, interfaceC5591h);
    }

    private final void b() {
        if (Thread.currentThread() != this.f31431f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void c(String str) {
        String.valueOf(this.f31433h);
    }

    final /* synthetic */ void a(IBinder iBinder) {
        this.f31434i = false;
        this.f31433h = iBinder;
        c("Connected.");
        this.f31430e.onConnected(new Bundle());
    }

    @Override // g2.C5539a.f
    public final void connect(AbstractC5670c.InterfaceC0311c interfaceC0311c) {
        b();
        c("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f31428c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f31426a).setAction(this.f31427b);
            }
            boolean zBindService = this.f31429d.bindService(intent, this, AbstractC5675h.getDefaultBindFlags());
            this.f31434i = zBindService;
            if (!zBindService) {
                this.f31433h = null;
                this.f31432g.onConnectionFailed(new C5392b(16));
            }
            c("Finished connect.");
        } catch (SecurityException e8) {
            this.f31434i = false;
            this.f31433h = null;
            throw e8;
        }
    }

    @Override // g2.C5539a.f
    public final void disconnect() {
        b();
        c("Disconnect called.");
        try {
            this.f31429d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f31434i = false;
        this.f31433h = null;
    }

    @Override // g2.C5539a.f
    public final C5394d[] getAvailableFeatures() {
        return new C5394d[0];
    }

    public IBinder getBinder() {
        b();
        return this.f31433h;
    }

    @Override // g2.C5539a.f
    public final String getEndpointPackageName() {
        String str = this.f31426a;
        if (str != null) {
            return str;
        }
        AbstractC5683p.checkNotNull(this.f31428c);
        return this.f31428c.getPackageName();
    }

    @Override // g2.C5539a.f
    public final String getLastDisconnectMessage() {
        return this.f31435j;
    }

    @Override // g2.C5539a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // g2.C5539a.f
    public final C5394d[] getRequiredFeatures() {
        return new C5394d[0];
    }

    @Override // g2.C5539a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // g2.C5539a.f
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @Override // g2.C5539a.f
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override // g2.C5539a.f
    public final boolean isConnected() {
        b();
        return this.f31433h != null;
    }

    @Override // g2.C5539a.f
    public final boolean isConnecting() {
        b();
        return this.f31434i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f31431f.post(new Runnable() { // from class: h2.C
            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.a(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f31431f.post(new Runnable() { // from class: h2.B
            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.zab();
            }
        });
    }

    @Override // g2.C5539a.f
    public final boolean providesSignIn() {
        return false;
    }

    @Override // g2.C5539a.f
    public final boolean requiresAccount() {
        return false;
    }

    @Override // g2.C5539a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // g2.C5539a.f
    public final boolean requiresSignIn() {
        return false;
    }

    final /* synthetic */ void zab() {
        this.f31434i = false;
        this.f31433h = null;
        c("Disconnected.");
        this.f31430e.onConnectionSuspended(1);
    }

    public final void zac(String str) {
        this.f31436k = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private ServiceConnectionC5590g(android.content.Context r2, android.os.Looper r3, java.lang.String r4, java.lang.String r5, android.content.ComponentName r6, h2.InterfaceC5587d r7, h2.InterfaceC5591h r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f31434i = r0
            r0 = 0
            r1.f31435j = r0
            r1.f31429d = r2
            x2.j r2 = new x2.j
            r2.<init>(r3)
            r1.f31431f = r2
            r1.f31430e = r7
            r1.f31432g = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.f31426a = r4
            r1.f31427b = r5
            r1.f31428c = r6
            return
        L27:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.ServiceConnectionC5590g.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, h2.d, h2.h):void");
    }

    public ServiceConnectionC5590g(Context context, Looper looper, String str, String str2, InterfaceC5587d interfaceC5587d, InterfaceC5591h interfaceC5591h) {
        this(context, looper, str, str2, null, interfaceC5587d, interfaceC5591h);
    }

    @Override // g2.C5539a.f
    public final void disconnect(String str) {
        b();
        this.f31435j = str;
        disconnect();
    }

    @Override // g2.C5539a.f
    public final void onUserSignOut(AbstractC5670c.e eVar) {
    }

    @Override // g2.C5539a.f
    public final void getRemoteService(InterfaceC5677j interfaceC5677j, Set<Scope> set) {
    }

    @Override // g2.C5539a.f
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
