package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import f2.C5398h;

@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private final int f11845a;

    public GooglePlayServicesManifestException(int i8, String str) {
        super(str);
        this.f11845a = i8;
    }

    public int getActualVersion() {
        return this.f11845a;
    }

    public int getExpectedVersion() {
        return C5398h.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
