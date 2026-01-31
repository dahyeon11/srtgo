package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.ads.kb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3403kb0 {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f20436a;

    public C3403kb0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) H1.C.zzc().zza(AbstractC4439th.zzhc));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f20436a = patternCompile;
    }

    public final String zza(String str) {
        Pattern pattern = this.f20436a;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
