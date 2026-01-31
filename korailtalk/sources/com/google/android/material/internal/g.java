package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f25000a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private b f25001b = null;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f25002c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f25003d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.f25002c == animator) {
                gVar.f25002c = null;
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f25005a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f25006b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f25005a = iArr;
            this.f25006b = valueAnimator;
        }
    }

    private void a() {
        ValueAnimator valueAnimator = this.f25002c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25002c = null;
        }
    }

    private void b(b bVar) {
        ValueAnimator valueAnimator = bVar.f25006b;
        this.f25002c = valueAnimator;
        valueAnimator.start();
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f25003d);
        this.f25000a.add(bVar);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.f25002c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f25002c = null;
        }
    }

    public void setState(int[] iArr) {
        b bVar;
        int size = this.f25000a.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                bVar = null;
                break;
            }
            bVar = (b) this.f25000a.get(i8);
            if (StateSet.stateSetMatches(bVar.f25005a, iArr)) {
                break;
            } else {
                i8++;
            }
        }
        b bVar2 = this.f25001b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            a();
        }
        this.f25001b = bVar;
        if (bVar != null) {
            b(bVar);
        }
    }
}
