package q2;

import android.content.Context;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f34918b = new e();

    /* renamed from: a, reason: collision with root package name */
    private d f34919a = null;

    public static d packageManager(Context context) {
        return f34918b.zza(context);
    }

    public final synchronized d zza(Context context) {
        try {
            if (this.f34919a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f34919a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f34919a;
    }
}
