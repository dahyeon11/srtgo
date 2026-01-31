package com.nhn.android.naverlogin.ui.view;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d;
import h.AbstractC5571i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC5837a;

/* loaded from: classes.dex */
public class CustomTabDialogFragment extends DialogInterfaceOnCancelListenerC1009d {
    public static final String ARG_PACKAGE = "packages";
    public static final String DIALOG_TAG = "CUSTOM_TAB_SELECTOR";

    /* renamed from: r0 */
    private List f29699r0;

    /* renamed from: s0 */
    private c f29700s0;

    /* renamed from: t0 */
    private OnPackageSelectListener f29701t0;

    public interface OnPackageSelectListener {
        void onPackageSelect(PackageInfo packageInfo);
    }

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            CustomTabDialogFragment.this.f29701t0.onPackageSelect((PackageInfo) CustomTabDialogFragment.this.f29699r0.get(i8));
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            CustomTabDialogFragment.this.onCancel(dialogInterface);
        }
    }

    private class c extends BaseAdapter {
        private c() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return CustomTabDialogFragment.this.f29699r0.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return CustomTabDialogFragment.this.f29699r0.get(i8);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (view == null) {
                linearLayout = (LinearLayout) ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(E6.c.package_list_item, viewGroup, false);
            }
            ImageView imageView = (ImageView) linearLayout.findViewById(E6.b.package_icon);
            TextView textView = (TextView) linearLayout.findViewById(E6.b.package_name);
            PackageInfo packageInfo = (PackageInfo) getItem(i8);
            PackageManager packageManager = CustomTabDialogFragment.this.getActivity().getPackageManager();
            imageView.setImageDrawable(packageInfo.applicationInfo.loadIcon(packageManager));
            textView.setText(packageInfo.applicationInfo.loadLabel(packageManager));
            return linearLayout;
        }

        /* synthetic */ c(CustomTabDialogFragment customTabDialogFragment, a aVar) {
            this();
        }
    }

    public static CustomTabDialogFragment newInstance(List<PackageInfo> list) {
        CustomTabDialogFragment customTabDialogFragment = new CustomTabDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray(ARG_PACKAGE, (Parcelable[]) list.toArray(new PackageInfo[0]));
        customTabDialogFragment.setArguments(bundle);
        return customTabDialogFragment;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f29701t0.onPackageSelect(null);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getParcelableArray(ARG_PACKAGE) == null) {
            return;
        }
        List listAsList = Arrays.asList(arguments.getParcelableArray(ARG_PACKAGE));
        this.f29699r0 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            this.f29699r0.add((PackageInfo) ((Parcelable) it.next()));
        }
        this.f29700s0 = new c(this, null);
        setStyle(1, AbstractC5571i.Theme_AppCompat_DayNight_Dialog_Alert);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d
    public Dialog onCreateDialog(Bundle bundle) {
        return new d.a(getActivity(), getTheme()).setNegativeButton(R.string.cancel, new b()).setAdapter(this.f29700s0, new a()).setTitle(E6.d.use_application).create();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1009d, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f29701t0 = null;
    }

    public void setPackageSelectListener(OnPackageSelectListener onPackageSelectListener) {
        this.f29701t0 = onPackageSelectListener;
    }
}
