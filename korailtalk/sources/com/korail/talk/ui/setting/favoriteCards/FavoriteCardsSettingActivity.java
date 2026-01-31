package com.korail.talk.ui.setting.favoriteCards;

import android.os.Bundle;
import android.view.View;
import com.korail.talk.ui.setting.favoriteCards.a;
import com.korail.talk.ui.setting.favoriteCards.b;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import p4.C6054a;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class FavoriteCardsSettingActivity extends BaseViewActivity implements b.c, a.c {
    public static final String MODE = "MODE";

    private void s0() {
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_favorite_cards_setting);
    }

    private void t0() {
        b bVarNewInstance = (b) getFragment(b.TAG);
        if (C6630d.isNull(bVarNewInstance)) {
            bVarNewInstance = b.newInstance();
        }
        replaceTransaction(AbstractC5955f.contentContainer, bVarNewInstance, b.TAG);
    }

    private void u0() {
        String str;
        t0();
        Bundle extras = getIntent().getExtras();
        if (C6630d.isNull(extras)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("CARD_NICK_NAME", "");
        bundle.putString("CARD_NO", extras.getString("CARD_NO"));
        bundle.putString("CARD_MONTH", extras.getString("CARD_MONTH"));
        bundle.putString("CARD_YEAR", extras.getString("CARD_YEAR"));
        String string = extras.getString("CARD_CREDIT_TYPE");
        if (string == null || !string.equals("S")) {
            str = "0";
        } else {
            bundle.putString("CARD_BUSINESS_NUMBER", extras.getString("CARD_BUSINESS_NUMBER"));
            str = "1";
        }
        bundle.putString("CARD_TYPE", str);
        bundle.putInt(MODE, 1);
        addFavoriteCardEditFragment(bundle);
    }

    private void v0() {
        k0();
    }

    public void addFavoriteCardEditFragment() {
        addFavoriteCardEditFragment(null);
    }

    @Override // com.korail.talk.ui.setting.favoriteCards.b.c
    public void callFavoriteCardEdit(Bundle bundle) {
        addFavoriteCardEditFragment(bundle);
    }

    @Override // com.korail.talk.ui.setting.favoriteCards.a.c
    public void callFavoriteCardList() {
        ((b) getFragment(b.TAG)).updateListData();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.addBtn == view.getId()) {
            addFavoriteCardEditFragment();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.favorite_cards_setting_activity);
        if (C6630d.isNull(bundle)) {
            v0();
            setText();
            s0();
            u0();
        }
    }

    public void addFavoriteCardEditFragment(Bundle bundle) {
        int size = C6038a.getCreditCardList(getApplicationContext()).size();
        if (C6630d.isNull(bundle) && size >= C6054a.FAVORITE_CARD_CREDIT_LIMIT) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_card_save_count_limit_info)).showDialog();
            return;
        }
        a aVarNewInstance = a.newInstance();
        if (!C6630d.isNull(bundle)) {
            aVarNewInstance.setArguments(bundle);
        }
        addTransaction(AbstractC5955f.contentContainer, aVarNewInstance, a.TAG);
    }
}
