package i2;

import android.content.Intent;
import h2.InterfaceC5589f;

/* renamed from: i2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5646E extends AbstractDialogInterfaceOnClickListenerC5647F {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f31698a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC5589f f31699b;

    C5646E(Intent intent, InterfaceC5589f interfaceC5589f, int i8) {
        this.f31698a = intent;
        this.f31699b = interfaceC5589f;
    }

    @Override // i2.AbstractDialogInterfaceOnClickListenerC5647F
    public final void zaa() {
        Intent intent = this.f31698a;
        if (intent != null) {
            this.f31699b.startActivityForResult(intent, 2);
        }
    }
}
