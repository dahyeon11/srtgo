package i2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.kakao.sdk.template.Constants;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f31840f = new Uri.Builder().scheme(Constants.CONTENT).authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f31841a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31842b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f31843c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31844d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31845e;

    public q0(ComponentName componentName, int i8) {
        this.f31841a = null;
        this.f31842b = null;
        AbstractC5683p.checkNotNull(componentName);
        this.f31843c = componentName;
        this.f31844d = 4225;
        this.f31845e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return AbstractC5681n.equal(this.f31841a, q0Var.f31841a) && AbstractC5681n.equal(this.f31842b, q0Var.f31842b) && AbstractC5681n.equal(this.f31843c, q0Var.f31843c) && this.f31845e == q0Var.f31845e;
    }

    public final int hashCode() {
        return AbstractC5681n.hashCode(this.f31841a, this.f31842b, this.f31843c, 4225, Boolean.valueOf(this.f31845e));
    }

    public final String toString() {
        String str = this.f31841a;
        if (str != null) {
            return str;
        }
        AbstractC5683p.checkNotNull(this.f31843c);
        return this.f31843c.flattenToString();
    }

    public final ComponentName zza() {
        return this.f31843c;
    }

    public final Intent zzb(Context context) {
        Bundle bundleCall;
        if (this.f31841a == null) {
            return new Intent().setComponent(this.f31843c);
        }
        if (this.f31845e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f31841a);
            try {
                bundleCall = context.getContentResolver().call(f31840f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e8) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e8.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f31841a)));
            }
        }
        return intent == null ? new Intent(this.f31841a).setPackage(this.f31842b) : intent;
    }

    public final String zzc() {
        return this.f31842b;
    }

    public q0(String str, int i8, boolean z8) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public q0(String str, String str2, int i8, boolean z8) {
        AbstractC5683p.checkNotEmpty(str);
        this.f31841a = str;
        AbstractC5683p.checkNotEmpty(str2);
        this.f31842b = str2;
        this.f31843c = null;
        this.f31844d = 4225;
        this.f31845e = z8;
    }
}
