package com.kakao.sdk.link.model;

import com.google.gson.l;
import com.kakao.sdk.link.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class KakaoLinkAttachment {

    /* renamed from: C, reason: collision with root package name */
    private final l f27536C;

    /* renamed from: P, reason: collision with root package name */
    private final l f27537P;
    private final String ak;
    private final String av;
    private final l extras;
    private final String lv;
    private final l ta;
    private final long ti;

    public KakaoLinkAttachment(String lv, String av, String ak, l lVar, l lVar2, long j8, l lVar3, l extras) {
        Intrinsics.checkParameterIsNotNull(lv, "lv");
        Intrinsics.checkParameterIsNotNull(av, "av");
        Intrinsics.checkParameterIsNotNull(ak, "ak");
        Intrinsics.checkParameterIsNotNull(extras, "extras");
        this.lv = lv;
        this.av = av;
        this.ak = ak;
        this.f27537P = lVar;
        this.f27536C = lVar2;
        this.ti = j8;
        this.ta = lVar3;
        this.extras = extras;
    }

    public final String getAk() {
        return this.ak;
    }

    public final String getAv() {
        return this.av;
    }

    public final l getC() {
        return this.f27536C;
    }

    public final l getExtras() {
        return this.extras;
    }

    public final String getLv() {
        return this.lv;
    }

    public final l getP() {
        return this.f27537P;
    }

    public final l getTa() {
        return this.ta;
    }

    public final long getTi() {
        return this.ti;
    }

    public /* synthetic */ KakaoLinkAttachment(String str, String str2, String str3, l lVar, l lVar2, long j8, l lVar3, l lVar4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? Constants.LINKVER_40 : str, (i8 & 2) != 0 ? Constants.LINKVER_40 : str2, str3, (i8 & 8) != 0 ? null : lVar, (i8 & 16) != 0 ? null : lVar2, j8, (i8 & 64) != 0 ? null : lVar3, lVar4);
    }
}
