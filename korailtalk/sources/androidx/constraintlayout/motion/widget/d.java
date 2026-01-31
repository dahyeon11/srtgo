package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class d {
    public static int UNSET = -1;

    /* renamed from: a, reason: collision with root package name */
    int f8098a;

    /* renamed from: b, reason: collision with root package name */
    int f8099b;

    /* renamed from: c, reason: collision with root package name */
    String f8100c;

    /* renamed from: d, reason: collision with root package name */
    protected int f8101d;

    /* renamed from: e, reason: collision with root package name */
    HashMap f8102e;

    public d() {
        int i8 = UNSET;
        this.f8098a = i8;
        this.f8099b = i8;
        this.f8100c = null;
    }

    boolean a(String str) {
        String str2 = this.f8100c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public abstract void addValues(HashMap<String, v> map);

    boolean b(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float c(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int d(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    abstract void getAttributeNames(HashSet hashSet);

    abstract void load(Context context, AttributeSet attributeSet);

    public void setInterpolation(HashMap<String, Integer> map) {
    }

    public abstract void setValue(String str, Object obj);
}
