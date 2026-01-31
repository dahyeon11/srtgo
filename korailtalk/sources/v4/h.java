package v4;

import android.view.View;

/* loaded from: classes.dex */
public class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f37256a;

    /* renamed from: b, reason: collision with root package name */
    private int f37257b;

    /* renamed from: c, reason: collision with root package name */
    private int f37258c;

    /* renamed from: d, reason: collision with root package name */
    private a f37259d;

    public interface a {
        void onCustomClick(View view, int i8, int i9, int i10);
    }

    public h(a aVar, int i8, int i9, int i10) {
        this.f37259d = aVar;
        this.f37256a = i8;
        this.f37257b = i9;
        this.f37258c = i10;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f37259d.onCustomClick(view, this.f37256a, this.f37257b, this.f37258c);
    }
}
