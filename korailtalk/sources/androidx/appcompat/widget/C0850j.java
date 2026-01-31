package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.g0;
import h.AbstractC5563a;
import h.AbstractC5565c;
import h.AbstractC5566d;
import h.AbstractC5567e;
import i.AbstractC5638a;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C0850j {

    /* renamed from: b */
    private static final PorterDuff.Mode f7142b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0850j f7143c;

    /* renamed from: a */
    private g0 f7144a;

    /* renamed from: androidx.appcompat.widget.j$a */
    class a implements g0.c {

        /* renamed from: a */
        private final int[] f7145a = {AbstractC5567e.abc_textfield_search_default_mtrl_alpha, AbstractC5567e.abc_textfield_default_mtrl_alpha, AbstractC5567e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f7146b = {AbstractC5567e.abc_ic_commit_search_api_mtrl_alpha, AbstractC5567e.abc_seekbar_tick_mark_material, AbstractC5567e.abc_ic_menu_share_mtrl_alpha, AbstractC5567e.abc_ic_menu_copy_mtrl_am_alpha, AbstractC5567e.abc_ic_menu_cut_mtrl_alpha, AbstractC5567e.abc_ic_menu_selectall_mtrl_alpha, AbstractC5567e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f7147c = {AbstractC5567e.abc_textfield_activated_mtrl_alpha, AbstractC5567e.abc_textfield_search_activated_mtrl_alpha, AbstractC5567e.abc_cab_background_top_mtrl_alpha, AbstractC5567e.abc_text_cursor_material, AbstractC5567e.abc_text_select_handle_left_mtrl, AbstractC5567e.abc_text_select_handle_middle_mtrl, AbstractC5567e.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        private final int[] f7148d = {AbstractC5567e.abc_popup_background_mtrl_mult, AbstractC5567e.abc_cab_background_internal_bg, AbstractC5567e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f7149e = {AbstractC5567e.abc_tab_indicator_material, AbstractC5567e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f7150f = {AbstractC5567e.abc_btn_check_material, AbstractC5567e.abc_btn_radio_material, AbstractC5567e.abc_btn_check_material_anim, AbstractC5567e.abc_btn_radio_material_anim};

        a() {
        }

        private boolean a(int[] iArr, int i8) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList b(Context context) {
            return c(context, 0);
        }

        private ColorStateList c(Context context, int i8) {
            int themeAttrColor = n0.getThemeAttrColor(context, AbstractC5563a.colorControlHighlight);
            return new ColorStateList(new int[][]{n0.f7201b, n0.f7204e, n0.f7202c, n0.f7208i}, new int[]{n0.getDisabledThemeAttrColor(context, AbstractC5563a.colorButtonNormal), androidx.core.graphics.a.compositeColors(themeAttrColor, i8), androidx.core.graphics.a.compositeColors(themeAttrColor, i8), i8});
        }

        private ColorStateList d(Context context) {
            return c(context, n0.getThemeAttrColor(context, AbstractC5563a.colorAccent));
        }

        private ColorStateList e(Context context) {
            return c(context, n0.getThemeAttrColor(context, AbstractC5563a.colorButtonNormal));
        }

        private ColorStateList f(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList themeAttrColorStateList = n0.getThemeAttrColorStateList(context, AbstractC5563a.colorSwitchThumbNormal);
            if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                iArr[0] = n0.f7201b;
                iArr2[0] = n0.getDisabledThemeAttrColor(context, AbstractC5563a.colorSwitchThumbNormal);
                iArr[1] = n0.f7205f;
                iArr2[1] = n0.getThemeAttrColor(context, AbstractC5563a.colorControlActivated);
                iArr[2] = n0.f7208i;
                iArr2[2] = n0.getThemeAttrColor(context, AbstractC5563a.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = n0.f7201b;
                iArr[0] = iArr3;
                iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                iArr[1] = n0.f7205f;
                iArr2[1] = n0.getThemeAttrColor(context, AbstractC5563a.colorControlActivated);
                iArr[2] = n0.f7208i;
                iArr2[2] = themeAttrColorStateList.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable g(g0 g0Var, Context context, int i8) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i8);
            Drawable drawable = g0Var.getDrawable(context, AbstractC5567e.abc_star_black_48dp);
            Drawable drawable2 = g0Var.getDrawable(context, AbstractC5567e.abc_star_half_black_48dp);
            if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawable;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawable2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void h(Drawable drawable, int i8, PorterDuff.Mode mode) {
            if (W.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0850j.f7142b;
            }
            drawable.setColorFilter(C0850j.getPorterDuffColorFilter(i8, mode));
        }

        @Override // androidx.appcompat.widget.g0.c
        public Drawable createDrawableFor(g0 g0Var, Context context, int i8) {
            if (i8 == AbstractC5567e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{g0Var.getDrawable(context, AbstractC5567e.abc_cab_background_internal_bg), g0Var.getDrawable(context, AbstractC5567e.abc_cab_background_top_mtrl_alpha)});
            }
            if (i8 == AbstractC5567e.abc_ratingbar_material) {
                return g(g0Var, context, AbstractC5566d.abc_star_big);
            }
            if (i8 == AbstractC5567e.abc_ratingbar_indicator_material) {
                return g(g0Var, context, AbstractC5566d.abc_star_medium);
            }
            if (i8 == AbstractC5567e.abc_ratingbar_small_material) {
                return g(g0Var, context, AbstractC5566d.abc_star_small);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g0.c
        public ColorStateList getTintListForDrawableRes(Context context, int i8) {
            if (i8 == AbstractC5567e.abc_edit_text_material) {
                return AbstractC5638a.getColorStateList(context, AbstractC5565c.abc_tint_edittext);
            }
            if (i8 == AbstractC5567e.abc_switch_track_mtrl_alpha) {
                return AbstractC5638a.getColorStateList(context, AbstractC5565c.abc_tint_switch_track);
            }
            if (i8 == AbstractC5567e.abc_switch_thumb_material) {
                return f(context);
            }
            if (i8 == AbstractC5567e.abc_btn_default_mtrl_shape) {
                return e(context);
            }
            if (i8 == AbstractC5567e.abc_btn_borderless_material) {
                return b(context);
            }
            if (i8 == AbstractC5567e.abc_btn_colored_material) {
                return d(context);
            }
            if (i8 == AbstractC5567e.abc_spinner_mtrl_am_alpha || i8 == AbstractC5567e.abc_spinner_textfield_background_material) {
                return AbstractC5638a.getColorStateList(context, AbstractC5565c.abc_tint_spinner);
            }
            if (a(this.f7146b, i8)) {
                return n0.getThemeAttrColorStateList(context, AbstractC5563a.colorControlNormal);
            }
            if (a(this.f7149e, i8)) {
                return AbstractC5638a.getColorStateList(context, AbstractC5565c.abc_tint_default);
            }
            if (a(this.f7150f, i8)) {
                return AbstractC5638a.getColorStateList(context, AbstractC5565c.abc_tint_btn_checkable);
            }
            if (i8 == AbstractC5567e.abc_seekbar_thumb_material) {
                return AbstractC5638a.getColorStateList(context, AbstractC5565c.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g0.c
        public PorterDuff.Mode getTintModeForDrawableRes(int i8) {
            if (i8 == AbstractC5567e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g0.c
        public boolean tintDrawable(Context context, int i8, Drawable drawable) {
            if (i8 == AbstractC5567e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                h(layerDrawable.findDrawableByLayerId(R.id.background), n0.getThemeAttrColor(context, AbstractC5563a.colorControlNormal), C0850j.f7142b);
                h(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), n0.getThemeAttrColor(context, AbstractC5563a.colorControlNormal), C0850j.f7142b);
                h(layerDrawable.findDrawableByLayerId(R.id.progress), n0.getThemeAttrColor(context, AbstractC5563a.colorControlActivated), C0850j.f7142b);
                return true;
            }
            if (i8 != AbstractC5567e.abc_ratingbar_material && i8 != AbstractC5567e.abc_ratingbar_indicator_material && i8 != AbstractC5567e.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            h(layerDrawable2.findDrawableByLayerId(R.id.background), n0.getDisabledThemeAttrColor(context, AbstractC5563a.colorControlNormal), C0850j.f7142b);
            h(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), n0.getThemeAttrColor(context, AbstractC5563a.colorControlActivated), C0850j.f7142b);
            h(layerDrawable2.findDrawableByLayerId(R.id.progress), n0.getThemeAttrColor(context, AbstractC5563a.colorControlActivated), C0850j.f7142b);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x006c A[RETURN] */
        @Override // androidx.appcompat.widget.g0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tintDrawableUsingColorFilter(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0850j.a()
                int[] r1 = r7.f7145a
                boolean r1 = r7.a(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = h.AbstractC5563a.colorControlNormal
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f7147c
                boolean r1 = r7.a(r1, r9)
                if (r1 == 0) goto L20
                int r9 = h.AbstractC5563a.colorControlActivated
                goto L11
            L20:
                int[] r1 = r7.f7148d
                boolean r1 = r7.a(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = h.AbstractC5567e.abc_list_divider_mtrl_alpha
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = h.AbstractC5567e.abc_dialog_material_background
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.W.canSafelyMutateDrawable(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.n0.getThemeAttrColor(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0850j.getPorterDuffColorFilter(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0850j.a.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    static void d(Drawable drawable, p0 p0Var, int[] iArr) {
        g0.q(drawable, p0Var, iArr);
    }

    public static synchronized C0850j get() {
        try {
            if (f7143c == null) {
                preload();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7143c;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i8, PorterDuff.Mode mode) {
        return g0.getPorterDuffColorFilter(i8, mode);
    }

    public static synchronized void preload() {
        if (f7143c == null) {
            C0850j c0850j = new C0850j();
            f7143c = c0850j;
            c0850j.f7144a = g0.get();
            f7143c.f7144a.setHooks(new a());
        }
    }

    synchronized Drawable b(Context context, int i8, boolean z8) {
        return this.f7144a.h(context, i8, z8);
    }

    synchronized ColorStateList c(Context context, int i8) {
        return this.f7144a.i(context, i8);
    }

    public synchronized Drawable getDrawable(Context context, int i8) {
        return this.f7144a.getDrawable(context, i8);
    }

    public synchronized void onConfigurationChanged(Context context) {
        this.f7144a.onConfigurationChanged(context);
    }
}
