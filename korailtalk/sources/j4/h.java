package j4;

/* loaded from: classes2.dex */
public class h implements F3.t {

    /* renamed from: a, reason: collision with root package name */
    private f f33444a;

    public h(f fVar) {
        this.f33444a = fVar;
    }

    @Override // F3.t
    public void foundPossibleResultPoint(F3.s sVar) {
        f fVar = this.f33444a;
        if (fVar != null) {
            fVar.foundPossibleResultPoint(sVar);
        }
    }

    public f getDecoder() {
        return this.f33444a;
    }

    public void setDecoder(f fVar) {
        this.f33444a = fVar;
    }

    public h() {
    }
}
