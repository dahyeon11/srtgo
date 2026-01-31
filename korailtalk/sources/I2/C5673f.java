package i2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import f2.C5394d;
import i2.InterfaceC5677j;
import j2.AbstractC5814a;

/* renamed from: i2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5673f extends AbstractC5814a {
    public static final Parcelable.Creator<C5673f> CREATOR = new p0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f31785o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C5394d[] f31786p = new C5394d[0];

    /* renamed from: a, reason: collision with root package name */
    final int f31787a;

    /* renamed from: b, reason: collision with root package name */
    final int f31788b;

    /* renamed from: c, reason: collision with root package name */
    final int f31789c;

    /* renamed from: d, reason: collision with root package name */
    String f31790d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f31791e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f31792f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f31793g;

    /* renamed from: h, reason: collision with root package name */
    Account f31794h;

    /* renamed from: i, reason: collision with root package name */
    C5394d[] f31795i;

    /* renamed from: j, reason: collision with root package name */
    C5394d[] f31796j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f31797k;

    /* renamed from: l, reason: collision with root package name */
    final int f31798l;

    /* renamed from: m, reason: collision with root package name */
    boolean f31799m;

    /* renamed from: n, reason: collision with root package name */
    private final String f31800n;

    C5673f(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C5394d[] c5394dArr, C5394d[] c5394dArr2, boolean z8, int i11, boolean z9, String str2) {
        scopeArr = scopeArr == null ? f31785o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c5394dArr = c5394dArr == null ? f31786p : c5394dArr;
        c5394dArr2 = c5394dArr2 == null ? f31786p : c5394dArr2;
        this.f31787a = i8;
        this.f31788b = i9;
        this.f31789c = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f31790d = "com.google.android.gms";
        } else {
            this.f31790d = str;
        }
        if (i8 < 2) {
            this.f31794h = iBinder != null ? AbstractBinderC5667a.getAccountBinderSafe(InterfaceC5677j.a.asInterface(iBinder)) : null;
        } else {
            this.f31791e = iBinder;
            this.f31794h = account;
        }
        this.f31792f = scopeArr;
        this.f31793g = bundle;
        this.f31795i = c5394dArr;
        this.f31796j = c5394dArr2;
        this.f31797k = z8;
        this.f31798l = i11;
        this.f31799m = z9;
        this.f31800n = str2;
    }

    public Bundle getExtraArgs() {
        return this.f31793g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        p0.a(this, parcel, i8);
    }

    public final String zza() {
        return this.f31800n;
    }
}
