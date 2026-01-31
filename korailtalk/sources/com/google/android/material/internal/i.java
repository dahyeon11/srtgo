package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private float f25019c;

    /* renamed from: f, reason: collision with root package name */
    private X2.d f25022f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f25017a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final X2.f f25018b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f25020d = true;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference f25021e = new WeakReference(null);

    class a extends X2.f {
        a() {
        }

        @Override // X2.f
        public void onFontRetrievalFailed(int i8) {
            i.this.f25020d = true;
            b bVar = (b) i.this.f25021e.get();
            if (bVar != null) {
                bVar.onTextSizeChange();
            }
        }

        @Override // X2.f
        public void onFontRetrieved(Typeface typeface, boolean z8) {
            if (z8) {
                return;
            }
            i.this.f25020d = true;
            b bVar = (b) i.this.f25021e.get();
            if (bVar != null) {
                bVar.onTextSizeChange();
            }
        }
    }

    public interface b {
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public i(b bVar) {
        setDelegate(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f25017a.measureText(charSequence, 0, charSequence.length());
    }

    public X2.d getTextAppearance() {
        return this.f25022f;
    }

    public TextPaint getTextPaint() {
        return this.f25017a;
    }

    public float getTextWidth(String str) {
        if (!this.f25020d) {
            return this.f25019c;
        }
        float fC = c(str);
        this.f25019c = fC;
        this.f25020d = false;
        return fC;
    }

    public boolean isTextWidthDirty() {
        return this.f25020d;
    }

    public void setDelegate(b bVar) {
        this.f25021e = new WeakReference(bVar);
    }

    public void setTextAppearance(X2.d dVar, Context context) {
        if (this.f25022f != dVar) {
            this.f25022f = dVar;
            if (dVar != null) {
                dVar.updateMeasureState(context, this.f25017a, this.f25018b);
                b bVar = (b) this.f25021e.get();
                if (bVar != null) {
                    this.f25017a.drawableState = bVar.getState();
                }
                dVar.updateDrawState(context, this.f25017a, this.f25018b);
                this.f25020d = true;
            }
            b bVar2 = (b) this.f25021e.get();
            if (bVar2 != null) {
                bVar2.onTextSizeChange();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void setTextWidthDirty(boolean z8) {
        this.f25020d = z8;
    }

    public void updateTextPaintDrawState(Context context) {
        this.f25022f.updateDrawState(context, this.f25017a, this.f25018b);
    }
}
