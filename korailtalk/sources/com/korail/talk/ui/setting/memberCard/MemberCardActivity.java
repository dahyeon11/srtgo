package com.korail.talk.ui.setting.memberCard;

import Y5.c;
import Y5.d;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.xPoint.KorailPointInquiryDao;
import com.korail.talk.view.CTabLayout;
import com.korail.talk.view.CustomViewPager;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class MemberCardActivity extends BaseViewActivity {
    public static final int BAR_CODE_SELECTED_POSITION = 1;
    public static final String MEMBER_CARD_SELECTED_POSITION = "MEMBER_CARD_SELECTED_POSITION";
    public static final int QR_CODE_SELECTED_POSITION = 0;

    /* renamed from: i */
    private String[] f28811i;

    /* renamed from: j */
    private CustomViewPager f28812j;

    /* renamed from: k */
    private b f28813k;

    private class b extends r {

        /* renamed from: h */
        private final Fragment[] f28814h;

        /* synthetic */ b(MemberCardActivity memberCardActivity, FragmentManager fragmentManager, a aVar) {
            this(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return MemberCardActivity.this.f28811i.length;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f28814h[i8];
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return MemberCardActivity.this.f28811i[i8];
        }

        private b(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f28814h = new Fragment[]{d.newInstance(), Y5.a.newInstance()};
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_membership_card);
    }

    private void t0() {
        executeDao(new KorailPointInquiryDao());
    }

    private void u0() {
        this.f28811i = getResources().getStringArray(AbstractC5952c.member_card);
    }

    private void v0() {
    }

    private void w0() throws Resources.NotFoundException {
        m0();
        CTabLayout cTabLayout = (CTabLayout) findViewById(AbstractC5955f.tl_member_card);
        this.f28812j = (CustomViewPager) findViewById(AbstractC5955f.vp_member_card);
        b bVar = new b(getSupportFragmentManager());
        this.f28813k = bVar;
        this.f28812j.setAdapter(bVar);
        this.f28812j.setSwipeEnabled(false);
        cTabLayout.setupWithViewPager(this.f28812j);
        int intExtra = getIntent().getIntExtra(MEMBER_CARD_SELECTED_POSITION, 0);
        if (intExtra > 0) {
            this.f28812j.setCurrentItem(intExtra);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_member_card);
        if (C6630d.isNull(bundle)) {
            u0();
            w0();
            setText();
            v0();
            t0();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f29352h.sendEmptyMessage(1);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_korail_point_inquiry == iBaseDao.getId()) {
            KorailPointInquiryDao.KorailPointInquiryResponse korailPointInquiryResponse = (KorailPointInquiryDao.KorailPointInquiryResponse) iBaseDao.getResponse();
            boolean zEquals = korailPointInquiryResponse.getH_cp_athn_flg().toUpperCase().equals("Y");
            boolean zEquals2 = korailPointInquiryResponse.getH_emil_athn_flg().toUpperCase().equals("Y");
            if (C6630d.isNotNull(this.f28812j)) {
                for (int i8 = 0; i8 < this.f28813k.getCount(); i8++) {
                    c cVar = (c) this.f28813k.getItem(i8);
                    cVar.setMemberInfo();
                    cVar.setBitmap();
                    cVar.setAuthInfo(zEquals, zEquals2);
                }
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f29352h.sendEmptyMessageDelayed(0, 1000L);
    }
}
