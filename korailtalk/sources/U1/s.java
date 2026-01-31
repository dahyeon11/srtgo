package u1;

import u1.C6398A;

/* loaded from: classes.dex */
final /* synthetic */ class s implements C6398A.d {

    /* renamed from: a, reason: collision with root package name */
    private final C6403F f37091a;

    private s(C6403F c6403f) {
        this.f37091a = c6403f;
    }

    public static C6398A.d lambdaFactory$(C6403F c6403f) {
        return new s(c6403f);
    }

    @Override // u1.C6398A.d
    public Object produce() {
        return this.f37091a.getWritableDatabase();
    }
}
