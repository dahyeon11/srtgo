package androidx.appcompat.app;

import Q7.C0712p;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0844d;
import androidx.appcompat.widget.C0846f;
import androidx.appcompat.widget.C0847g;
import androidx.appcompat.widget.C0848h;
import androidx.appcompat.widget.C0851k;
import androidx.appcompat.widget.C0853m;
import androidx.appcompat.widget.C0855o;
import androidx.appcompat.widget.C0858s;
import androidx.appcompat.widget.C0861v;
import androidx.appcompat.widget.C0863x;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.o0;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5572j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.C5878d;

/* loaded from: classes.dex */
public class l {

    /* renamed from: b */
    private static final Class[] f6419b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f6420c = {R.attr.onClick};

    /* renamed from: d */
    private static final String[] f6421d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final O.h f6422e = new O.h();

    /* renamed from: a */
    private final Object[] f6423a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: a */
        private final View f6424a;

        /* renamed from: b */
        private final String f6425b;

        /* renamed from: c */
        private Method f6426c;

        /* renamed from: d */
        private Context f6427d;

        public a(View view, String str) {
            this.f6424a = view;
            this.f6425b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f6425b, View.class)) != null) {
                        this.f6426c = method;
                        this.f6427d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f6424a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f6424a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f6425b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f6424a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f6426c == null) {
                a(this.f6424a.getContext());
            }
            try {
                this.f6426c.invoke(this.f6427d, view);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("Could not execute method for android:onClick", e9);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && AbstractC0985p0.hasOnClickListeners(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6420c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        O.h hVar = f6422e;
        Constructor constructor = (Constructor) hVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6419b);
            hVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6423a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f6423a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i8 = 0;
            while (true) {
                String[] strArr = f6421d;
                if (i8 >= strArr.length) {
                    return null;
                }
                View viewR = r(context, str, strArr[i8]);
                if (viewR != null) {
                    return viewR;
                }
                i8++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f6423a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z8, boolean z9) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5572j.View, 0, 0);
        int resourceId = z8 ? typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.View_android_theme, 0) : 0;
        if (z9 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.View_theme, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C5878d) && ((C5878d) context).getThemeResId() == resourceId) ? context : new C5878d(context, resourceId) : context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C0844d b(Context context, AttributeSet attributeSet) {
        return new C0844d(context, attributeSet);
    }

    protected C0846f c(Context context, AttributeSet attributeSet) {
        return new C0846f(context, attributeSet);
    }

    protected C0847g d(Context context, AttributeSet attributeSet) {
        return new C0847g(context, attributeSet);
    }

    protected C0848h e(Context context, AttributeSet attributeSet) {
        return new C0848h(context, attributeSet);
    }

    protected C0851k f(Context context, AttributeSet attributeSet) {
        return new C0851k(context, attributeSet);
    }

    protected C0853m g(Context context, AttributeSet attributeSet) {
        return new C0853m(context, attributeSet);
    }

    protected AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected C0855o i(Context context, AttributeSet attributeSet) {
        return new C0855o(context, attributeSet);
    }

    protected androidx.appcompat.widget.r j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected C0858s k(Context context, AttributeSet attributeSet) {
        return new C0858s(context, attributeSet);
    }

    protected C0861v l(Context context, AttributeSet attributeSet) {
        return new C0861v(context, attributeSet);
    }

    protected C0863x m(Context context, AttributeSet attributeSet) {
        return new C0863x(context, attributeSet);
    }

    protected J n(Context context, AttributeSet attributeSet) {
        return new J(context, attributeSet);
    }

    protected N o(Context context, AttributeSet attributeSet) {
        return new N(context, attributeSet);
    }

    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z8, boolean z9, boolean z10, boolean z11) {
        View viewK;
        Context context2 = (!z8 || view == null) ? context : view.getContext();
        if (z9 || z10) {
            context2 = t(context2, attributeSet, z9, z10);
        }
        if (z11) {
            context2 = o0.wrap(context2);
        }
        str.hashCode();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c9 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c9 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c9 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c9 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c9 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c9 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c9 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c9 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c9 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c9 = C0712p.CR;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                viewK = k(context2, attributeSet);
                u(viewK, str);
                break;
            case 1:
                viewK = e(context2, attributeSet);
                u(viewK, str);
                break;
            case 2:
                viewK = i(context2, attributeSet);
                u(viewK, str);
                break;
            case 3:
                viewK = n(context2, attributeSet);
                u(viewK, str);
                break;
            case 4:
                viewK = g(context2, attributeSet);
                u(viewK, str);
                break;
            case 5:
                viewK = l(context2, attributeSet);
                u(viewK, str);
                break;
            case 6:
                viewK = m(context2, attributeSet);
                u(viewK, str);
                break;
            case 7:
                viewK = j(context2, attributeSet);
                u(viewK, str);
                break;
            case '\b':
                viewK = o(context2, attributeSet);
                u(viewK, str);
                break;
            case '\t':
                viewK = h(context2, attributeSet);
                u(viewK, str);
                break;
            case '\n':
                viewK = b(context2, attributeSet);
                u(viewK, str);
                break;
            case 11:
                viewK = d(context2, attributeSet);
                u(viewK, str);
                break;
            case '\f':
                viewK = f(context2, attributeSet);
                u(viewK, str);
                break;
            case '\r':
                viewK = c(context2, attributeSet);
                u(viewK, str);
                break;
            default:
                viewK = p(context2, str, attributeSet);
                break;
        }
        if (viewK == null && context != context2) {
            viewK = s(context2, str, attributeSet);
        }
        if (viewK != null) {
            a(viewK, attributeSet);
        }
        return viewK;
    }
}
