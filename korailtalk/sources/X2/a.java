package X2;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f5421a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0085a f5422b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5423c;

    /* renamed from: X2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0085a {
        void apply(Typeface typeface);
    }

    public a(InterfaceC0085a interfaceC0085a, Typeface typeface) {
        this.f5421a = typeface;
        this.f5422b = interfaceC0085a;
    }

    private void a(Typeface typeface) {
        if (this.f5423c) {
            return;
        }
        this.f5422b.apply(typeface);
    }

    public void cancel() {
        this.f5423c = true;
    }

    @Override // X2.f
    public void onFontRetrievalFailed(int i8) {
        a(this.f5421a);
    }

    @Override // X2.f
    public void onFontRetrieved(Typeface typeface, boolean z8) {
        a(typeface);
    }
}
