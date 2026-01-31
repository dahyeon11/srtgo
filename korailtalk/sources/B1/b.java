package B1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private y1.o f192a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView.ScaleType f193b;

    public b(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f193b = scaleType;
    }

    public void setMediaContent(y1.o oVar) {
        this.f192a = oVar;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public b(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }
}
