package v4;

import android.view.View;

/* loaded from: classes.dex */
public class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private a f37251a;

    /* renamed from: b, reason: collision with root package name */
    private Q5.b f37252b;

    /* renamed from: c, reason: collision with root package name */
    private int f37253c;

    public interface a {
        void onCustomClick(View view, Q5.b bVar, int i8);
    }

    public e(a aVar, Q5.b bVar, int i8) {
        this.f37251a = aVar;
        this.f37252b = bVar;
        this.f37253c = i8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f37251a.onCustomClick(view, this.f37252b, this.f37253c);
    }
}
