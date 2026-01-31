package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.hA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3018hA0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f19769a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC2878fy0 f19770b;

    /* synthetic */ C3018hA0(AbstractC3677my0 abstractC3677my0, AbstractC2903gA0 abstractC2903gA0) {
        if (!(abstractC3677my0 instanceof C3246jA0)) {
            this.f19769a = null;
            this.f19770b = (AbstractC2878fy0) abstractC3677my0;
            return;
        }
        C3246jA0 c3246jA0 = (C3246jA0) abstractC3677my0;
        ArrayDeque arrayDeque = new ArrayDeque(c3246jA0.d());
        this.f19769a = arrayDeque;
        arrayDeque.push(c3246jA0);
        this.f19770b = a(c3246jA0.f20203e);
    }

    private final AbstractC2878fy0 a(AbstractC3677my0 abstractC3677my0) {
        while (abstractC3677my0 instanceof C3246jA0) {
            C3246jA0 c3246jA0 = (C3246jA0) abstractC3677my0;
            this.f19769a.push(c3246jA0);
            abstractC3677my0 = c3246jA0.f20203e;
        }
        return (AbstractC2878fy0) abstractC3677my0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19770b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final AbstractC2878fy0 next() {
        AbstractC2878fy0 abstractC2878fy0A;
        AbstractC2878fy0 abstractC2878fy0 = this.f19770b;
        if (abstractC2878fy0 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f19769a;
            abstractC2878fy0A = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abstractC2878fy0A = a(((C3246jA0) this.f19769a.pop()).f20204f);
        } while (abstractC2878fy0A.zzd() == 0);
        this.f19770b = abstractC2878fy0A;
        return abstractC2878fy0;
    }
}
