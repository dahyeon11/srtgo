package com.google.firebase.installations;

import I2.C0609m;

/* loaded from: classes2.dex */
class k implements o {

    /* renamed from: a, reason: collision with root package name */
    private final p f25731a;

    /* renamed from: b, reason: collision with root package name */
    private final C0609m f25732b;

    public k(p pVar, C0609m c0609m) {
        this.f25731a = pVar;
        this.f25732b = c0609m;
    }

    @Override // com.google.firebase.installations.o
    public boolean onException(v3.d dVar, Exception exc) {
        if (!dVar.isErrored() && !dVar.isNotGenerated() && !dVar.isUnregistered()) {
            return false;
        }
        this.f25732b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.o
    public boolean onStateReached(v3.d dVar) {
        if (!dVar.isRegistered() || this.f25731a.isAuthTokenExpired(dVar)) {
            return false;
        }
        this.f25732b.setResult(m.builder().setToken(dVar.getAuthToken()).setTokenExpirationTimestamp(dVar.getExpiresInSecs()).setTokenCreationTimestamp(dVar.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
