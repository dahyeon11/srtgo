package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.g0;
import java.util.WeakHashMap;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5638a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f31669a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f31670b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f31671c = new Object();

    public static ColorStateList getColorStateList(Context context, int i8) {
        return context.getColorStateList(i8);
    }

    public static Drawable getDrawable(Context context, int i8) {
        return g0.get().getDrawable(context, i8);
    }
}
