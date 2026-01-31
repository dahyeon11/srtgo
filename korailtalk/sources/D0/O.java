package D0;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
abstract class O {

    /* renamed from: b, reason: collision with root package name */
    private static Method f726b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f727c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f728d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f729e;

    /* renamed from: a, reason: collision with root package name */
    private float[] f730a;

    O() {
    }

    private void a() throws NoSuchMethodException, SecurityException {
        if (f727c) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f726b = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f727c = true;
    }

    public void clearNonTransitionAlpha(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(AbstractC0490i.save_non_transition_alpha, null);
        }
    }

    public float getTransitionAlpha(View view) {
        Float f8 = (Float) view.getTag(AbstractC0490i.save_non_transition_alpha);
        return f8 != null ? view.getAlpha() / f8.floatValue() : view.getAlpha();
    }

    public void saveNonTransitionAlpha(View view) {
        if (view.getTag(AbstractC0490i.save_non_transition_alpha) == null) {
            view.setTag(AbstractC0490i.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void setAnimationMatrix(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f730a;
        if (fArr == null) {
            fArr = new float[9];
            this.f730a = fArr;
        }
        matrix.getValues(fArr);
        float f8 = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f8 * f8))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f8, fSqrt));
        float f9 = fArr[0] / fSqrt;
        float f10 = fArr[4] / fSqrt;
        float f11 = fArr[2];
        float f12 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        view.setRotation(degrees);
        view.setScaleX(f9);
        view.setScaleY(f10);
    }

    public void setLeftTopRightBottom(View view, int i8, int i9, int i10, int i11) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a();
        Method method = f726b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8.getCause());
            }
        }
    }

    public void setTransitionAlpha(View view, float f8) {
        Float f9 = (Float) view.getTag(AbstractC0490i.save_non_transition_alpha);
        if (f9 != null) {
            view.setAlpha(f9.floatValue() * f8);
        } else {
            view.setAlpha(f8);
        }
    }

    public void setTransitionVisibility(View view, int i8) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f729e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f728d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f729e = true;
        }
        Field field = f728d;
        if (field != null) {
            try {
                f728d.setInt(view, i8 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void transformMatrixToGlobal(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            transformMatrixToGlobal((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void transformMatrixToLocal(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            transformMatrixToLocal((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
