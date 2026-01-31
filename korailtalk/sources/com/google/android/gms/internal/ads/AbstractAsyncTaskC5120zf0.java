package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC5120zf0 extends AbstractAsyncTaskC1139Af0 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet f24193c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f24194d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f24195e;

    public AbstractAsyncTaskC5120zf0(C4550uf0 c4550uf0, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(c4550uf0);
        this.f24193c = new HashSet(hashSet);
        this.f24194d = jSONObject;
        this.f24195e = j8;
    }
}
