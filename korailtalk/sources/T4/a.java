package T4;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: F, reason: collision with root package name */
    private String f4856F;

    /* renamed from: G, reason: collision with root package name */
    private CmtrInfoDao.CmtrInfoResponse f4857G;

    public a(Context context) {
        super(context);
        setText();
    }

    private void D() {
        for (View view : this.f4862D) {
            view.setVisibility(8);
        }
    }

    private int E(int i8, int i9, int i10, int i11, int i12) {
        if (C6630d.isNotNull(this.f4884z) && isCmpaFlg()) {
            t.e("start : " + i9 + ", psgPrnbFrom : " + i12);
            t.e("totalCount : " + i10 + ", avlPrnbFrom :  " + i11);
            while (i9 < i12) {
                if (i10 < i11) {
                    t.e("in totalCount : " + i10 + ", avlPrnbFrom :  " + i11 + ", psgPrnbFrom : " + i12);
                    this.f4884z.onChangePersonInfo(getPassengerInfo(), i8, l(i8));
                }
                i9++;
                i10++;
            }
        }
        return i10;
    }

    private void F(String str, CmtrInfoDao.CmtrInfoResponse cmtrInfoResponse) {
        this.f4856F = str;
        this.f4857G = cmtrInfoResponse;
    }

    private void G(String str, CmtrInfoDao.CmtrInfoResponse cmtrInfoResponse) {
        List<CmtrInfoDao.Psg> psgList = cmtrInfoResponse.getPsgList();
        int avlPrnbFrom = cmtrInfoResponse.getAvlPrnbFrom();
        int iE = 1;
        for (int i8 = 0; i8 < psgList.size(); i8++) {
            CmtrInfoDao.Psg psg = psgList.get(i8);
            if (i8 == 0) {
                this.f4865g = CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(str) ? psg.getPsgPrnbTo() : psg.getPsgPrnbFrom();
                H(this.f4862D[i8], this.f4873o, psg);
                iE = E(i8, 1, iE, avlPrnbFrom, psg.getPsgPrnbFrom());
            } else if (7 == i8) {
                this.f4866h = CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(str) ? psg.getPsgPrnbTo() : psg.getPsgPrnbFrom();
                H(this.f4862D[i8], this.f4874p, psg);
                iE = E(i8, 0, iE, avlPrnbFrom, psg.getPsgPrnbFrom());
            } else if (1 == i8) {
                this.f4867i = CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(str) ? psg.getPsgPrnbTo() : psg.getPsgPrnbFrom();
                H(this.f4862D[i8], this.f4875q, psg);
                iE = E(i8, 0, iE, avlPrnbFrom, psg.getPsgPrnbFrom());
            } else if (2 == i8) {
                this.f4868j = CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(str) ? psg.getPsgPrnbTo() : psg.getPsgPrnbFrom();
                H(this.f4862D[i8], this.f4876r, psg);
                iE = E(i8, 0, iE, avlPrnbFrom, psg.getPsgPrnbFrom());
            } else if (3 == i8) {
                this.f4869k = CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(str) ? psg.getPsgPrnbTo() : psg.getPsgPrnbFrom();
                H(this.f4862D[i8], this.f4877s, psg);
                iE = E(i8, 0, iE, avlPrnbFrom, psg.getPsgPrnbFrom());
            } else if (4 == i8) {
                this.f4870l = CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(str) ? psg.getPsgPrnbTo() : psg.getPsgPrnbFrom();
                H(this.f4862D[i8], this.f4878t, psg);
                iE = E(i8, 0, iE, avlPrnbFrom, psg.getPsgPrnbFrom());
            } else if (5 == i8) {
                this.f4871m = CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(str) ? psg.getPsgPrnbTo() : psg.getPsgPrnbFrom();
                H(this.f4862D[i8], this.f4879u, psg);
                iE = E(i8, 0, iE, avlPrnbFrom, psg.getPsgPrnbFrom());
            } else if (6 == i8) {
                this.f4872n = CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C.equals(str) ? psg.getPsgPrnbTo() : psg.getPsgPrnbFrom();
                H(this.f4862D[i8], this.f4880v, psg);
                iE = E(i8, 0, iE, avlPrnbFrom, psg.getPsgPrnbFrom());
            }
        }
    }

    private void H(View view, int[] iArr, CmtrInfoDao.Psg psg) {
        view.setVisibility(0);
        iArr[0] = psg.getPsgPrnbFrom();
        iArr[1] = psg.getPsgPrnbTo();
        ((TextView) view.findViewById(AbstractC5955f.titleTxt)).setText(psg.getComnCdNm());
        ((TextView) view.findViewById(AbstractC5955f.valueTxt)).setText(String.valueOf(iArr[0]));
    }

    private void setText() {
        this.f4860B.setText(b(AbstractC5959j.common_empty));
    }

    public void init(String str, CmtrInfoDao.CmtrInfoResponse cmtrInfoResponse) {
        F(str, cmtrInfoResponse);
        D();
        v();
    }

    public boolean isCmpaFlg() {
        return "Y".equals(this.f4857G.getCmpaFlg());
    }

    @Override // T4.c
    protected boolean p() {
        return false;
    }

    @Override // T4.c
    protected void w() {
        this.f4882x = this.f4857G.getAvlPrnbFrom();
        this.f4881w = this.f4857G.getAvlPrnbTo();
        G(this.f4856F, this.f4857G);
    }
}
