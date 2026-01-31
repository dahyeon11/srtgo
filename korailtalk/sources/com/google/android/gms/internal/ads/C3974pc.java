package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3974pc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC1581Lb f21785i;

    /* renamed from: j, reason: collision with root package name */
    private long f21786j;

    public C3974pc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, ViewOnAttachStateChangeListenerC1581Lb viewOnAttachStateChangeListenerC1581Lb) {
        super(c1294Eb, "1LUIVO6lhWmBJfHw9DMAIriIU/Yodc7yYpCjENKu6ENqSuhgH3MJrJCpj/jKq6Pa", "V8P78mWO+MxnWR283vMX+BSDXEvrm8XlQCYXMpvUe5w=", c3357k9, i8, 53);
        this.f21785i = viewOnAttachStateChangeListenerC1581Lb;
        if (viewOnAttachStateChangeListenerC1581Lb != null) {
            this.f21786j = viewOnAttachStateChangeListenerC1581Lb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        if (this.f21785i != null) {
            this.f23265e.zzV(((Long) this.f23266f.invoke(null, Long.valueOf(this.f21786j))).longValue());
        }
    }
}
