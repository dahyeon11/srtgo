package K2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final O.h f2869a = new O.h();

    /* renamed from: b, reason: collision with root package name */
    private final O.h f2870b = new O.h();

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.setTiming(objectAnimator.getPropertyName(), i.a(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    private PropertyValuesHolder[] b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i8 = 0; i8 < propertyValuesHolderArr.length; i8++) {
            propertyValuesHolderArr2[i8] = propertyValuesHolderArr[i8].clone();
        }
        return propertyValuesHolderArr2;
    }

    private static h c(List list) {
        h hVar = new h();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            a(hVar, (Animator) list.get(i8));
        }
        return hVar;
    }

    public static h createFromAttribute(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        if (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    public static h createFromResource(Context context, int i8) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i8);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e8) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i8), e8);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f2869a.equals(((h) obj).f2869a);
        }
        return false;
    }

    public <T> ObjectAnimator getAnimator(String str, T t8, Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t8, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return b((PropertyValuesHolder[]) this.f2870b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public i getTiming(String str) {
        if (hasTiming(str)) {
            return (i) this.f2869a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int size = this.f2869a.size();
        long jMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = (i) this.f2869a.valueAt(i8);
            jMax = Math.max(jMax, iVar.getDelay() + iVar.getDuration());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.f2870b.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.f2869a.get(str) != null;
    }

    public int hashCode() {
        return this.f2869a.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f2870b.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, i iVar) {
        this.f2869a.put(str, iVar);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2869a + "}\n";
    }
}
