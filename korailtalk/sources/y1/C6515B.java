package y1;

import H1.R1;

/* renamed from: y1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6515B {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37562a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37563b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37564c;

    public C6515B(R1 r12) {
        this.f37562a = r12.zza;
        this.f37563b = r12.zzb;
        this.f37564c = r12.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.f37564c;
    }

    public boolean getCustomControlsRequested() {
        return this.f37563b;
    }

    public boolean getStartMuted() {
        return this.f37562a;
    }
}
