package p6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.view.indexbar.IndexBarRecyclerView;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import r4.C6174a;
import z4.C6630d;
import z4.N;

/* renamed from: p6.a */
/* loaded from: classes.dex */
public class C6059a extends RecyclerView.o {

    /* renamed from: a */
    private Typeface f34619a;

    /* renamed from: b */
    private Drawable f34620b;

    /* renamed from: c */
    private Drawable f34621c;

    /* renamed from: p6.a$a */
    static /* synthetic */ class C0364a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34622a;

        static {
            int[] iArr = new int[b.values().length];
            f34622a = iArr;
            try {
                iArr[b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34622a[b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34622a[b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: p6.a$b */
    enum b {
        LEFT,
        CENTER,
        RIGHT,
        NONE
    }

    public C6059a(Context context) {
        try {
            this.f34619a = Typeface.createFromAsset(context.getAssets(), C6174a.FONT_NAME);
        } catch (RuntimeException unused) {
            this.f34619a = null;
        }
        this.f34620b = androidx.core.content.a.getDrawable(context, AbstractC5954e.list_divider);
        this.f34621c = androidx.core.content.a.getDrawable(context, AbstractC5954e.list_divider);
    }

    private b a(RecyclerView recyclerView, View view, int i8) {
        int i9;
        int childCount = recyclerView.getChildCount();
        int i10 = i8 + 1;
        if (i10 == childCount || ((i9 = i8 + 2) == childCount && recyclerView.getChildAt(i10).getLeft() != 0)) {
            return b.NONE;
        }
        View childAt = recyclerView.getChildAt(i10);
        View childAt2 = recyclerView.getChildAt(i9);
        return childAt.getId() == AbstractC5955f.tv_search_header ? b.NONE : (childAt2 == null || childAt2.getId() != AbstractC5955f.tv_search_header || childAt.getLeft() == 0) ? view.getLeft() != 0 ? b.RIGHT : view.getLeft() == childAt.getLeft() ? b.CENTER : b.LEFT : b.NONE;
    }

    public void onDrawDivider(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int right;
        int right2;
        int iDpToPx;
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            if (childAt.getId() == AbstractC5955f.stationNameTxt) {
                b bVarA = a(recyclerView, childAt, i8);
                int i9 = C0364a.f34622a[bVarA.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        left = childAt.getLeft();
                        right2 = childAt.getRight();
                        iDpToPx = N.dpToPx(12.0f);
                    } else if (i9 != 3) {
                        left = 0;
                        right = 0;
                    } else {
                        left = childAt.getLeft() + N.dpToPx(12.0f);
                        right2 = childAt.getRight();
                        iDpToPx = N.dpToPx(12.0f);
                    }
                    right = right2 - iDpToPx;
                } else {
                    left = childAt.getLeft() + N.dpToPx(12.0f);
                    right = childAt.getRight();
                }
                if (bVarA != b.NONE) {
                    int bottom = childAt.getBottom() - N.dpToPx(1.0f);
                    this.f34621c.setBounds(left, bottom, right, N.dpToPx(1.0f) + bottom);
                    this.f34621c.draw(canvas);
                }
                int right3 = childAt.getRight();
                int iDpToPx2 = N.dpToPx(1.0f) + right3;
                int top = childAt.getTop();
                int bottom2 = childAt.getBottom();
                if (right3 != recyclerView.getPaddingLeft()) {
                    this.f34620b.setBounds(right3, top, iDpToPx2, bottom2);
                    this.f34620b.draw(canvas);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b9) {
        boolean z8;
        Object obj;
        String[] strArr;
        float f8;
        String str;
        boolean z9;
        Object obj2;
        super.onDrawOver(canvas, recyclerView, b9);
        onDrawDivider(canvas, recyclerView);
        IndexBarRecyclerView indexBarRecyclerView = (IndexBarRecyclerView) recyclerView;
        if (indexBarRecyclerView.showIndexBar) {
            float f9 = indexBarRecyclerView.idxBarW;
            float f10 = indexBarRecyclerView.idxBarH;
            float f11 = indexBarRecyclerView.idxBarX;
            float f12 = indexBarRecyclerView.idxBarY;
            float f13 = indexBarRecyclerView.idxCharW;
            float f14 = indexBarRecyclerView.idxCharX;
            float f15 = indexBarRecyclerView.idxCharH;
            float f16 = indexBarRecyclerView.idxCharY;
            float f17 = indexBarRecyclerView.idxCharLineH;
            String[] strArr2 = indexBarRecyclerView.idxCharAry;
            String str2 = indexBarRecyclerView.selIdxChar;
            boolean z10 = indexBarRecyclerView.showCenterChar;
            if (strArr2 == null || strArr2.length == 0) {
                return;
            }
            if ((!z10 || !(str2 != null)) || str2.equals("")) {
                z8 = z10;
                obj = "";
                strArr = strArr2;
                f8 = f17;
                str = str2;
                z9 = true;
            } else {
                Paint paint = new Paint();
                paint.setColor(-16777216);
                paint.setAlpha(100);
                obj = "";
                z8 = z10;
                strArr = strArr2;
                f8 = f17;
                canvas.drawRect(0.0f, 0.0f, recyclerView.getWidth(), recyclerView.getHeight(), paint);
                float fDpToPx = N.dpToPx(100.0f);
                Paint paint2 = new Paint();
                paint2.setColor(-1);
                paint2.setTextSize(fDpToPx);
                z9 = true;
                paint2.setAntiAlias(true);
                paint2.setFakeBoldText(true);
                paint2.setStyle(Paint.Style.FILL);
                if (C6630d.isNotNull(this.f34619a)) {
                    paint2.setTypeface(this.f34619a);
                }
                str = str2;
                canvas.drawText(str, (canvas.getWidth() - ((int) fDpToPx)) / 2, (int) ((canvas.getHeight() / 2) - ((paint2.descent() + paint2.ascent()) / 2.0f)), paint2);
            }
            Paint paint3 = new Paint();
            paint3.setAntiAlias(z9);
            Paint.Style style = Paint.Style.FILL;
            paint3.setStyle(style);
            paint3.setColor(-1711276033);
            float f18 = f9 + f11;
            float f19 = f10 + f12;
            float fDpToPx2 = N.dpToPx(13.0f);
            canvas.drawRoundRect(new RectF(f11, f12, f18, f19), fDpToPx2, fDpToPx2, paint3);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setColor(1493172224);
            canvas.drawRoundRect(new RectF(f11, f12, f18, f19), fDpToPx2, fDpToPx2, paint3);
            Paint paint4 = new Paint();
            paint4.setAntiAlias(z9);
            paint4.setStyle(style);
            if (C6630d.isNotNull(this.f34619a)) {
                paint4.setTypeface(this.f34619a);
            }
            paint4.setTextSize(f15);
            float fAscent = (f16 + ((f8 - f15) / 2.0f)) - paint4.ascent();
            float fDpToPx3 = (f11 - N.dpToPx(2.0f)) - f13;
            String[] strArr3 = strArr;
            int i8 = 0;
            while (i8 < strArr3.length) {
                if (z8 && (str != null ? z9 : false)) {
                    obj2 = obj;
                    if (!str.equals(obj2) && strArr3[i8].equals(str)) {
                        paint4.setColor(-1);
                        paint4.setAlpha(255);
                        paint4.setFakeBoldText(z9);
                        canvas.drawText(strArr3[i8], f14, fAscent, paint4);
                        canvas.drawText("●", fDpToPx3, fAscent, paint4);
                    }
                    fAscent += f8;
                    i8++;
                    obj = obj2;
                } else {
                    obj2 = obj;
                }
                paint4.setColor(androidx.core.content.a.getColor(recyclerView.getContext(), AbstractC5953d.brownish_grey));
                paint4.setFakeBoldText(false);
                canvas.drawText(strArr3[i8], f14, fAscent, paint4);
                fAscent += f8;
                i8++;
                obj = obj2;
            }
        }
    }
}
