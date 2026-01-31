package a0;

import android.view.autofill.AutofillId;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0823b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5755a;

    private C0823b(AutofillId autofillId) {
        this.f5755a = autofillId;
    }

    public static C0823b toAutofillIdCompat(AutofillId autofillId) {
        return new C0823b(autofillId);
    }

    public AutofillId toAutofillId() {
        return AbstractC0822a.a(this.f5755a);
    }
}
