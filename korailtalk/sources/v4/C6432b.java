package v4;

import android.widget.CompoundButton;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6432b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private a f37244a;

    /* renamed from: b, reason: collision with root package name */
    private int f37245b;

    /* renamed from: v4.b$a */
    public interface a {
        void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8);
    }

    public C6432b(a aVar, int i8) {
        this.f37244a = aVar;
        this.f37245b = i8;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        this.f37244a.onCustomCheckedChanged(compoundButton, z8, this.f37245b);
    }
}
