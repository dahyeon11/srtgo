package com.korail.talk.ui.web;

import android.os.Bundle;
import android.view.View;
import com.korail.talk.ui.web.BaseWebViewActivity;
import com.korail.talk.view.TabView;
import com.korail.talk.view.TabViewItem;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6630d;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class TrainServiceWebViewActivity extends BaseWebViewActivity implements TabView.a {

    /* renamed from: t, reason: collision with root package name */
    private String f29320t;

    /* renamed from: u, reason: collision with root package name */
    private String f29321u;

    /* renamed from: v, reason: collision with root package name */
    private TabView f29322v;

    private void R0() {
        this.f29320t = getIntent().getStringExtra("WEB_POST_URL");
        this.f29321u = getIntent().getStringExtra("WEB_POST_URL_2");
    }

    private void S0() {
        if (N.isNotNull(this.f29321u)) {
            this.f29322v.setTabItemOnSelectedChangeListener(this);
            return;
        }
        this.f29322v.getChildCount();
        for (int i8 = 0; i8 < this.f29322v.getChildCount(); i8++) {
            View childAt = this.f29322v.getChildAt(i8);
            if (childAt instanceof TabViewItem) {
                childAt.setOnClickListener(null);
            }
        }
    }

    private void T0() {
        TabView tabView = (TabView) findViewById(AbstractC5955f.tab_view_train_service);
        this.f29322v = tabView;
        tabView.setSelectedTabItem(AbstractC5955f.tab_view_item_1, true);
    }

    private void U0() {
        P0(new BaseWebViewActivity.c(), true);
        Q0(new BaseWebViewActivity.e());
        O0(new BaseWebViewActivity.d());
        N0(this.f29320t);
    }

    @Override // com.korail.talk.ui.web.BaseWebViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_train_service_webview);
        if (C6630d.isNull(bundle)) {
            R0();
            T0();
            S0();
            U0();
            t.d("trainFacilityUrl : " + this.f29320t + ", vrUrl : " + this.f29321u);
        }
    }

    @Override // com.korail.talk.view.TabView.a
    public void onTabItemSelectedChanged(View view) {
        O(view);
        int id = view.getId();
        if (AbstractC5955f.tab_view_item_1 == id) {
            N0(this.f29320t);
        } else if (AbstractC5955f.tab_view_item_2 == id) {
            N0(this.f29321u);
        }
    }
}
