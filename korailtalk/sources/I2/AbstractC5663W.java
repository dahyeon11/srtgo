package i2;

import android.app.PendingIntent;
import android.os.Bundle;
import f2.C5392b;

/* renamed from: i2.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5663W extends h0 {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC5670c f31727d;
    public final int zza;
    public final Bundle zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC5663W(AbstractC5670c abstractC5670c, int i8, Bundle bundle) {
        super(abstractC5670c, Boolean.TRUE);
        this.f31727d = abstractC5670c;
        this.zza = i8;
        this.zzb = bundle;
    }

    @Override // i2.h0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.zza != 0) {
            this.f31727d.E(1, null);
            Bundle bundle = this.zzb;
            c(new C5392b(this.zza, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC5670c.KEY_PENDING_INTENT) : null));
        } else {
            if (d()) {
                return;
            }
            this.f31727d.E(1, null);
            c(new C5392b(8, null));
        }
    }

    protected abstract void c(C5392b c5392b);

    protected abstract boolean d();

    @Override // i2.h0
    protected final void b() {
    }
}
