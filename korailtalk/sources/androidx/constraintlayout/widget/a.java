package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.core.view.AbstractC0985p0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f8560a;

    /* renamed from: b, reason: collision with root package name */
    private b f8561b;

    /* renamed from: c, reason: collision with root package name */
    private int f8562c;

    /* renamed from: d, reason: collision with root package name */
    private float f8563d;

    /* renamed from: e, reason: collision with root package name */
    private String f8564e;

    /* renamed from: f, reason: collision with root package name */
    boolean f8565f;

    /* renamed from: g, reason: collision with root package name */
    private int f8566g;

    /* renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0125a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8567a;

        static {
            int[] iArr = new int[b.values().length];
            f8567a = iArr;
            try {
                iArr[b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8567a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8567a[b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8567a[b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8567a[b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8567a[b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8567a[b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public a(String str, b bVar) {
        this.f8560a = str;
        this.f8561b = bVar;
    }

    private static int a(int i8) {
        int i9 = (i8 & (~(i8 >> 31))) - 255;
        return (i9 & (i9 >> 31)) + 255;
    }

    public static HashMap<String, a> extractAttributes(HashMap<String, a> map, View view) {
        HashMap<String, a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
            } catch (NoSuchMethodException e9) {
                e9.printStackTrace();
            } catch (InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
        return map2;
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        b bVar;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        b bVar2 = null;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i8);
            if (index == i.CustomAttribute_attributeName) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == i.CustomAttribute_customBoolean) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == i.CustomAttribute_customColorValue) {
                    bVar = b.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.CustomAttribute_customColorDrawableValue) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.CustomAttribute_customPixelDimension) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == i.CustomAttribute_customDimension) {
                    bVar = b.DIMENSION_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == i.CustomAttribute_customFloatValue) {
                    bVar = b.FLOAT_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == i.CustomAttribute_customIntegerValue) {
                    bVar = b.INT_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == i.CustomAttribute_customStringValue) {
                    bVar = b.STRING_TYPE;
                    string = typedArrayObtainStyledAttributes.getString(index);
                }
                Object obj = string;
                bVar2 = bVar;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new a(string2, bVar2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setAttributes(View view, HashMap<String, a> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String str2 = "set" + str;
            try {
                switch (C0125a.f8567a[aVar.f8561b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f8566g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f8566g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f8562c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f8563d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f8564e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f8565f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f8563d));
                        break;
                }
            } catch (IllegalAccessException e8) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e8.printStackTrace();
            } catch (NoSuchMethodException e9) {
                Log.e("TransitionLayout", e9.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e10.printStackTrace();
            }
        }
    }

    public boolean diff(a aVar) {
        b bVar;
        if (aVar == null || (bVar = this.f8561b) != aVar.f8561b) {
            return false;
        }
        switch (C0125a.f8567a[bVar.ordinal()]) {
            case 1:
            case 2:
                return this.f8566g == aVar.f8566g;
            case 3:
                return this.f8562c == aVar.f8562c;
            case 4:
                return this.f8563d == aVar.f8563d;
            case 5:
                return this.f8562c == aVar.f8562c;
            case 6:
                return this.f8565f == aVar.f8565f;
            case 7:
                return this.f8563d == aVar.f8563d;
            default:
                return false;
        }
    }

    public b getType() {
        return this.f8561b;
    }

    public float getValueToInterpolate() {
        switch (C0125a.f8567a[this.f8561b.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f8562c;
            case 4:
                return this.f8563d;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f8565f ? 1.0f : 0.0f;
            case 7:
                return this.f8563d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (C0125a.f8567a[this.f8561b.ordinal()]) {
            case 1:
            case 2:
                int i8 = (this.f8566g >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i8 / 255.0f;
                return;
            case 3:
                fArr[0] = this.f8562c;
                return;
            case 4:
                fArr[0] = this.f8563d;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f8565f ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f8563d;
                return;
            default:
                return;
        }
    }

    public int noOfInterpValues() {
        int i8 = C0125a.f8567a[this.f8561b.ordinal()];
        return (i8 == 1 || i8 == 2) ? 4 : 1;
    }

    public void setColorValue(int i8) {
        this.f8566g = i8;
    }

    public void setFloatValue(float f8) {
        this.f8563d = f8;
    }

    public void setIntValue(int i8) {
        this.f8562c = i8;
    }

    public void setInterpolatedValue(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + this.f8560a;
        try {
            boolean z8 = true;
            switch (C0125a.f8567a[this.f8561b.ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iA = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f8560a);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z8 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z8));
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e8) {
            Log.e("TransitionLayout", "cannot access method " + str + "on View \"" + androidx.constraintlayout.motion.widget.b.getName(view) + "\"");
            e8.printStackTrace();
        } catch (NoSuchMethodException e9) {
            Log.e("TransitionLayout", "no method " + str + "on View \"" + androidx.constraintlayout.motion.widget.b.getName(view) + "\"");
            e9.printStackTrace();
        } catch (InvocationTargetException e10) {
            e10.printStackTrace();
        }
    }

    public void setStringValue(String str) {
        this.f8564e = str;
    }

    public void setValue(float[] fArr) {
        switch (C0125a.f8567a[this.f8561b.ordinal()]) {
            case 1:
            case 2:
                int iHSVToColor = Color.HSVToColor(fArr);
                this.f8566g = iHSVToColor;
                this.f8566g = (a((int) (fArr[3] * 255.0f)) << 24) | (iHSVToColor & AbstractC0985p0.MEASURED_SIZE_MASK);
                return;
            case 3:
                this.f8562c = (int) fArr[0];
                return;
            case 4:
                this.f8563d = fArr[0];
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                this.f8565f = ((double) fArr[0]) > 0.5d;
                return;
            case 7:
                this.f8563d = fArr[0];
                return;
            default:
                return;
        }
    }

    public a(String str, b bVar, Object obj) {
        this.f8560a = str;
        this.f8561b = bVar;
        setValue(obj);
    }

    public a(a aVar, Object obj) {
        this.f8560a = aVar.f8560a;
        this.f8561b = aVar.f8561b;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (C0125a.f8567a[this.f8561b.ordinal()]) {
            case 1:
            case 2:
                this.f8566g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f8562c = ((Integer) obj).intValue();
                break;
            case 4:
                this.f8563d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f8564e = (String) obj;
                break;
            case 6:
                this.f8565f = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f8563d = ((Float) obj).floatValue();
                break;
        }
    }
}
