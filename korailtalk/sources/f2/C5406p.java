package f2;

import android.content.Intent;

/* renamed from: f2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5406p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f30584a;

    public C5406p(String str, Intent intent) {
        super(str);
        this.f30584a = intent;
    }

    public Intent getIntent() {
        return new Intent(this.f30584a);
    }
}
