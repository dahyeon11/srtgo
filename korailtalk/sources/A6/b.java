package A6;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private a f78a;

    public b(a aVar) {
        super(aVar.toString());
        a aVar2 = a.None;
        this.f78a = aVar;
    }

    public a getCode() {
        return this.f78a;
    }

    public b(a aVar, String str) {
        super(str);
        a aVar2 = a.None;
        this.f78a = aVar;
    }
}
