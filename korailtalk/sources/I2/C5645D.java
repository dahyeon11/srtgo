package i2;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: i2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5645D extends AbstractDialogInterfaceOnClickListenerC5647F {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f31695a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fragment f31696b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f31697c;

    C5645D(Intent intent, Fragment fragment, int i8) {
        this.f31695a = intent;
        this.f31696b = fragment;
        this.f31697c = i8;
    }

    @Override // i2.AbstractDialogInterfaceOnClickListenerC5647F
    public final void zaa() {
        Intent intent = this.f31695a;
        if (intent != null) {
            this.f31696b.startActivityForResult(intent, this.f31697c);
        }
    }
}
