package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.om0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3881om0 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f21560a;

    public C3881om0(Pattern pattern) {
        pattern.getClass();
        this.f21560a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f21560a.matcher(str).matches();
    }
}
