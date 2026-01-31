package T4;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class g extends c {

    /* renamed from: F, reason: collision with root package name */
    private boolean f4885F;

    /* renamed from: G, reason: collision with root package name */
    private DiscountMenuDao.GoodInfo f4886G;

    public g(Context context) {
        super(context);
        E(null);
    }

    private void D() {
        for (View view : this.f4862D) {
            view.setVisibility(8);
        }
    }

    private void E(DiscountMenuDao.GoodInfo goodInfo) {
        setData(goodInfo);
        D();
        v();
    }

    private void setData(DiscountMenuDao.GoodInfo goodInfo) {
        this.f4886G = goodInfo;
    }

    private void setPassengerCount(DiscountMenuDao.GoodInfo goodInfo) {
        DiscountMenuDao.PsgInfos psg_infos = goodInfo.getPsg_infos();
        if (C6630d.isNotNull(psg_infos)) {
            List<DiscountMenuDao.PsgInfo> psg_info = psg_infos.getPsg_info();
            if (!C6630d.isNotNull(psg_info) || psg_info.size() <= 0) {
                return;
            }
            for (int i8 = 0; i8 < psg_info.size(); i8++) {
                String h_dcnt_knd_cd = psg_info.get(i8).getH_dcnt_knd_cd();
                int h_st_prnb = psg_info.get(i8).getH_st_prnb();
                int h_cls_prnb = psg_info.get(i8).getH_cls_prnb();
                if ("000".equals(h_dcnt_knd_cd)) {
                    this.f4865g = h_st_prnb;
                    F(this.f4862D[0], this.f4873o, h_st_prnb, h_cls_prnb);
                }
                if ("P11".equals(h_dcnt_knd_cd)) {
                    this.f4866h = h_st_prnb;
                    F(this.f4862D[7], this.f4874p, h_st_prnb, h_cls_prnb);
                }
                if ("201".equals(h_dcnt_knd_cd)) {
                    this.f4867i = h_st_prnb;
                    F(this.f4862D[1], this.f4875q, h_st_prnb, h_cls_prnb);
                }
                if ("202".equals(h_dcnt_knd_cd)) {
                    this.f4868j = h_st_prnb;
                    F(this.f4862D[2], this.f4876r, h_st_prnb, h_cls_prnb);
                }
                if ("204".equals(h_dcnt_knd_cd)) {
                    this.f4869k = h_st_prnb;
                    F(this.f4862D[3], this.f4877s, h_st_prnb, h_cls_prnb);
                }
                if ("205".equals(h_dcnt_knd_cd)) {
                    this.f4870l = h_st_prnb;
                    F(this.f4862D[4], this.f4878t, h_st_prnb, h_cls_prnb);
                }
                if ("206".equals(h_dcnt_knd_cd)) {
                    this.f4871m = h_st_prnb;
                    F(this.f4862D[5], this.f4879u, h_st_prnb, h_cls_prnb);
                }
                if ("210".equals(h_dcnt_knd_cd)) {
                    this.f4872n = h_st_prnb;
                    F(this.f4862D[6], this.f4880v, h_st_prnb, h_cls_prnb);
                }
            }
        }
    }

    protected void F(View view, int[] iArr, int i8, int i9) {
        view.setVisibility(0);
        iArr[0] = i8;
        iArr[1] = i9;
        ((TextView) view.findViewById(AbstractC5955f.valueTxt)).setText(String.valueOf(iArr[0]));
    }

    @Override // T4.c
    protected void w() {
        this.f4885F = false;
        DiscountMenuDao.PsgInfos psg_infos = this.f4886G.getPsg_infos();
        this.f4882x = Integer.parseInt(psg_infos.getH_min_cnt());
        this.f4881w = Integer.parseInt(psg_infos.getH_max_cnt());
        setPassengerCount(this.f4886G);
        if (this.f4882x == this.f4881w) {
            this.f4885F = true;
        }
    }

    @Override // T4.c
    protected void x() {
        StringBuilder sb = new StringBuilder();
        int i8 = this.f4866h;
        if (i8 > 0) {
            sb.append(c(AbstractC5959j.booking_teen_count, Integer.valueOf(i8)));
            int i9 = this.f4865g + this.f4867i + this.f4868j + this.f4869k + this.f4870l + this.f4871m + this.f4872n;
            if (i9 > 0) {
                sb.append(c(AbstractC5959j.booking_etc_count, Integer.valueOf(i9)));
            }
            this.f4860B.setText(sb.toString());
            return;
        }
        if (!this.f4885F) {
            super.x();
        } else {
            sb.append(c(AbstractC5959j.booking_adult_count, Integer.valueOf(this.f4865g)));
            this.f4860B.setText(sb.toString());
        }
    }

    @Override // T4.c
    protected void y() {
        if (!this.f4885F) {
            super.y();
            return;
        }
        this.f4861C.setText(c(AbstractC5959j.booking_default_1_possible_warning_one, Integer.valueOf(this.f4881w)));
        findViewById(AbstractC5955f.foldImg).setVisibility(4);
        collapse();
        setAutoExpand(false);
    }

    public g(Context context, DiscountMenuDao.GoodInfo goodInfo) {
        super(context);
        E(goodInfo);
    }
}
