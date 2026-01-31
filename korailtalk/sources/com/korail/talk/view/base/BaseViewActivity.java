package com.korail.talk.view.base;

import E5.f;
import E5.i;
import I4.h;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import androidx.core.view.A;
import androidx.drawerlayout.widget.DrawerLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.menu.discountMenu.DiscountMenuActivity;
import com.korail.talk.ui.menu.discountMenu.NewDiscountMenuActivity;
import com.korail.talk.ui.menu.discountMenu.NewTripMenuActivity;
import com.korail.talk.ui.railPlus.RailPlusActivity;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import p4.C6054a;
import z4.C6627a;
import z4.C6630d;
import z4.C6641o;
import z4.H;
import z4.q;

/* loaded from: classes.dex */
public class BaseViewActivity extends BaseActivity implements View.OnClickListener, i {

    /* renamed from: e */
    protected DrawerLayout f29349e;

    /* renamed from: f */
    protected ViewGroup f29350f;

    /* renamed from: g */
    protected f f29351g;

    /* renamed from: h */
    protected final Handler f29352h = new a();

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            if (message.what == 0) {
                BaseViewActivity.this.p0();
            } else {
                BaseViewActivity.this.q0();
            }
        }
    }

    class b implements DrawerLayout.d {
        b() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerClosed(View view) {
            BaseViewActivity.this.f29349e.setDrawerLockMode(1);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerOpened(View view) {
            BaseViewActivity.this.f29349e.setDrawerLockMode(0);
            BaseViewActivity.this.f29351g.updateView();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerSlide(View view, float f8) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerStateChanged(int i8) {
        }
    }

    public void p0() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        getWindow().setAttributes(attributes);
    }

    public void q0() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        getWindow().setAttributes(attributes);
    }

    @Override // E5.i
    public void closeDrawer() {
        if (C6630d.isNotNull(this.f29349e)) {
            this.f29349e.closeDrawers();
        }
    }

    protected void i0() {
        findViewById(AbstractC5955f.v_bn).setVisibility(8);
    }

    @Override // E5.i
    public void initNavigationMenu() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(AbstractC5955f.drawer_layout);
        this.f29349e = drawerLayout;
        if (C6630d.isNull(drawerLayout)) {
            return;
        }
        this.f29349e.setDrawerLockMode(1);
        this.f29349e.addDrawerListener(new b());
        this.f29350f = (ViewGroup) findViewById(AbstractC5955f.naviMenuContainer);
        f fVarNewInstance = f.newInstance();
        this.f29351g = fVarNewInstance;
        replaceTransaction(AbstractC5955f.naviMenuContainer, fVarNewInstance, f.TAG);
    }

    @Override // E5.i
    public boolean isOpenDrawer() {
        return C6630d.isNotNull(this.f29349e) && this.f29349e.isDrawerOpen(A.END);
    }

    protected void j0() {
        if (C6054a.IS_DEBUG_LOG) {
            return;
        }
        getWindow().addFlags(8192);
    }

    protected void k0() {
        findViewById(AbstractC5955f.addBtn).setVisibility(0);
        initNavigationMenu();
        o0();
        findViewById(AbstractC5955f.backBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.menuBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.addBtn).setOnClickListener(this);
    }

    protected void l0() {
        findViewById(AbstractC5955f.backBtn).setVisibility(8);
        findViewById(AbstractC5955f.menuBtn).setVisibility(8);
        findViewById(AbstractC5955f.closeBtn).setVisibility(0);
        o0();
        findViewById(AbstractC5955f.closeBtn).setOnClickListener(this);
    }

    protected void m0() {
        n0(true);
    }

    protected void n0(boolean z8) {
        initNavigationMenu();
        if (z8) {
            r0();
        }
        o0();
        findViewById(AbstractC5955f.backBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.menuBtn).setOnClickListener(this);
        if (findViewById(AbstractC5955f.menuBtn).getVisibility() == 0) {
            findViewById(AbstractC5955f.iv_exist_push).setVisibility(h.getInstance().isNotificationExist() ? 0 : 8);
        }
    }

    public void navigationMenuRefresh() {
        if (C6630d.isNotNull(this.f29351g)) {
            this.f29351g.updateView();
        }
    }

    protected void o0() {
        View viewFindViewById = findViewById(AbstractC5955f.v_bn_book);
        View viewFindViewById2 = findViewById(AbstractC5955f.v_bn_discount);
        View viewFindViewById3 = findViewById(AbstractC5955f.v_bn_trip);
        View viewFindViewById4 = findViewById(AbstractC5955f.v_bn_ticket);
        if (viewFindViewById != null) {
            C6627a.setDescription(viewFindViewById, getString(AbstractC5959j.common_home), getString(AbstractC5959j.common_button));
            if (this instanceof MainBookingActivity) {
                viewFindViewById.setSelected(true);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(AbstractC5955f.lottie_book);
                lottieAnimationView.setProgress(0.5f);
                lottieAnimationView.setSpeed(0.5f);
                lottieAnimationView.playAnimation();
            } else {
                viewFindViewById.setOnClickListener(this);
            }
        }
        if (viewFindViewById2 != null) {
            C6627a.setDescription(viewFindViewById2, getString(AbstractC5959j.title_discount_menu), getString(AbstractC5959j.common_button));
            String stringExtra = getIntent().getStringExtra("DISCOUNT_MENU_NO");
            if ((this instanceof NewDiscountMenuActivity) || ((this instanceof DiscountMenuActivity) && "1".equals(stringExtra))) {
                viewFindViewById2.setSelected(true);
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) findViewById(AbstractC5955f.lottie_discount);
                lottieAnimationView2.setProgress(0.5f);
                lottieAnimationView2.setSpeed(0.5f);
                lottieAnimationView2.playAnimation();
            } else {
                viewFindViewById2.setOnClickListener(this);
            }
        }
        if (viewFindViewById3 != null) {
            C6627a.setDescription(viewFindViewById3, getString(AbstractC5959j.title_theme_menu), getString(AbstractC5959j.common_button));
            String stringExtra2 = getIntent().getStringExtra("DISCOUNT_MENU_NO");
            if ((this instanceof NewTripMenuActivity) || ((this instanceof DiscountMenuActivity) && "2".equals(stringExtra2))) {
                viewFindViewById3.setSelected(true);
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) findViewById(AbstractC5955f.lottie_trip);
                lottieAnimationView3.setProgress(0.5f);
                lottieAnimationView3.setSpeed(0.5f);
                lottieAnimationView3.playAnimation();
            } else {
                viewFindViewById3.setOnClickListener(this);
            }
        }
        if (viewFindViewById4 != null) {
            C6627a.setDescription(viewFindViewById4, getString(AbstractC5959j.title_ticket_confirm), getString(AbstractC5959j.common_button));
            if (!(this instanceof TicketListActivity)) {
                viewFindViewById4.setOnClickListener(this);
                return;
            }
            viewFindViewById4.setSelected(true);
            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) findViewById(AbstractC5955f.lottie_ticket);
            lottieAnimationView4.setProgress(0.5f);
            lottieAnimationView4.setSpeed(0.5f);
            lottieAnimationView4.playAnimation();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isOpenDrawer()) {
            closeDrawer();
        } else {
            super.onBackPressed();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.backBtn == id || AbstractC5955f.closeBtn == id) {
            onBackPressed();
            return;
        }
        if (AbstractC5955f.menuBtn == id) {
            openDrawer();
            return;
        }
        if (AbstractC5955f.v_bn_book == id) {
            C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
            return;
        }
        if (AbstractC5955f.v_bn_discount == id) {
            Bundle bundle = new Bundle();
            bundle.putString("DISCOUNT_MENU_NO", "1");
            if ("Y".equals(((CommonCodeDao.Data) q.fromJson(H.getString(getApplicationContext(), "VAR_DATA"), CommonCodeDao.Data.class)).getNewTabUI1())) {
                C6641o.navigation(getApplicationContext(), NewDiscountMenuActivity.class, bundle);
                return;
            } else {
                C6641o.navigation(getApplicationContext(), DiscountMenuActivity.class, bundle);
                return;
            }
        }
        if (AbstractC5955f.v_bn_trip == id) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("DISCOUNT_MENU_NO", "2");
            if ("Y".equals(((CommonCodeDao.Data) q.fromJson(H.getString(getApplicationContext(), "VAR_DATA"), CommonCodeDao.Data.class)).getNewTabUI2())) {
                C6641o.navigation(getApplicationContext(), NewTripMenuActivity.class, bundle2);
                return;
            } else {
                C6641o.navigation(getApplicationContext(), DiscountMenuActivity.class, bundle2);
                return;
            }
        }
        if (AbstractC5955f.v_bn_ticket == id) {
            C6641o.navigation(getApplicationContext(), TicketListActivity.class);
        } else if (AbstractC5955f.railplusBtn == id) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) RailPlusActivity.class));
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        closeDrawer();
        super.onPause();
    }

    @Override // E5.i
    public void openDrawer() {
        if (C6630d.isNotNull(this.f29349e)) {
            this.f29349e.openDrawer(this.f29350f);
            findViewById(AbstractC5955f.iv_exist_push).setVisibility(8);
        }
    }

    protected void r0() {
        try {
            if (H.getString(getApplicationContext(), "KEY_RAIL_PLUS_CARD_INFO").toUpperCase().equals("N")) {
                return;
            }
            ImageButton imageButton = (ImageButton) findViewById(AbstractC5955f.railplusBtn);
            imageButton.setOnClickListener(this);
            imageButton.setVisibility(0);
            C6627a.addClickEvent(imageButton, getString(AbstractC5959j.open_new_window));
        } catch (Exception unused) {
            ImageButton imageButton2 = (ImageButton) findViewById(AbstractC5955f.railplusBtn);
            imageButton2.setOnClickListener(this);
            imageButton2.setVisibility(0);
            C6627a.addClickEvent(imageButton2, getString(AbstractC5959j.open_new_window));
        }
    }

    @Override // E5.i
    public void setDrawerLockMode(int i8) {
        if (C6630d.isNull(this.f29349e)) {
            this.f29349e = (DrawerLayout) findViewById(AbstractC5955f.drawer_layout);
        }
        this.f29349e.setDrawerLockMode(i8);
    }
}
