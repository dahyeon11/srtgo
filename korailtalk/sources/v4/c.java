package v4;

import android.view.View;

/* loaded from: classes.dex */
public class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f37246a;

    /* renamed from: b, reason: collision with root package name */
    private a f37247b;

    public interface a {
        void onCustomClick(View view, int i8);
    }

    public c(a aVar, int i8) {
        this.f37246a = i8;
        this.f37247b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f37247b.onCustomClick(view, this.f37246a);
    }
}
