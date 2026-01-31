package g1;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5536c {

    /* renamed from: a, reason: collision with root package name */
    private final C5535b f31272a;

    /* renamed from: b, reason: collision with root package name */
    private W0.a f31273b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f31274c;

    public C5536c() {
        this.f31272a = new C5535b();
        this.f31274c = null;
    }

    public Object getValue(C5535b c5535b) {
        return this.f31274c;
    }

    public final Object getValueInternal(float f8, float f9, Object obj, Object obj2, float f10, float f11, float f12) {
        return getValue(this.f31272a.set(f8, f9, obj, obj2, f10, f11, f12));
    }

    public final void setAnimation(W0.a aVar) {
        this.f31273b = aVar;
    }

    public final void setValue(Object obj) {
        this.f31274c = obj;
        W0.a aVar = this.f31273b;
        if (aVar != null) {
            aVar.notifyListeners();
        }
    }

    public C5536c(Object obj) {
        this.f31272a = new C5535b();
        this.f31274c = obj;
    }
}
