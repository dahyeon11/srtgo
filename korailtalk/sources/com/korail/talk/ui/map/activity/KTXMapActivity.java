package com.korail.talk.ui.map.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.view.CTabLayout;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import t5.InterfaceC6365a;
import v5.C6433a;
import v5.C6434b;
import v5.C6435c;
import v5.C6436d;
import v5.C6437e;
import v5.f;
import v5.g;
import v5.m;
import z4.C6630d;
import z4.H;
import z4.q;

/* loaded from: classes.dex */
public class KTXMapActivity extends BaseViewActivity implements InterfaceC6365a, TabLayout.d {

    /* renamed from: j, reason: collision with root package name */
    private String[] f28171j;

    /* renamed from: k, reason: collision with root package name */
    private CTabLayout f28172k;

    /* renamed from: m, reason: collision with root package name */
    private ViewPager f28174m;

    /* renamed from: n, reason: collision with root package name */
    private b f28175n;

    /* renamed from: o, reason: collision with root package name */
    private Button f28176o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f28177p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f28178q;

    /* renamed from: i, reason: collision with root package name */
    private final int f28170i = 7;

    /* renamed from: l, reason: collision with root package name */
    private Point f28173l = new Point();

    private class b extends r {

        /* renamed from: h, reason: collision with root package name */
        boolean f28179h;

        /* renamed from: i, reason: collision with root package name */
        private final Fragment[] f28180i;

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return this.f28179h ? KTXMapActivity.this.f28171j.length : KTXMapActivity.this.f28171j.length - 1;
        }

        @Override // androidx.fragment.app.r
        public Fragment getItem(int i8) {
            return this.f28180i[i8];
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence getPageTitle(int i8) {
            return KTXMapActivity.this.f28171j[i8];
        }

        private b(FragmentManager fragmentManager, boolean z8) {
            super(fragmentManager, 1);
            this.f28180i = new Fragment[]{C6434b.newInstance(), C6436d.newInstance(), C6435c.newInstance(), C6437e.newInstance(), C6433a.newInstance(), g.newInstance(), f.newInstance()};
            this.f28179h = z8;
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_select_station_map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        int scrollX = this.f28172k.getScrollX();
        int measuredWidth = this.f28172k.getChildAt(0).getMeasuredWidth() - this.f28173l.x;
        if (scrollX == 0) {
            this.f28177p.setVisibility(8);
            this.f28178q.setVisibility(0);
        } else if (scrollX == measuredWidth) {
            this.f28177p.setVisibility(0);
            this.f28178q.setVisibility(8);
        } else {
            this.f28177p.setVisibility(0);
            this.f28178q.setVisibility(0);
        }
    }

    private void v0() {
        this.f28171j = getResources().getStringArray(AbstractC5952c.ktx_map);
    }

    private void w0() {
        this.f28176o.setOnClickListener(this);
        this.f28172k.addOnTabSelectedListener((TabLayout.d) this);
        this.f28172k.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: t5.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f36944a.u0();
            }
        });
    }

    private void x0() throws Resources.NotFoundException {
        l0();
        boolean zEquals = "Y".equals(((CommonCodeDao.ViewVisibility) q.fromJson(H.getString(getApplicationContext(), "VIEW_VISIBILITY"), CommonCodeDao.ViewVisibility.class)).getCentralInlandMap());
        this.f28172k = (CTabLayout) findViewById(AbstractC5955f.tl_ktx_map);
        K().getWindowManager().getDefaultDisplay().getSize(this.f28173l);
        this.f28177p = (ImageView) findViewById(AbstractC5955f.tl_left_arrow);
        this.f28178q = (ImageView) findViewById(AbstractC5955f.tl_right_arrow);
        ViewPager viewPager = (ViewPager) findViewById(AbstractC5955f.cp_ktx_map);
        this.f28174m = viewPager;
        viewPager.setOffscreenPageLimit(zEquals ? 7 : 6);
        b bVar = new b(getSupportFragmentManager(), zEquals);
        this.f28175n = bVar;
        this.f28174m.setAdapter(bVar);
        this.f28172k.setupWithViewPager(this.f28174m);
        Button button = (Button) findViewById(AbstractC5955f.confirm_button);
        this.f28176o = button;
        button.setEnabled(false);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.confirm_button != view.getId()) {
            super.onClick(view);
            return;
        }
        String[] selectStationNm = ((m) this.f28175n.getItem(this.f28174m.getCurrentItem())).getSelectStationNm();
        Intent intent = new Intent();
        intent.putExtra("DEPARTURE_STATION_NM", selectStationNm[0]);
        intent.putExtra("ARRIVAL_STATION_NM", selectStationNm[1]);
        setResult(-1, intent);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.select_map_activity);
        if (C6630d.isNull(bundle)) {
            v0();
            x0();
            setText();
            w0();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
    public void onTabReselected(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
    public void onTabSelected(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.d, com.google.android.material.tabs.TabLayout.c
    public void onTabUnselected(TabLayout.g gVar) {
        ((m) this.f28175n.getItem(gVar.getPosition())).clearAllMap();
        this.f28176o.setEnabled(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            getWindow().getDecorView().setSystemUiVisibility(4098);
        }
    }

    @Override // t5.InterfaceC6365a
    public void setConfirm(boolean z8) {
        this.f28176o.setEnabled(z8);
    }
}
