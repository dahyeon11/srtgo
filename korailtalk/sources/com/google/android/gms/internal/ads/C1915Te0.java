package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Te0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1915Te0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f16500b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final List f16501a = new ArrayList();

    public final List zza() {
        return this.f16501a;
    }

    public final void zzb(View view, EnumC1137Ae0 enumC1137Ae0, String str) {
        C1874Se0 c1874Se0;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f16500b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.f16501a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1874Se0 = null;
                break;
            } else {
                c1874Se0 = (C1874Se0) it.next();
                if (c1874Se0.zzb().get() == view) {
                    break;
                }
            }
        }
        if (c1874Se0 == null) {
            this.f16501a.add(new C1874Se0(view, enumC1137Ae0, "Ad overlay"));
        }
    }

    public final void zzc() {
        this.f16501a.clear();
    }
}
