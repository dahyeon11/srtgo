package com.google.firebase.iid;

/* loaded from: classes2.dex */
final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    private final String f25665a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25666b;

    q(String str, String str2) {
        this.f25665a = str;
        this.f25666b = str2;
    }

    @Override // com.google.firebase.iid.p
    public final String getId() {
        return this.f25665a;
    }

    @Override // com.google.firebase.iid.p
    public final String getToken() {
        return this.f25666b;
    }
}
