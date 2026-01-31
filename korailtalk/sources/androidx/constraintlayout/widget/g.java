package androidx.constraintlayout.widget;

import R.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: a */
    private int f8606a;

    /* renamed from: b */
    private View f8607b;

    /* renamed from: c */
    private int f8608c;

    public g(Context context) {
        super(context);
        this.f8606a = -1;
        this.f8607b = null;
        this.f8608c = 4;
        a(null);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f8608c);
        this.f8606a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.ConstraintLayout_placeholder_content) {
                    this.f8606a = typedArrayObtainStyledAttributes.getResourceId(index, this.f8606a);
                } else if (index == i.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f8608c = typedArrayObtainStyledAttributes.getInt(index, this.f8608c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f8607b;
    }

    public int getEmptyVisibility() {
        return this.f8608c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i8) {
        View viewFindViewById;
        if (this.f8606a == i8) {
            return;
        }
        View view = this.f8607b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f8607b.getLayoutParams()).f8539h = false;
            this.f8607b = null;
        }
        this.f8606a = i8;
        if (i8 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i8)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i8) {
        this.f8608c = i8;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        if (this.f8607b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f8607b.getLayoutParams();
        bVar2.f8551t.setVisibility(0);
        e.b horizontalDimensionBehaviour = bVar.f8551t.getHorizontalDimensionBehaviour();
        e.b bVar3 = e.b.FIXED;
        if (horizontalDimensionBehaviour != bVar3) {
            bVar.f8551t.setWidth(bVar2.f8551t.getWidth());
        }
        if (bVar.f8551t.getVerticalDimensionBehaviour() != bVar3) {
            bVar.f8551t.setHeight(bVar2.f8551t.getHeight());
        }
        bVar2.f8551t.setVisibility(8);
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.f8606a == -1 && !isInEditMode()) {
            setVisibility(this.f8608c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f8606a);
        this.f8607b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f8539h = true;
            this.f8607b.setVisibility(0);
            setVisibility(0);
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8606a = -1;
        this.f8607b = null;
        this.f8608c = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f8606a = -1;
        this.f8607b = null;
        this.f8608c = 4;
        a(attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8);
        this.f8606a = -1;
        this.f8607b = null;
        this.f8608c = 4;
        a(attributeSet);
    }
}
