package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.InterfaceC1025n;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import k0.AbstractC5837a;
import y0.AbstractC6513e;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1009d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;

    /* renamed from: b0 */
    private Handler f9687b0;

    /* renamed from: c0 */
    private Runnable f9688c0;

    /* renamed from: d0 */
    private DialogInterface.OnCancelListener f9689d0;

    /* renamed from: e0 */
    private DialogInterface.OnDismissListener f9690e0;

    /* renamed from: f0 */
    private int f9691f0;

    /* renamed from: g0 */
    private int f9692g0;

    /* renamed from: h0 */
    private boolean f9693h0;

    /* renamed from: i0 */
    private boolean f9694i0;

    /* renamed from: j0 */
    private int f9695j0;

    /* renamed from: k0 */
    private boolean f9696k0;

    /* renamed from: l0 */
    private androidx.lifecycle.u f9697l0;

    /* renamed from: m0 */
    private Dialog f9698m0;

    /* renamed from: n0 */
    private boolean f9699n0;

    /* renamed from: o0 */
    private boolean f9700o0;

    /* renamed from: p0 */
    private boolean f9701p0;

    /* renamed from: q0 */
    private boolean f9702q0;

    /* renamed from: androidx.fragment.app.d$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC1009d.this.f9690e0.onDismiss(DialogInterfaceOnCancelListenerC1009d.this.f9698m0);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1009d.this.f9698m0 != null) {
                DialogInterfaceOnCancelListenerC1009d dialogInterfaceOnCancelListenerC1009d = DialogInterfaceOnCancelListenerC1009d.this;
                dialogInterfaceOnCancelListenerC1009d.onCancel(dialogInterfaceOnCancelListenerC1009d.f9698m0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1009d.this.f9698m0 != null) {
                DialogInterfaceOnCancelListenerC1009d dialogInterfaceOnCancelListenerC1009d = DialogInterfaceOnCancelListenerC1009d.this;
                dialogInterfaceOnCancelListenerC1009d.onDismiss(dialogInterfaceOnCancelListenerC1009d.f9698m0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    class C0149d implements androidx.lifecycle.u {
        C0149d() {
        }

        @Override // androidx.lifecycle.u
        public void onChanged(InterfaceC1025n interfaceC1025n) {
            if (interfaceC1025n == null || !DialogInterfaceOnCancelListenerC1009d.this.f9694i0) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC1009d.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC1009d.this.f9698m0 != null) {
                if (FragmentManager.x0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DialogFragment ");
                    sb.append(this);
                    sb.append(" setting the content view on ");
                    sb.append(DialogInterfaceOnCancelListenerC1009d.this.f9698m0);
                }
                DialogInterfaceOnCancelListenerC1009d.this.f9698m0.setContentView(viewRequireView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    class e extends g {

        /* renamed from: a */
        final /* synthetic */ g f9707a;

        e(g gVar) {
            this.f9707a = gVar;
        }

        @Override // androidx.fragment.app.g
        public View onFindViewById(int i8) {
            return this.f9707a.onHasView() ? this.f9707a.onFindViewById(i8) : DialogInterfaceOnCancelListenerC1009d.this.s0(i8);
        }

        @Override // androidx.fragment.app.g
        public boolean onHasView() {
            return this.f9707a.onHasView() || DialogInterfaceOnCancelListenerC1009d.this.t0();
        }
    }

    public DialogInterfaceOnCancelListenerC1009d() {
        this.f9688c0 = new a();
        this.f9689d0 = new b();
        this.f9690e0 = new c();
        this.f9691f0 = 0;
        this.f9692g0 = 0;
        this.f9693h0 = true;
        this.f9694i0 = true;
        this.f9695j0 = -1;
        this.f9697l0 = new C0149d();
        this.f9702q0 = false;
    }

    private void r0(boolean z8, boolean z9) {
        if (this.f9700o0) {
            return;
        }
        this.f9700o0 = true;
        this.f9701p0 = false;
        Dialog dialog = this.f9698m0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f9698m0.dismiss();
            if (!z9) {
                if (Looper.myLooper() == this.f9687b0.getLooper()) {
                    onDismiss(this.f9698m0);
                } else {
                    this.f9687b0.post(this.f9688c0);
                }
            }
        }
        this.f9699n0 = true;
        if (this.f9695j0 >= 0) {
            getParentFragmentManager().popBackStack(this.f9695j0, 1);
            this.f9695j0 = -1;
            return;
        }
        x xVarBeginTransaction = getParentFragmentManager().beginTransaction();
        xVarBeginTransaction.remove(this);
        if (z8) {
            xVarBeginTransaction.commitAllowingStateLoss();
        } else {
            xVarBeginTransaction.commit();
        }
    }

    private void u0(Bundle bundle) {
        if (this.f9694i0 && !this.f9702q0) {
            try {
                this.f9696k0 = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.f9698m0 = dialogOnCreateDialog;
                if (this.f9694i0) {
                    setupDialog(dialogOnCreateDialog, this.f9691f0);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f9698m0.setOwnerActivity((Activity) context);
                    }
                    this.f9698m0.setCancelable(this.f9693h0);
                    this.f9698m0.setOnCancelListener(this.f9689d0);
                    this.f9698m0.setOnDismissListener(this.f9690e0);
                    this.f9702q0 = true;
                } else {
                    this.f9698m0 = null;
                }
                this.f9696k0 = false;
            } catch (Throwable th) {
                this.f9696k0 = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    void H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.H(layoutInflater, viewGroup, bundle);
        if (this.f9464H != null || this.f9698m0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f9698m0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    g b() {
        return new e(super.b());
    }

    public void dismiss() {
        r0(false, false);
    }

    public void dismissAllowingStateLoss() {
        r0(true, false);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public Dialog getDialog() {
        return this.f9698m0;
    }

    public boolean getShowsDialog() {
        return this.f9694i0;
    }

    public int getTheme() {
        return this.f9692g0;
    }

    public boolean isCancelable() {
        return this.f9693h0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.f9697l0);
        if (this.f9701p0) {
            return;
        }
        this.f9700o0 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9687b0 = new Handler();
        this.f9694i0 = this.f9506x == 0;
        if (bundle != null) {
            this.f9691f0 = bundle.getInt("android:style", 0);
            this.f9692g0 = bundle.getInt("android:theme", 0);
            this.f9693h0 = bundle.getBoolean("android:cancelable", true);
            this.f9694i0 = bundle.getBoolean("android:showsDialog", this.f9694i0);
            this.f9695j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new Dialog(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f9698m0;
        if (dialog != null) {
            this.f9699n0 = true;
            dialog.setOnDismissListener(null);
            this.f9698m0.dismiss();
            if (!this.f9700o0) {
                onDismiss(this.f9698m0);
            }
            this.f9698m0 = null;
            this.f9702q0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.f9701p0 && !this.f9700o0) {
            this.f9700o0 = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.f9697l0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f9699n0) {
            return;
        }
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDismiss called for DialogFragment ");
            sb.append(this);
        }
        r0(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f9694i0 && !this.f9696k0) {
            u0(bundle);
            if (FragmentManager.x0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
            }
            Dialog dialog = this.f9698m0;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.x0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f9694i0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mCreatingDialog = true: ");
                sb2.append(str);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("mShowsDialog = false: ");
                sb3.append(str);
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f9698m0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i8 = this.f9691f0;
        if (i8 != 0) {
            bundle.putInt("android:style", i8);
        }
        int i9 = this.f9692g0;
        if (i9 != 0) {
            bundle.putInt("android:theme", i9);
        }
        boolean z8 = this.f9693h0;
        if (!z8) {
            bundle.putBoolean("android:cancelable", z8);
        }
        boolean z9 = this.f9694i0;
        if (!z9) {
            bundle.putBoolean("android:showsDialog", z9);
        }
        int i10 = this.f9695j0;
        if (i10 != -1) {
            bundle.putInt("android:backStackId", i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f9698m0;
        if (dialog != null) {
            this.f9699n0 = false;
            dialog.show();
            View decorView = this.f9698m0.getWindow().getDecorView();
            O.set(decorView, this);
            P.set(decorView, this);
            AbstractC6513e.set(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f9698m0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f9698m0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f9698m0.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    View s0(int i8) {
        Dialog dialog = this.f9698m0;
        if (dialog != null) {
            return dialog.findViewById(i8);
        }
        return null;
    }

    public void setCancelable(boolean z8) {
        this.f9693h0 = z8;
        Dialog dialog = this.f9698m0;
        if (dialog != null) {
            dialog.setCancelable(z8);
        }
    }

    public void setShowsDialog(boolean z8) {
        this.f9694i0 = z8;
    }

    public void setStyle(int i8, int i9) {
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i8);
            sb.append(", ");
            sb.append(i9);
        }
        this.f9691f0 = i8;
        if (i8 == 2 || i8 == 3) {
            this.f9692g0 = R.style.Theme.Panel;
        }
        if (i9 != 0) {
            this.f9692g0 = i9;
        }
    }

    public void setupDialog(Dialog dialog, int i8) {
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.f9700o0 = false;
        this.f9701p0 = true;
        x xVarBeginTransaction = fragmentManager.beginTransaction();
        xVarBeginTransaction.add(this, str);
        xVarBeginTransaction.commit();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.f9700o0 = false;
        this.f9701p0 = true;
        x xVarBeginTransaction = fragmentManager.beginTransaction();
        xVarBeginTransaction.add(this, str);
        xVarBeginTransaction.commitNow();
    }

    boolean t0() {
        return this.f9702q0;
    }

    public int show(x xVar, String str) {
        this.f9700o0 = false;
        this.f9701p0 = true;
        xVar.add(this, str);
        this.f9699n0 = false;
        int iCommit = xVar.commit();
        this.f9695j0 = iCommit;
        return iCommit;
    }

    public DialogInterfaceOnCancelListenerC1009d(int i8) {
        super(i8);
        this.f9688c0 = new a();
        this.f9689d0 = new b();
        this.f9690e0 = new c();
        this.f9691f0 = 0;
        this.f9692g0 = 0;
        this.f9693h0 = true;
        this.f9694i0 = true;
        this.f9695j0 = -1;
        this.f9697l0 = new C0149d();
        this.f9702q0 = false;
    }
}
