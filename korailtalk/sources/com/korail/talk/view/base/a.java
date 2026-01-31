package com.korail.talk.view.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.korail.talk.network.IBase;
import com.korail.talk.network.IBaseDao;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import k0.AbstractC5837a;
import n6.j;
import y4.C6536a;
import z4.C6630d;
import z4.N;
import z4.P;
import z4.t;

/* loaded from: classes.dex */
public class a extends Fragment implements j, IBase, Serializable {

    /* renamed from: b0, reason: collision with root package name */
    private BaseActivity f29355b0;

    /* renamed from: c0, reason: collision with root package name */
    private Intent f29356c0;

    @Override // n6.j
    public void addTransaction(int i8, Fragment fragment, String str) {
        this.f29355b0.addTransaction(i8, fragment, str);
    }

    public boolean appBack() {
        return true;
    }

    @Override // n6.j
    public void clearBackStackFragment() {
        this.f29355b0.clearBackStackFragment();
    }

    @Override // com.korail.talk.network.IBase
    public void executeDao(IBaseDao iBaseDao) {
        if (C6630d.isNotNull(this.f29355b0)) {
            this.f29355b0.executeDao(iBaseDao, this);
        }
    }

    @Override // com.korail.talk.network.IBase
    public void executeRetryDao() {
        if (C6630d.isNotNull(this.f29355b0)) {
            this.f29355b0.executeRetryDao();
        }
    }

    public Context getApplicationContext() {
        return getActivity().getApplicationContext();
    }

    @Override // n6.j
    public Fragment getCurrentFragment() {
        return this.f29355b0.getCurrentFragment();
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // n6.j
    public Fragment getFragment(String str) {
        return this.f29355b0.getFragment(str);
    }

    public Intent getFragmentResult() {
        return this.f29356c0;
    }

    @Override // n6.j
    public String getFragmentTag(int i8) {
        return this.f29355b0.getFragmentTag(i8);
    }

    @Override // com.korail.talk.network.IBase
    public boolean isFinishing() {
        return C6630d.isNull(getActivity()) || getActivity().isFinishing();
    }

    protected void o0() {
        if (C6630d.isNotNull(this.f29355b0)) {
            this.f29355b0.dismissLoading();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        t.e(getClass().getSimpleName() + " : " + i8);
        if (i9 == -1) {
            if (i8 == 104) {
                onLoginSuccess();
            }
        } else if (i9 == 0 && i8 == 104) {
            onLoginFail(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f29355b0 = (BaseActivity) context;
    }

    public void onBackFragment() {
        this.f29355b0.onBackPressed();
    }

    @Override // com.korail.talk.network.IBase
    public void onCancelDao() {
        if (C6630d.isNotNull(this.f29355b0)) {
            this.f29355b0.onCancelDao();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        t.v("onCreate = " + getClass().getSimpleName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (C6630d.isNull(super.getView())) {
            return;
        }
        t0(super.getView());
    }

    public void onFragmentResult(Intent intent) {
    }

    public void onLoginFail(boolean z8) {
        t.e(getClass().getSimpleName() + " : " + z8);
        if (z8) {
            q0();
        } else if (C6630d.isNotNull(this.f29355b0)) {
            this.f29355b0.f29343b = null;
        }
    }

    public void onLoginSuccess() {
        t.e(getClass().getSimpleName());
        executeRetryDao();
    }

    public void onReceive(IBaseDao iBaseDao) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setClickable(true);
    }

    protected View p0(int i8) {
        return getView().findViewById(i8);
    }

    protected void q0() {
        if (isFinishing() || !C6630d.isNotNull(getActivity())) {
            return;
        }
        getActivity().finish();
    }

    protected String[] r0(int i8) {
        return getResources().getStringArray(i8);
    }

    @Override // n6.j
    public void replaceTransaction(int i8, Fragment fragment, String str) {
        this.f29355b0.replaceTransaction(i8, fragment, str);
    }

    protected String s0(TextView textView) {
        return N.getText(textView);
    }

    public void setFragmentResult(Intent intent) {
        this.f29356c0 = intent;
    }

    public void showLoading() {
        if (C6630d.isNotNull(this.f29355b0)) {
            this.f29355b0.showLoading();
        }
    }

    protected void t0(View view) {
        P.hideIME(getApplicationContext(), view);
    }

    protected void u0(int i8) {
        if (C6630d.isNull(getActivity()) || !(getActivity() instanceof BaseActivity)) {
            return;
        }
        ((BaseActivity) getActivity()).setAppTitle(i8);
    }

    protected void v0(String str) {
        if (C6630d.isNotNull(this.f29355b0)) {
            this.f29355b0.setAppTitle(str);
        }
    }

    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
    }
}
