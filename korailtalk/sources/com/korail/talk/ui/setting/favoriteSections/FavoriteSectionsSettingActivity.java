package com.korail.talk.ui.setting.favoriteSections;

import android.os.Bundle;
import android.view.View;
import com.korail.talk.ui.setting.favoriteSections.a;
import com.korail.talk.ui.setting.favoriteSections.b;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class FavoriteSectionsSettingActivity extends BaseViewActivity implements b.InterfaceC0251b, a.c {
    private void s0() {
        t0(null);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_favorite_sections_setting);
    }

    private void t0(Bundle bundle) {
        a aVarNewInstance = (a) getFragment(a.TAG);
        if (C6630d.isNull(aVarNewInstance)) {
            aVarNewInstance = a.newInstance();
        }
        if (!C6630d.isNull(bundle)) {
            aVarNewInstance.setArguments(bundle);
        }
        addTransaction(AbstractC5955f.contentContainer, aVarNewInstance, a.TAG);
    }

    private void u0() {
    }

    private void v0() {
        b bVarNewInstance = (b) getFragment(b.TAG);
        if (C6630d.isNull(bVarNewInstance)) {
            bVarNewInstance = b.newInstance();
        }
        replaceTransaction(AbstractC5955f.contentContainer, bVarNewInstance, b.TAG);
    }

    private void w0() {
        k0();
    }

    @Override // com.korail.talk.ui.setting.favoriteSections.b.InterfaceC0251b
    public void callFavoriteSectionEdit(Bundle bundle) {
        t0(bundle);
    }

    @Override // com.korail.talk.ui.setting.favoriteSections.a.c
    public void callFavoriteSectionList() {
        ((b) getFragment(b.TAG)).updateListData();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        if (AbstractC5955f.addBtn != view.getId()) {
            super.onClick(view);
        } else {
            ((b) getFragment(b.TAG)).setMode(0);
            s0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.favorite_sections_setting_activity);
        if (C6630d.isNull(bundle)) {
            w0();
            setText();
            u0();
            v0();
        }
    }
}
