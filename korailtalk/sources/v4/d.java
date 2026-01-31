package v4;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f37248a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f37249b;

    /* renamed from: c, reason: collision with root package name */
    private a f37250c;

    public interface a {
        void onCustomClick(View view, int i8, Bundle bundle);
    }

    public d(a aVar, int i8, Bundle bundle) {
        this.f37248a = i8;
        this.f37249b = bundle;
        this.f37250c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f37250c.onCustomClick(view, this.f37248a, this.f37249b);
    }
}
