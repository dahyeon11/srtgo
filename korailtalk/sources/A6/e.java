package A6;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private h f83a = null;

    /* renamed from: b, reason: collision with root package name */
    private i f84b = new i();

    /* renamed from: c, reason: collision with root package name */
    private i f85c = new i();

    /* renamed from: d, reason: collision with root package name */
    private int f86d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f87e = 0;

    /* renamed from: f, reason: collision with root package name */
    private float f88f = 0.0f;

    public void Update(i iVar) {
        if (this.f86d == 0) {
            this.f84b = iVar.m2clone();
        }
        this.f85c = iVar.m2clone();
        this.f86d++;
    }

    public void acountNotice() {
        this.f87e++;
    }

    public void clear() {
        this.f86d = 0;
        this.f87e = 0;
        this.f88f = 0.0f;
        this.f84b.clear();
        this.f85c.clear();
    }

    public int getAcountNotice() {
        return this.f87e;
    }

    public i getCurrentData() {
        return this.f85c;
    }

    public int getCurrentNextCount() {
        return this.f85c.getNextCount();
    }

    public float getCurrentTPS() {
        return this.f85c.getTPS();
    }

    public int getCurrentWaitCount() {
        return this.f85c.getWaitCount();
    }

    public float getCurrentWaitPercent() {
        if (this.f84b.getWaitCount() < 1 || this.f85c.getWaitCount() >= this.f84b.getWaitCount()) {
            return 0.0f;
        }
        float waitCount = ((this.f84b.getWaitCount() - this.f85c.getWaitCount()) * 100) / this.f84b.getWaitCount();
        if (waitCount > 100.0f) {
            return 100.0f;
        }
        return waitCount;
    }

    public float getCurrentWaitTimeSecond() {
        float currentWaitCount = getCurrentWaitCount() / (getCurrentTPS() > 0.0f ? getCurrentTPS() : 1.0f);
        if (this.f88f == 0.0f) {
            this.f88f = currentWaitCount;
        }
        float f8 = this.f88f;
        return currentWaitCount > f8 ? f8 : currentWaitCount;
    }

    public i getFirstData() {
        return this.f84b;
    }

    public int getUpdateAcount() {
        return this.f86d;
    }

    public void setProperty(h hVar) {
        this.f83a = hVar;
    }
}
