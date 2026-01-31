package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p1.h;
import p1.m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements p1.d {
    @Override // p1.d
    public m create(h hVar) {
        return new d(hVar.getApplicationContext(), hVar.getWallClock(), hVar.getMonotonicClock());
    }
}
