package p5;

import T4.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.viewGroup.DropDownSelector;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6625A;
import z4.C6626B;
import z4.C6630d;

/* loaded from: classes.dex */
public class n extends h implements View.OnClickListener {
    public static final String TAG = "SingleReleaseLimousineFragment";

    /* renamed from: i0, reason: collision with root package name */
    private String[] f34615i0;

    /* renamed from: j0, reason: collision with root package name */
    private DropDownSelector f34616j0;

    /* renamed from: k0, reason: collision with root package name */
    private DropDownSelector f34617k0;

    /* renamed from: l0, reason: collision with root package name */
    private V4.b f34618l0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(Bundle bundle, int i8, String str) {
        this.f34605d0.setPassengerData(bundle);
    }

    public static Fragment newInstance() {
        return new n();
    }

    @Override // p5.h
    protected void F0() {
        super.F0();
        p0(AbstractC5955f.iv_limousine_switch).setOnClickListener(this);
    }

    @Override // p5.h
    protected void G0() {
        super.G0();
        this.f34616j0 = (DropDownSelector) p0(AbstractC5955f.dds_limousine_start_station_nm);
        this.f34617k0 = (DropDownSelector) p0(AbstractC5955f.dds_limousine_arrival_station_nm);
        this.f34618l0 = new V4.b(getActivity());
    }

    protected void J0() {
        T4.d dVar = new T4.d(getActivity(), C6626B.getPassengerBundleData());
        this.f34609h0 = dVar;
        this.f34607f0.addView(dVar);
        this.f34609h0.setPassengerViewText(1, getString(AbstractC5959j.common_child));
        this.f34609h0.setPassengerViewVisibility(2, 8);
        this.f34609h0.setPassengerViewVisibility(3, 8);
        this.f34609h0.setPassengerViewVisibility(4, 8);
        this.f34609h0.setPassengerViewVisibility(5, 8);
        this.f34609h0.setPassengerViewVisibility(6, 8);
        this.f34609h0.setOnChangePersonInfoListener(new c.a() { // from class: p5.m
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f34614a.I0(bundle, i8, str);
            }
        });
    }

    @Override // p5.h, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // p5.h, p5.InterfaceC6055a
    public V4.b getRouteOption() {
        this.f34618l0.setStationNm(this.f34616j0.getSelectItem(), this.f34617k0.getSelectItem());
        return this.f34618l0;
    }

    @Override // p5.h, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            G0();
            E0();
            J0();
            F0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int selectIndex;
        int selectIndex2;
        if (AbstractC5955f.iv_limousine_switch != view.getId() || (selectIndex = this.f34616j0.getSelectIndex()) == (selectIndex2 = this.f34617k0.getSelectIndex())) {
            return;
        }
        this.f34616j0.setEntries(this.f34615i0, (String[]) null, selectIndex2);
        this.f34617k0.setEntries(this.f34615i0, (String[]) null, selectIndex);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_single_release_limousine, viewGroup, false);
    }

    public void setLimousineStation(CommonCodeDao.CommonCodeResponse commonCodeResponse) {
        String[] array = C6625A.toArray(commonCodeResponse.getStationNm());
        this.f34615i0 = array;
        this.f34616j0.setEntries(array, (String[]) null, 0);
        this.f34617k0.setEntries(this.f34615i0, (String[]) null, 1);
    }
}
