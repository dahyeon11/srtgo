package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;

/* loaded from: classes.dex */
public class Barrier extends b {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f8503j;

    /* renamed from: k, reason: collision with root package name */
    private int f8504k;

    /* renamed from: l, reason: collision with root package name */
    private R.a f8505l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void k(R.e eVar, int i8, boolean z8) {
        this.f8504k = i8;
        if (z8) {
            int i9 = this.f8503j;
            if (i9 == 5) {
                this.f8504k = 1;
            } else if (i9 == 6) {
                this.f8504k = 0;
            }
        } else {
            int i10 = this.f8503j;
            if (i10 == 5) {
                this.f8504k = 0;
            } else if (i10 == 6) {
                this.f8504k = 1;
            }
        }
        if (eVar instanceof R.a) {
            ((R.a) eVar).setBarrierType(this.f8504k);
        }
    }

    public boolean allowsGoneWidget() {
        return this.f8505l.allowsGoneWidget();
    }

    public int getMargin() {
        return this.f8505l.getMargin();
    }

    public int getType() {
        return this.f8503j;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void j(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.j(attributeSet);
        this.f8505l = new R.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == i.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f8505l.setAllowsGoneWidget(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.ConstraintLayout_Layout_barrierMargin) {
                    this.f8505l.setMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8572d = this.f8505l;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.b
    public void loadParameters(d.a aVar, R.j jVar, ConstraintLayout.b bVar, SparseArray<R.e> sparseArray) {
        super.loadParameters(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof R.a) {
            R.a aVar2 = (R.a) jVar;
            k(aVar2, aVar.layout.mBarrierDirection, ((R.f) jVar.getParent()).isRtl());
            aVar2.setAllowsGoneWidget(aVar.layout.mBarrierAllowsGoneWidgets);
            aVar2.setMargin(aVar.layout.mBarrierMargin);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void resolveRtl(R.e eVar, boolean z8) {
        k(eVar, this.f8503j, z8);
    }

    public void setAllowsGoneWidget(boolean z8) {
        this.f8505l.setAllowsGoneWidget(z8);
    }

    public void setDpMargin(int i8) {
        this.f8505l.setMargin((int) ((i8 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i8) {
        this.f8505l.setMargin(i8);
    }

    public void setType(int i8) {
        this.f8503j = i8;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        super.setVisibility(8);
    }
}
