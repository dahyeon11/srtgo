package com.google.android.gms.common.api.internal;

import g2.C5539a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1125x extends B {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f12111b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C f12112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1125x(C c9, ArrayList<C5539a.f> arrayList) {
        super(c9, null);
        this.f12112c = c9;
        this.f12111b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.B
    public final void zaa() {
        C c9 = this.f12112c;
        c9.f11872a.f11945n.f11919p = C.q(c9);
        ArrayList arrayList = this.f12111b;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C5539a.f fVar = (C5539a.f) arrayList.get(i8);
            C c10 = this.f12112c;
            fVar.getRemoteService(c10.f11886o, c10.f11872a.f11945n.f11919p);
        }
    }
}
