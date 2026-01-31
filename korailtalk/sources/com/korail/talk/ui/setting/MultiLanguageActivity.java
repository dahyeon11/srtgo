package com.korail.talk.ui.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.kakao.sdk.user.Constants;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import n4.AbstractC5952c;
import n4.AbstractC5957h;
import r4.g;
import s4.C6219c;
import z4.C6630d;
import z4.C6637k;
import z4.H;
import z4.I;
import z4.N;
import z4.r;

/* loaded from: classes.dex */
public class MultiLanguageActivity extends BaseActivity {

    /* renamed from: e, reason: collision with root package name */
    private final String f28703e = "common_yes_";

    /* renamed from: f, reason: collision with root package name */
    private final String f28704f = "common_no_";

    /* renamed from: g, reason: collision with root package name */
    private final String f28705g = "select_lang_dialog_title_";

    /* renamed from: h, reason: collision with root package name */
    private final String f28706h = "multi_language_dialog_title_";

    /* renamed from: i, reason: collision with root package name */
    private final String f28707i = "multi_language_dialog_message_";

    /* renamed from: j, reason: collision with root package name */
    private String[] f28708j;

    /* renamed from: k, reason: collision with root package name */
    private String f28709k;

    private void h0() {
        if (!getIntent().getBooleanExtra("IS_DIRECT_SHOW_MULTI_LANGUAGE", false)) {
            o0();
            return;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        String strConvertLanguageToWebView = r.convertLanguageToWebView(this.f28709k);
        Locale locale = Locale.JAPANESE;
        intent.putExtra("WEB_POST_URL", g.MULTI_LANGUAGE_URL + ((strConvertLanguageToWebView.equals(locale) || locale.getLanguage().equals(this.f28709k)) ? g.MULTI_LANGUAGE_JPN_DATA : Locale.CHINESE.getLanguage().equals(this.f28709k) ? g.MULTI_LANGUAGE_CHN_DATA : "zht".equals(this.f28709k) ? g.MULTI_LANGUAGE_TW_DATA : "vi".equals(this.f28709k) ? g.MULTI_LANGUAGE_VI_DATA : (Constants.ID.equals(this.f28709k) || "in".equals(this.f28709k)) ? g.MULTI_LANGUAGE_ID_DATA : "th".equals(this.f28709k) ? g.MULTI_LANGUAGE_TH_DATA : g.MULTI_LANGUAGE_ENG_DATA));
        intent.putExtra("IS_SCREEN_FULL", true);
        startActivity(intent);
        finish();
    }

    private int i0(String str) {
        if (Locale.KOREAN.getLanguage().equals(str)) {
            return 0;
        }
        if (!Locale.ENGLISH.getLanguage().equals(str)) {
            if (Locale.CHINESE.getLanguage().equals(str)) {
                return 2;
            }
            if ("zht".equals(str)) {
                return 3;
            }
            if (Locale.JAPANESE.getLanguage().equals(str)) {
                return 4;
            }
            if ("vi".equals(str)) {
                return 5;
            }
            if (Constants.ID.equals(str) || "in".equals(str)) {
                return 6;
            }
            if ("th".equals(str)) {
                return 7;
            }
        }
        return 1;
    }

    private String j0(String str) {
        return getString(I.getStringID(getApplicationContext(), str + this.f28709k));
    }

    private String k0(int i8) {
        Locale locale = Locale.ENGLISH;
        String language = locale.getLanguage();
        switch (i8) {
            case 0:
                return Locale.KOREA.getLanguage();
            case 1:
                return locale.getLanguage();
            case 2:
                return Locale.CHINESE.getLanguage();
            case 3:
                return "zht";
            case 4:
                return Locale.JAPANESE.getLanguage();
            case 5:
                return "vi";
            case 6:
                return Constants.ID;
            case 7:
                return "th";
            default:
                return language;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(DialogInterface dialogInterface, int i8, boolean z8, int i9) {
        if (100 == i8) {
            finish();
            return;
        }
        if (102 == i8) {
            this.f28709k = k0(i9);
            H.putString(getApplicationContext(), "IS_MULTI_LANGUAGE_TYPE", this.f28709k);
            if (Locale.KOREAN.getLanguage().equals(this.f28709k)) {
                finish();
            } else {
                m0();
            }
        }
    }

    private void m0() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        String strConvertLanguageToWebView = r.convertLanguageToWebView(this.f28709k);
        Locale locale = Locale.JAPANESE;
        intent.putExtra("WEB_POST_URL", g.MULTI_LANGUAGE_URL + ((strConvertLanguageToWebView.equals(locale) || locale.getLanguage().equals(this.f28709k)) ? g.MULTI_LANGUAGE_JPN_DATA : Locale.CHINESE.getLanguage().equals(this.f28709k) ? g.MULTI_LANGUAGE_CHN_DATA : "zht".equals(this.f28709k) ? g.MULTI_LANGUAGE_TW_DATA : "vi".equals(this.f28709k) ? g.MULTI_LANGUAGE_VI_DATA : (Constants.ID.equals(this.f28709k) || "in".equals(this.f28709k)) ? g.MULTI_LANGUAGE_ID_DATA : "th".equals(this.f28709k) ? g.MULTI_LANGUAGE_TH_DATA : g.MULTI_LANGUAGE_ENG_DATA));
        intent.putExtra("IS_SCREEN_FULL", true);
        startActivity(intent);
        finish();
    }

    private void n0() {
        this.f28708j = getResources().getStringArray(AbstractC5952c.multi_language);
        this.f28709k = r.getLanguageType(getApplicationContext());
    }

    private void o0() {
        int iI0 = i0(this.f28709k);
        String strJ0 = j0("select_lang_dialog_title_");
        j0("common_no_");
        C6637k.getRDialog(K(), 1001, 0, strJ0).setRadioGroup(this.f28708j, iI0).setButtonTextLetterCase(false).setButtonNames(N.getStringArray(j0("common_yes_"))).setButtonListener(new C6219c.d() { // from class: V5.a
            @Override // s4.C6219c.d
            public final void onClick(DialogInterface dialogInterface, int i8, boolean z8, int i9) {
                this.f5222a.l0(dialogInterface, i8, z8, i9);
            }
        }).showDialog();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_empty);
        if (C6630d.isNull(bundle)) {
            n0();
            h0();
        }
    }
}
