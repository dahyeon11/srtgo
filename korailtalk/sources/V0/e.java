package V0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.List;

/* loaded from: classes.dex */
public interface e extends c {
    void draw(Canvas canvas, Matrix matrix, int i8);

    void getBounds(RectF rectF, Matrix matrix, boolean z8);

    /* synthetic */ String getName();

    /* synthetic */ void setContents(List list, List list2);
}
