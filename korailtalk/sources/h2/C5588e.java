package h2;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.ActivityC1010e;
import i2.AbstractC5683p;

/* renamed from: h2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5588e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31425a;

    public C5588e(Activity activity) {
        AbstractC5683p.checkNotNull(activity, "Activity must not be null");
        this.f31425a = activity;
    }

    public final Activity zza() {
        return (Activity) this.f31425a;
    }

    public final ActivityC1010e zzb() {
        return (ActivityC1010e) this.f31425a;
    }

    public final boolean zzc() {
        return this.f31425a instanceof Activity;
    }

    public final boolean zzd() {
        return this.f31425a instanceof ActivityC1010e;
    }

    public C5588e(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
