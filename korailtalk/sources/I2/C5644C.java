package i2;

import android.app.Activity;
import android.content.Intent;

/* renamed from: i2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5644C extends AbstractDialogInterfaceOnClickListenerC5647F {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f31692a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f31693b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f31694c;

    C5644C(Intent intent, Activity activity, int i8) {
        this.f31692a = intent;
        this.f31693b = activity;
        this.f31694c = i8;
    }

    @Override // i2.AbstractDialogInterfaceOnClickListenerC5647F
    public final void zaa() {
        Intent intent = this.f31692a;
        if (intent != null) {
            this.f31693b.startActivityForResult(intent, this.f31694c);
        }
    }
}
