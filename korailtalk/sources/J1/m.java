package J1;

import android.view.View;

/* loaded from: classes.dex */
final class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f2544a;

    m(u uVar) {
        this.f2544a = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar = this.f2544a;
        uVar.f2570v = 2;
        uVar.f2549a.finish();
    }
}
