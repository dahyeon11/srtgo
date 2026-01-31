package com.google.android.gms.auth.api.signin;

import I2.AbstractC0608l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import b2.C1074c;
import c2.k;
import com.google.android.gms.dynamite.DynamiteModule;
import f2.C5397g;
import g2.AbstractC5543e;
import g2.C5539a;
import g2.n;
import h2.C5584a;
import h2.InterfaceC5595l;
import i2.C5682o;

/* loaded from: classes.dex */
public class b extends AbstractC5543e {

    /* renamed from: k, reason: collision with root package name */
    private static final C0193b f11832k = new C0193b(null);

    /* renamed from: l, reason: collision with root package name */
    private static int f11833l = a.zzbx;

    enum a {

        /* renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ int[] f11834a = {1, 2, 3, 4};
        public static final int zzbx = 1;
        public static final int zzby = 2;
        public static final int zzbz = 3;
        public static final int zzca = 4;

        public static int[] zzm() {
            return (int[]) f11834a.clone();
        }
    }

    /* renamed from: com.google.android.gms.auth.api.signin.b$b, reason: collision with other inner class name */
    private static class C0193b implements C5682o.a {
        private C0193b() {
        }

        @Override // i2.C5682o.a
        public final /* synthetic */ Object convert(n nVar) {
            return ((C1074c) nVar).getSignInAccount();
        }

        /* synthetic */ C0193b(f fVar) {
            this();
        }
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, Y1.a.GOOGLE_SIGN_IN_API, googleSignInOptions, new C5584a());
    }

    private final synchronized int e() {
        try {
            if (f11833l == a.zzbx) {
                Context applicationContext = getApplicationContext();
                C5397g c5397g = C5397g.getInstance();
                int iIsGooglePlayServicesAvailable = c5397g.isGooglePlayServicesAvailable(applicationContext, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    f11833l = a.zzca;
                } else if (c5397g.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) != null || DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    f11833l = a.zzby;
                } else {
                    f11833l = a.zzbz;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11833l;
    }

    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        int i8 = f.f11835a[e() - 1];
        return i8 != 1 ? i8 != 2 ? k.zze(applicationContext, (GoogleSignInOptions) getApiOptions()) : k.zzc(applicationContext, (GoogleSignInOptions) getApiOptions()) : k.zzd(applicationContext, (GoogleSignInOptions) getApiOptions());
    }

    public AbstractC0608l revokeAccess() {
        return C5682o.toVoidTask(k.zzd(asGoogleApiClient(), getApplicationContext(), e() == a.zzbz));
    }

    public AbstractC0608l signOut() {
        return C5682o.toVoidTask(k.zzc(asGoogleApiClient(), getApplicationContext(), e() == a.zzbz));
    }

    public AbstractC0608l silentSignIn() {
        return C5682o.toTask(k.zzc(asGoogleApiClient(), getApplicationContext(), (GoogleSignInOptions) getApiOptions(), e() == a.zzbz), f11832k);
    }

    b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, Y1.a.GOOGLE_SIGN_IN_API, (C5539a.d) googleSignInOptions, (InterfaceC5595l) new C5584a());
    }
}
