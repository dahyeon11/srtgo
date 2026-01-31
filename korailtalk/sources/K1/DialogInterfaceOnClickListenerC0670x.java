package K1;

import android.content.DialogInterface;
import android.net.Uri;

/* renamed from: K1.x */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0670x implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RunnableC0672y f2851a;

    DialogInterfaceOnClickListenerC0670x(RunnableC0672y runnableC0672y) {
        this.f2851a = runnableC0672y;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        G1.u.zzp();
        K0.zzU(this.f2851a.f2852a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
