package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.f;
import androidx.core.view.accessibility.AbstractC0927b;
import b.InterfaceC1058a;
import b.InterfaceC1059b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1059b f7319a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f7320b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7321c;

    class a extends e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7322a;

        a(Context context) {
            this.f7322a = context;
        }

        @Override // androidx.browser.customtabs.e
        public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            cVar.warmup(0L);
            this.f7322a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class b extends InterfaceC1058a.AbstractBinderC0183a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f7323a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f7324b;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f7326a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f7327b;

            a(int i8, Bundle bundle) {
                this.f7326a = i8;
                this.f7327b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f7324b.onNavigationEvent(this.f7326a, this.f7327b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$b, reason: collision with other inner class name */
        class RunnableC0116b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f7329a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f7330b;

            RunnableC0116b(String str, Bundle bundle) {
                this.f7329a = str;
                this.f7330b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f7324b.extraCallback(this.f7329a, this.f7330b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$c, reason: collision with other inner class name */
        class RunnableC0117c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f7332a;

            RunnableC0117c(Bundle bundle) {
                this.f7332a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f7324b.onMessageChannelReady(this.f7332a);
            }
        }

        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f7334a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f7335b;

            d(String str, Bundle bundle) {
                this.f7334a = str;
                this.f7335b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f7324b.onPostMessage(this.f7334a, this.f7335b);
            }
        }

        class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f7337a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f7338b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f7339c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f7340d;

            e(int i8, Uri uri, boolean z8, Bundle bundle) {
                this.f7337a = i8;
                this.f7338b = uri;
                this.f7339c = z8;
                this.f7340d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f7324b.onRelationshipValidationResult(this.f7337a, this.f7338b, this.f7339c, this.f7340d);
            }
        }

        b(androidx.browser.customtabs.b bVar) {
            this.f7324b = bVar;
        }

        @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
        public void extraCallback(String str, Bundle bundle) {
            if (this.f7324b == null) {
                return;
            }
            this.f7323a.post(new RunnableC0116b(str, bundle));
        }

        @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f7324b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
        public void onMessageChannelReady(Bundle bundle) {
            if (this.f7324b == null) {
                return;
            }
            this.f7323a.post(new RunnableC0117c(bundle));
        }

        @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
        public void onNavigationEvent(int i8, Bundle bundle) {
            if (this.f7324b == null) {
                return;
            }
            this.f7323a.post(new a(i8, bundle));
        }

        @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
        public void onPostMessage(String str, Bundle bundle) {
            if (this.f7324b == null) {
                return;
            }
            this.f7323a.post(new d(str, bundle));
        }

        @Override // b.InterfaceC1058a.AbstractBinderC0183a, b.InterfaceC1058a
        public void onRelationshipValidationResult(int i8, Uri uri, boolean z8, Bundle bundle) {
            if (this.f7324b == null) {
                return;
            }
            this.f7323a.post(new e(i8, uri, z8, bundle));
        }
    }

    c(InterfaceC1059b interfaceC1059b, ComponentName componentName, Context context) {
        this.f7319a = interfaceC1059b;
        this.f7320b = componentName;
        this.f7321c = context;
    }

    private InterfaceC1058a.AbstractBinderC0183a a(androidx.browser.customtabs.b bVar) {
        return new b(bVar);
    }

    private static PendingIntent b(Context context, int i8) {
        return PendingIntent.getActivity(context, i8, new Intent(), AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    public static boolean bindCustomTabsService(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 1);
    }

    private f c(androidx.browser.customtabs.b bVar, PendingIntent pendingIntent) {
        boolean zNewSession;
        InterfaceC1058a.AbstractBinderC0183a abstractBinderC0183aA = a(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(d.EXTRA_SESSION_ID, pendingIntent);
                zNewSession = this.f7319a.newSessionWithExtras(abstractBinderC0183aA, bundle);
            } else {
                zNewSession = this.f7319a.newSession(abstractBinderC0183aA);
            }
            if (zNewSession) {
                return new f(this.f7319a, abstractBinderC0183aA, this.f7320b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public static boolean connectAndInitialize(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static String getPackageName(Context context, List<String> list) {
        return getPackageName(context, list, false);
    }

    public static f.b newPendingSession(Context context, androidx.browser.customtabs.b bVar, int i8) {
        return new f.b(bVar, b(context, i8));
    }

    public f attachSession(f.b bVar) {
        return c(bVar.a(), bVar.b());
    }

    public Bundle extraCommand(String str, Bundle bundle) {
        try {
            return this.f7319a.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f newSession(androidx.browser.customtabs.b bVar) {
        return c(bVar, null);
    }

    public boolean warmup(long j8) {
        try {
            return this.f7319a.warmup(j8);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public static String getPackageName(Context context, List<String> list, boolean z8) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z8 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public f newSession(androidx.browser.customtabs.b bVar, int i8) {
        return c(bVar, b(this.f7321c, i8));
    }
}
