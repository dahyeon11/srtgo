package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1867Sb extends AbstractCallableC4657vc {

    /* renamed from: j, reason: collision with root package name */
    private static final C4771wc f16305j = new C4771wc();

    /* renamed from: i, reason: collision with root package name */
    private final Context f16306i;

    public C1867Sb(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, Context context) {
        super(c1294Eb, "LYoHKR17UvbUNibqKPKJklawQJNaw1zk7CnhZAC68YBTzC7x4MYQVXp9Sihs98Ok", "ngqbGKXcQCvq0ft27xRzOzNoEVN+ei+Vq2+CNx9QQMc=", c3357k9, i8, 29);
        this.f16306i = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        this.f23265e.zzo("E");
        AtomicReference atomicReferenceZza = f16305j.zza(this.f16306i.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                try {
                    if (atomicReferenceZza.get() == null) {
                        atomicReferenceZza.set((String) this.f23266f.invoke(null, this.f16306i));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        synchronized (this.f23265e) {
            this.f23265e.zzo(AbstractC3514la.zza(str.getBytes(), true));
        }
    }
}
