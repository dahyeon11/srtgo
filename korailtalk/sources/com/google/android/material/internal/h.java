package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f25007a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f25008b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25009c;

    /* renamed from: e, reason: collision with root package name */
    private int f25011e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25015i;

    /* renamed from: d, reason: collision with root package name */
    private int f25010d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f25012f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f25013g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25014h = true;

    /* renamed from: j, reason: collision with root package name */
    private TextUtils.TruncateAt f25016j = null;

    static class a extends Exception {
    }

    private h(CharSequence charSequence, TextPaint textPaint, int i8) {
        this.f25007a = charSequence;
        this.f25008b = textPaint;
        this.f25009c = i8;
        this.f25011e = charSequence.length();
    }

    public static h obtain(CharSequence charSequence, TextPaint textPaint, int i8) {
        return new h(charSequence, textPaint, i8);
    }

    public StaticLayout build() {
        if (this.f25007a == null) {
            this.f25007a = "";
        }
        int iMax = Math.max(0, this.f25009c);
        CharSequence charSequenceEllipsize = this.f25007a;
        if (this.f25013g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f25008b, iMax, this.f25016j);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f25011e);
        this.f25011e = iMin;
        if (this.f25015i) {
            this.f25012f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f25010d, iMin, this.f25008b, iMax);
        builderObtain.setAlignment(this.f25012f);
        builderObtain.setIncludePad(this.f25014h);
        builderObtain.setTextDirection(this.f25015i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f25016j;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f25013g);
        return builderObtain.build();
    }

    public h setAlignment(Layout.Alignment alignment) {
        this.f25012f = alignment;
        return this;
    }

    public h setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f25016j = truncateAt;
        return this;
    }

    public h setEnd(int i8) {
        this.f25011e = i8;
        return this;
    }

    public h setIncludePad(boolean z8) {
        this.f25014h = z8;
        return this;
    }

    public h setIsRtl(boolean z8) {
        this.f25015i = z8;
        return this;
    }

    public h setMaxLines(int i8) {
        this.f25013g = i8;
        return this;
    }

    public h setStart(int i8) {
        this.f25010d = i8;
        return this;
    }
}
