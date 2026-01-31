package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.W;
import androidx.appcompat.widget.r0;
import androidx.core.view.AbstractC0942b;
import androidx.core.view.K;
import h.AbstractC5572j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f33852e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f33853f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f33854a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f33855b;

    /* renamed from: c, reason: collision with root package name */
    Context f33856c;

    /* renamed from: d, reason: collision with root package name */
    private Object f33857d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class[] f33858c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f33859a;

        /* renamed from: b, reason: collision with root package name */
        private Method f33860b;

        public a(Object obj, String str) {
            this.f33859a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f33860b = cls.getMethod(str, f33858c);
            } catch (Exception e8) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e8);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f33860b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f33860b.invoke(this.f33859a, menuItem)).booleanValue();
                }
                this.f33860b.invoke(this.f33859a, menuItem);
                return true;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    private class b {

        /* renamed from: A, reason: collision with root package name */
        AbstractC0942b f33861A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f33862B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f33863C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f33864D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f33865E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f33867a;

        /* renamed from: b, reason: collision with root package name */
        private int f33868b;

        /* renamed from: c, reason: collision with root package name */
        private int f33869c;

        /* renamed from: d, reason: collision with root package name */
        private int f33870d;

        /* renamed from: e, reason: collision with root package name */
        private int f33871e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f33872f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f33873g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f33874h;

        /* renamed from: i, reason: collision with root package name */
        private int f33875i;

        /* renamed from: j, reason: collision with root package name */
        private int f33876j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f33877k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f33878l;

        /* renamed from: m, reason: collision with root package name */
        private int f33879m;

        /* renamed from: n, reason: collision with root package name */
        private char f33880n;

        /* renamed from: o, reason: collision with root package name */
        private int f33881o;

        /* renamed from: p, reason: collision with root package name */
        private char f33882p;

        /* renamed from: q, reason: collision with root package name */
        private int f33883q;

        /* renamed from: r, reason: collision with root package name */
        private int f33884r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f33885s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f33886t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f33887u;

        /* renamed from: v, reason: collision with root package name */
        private int f33888v;

        /* renamed from: w, reason: collision with root package name */
        private int f33889w;

        /* renamed from: x, reason: collision with root package name */
        private String f33890x;

        /* renamed from: y, reason: collision with root package name */
        private String f33891y;

        /* renamed from: z, reason: collision with root package name */
        private String f33892z;

        public b(Menu menu) {
            this.f33867a = menu;
            resetGroup();
        }

        private char a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object b(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f33856c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e8) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
                return null;
            }
        }

        private void c(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z8 = false;
            menuItem.setChecked(this.f33885s).setVisible(this.f33886t).setEnabled(this.f33887u).setCheckable(this.f33884r >= 1).setTitleCondensed(this.f33878l).setIcon(this.f33879m);
            int i8 = this.f33888v;
            if (i8 >= 0) {
                menuItem.setShowAsAction(i8);
            }
            if (this.f33892z != null) {
                if (g.this.f33856c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f33892z));
            }
            if (this.f33884r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof m.c) {
                    ((m.c) menuItem).setExclusiveCheckable(true);
                }
            }
            String str = this.f33890x;
            if (str != null) {
                menuItem.setActionView((View) b(str, g.f33852e, g.this.f33854a));
                z8 = true;
            }
            int i9 = this.f33889w;
            if (i9 > 0) {
                if (z8) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i9);
                }
            }
            AbstractC0942b abstractC0942b = this.f33861A;
            if (abstractC0942b != null) {
                K.setActionProvider(menuItem, abstractC0942b);
            }
            K.setContentDescription(menuItem, this.f33862B);
            K.setTooltipText(menuItem, this.f33863C);
            K.setAlphabeticShortcut(menuItem, this.f33880n, this.f33881o);
            K.setNumericShortcut(menuItem, this.f33882p, this.f33883q);
            PorterDuff.Mode mode = this.f33865E;
            if (mode != null) {
                K.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.f33864D;
            if (colorStateList != null) {
                K.setIconTintList(menuItem, colorStateList);
            }
        }

        public void addItem() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f33874h = true;
            c(this.f33867a.add(this.f33868b, this.f33875i, this.f33876j, this.f33877k));
        }

        public SubMenu addSubMenuItem() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f33874h = true;
            SubMenu subMenuAddSubMenu = this.f33867a.addSubMenu(this.f33868b, this.f33875i, this.f33876j, this.f33877k);
            c(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean hasAddedItem() {
            return this.f33874h;
        }

        public void readGroup(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f33856c.obtainStyledAttributes(attributeSet, AbstractC5572j.MenuGroup);
            this.f33868b = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.MenuGroup_android_id, 0);
            this.f33869c = typedArrayObtainStyledAttributes.getInt(AbstractC5572j.MenuGroup_android_menuCategory, 0);
            this.f33870d = typedArrayObtainStyledAttributes.getInt(AbstractC5572j.MenuGroup_android_orderInCategory, 0);
            this.f33871e = typedArrayObtainStyledAttributes.getInt(AbstractC5572j.MenuGroup_android_checkableBehavior, 0);
            this.f33872f = typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.MenuGroup_android_visible, true);
            this.f33873g = typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void readItem(AttributeSet attributeSet) {
            r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(g.this.f33856c, attributeSet, AbstractC5572j.MenuItem);
            this.f33875i = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.MenuItem_android_id, 0);
            this.f33876j = (r0VarObtainStyledAttributes.getInt(AbstractC5572j.MenuItem_android_menuCategory, this.f33869c) & W.a.CATEGORY_MASK) | (r0VarObtainStyledAttributes.getInt(AbstractC5572j.MenuItem_android_orderInCategory, this.f33870d) & 65535);
            this.f33877k = r0VarObtainStyledAttributes.getText(AbstractC5572j.MenuItem_android_title);
            this.f33878l = r0VarObtainStyledAttributes.getText(AbstractC5572j.MenuItem_android_titleCondensed);
            this.f33879m = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.MenuItem_android_icon, 0);
            this.f33880n = a(r0VarObtainStyledAttributes.getString(AbstractC5572j.MenuItem_android_alphabeticShortcut));
            this.f33881o = r0VarObtainStyledAttributes.getInt(AbstractC5572j.MenuItem_alphabeticModifiers, 4096);
            this.f33882p = a(r0VarObtainStyledAttributes.getString(AbstractC5572j.MenuItem_android_numericShortcut));
            this.f33883q = r0VarObtainStyledAttributes.getInt(AbstractC5572j.MenuItem_numericModifiers, 4096);
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.MenuItem_android_checkable)) {
                this.f33884r = r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f33884r = this.f33871e;
            }
            this.f33885s = r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.MenuItem_android_checked, false);
            this.f33886t = r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.MenuItem_android_visible, this.f33872f);
            this.f33887u = r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.MenuItem_android_enabled, this.f33873g);
            this.f33888v = r0VarObtainStyledAttributes.getInt(AbstractC5572j.MenuItem_showAsAction, -1);
            this.f33892z = r0VarObtainStyledAttributes.getString(AbstractC5572j.MenuItem_android_onClick);
            this.f33889w = r0VarObtainStyledAttributes.getResourceId(AbstractC5572j.MenuItem_actionLayout, 0);
            this.f33890x = r0VarObtainStyledAttributes.getString(AbstractC5572j.MenuItem_actionViewClass);
            String string = r0VarObtainStyledAttributes.getString(AbstractC5572j.MenuItem_actionProviderClass);
            this.f33891y = string;
            boolean z8 = string != null;
            if (z8 && this.f33889w == 0 && this.f33890x == null) {
                this.f33861A = (AbstractC0942b) b(string, g.f33853f, g.this.f33855b);
            } else {
                if (z8) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f33861A = null;
            }
            this.f33862B = r0VarObtainStyledAttributes.getText(AbstractC5572j.MenuItem_contentDescription);
            this.f33863C = r0VarObtainStyledAttributes.getText(AbstractC5572j.MenuItem_tooltipText);
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.MenuItem_iconTintMode)) {
                this.f33865E = W.parseTintMode(r0VarObtainStyledAttributes.getInt(AbstractC5572j.MenuItem_iconTintMode, -1), this.f33865E);
            } else {
                this.f33865E = null;
            }
            if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.MenuItem_iconTint)) {
                this.f33864D = r0VarObtainStyledAttributes.getColorStateList(AbstractC5572j.MenuItem_iconTint);
            } else {
                this.f33864D = null;
            }
            r0VarObtainStyledAttributes.recycle();
            this.f33874h = false;
        }

        public void resetGroup() {
            this.f33868b = 0;
            this.f33869c = 0;
            this.f33870d = 0;
            this.f33871e = 0;
            this.f33872f = true;
            this.f33873g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f33852e = clsArr;
        f33853f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f33856c = context;
        Object[] objArr = {context};
        this.f33854a = objArr;
        this.f33855b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z8 = false;
        boolean z9 = false;
        String str = null;
        while (!z8) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z9 && name2.equals(str)) {
                        z9 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.resetGroup();
                    } else if (name2.equals("item")) {
                        if (!bVar.hasAddedItem()) {
                            AbstractC0942b abstractC0942b = bVar.f33861A;
                            if (abstractC0942b == null || !abstractC0942b.hasSubMenu()) {
                                bVar.addItem();
                            } else {
                                bVar.addSubMenuItem();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z8 = true;
                    }
                }
            } else if (!z9) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.readGroup(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.readItem(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.addSubMenuItem());
                } else {
                    str = name3;
                    z9 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f33857d == null) {
            this.f33857d = a(this.f33856c);
        }
        return this.f33857d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i8, Menu menu) {
        if (!(menu instanceof W.a)) {
            super.inflate(i8, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f33856c.getResources().getLayout(i8);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (XmlPullParserException e8) {
                    throw new InflateException("Error inflating menu XML", e8);
                }
            } catch (IOException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
