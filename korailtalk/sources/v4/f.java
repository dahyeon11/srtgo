package v4;

import android.widget.RadioGroup;

/* loaded from: classes.dex */
public class f implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private a f37254a;

    /* renamed from: b, reason: collision with root package name */
    private int f37255b;

    public interface a {
        void onCustomCheckedChanged(RadioGroup radioGroup, int i8, int i9);
    }

    public f(a aVar, int i8) {
        this.f37254a = aVar;
        this.f37255b = i8;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i8) {
        this.f37254a.onCustomCheckedChanged(radioGroup, this.f37255b, i8);
    }
}
