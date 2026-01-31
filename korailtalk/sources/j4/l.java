package j4;

/* loaded from: classes2.dex */
public class l extends f {

    /* renamed from: c, reason: collision with root package name */
    private boolean f33462c;

    public l(F3.o oVar) {
        super(oVar);
        this.f33462c = true;
    }

    @Override // j4.f
    protected F3.c b(F3.j jVar) {
        if (this.f33462c) {
            this.f33462c = false;
            return new F3.c(new M3.j(jVar.invert()));
        }
        this.f33462c = true;
        return new F3.c(new M3.j(jVar));
    }
}
