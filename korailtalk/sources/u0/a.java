package U0;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.AbstractC0985p0;
import f1.i;

/* loaded from: classes.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i8) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(i.clamp(i8, 0, 255));
        } else {
            setColor((i.clamp(i8, 0, 255) << 24) | (getColor() & AbstractC0985p0.MEASURED_SIZE_MASK));
        }
    }

    public a(int i8) {
        super(i8);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i8, PorterDuff.Mode mode) {
        super(i8);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
