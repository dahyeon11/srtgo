package com.google.firebase.installations;

import I2.C0609m;

/* loaded from: classes2.dex */
class l implements o {

    /* renamed from: a, reason: collision with root package name */
    final C0609m f25733a;

    public l(C0609m c0609m) {
        this.f25733a = c0609m;
    }

    @Override // com.google.firebase.installations.o
    public boolean onException(v3.d dVar, Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.o
    public boolean onStateReached(v3.d dVar) {
        if (!dVar.isUnregistered() && !dVar.isRegistered() && !dVar.isErrored()) {
            return false;
        }
        this.f25733a.trySetResult(dVar.getFirebaseInstallationId());
        return true;
    }
}
