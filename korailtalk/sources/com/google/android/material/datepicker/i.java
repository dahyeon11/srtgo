package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d;
import androidx.fragment.app.x;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import i.AbstractC5638a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.AbstractC5837a;

/* loaded from: classes2.dex */
public final class i<S> extends DialogInterfaceOnCancelListenerC1009d {
    public static final int INPUT_MODE_CALENDAR = 0;
    public static final int INPUT_MODE_TEXT = 1;

    /* renamed from: A0 */
    private CharSequence f24720A0;

    /* renamed from: B0 */
    private boolean f24721B0;

    /* renamed from: C0 */
    private int f24722C0;

    /* renamed from: D0 */
    private TextView f24723D0;

    /* renamed from: E0 */
    private CheckableImageButton f24724E0;

    /* renamed from: F0 */
    private a3.g f24725F0;

    /* renamed from: G0 */
    private Button f24726G0;

    /* renamed from: r0 */
    private final LinkedHashSet f24727r0 = new LinkedHashSet();

    /* renamed from: s0 */
    private final LinkedHashSet f24728s0 = new LinkedHashSet();

    /* renamed from: t0 */
    private final LinkedHashSet f24729t0 = new LinkedHashSet();

    /* renamed from: u0 */
    private final LinkedHashSet f24730u0 = new LinkedHashSet();

    /* renamed from: v0 */
    private int f24731v0;

    /* renamed from: w0 */
    private p f24732w0;

    /* renamed from: x0 */
    private com.google.android.material.datepicker.a f24733x0;

    /* renamed from: y0 */
    private h f24734y0;

    /* renamed from: z0 */
    private int f24735z0;

    /* renamed from: H0 */
    static final Object f24717H0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: I0 */
    static final Object f24718I0 = "CANCEL_BUTTON_TAG";

    /* renamed from: J0 */
    static final Object f24719J0 = "TOGGLE_BUTTON_TAG";

    class a extends o {
        a() {
        }

        @Override // com.google.android.material.datepicker.o
        public void onIncompleteSelectionChanged() {
            i.this.f24726G0.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.o
        public void onSelectionChanged(S s8) {
            i.this.H0();
            Button unused = i.this.f24726G0;
            i.w0(i.this);
            throw null;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Button unused = i.this.f24726G0;
            i.w0(i.this);
            throw null;
        }
    }

    private static int A0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(J2.d.mtrl_calendar_content_padding);
        int i8 = l.d().f24744d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(J2.d.mtrl_calendar_day_width) * i8) + ((i8 - 1) * resources.getDimensionPixelOffset(J2.d.mtrl_calendar_month_horizontal_padding));
    }

    private int B0(Context context) {
        int i8 = this.f24731v0;
        if (i8 != 0) {
            return i8;
        }
        throw null;
    }

    private void C0(Context context) {
        this.f24724E0.setTag(f24719J0);
        this.f24724E0.setImageDrawable(y0(context));
        this.f24724E0.setChecked(this.f24722C0 != 0);
        AbstractC0985p0.setAccessibilityDelegate(this.f24724E0, null);
        I0(this.f24724E0);
        this.f24724E0.setOnClickListener(new b());
    }

    static boolean D0(Context context) {
        return F0(context, R.attr.windowFullscreen);
    }

    static boolean E0(Context context) {
        return F0(context, J2.b.nestedScrollable);
    }

    static boolean F0(Context context, int i8) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(X2.b.resolveOrThrow(context, J2.b.materialCalendarStyle, h.class.getCanonicalName()), new int[]{i8});
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z8;
    }

    private void G0() {
        int iB0 = B0(requireContext());
        this.f24734y0 = h.newInstance(null, iB0, this.f24733x0);
        this.f24732w0 = this.f24724E0.isChecked() ? k.p0(null, iB0, this.f24733x0) : this.f24734y0;
        H0();
        x xVarBeginTransaction = getChildFragmentManager().beginTransaction();
        xVarBeginTransaction.replace(J2.f.mtrl_calendar_frame, this.f24732w0);
        xVarBeginTransaction.commitNow();
        this.f24732w0.addOnSelectionChangedListener(new a());
    }

    public void H0() {
        String headerText = getHeaderText();
        this.f24723D0.setContentDescription(String.format(getString(J2.j.mtrl_picker_announce_current_selection), headerText));
        this.f24723D0.setText(headerText);
    }

    private void I0(CheckableImageButton checkableImageButton) {
        this.f24724E0.setContentDescription(this.f24724E0.isChecked() ? checkableImageButton.getContext().getString(J2.j.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(J2.j.mtrl_picker_toggle_to_text_input_mode));
    }

    public static long thisMonthInUtcMilliseconds() {
        return l.d().f24746f;
    }

    public static long todayInUtcMilliseconds() {
        return s.g().getTimeInMillis();
    }

    static /* synthetic */ d w0(i iVar) {
        iVar.getClass();
        return null;
    }

    private static Drawable y0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC5638a.getDrawable(context, J2.e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC5638a.getDrawable(context, J2.e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private static int z0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(J2.d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(J2.d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(J2.d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(J2.d.mtrl_calendar_days_of_week_height);
        int i8 = m.f24748e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(J2.d.mtrl_calendar_day_height) * i8) + ((i8 - 1) * resources.getDimensionPixelOffset(J2.d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(J2.d.mtrl_calendar_bottom_padding);
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f24729t0.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f24730u0.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f24728s0.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(j jVar) {
        return this.f24727r0.add(jVar);
    }

    public void clearOnCancelListeners() {
        this.f24729t0.clear();
    }

    public void clearOnDismissListeners() {
        this.f24730u0.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f24728s0.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f24727r0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public String getHeaderText() {
        getContext();
        throw null;
    }

    public final S getSelection() {
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f24729t0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f24731v0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.f.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f24733x0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f24735z0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f24720A0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f24722C0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), B0(requireContext()));
        Context context = dialog.getContext();
        this.f24721B0 = D0(context);
        int iResolveOrThrow = X2.b.resolveOrThrow(context, J2.b.colorSurface, i.class.getCanonicalName());
        a3.g gVar = new a3.g(context, null, J2.b.materialCalendarStyle, J2.k.Widget_MaterialComponents_MaterialCalendar);
        this.f24725F0 = gVar;
        gVar.initializeElevationOverlay(context);
        this.f24725F0.setFillColor(ColorStateList.valueOf(iResolveOrThrow));
        this.f24725F0.setElevation(AbstractC0985p0.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f24721B0 ? J2.h.mtrl_picker_fullscreen : J2.h.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f24721B0) {
            viewInflate.findViewById(J2.f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(A0(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(J2.f.mtrl_calendar_main_pane);
            View viewFindViewById2 = viewInflate.findViewById(J2.f.mtrl_calendar_frame);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(A0(context), -1));
            viewFindViewById2.setMinimumHeight(z0(requireContext()));
        }
        TextView textView = (TextView) viewInflate.findViewById(J2.f.mtrl_picker_header_selection_text);
        this.f24723D0 = textView;
        AbstractC0985p0.setAccessibilityLiveRegion(textView, 1);
        this.f24724E0 = (CheckableImageButton) viewInflate.findViewById(J2.f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(J2.f.mtrl_picker_title_text);
        CharSequence charSequence = this.f24720A0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f24735z0);
        }
        C0(context);
        this.f24726G0 = (Button) viewInflate.findViewById(J2.f.confirm_button);
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f24730u0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f24731v0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f24733x0);
        if (this.f24734y0.y0() != null) {
            bVar.setOpenAt(this.f24734y0.y0().f24746f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.build());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f24735z0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f24720A0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f24721B0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f24725F0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(J2.d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f24725F0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new R2.a(requireDialog(), rect));
        }
        G0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment
    public void onStop() {
        this.f24732w0.o0();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f24729t0.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f24730u0.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f24728s0.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(j jVar) {
        return this.f24727r0.remove(jVar);
    }
}
