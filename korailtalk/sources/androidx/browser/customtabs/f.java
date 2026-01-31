package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.RemoteViews;
import b.InterfaceC1058a;
import b.InterfaceC1059b;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7352a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1059b f7353b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1058a f7354c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f7355d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f7356e;

    static class a extends InterfaceC1059b.a {
        a() {
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean mayLaunchUrl(InterfaceC1058a interfaceC1058a, Uri uri, Bundle bundle, List<Bundle> list) {
            return false;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean newSession(InterfaceC1058a interfaceC1058a) {
            return false;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean newSessionWithExtras(InterfaceC1058a interfaceC1058a, Bundle bundle) {
            return false;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public int postMessage(InterfaceC1058a interfaceC1058a, String str, Bundle bundle) {
            return 0;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean receiveFile(InterfaceC1058a interfaceC1058a, Uri uri, int i8, Bundle bundle) {
            return false;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean requestPostMessageChannel(InterfaceC1058a interfaceC1058a, Uri uri) {
            return false;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean requestPostMessageChannelWithExtras(InterfaceC1058a interfaceC1058a, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean updateVisuals(InterfaceC1058a interfaceC1058a, Bundle bundle) {
            return false;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean validateRelationship(InterfaceC1058a interfaceC1058a, int i8, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // b.InterfaceC1059b.a, b.InterfaceC1059b
        public boolean warmup(long j8) {
            return false;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.browser.customtabs.b f7357a;

        /* renamed from: b, reason: collision with root package name */
        private final PendingIntent f7358b;

        b(androidx.browser.customtabs.b bVar, PendingIntent pendingIntent) {
            this.f7357a = bVar;
            this.f7358b = pendingIntent;
        }

        androidx.browser.customtabs.b a() {
            return this.f7357a;
        }

        PendingIntent b() {
            return this.f7358b;
        }
    }

    f(InterfaceC1059b interfaceC1059b, InterfaceC1058a interfaceC1058a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f7353b = interfaceC1059b;
        this.f7354c = interfaceC1058a;
        this.f7355d = componentName;
        this.f7356e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f7356e;
        if (pendingIntent != null) {
            bundle.putParcelable(d.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public static f createMockSessionForTesting(ComponentName componentName) {
        return new f(new a(), new g(), componentName, null);
    }

    IBinder c() {
        return this.f7354c.asBinder();
    }

    ComponentName d() {
        return this.f7355d;
    }

    PendingIntent e() {
        return this.f7356e;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f7353b.mayLaunchUrl(this.f7354c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(String str, Bundle bundle) {
        int iPostMessage;
        Bundle bundleB = b(bundle);
        synchronized (this.f7352a) {
            try {
                try {
                    iPostMessage = this.f7353b.postMessage(this.f7354c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public boolean receiveFile(Uri uri, int i8, Bundle bundle) {
        try {
            return this.f7353b.receiveFile(this.f7354c, uri, i8, b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(Uri uri) {
        try {
            return this.f7356e != null ? this.f7353b.requestPostMessageChannelWithExtras(this.f7354c, uri, b(null)) : this.f7353b.requestPostMessageChannel(this.f7354c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setActionButton(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(d.KEY_ICON, bitmap);
        bundle.putString(d.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(d.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        a(bundle);
        try {
            return this.f7353b.updateVisuals(this.f7354c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(d.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(d.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(d.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        a(bundle);
        try {
            return this.f7353b.updateVisuals(this.f7354c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i8, Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(d.KEY_ID, i8);
        bundle.putParcelable(d.KEY_ICON, bitmap);
        bundle.putString(d.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(d.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        a(bundle2);
        try {
            return this.f7353b.updateVisuals(this.f7354c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i8, Uri uri, Bundle bundle) {
        if (i8 >= 1 && i8 <= 2) {
            try {
                return this.f7353b.validateRelationship(this.f7354c, i8, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
