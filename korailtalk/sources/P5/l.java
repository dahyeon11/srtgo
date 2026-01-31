package p5;

import T4.c;
import V4.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import k0.AbstractC5837a;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6626B;
import z4.C6630d;
import z4.M;
import z4.N;

/* loaded from: classes.dex */
public class l extends h {
    public static final String TAG = "LinkedReleaseLimousineBusFragment";

    /* renamed from: i0, reason: collision with root package name */
    private V4.b f34613i0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(Bundle bundle, int i8, String str) {
        this.f34605d0.setPassengerData(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        setStationNm(this.f34613i0.getArrivalStationNm(), this.f34613i0.getStartStationNm());
    }

    private void M0() {
        V4.b bVar = new V4.b(getActivity());
        this.f34613i0 = bVar;
        this.f34607f0.addView(bVar);
        String[] stationNm = M.getStationNm();
        this.f34613i0.setStationInfo(stationNm[0], stationNm[1], 0, 0);
        this.f34613i0.setOnReverseStationsListener(new b.a() { // from class: p5.j
            @Override // V4.b.a
            public final void onReverseStation() {
                this.f34611a.K0();
            }
        });
    }

    public static Fragment newInstance() {
        return new l();
    }

    protected void L0() {
        T4.d dVar = new T4.d(getActivity(), C6626B.getPassengerBundleData());
        this.f34609h0 = dVar;
        this.f34607f0.addView(dVar);
        this.f34609h0.setPassengerViewText(1, getString(AbstractC5959j.common_child));
        this.f34609h0.setOnChangePersonInfoListener(new c.a() { // from class: p5.k
            @Override // T4.c.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f34612a.J0(bundle, i8, str);
            }
        });
    }

    @Override // p5.h, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // p5.h, p5.InterfaceC6055a
    public V4.b getRouteOption() {
        return this.f34613i0;
    }

    @Override // p5.h, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            M0();
            E0();
            L0();
            F0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_linked_release_limousine, viewGroup, false);
    }

    @Override // p5.h, p5.InterfaceC6055a
    public void setStationNm(String str, String str2) {
        if (!N.isNotNull(str)) {
            str = this.f34613i0.getStartStationNm();
        }
        if (!N.isNotNull(str2)) {
            str2 = this.f34613i0.getArrivalStationNm();
        }
        this.f34613i0.setStationNm(str, str2);
    }

    @Override // p5.h, p5.InterfaceC6055a
    public void unSelectStation() {
        this.f34613i0.unSelectStation();
    }
}
