package com.google.android.gms.auth.api.signin;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import b2.C1074c;
import b2.InterfaceC1073b;
import c2.k;
import c2.s;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import i2.AbstractC5683p;
import i2.C5669b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    private static Intent a(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a();
        if (scopeArr.length > 0) {
            aVar.requestScopes(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.getEmail())) {
            aVar.setAccountName((String) AbstractC5683p.checkNotNull(googleSignInAccount.getEmail()));
        }
        return new b(activity, aVar.build()).getSignInIntent();
    }

    private static Scope[] b(List list) {
        return list == null ? new Scope[0] : (Scope[]) list.toArray(new Scope[list.size()]);
    }

    public static GoogleSignInAccount getAccountForExtension(Context context, InterfaceC1073b interfaceC1073b) {
        AbstractC5683p.checkNotNull(context, "please provide a valid Context object");
        AbstractC5683p.checkNotNull(interfaceC1073b, "please provide valid GoogleSignInOptionsExtension");
        GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = GoogleSignInAccount.createDefault();
        }
        return lastSignedInAccount.requestExtraScopes(b(interfaceC1073b.b()));
    }

    public static GoogleSignInAccount getAccountForScopes(Context context, Scope scope, Scope... scopeArr) {
        AbstractC5683p.checkNotNull(context, "please provide a valid Context object");
        AbstractC5683p.checkNotNull(scope, "please provide at least one valid scope");
        GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = GoogleSignInAccount.createDefault();
        }
        lastSignedInAccount.requestExtraScopes(scope);
        lastSignedInAccount.requestExtraScopes(scopeArr);
        return lastSignedInAccount;
    }

    public static b getClient(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) AbstractC5683p.checkNotNull(googleSignInOptions));
    }

    public static GoogleSignInAccount getLastSignedInAccount(Context context) {
        return s.zzd(context).zzr();
    }

    public static AbstractC0608l getSignedInAccountFromIntent(Intent intent) {
        C1074c signInResultFromIntent = k.getSignInResultFromIntent(intent);
        if (signInResultFromIntent == null) {
            return AbstractC0611o.forException(C5669b.fromStatus(Status.RESULT_INTERNAL_ERROR));
        }
        GoogleSignInAccount signInAccount = signInResultFromIntent.getSignInAccount();
        return (!signInResultFromIntent.getStatus().isSuccess() || signInAccount == null) ? AbstractC0611o.forException(C5669b.fromStatus(signInResultFromIntent.getStatus())) : AbstractC0611o.forResult(signInAccount);
    }

    public static boolean hasPermissions(GoogleSignInAccount googleSignInAccount, InterfaceC1073b interfaceC1073b) {
        AbstractC5683p.checkNotNull(interfaceC1073b, "Please provide a non-null GoogleSignInOptionsExtension");
        return hasPermissions(googleSignInAccount, b(interfaceC1073b.b()));
    }

    public static void requestPermissions(Activity activity, int i8, GoogleSignInAccount googleSignInAccount, InterfaceC1073b interfaceC1073b) {
        AbstractC5683p.checkNotNull(activity, "Please provide a non-null Activity");
        AbstractC5683p.checkNotNull(interfaceC1073b, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(activity, i8, googleSignInAccount, b(interfaceC1073b.b()));
    }

    public static b getClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        return new b(activity, (GoogleSignInOptions) AbstractC5683p.checkNotNull(googleSignInOptions));
    }

    public static boolean hasPermissions(GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.getGrantedScopes().containsAll(hashSet);
    }

    public static void requestPermissions(Fragment fragment, int i8, GoogleSignInAccount googleSignInAccount, InterfaceC1073b interfaceC1073b) {
        AbstractC5683p.checkNotNull(fragment, "Please provide a non-null Fragment");
        AbstractC5683p.checkNotNull(interfaceC1073b, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(fragment, i8, googleSignInAccount, b(interfaceC1073b.b()));
    }

    public static void requestPermissions(Activity activity, int i8, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        AbstractC5683p.checkNotNull(activity, "Please provide a non-null Activity");
        AbstractC5683p.checkNotNull(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(a(activity, googleSignInAccount, scopeArr), i8);
    }

    public static void requestPermissions(Fragment fragment, int i8, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        AbstractC5683p.checkNotNull(fragment, "Please provide a non-null Fragment");
        AbstractC5683p.checkNotNull(scopeArr, "Please provide at least one scope");
        fragment.startActivityForResult(a(fragment.getActivity(), googleSignInAccount, scopeArr), i8);
    }
}
