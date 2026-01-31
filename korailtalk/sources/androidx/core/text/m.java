package androidx.core.text;

import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class m implements Spannable {

    /* renamed from: e */
    private static final Object f9057e = new Object();

    /* renamed from: f */
    private static Executor f9058f;

    /* renamed from: a */
    private final Spannable f9059a;

    /* renamed from: b */
    private final b f9060b;

    /* renamed from: c */
    private final int[] f9061c;

    /* renamed from: d */
    private final PrecomputedText f9062d;

    static class a {
        static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    private static class c extends FutureTask {

        private static class a implements Callable {

            /* renamed from: a */
            private b f9072a;

            /* renamed from: b */
            private CharSequence f9073b;

            a(b bVar, CharSequence charSequence) {
                this.f9072a = bVar;
                this.f9073b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            public m call() {
                return m.create(this.f9073b, this.f9072a);
            }
        }

        c(b bVar, CharSequence charSequence) {
            super(new a(bVar, charSequence));
        }
    }

    private m(CharSequence charSequence, b bVar, int[] iArr) {
        this.f9059a = new SpannableString(charSequence);
        this.f9060b = bVar;
        this.f9061c = iArr;
        this.f9062d = null;
    }

    public static m create(CharSequence charSequence, b bVar) {
        PrecomputedText.Params params;
        Z.h.checkNotNull(charSequence);
        Z.h.checkNotNull(bVar);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = bVar.f9067e) != null) {
                return new m(PrecomputedText.create(charSequence, params), bVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i8 = 0;
            while (i8 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i8, length);
                i8 = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i8));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                iArr[i9] = ((Integer) arrayList.get(i9)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), bVar.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(bVar.getBreakStrategy()).setHyphenationFrequency(bVar.getHyphenationFrequency()).setTextDirection(bVar.getTextDirection()).build();
            return new m(charSequence, bVar, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public static Future<m> getTextFuture(CharSequence charSequence, b bVar, Executor executor) {
        c cVar = new c(bVar, charSequence);
        if (executor == null) {
            synchronized (f9057e) {
                try {
                    if (f9058f == null) {
                        f9058f = Executors.newFixedThreadPool(1);
                    }
                    executor = f9058f;
                } finally {
                }
            }
        }
        executor.execute(cVar);
        return cVar;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i8) {
        return this.f9059a.charAt(i8);
    }

    public int getParagraphCount() {
        return Build.VERSION.SDK_INT >= 29 ? this.f9062d.getParagraphCount() : this.f9061c.length;
    }

    public int getParagraphEnd(int i8) {
        Z.h.checkArgumentInRange(i8, 0, getParagraphCount(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f9062d.getParagraphEnd(i8) : this.f9061c[i8];
    }

    public int getParagraphStart(int i8) {
        Z.h.checkArgumentInRange(i8, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f9062d.getParagraphStart(i8);
        }
        if (i8 == 0) {
            return 0;
        }
        return this.f9061c[i8 - 1];
    }

    public b getParams() {
        return this.f9060b;
    }

    public PrecomputedText getPrecomputedText() {
        if (e.a(this.f9059a)) {
            return f.a(this.f9059a);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f9059a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f9059a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f9059a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i8, int i9, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f9062d.getSpans(i8, i9, cls) : (T[]) this.f9059a.getSpans(i8, i9, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f9059a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i8, int i9, Class cls) {
        return this.f9059a.nextSpanTransition(i8, i9, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9062d.removeSpan(obj);
        } else {
            this.f9059a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i8, int i9, int i10) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9062d.setSpan(obj, i8, i9, i10);
        } else {
            this.f9059a.setSpan(obj, i8, i9, i10);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        return this.f9059a.subSequence(i8, i9);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f9059a.toString();
    }

    private m(PrecomputedText precomputedText, b bVar) {
        this.f9059a = a.a(precomputedText);
        this.f9060b = bVar;
        this.f9061c = null;
        this.f9062d = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static final class b {

        /* renamed from: a */
        private final TextPaint f9063a;

        /* renamed from: b */
        private final TextDirectionHeuristic f9064b;

        /* renamed from: c */
        private final int f9065c;

        /* renamed from: d */
        private final int f9066d;

        /* renamed from: e */
        final PrecomputedText.Params f9067e;

        public static class a {

            /* renamed from: a */
            private final TextPaint f9068a;

            /* renamed from: c */
            private int f9070c = 1;

            /* renamed from: d */
            private int f9071d = 1;

            /* renamed from: b */
            private TextDirectionHeuristic f9069b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(TextPaint textPaint) {
                this.f9068a = textPaint;
            }

            public b build() {
                return new b(this.f9068a, this.f9069b, this.f9070c, this.f9071d);
            }

            public a setBreakStrategy(int i8) {
                this.f9070c = i8;
                return this;
            }

            public a setHyphenationFrequency(int i8) {
                this.f9071d = i8;
                return this;
            }

            public a setTextDirection(TextDirectionHeuristic textDirectionHeuristic) {
                this.f9069b = textDirectionHeuristic;
                return this;
            }
        }

        b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i8, int i9) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f9067e = w.a(textPaint).setBreakStrategy(i8).setHyphenationFrequency(i9).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f9067e = null;
            }
            this.f9063a = textPaint;
            this.f9064b = textDirectionHeuristic;
            this.f9065c = i8;
            this.f9066d = i9;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return equalsWithoutTextDirection(bVar) && this.f9064b == bVar.getTextDirection();
        }

        public boolean equalsWithoutTextDirection(b bVar) {
            if (this.f9065c == bVar.getBreakStrategy() && this.f9066d == bVar.getHyphenationFrequency() && this.f9063a.getTextSize() == bVar.getTextPaint().getTextSize() && this.f9063a.getTextScaleX() == bVar.getTextPaint().getTextScaleX() && this.f9063a.getTextSkewX() == bVar.getTextPaint().getTextSkewX() && this.f9063a.getLetterSpacing() == bVar.getTextPaint().getLetterSpacing() && TextUtils.equals(this.f9063a.getFontFeatureSettings(), bVar.getTextPaint().getFontFeatureSettings()) && this.f9063a.getFlags() == bVar.getTextPaint().getFlags() && this.f9063a.getTextLocales().equals(bVar.getTextPaint().getTextLocales())) {
                return this.f9063a.getTypeface() == null ? bVar.getTextPaint().getTypeface() == null : this.f9063a.getTypeface().equals(bVar.getTextPaint().getTypeface());
            }
            return false;
        }

        public int getBreakStrategy() {
            return this.f9065c;
        }

        public int getHyphenationFrequency() {
            return this.f9066d;
        }

        public TextDirectionHeuristic getTextDirection() {
            return this.f9064b;
        }

        public TextPaint getTextPaint() {
            return this.f9063a;
        }

        public int hashCode() {
            return Z.c.hash(Float.valueOf(this.f9063a.getTextSize()), Float.valueOf(this.f9063a.getTextScaleX()), Float.valueOf(this.f9063a.getTextSkewX()), Float.valueOf(this.f9063a.getLetterSpacing()), Integer.valueOf(this.f9063a.getFlags()), this.f9063a.getTextLocales(), this.f9063a.getTypeface(), Boolean.valueOf(this.f9063a.isElegantTextHeight()), this.f9064b, Integer.valueOf(this.f9065c), Integer.valueOf(this.f9066d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f9063a.getTextSize());
            sb.append(", textScaleX=" + this.f9063a.getTextScaleX());
            sb.append(", textSkewX=" + this.f9063a.getTextSkewX());
            int i8 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f9063a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f9063a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f9063a.getTextLocales());
            sb.append(", typeface=" + this.f9063a.getTypeface());
            if (i8 >= 26) {
                sb.append(", variationSettings=" + this.f9063a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f9064b);
            sb.append(", breakStrategy=" + this.f9065c);
            sb.append(", hyphenationFrequency=" + this.f9066d);
            sb.append("}");
            return sb.toString();
        }

        public b(PrecomputedText.Params params) {
            this.f9063a = params.getTextPaint();
            this.f9064b = params.getTextDirection();
            this.f9065c = params.getBreakStrategy();
            this.f9066d = params.getHyphenationFrequency();
            this.f9067e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
