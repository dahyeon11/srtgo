package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.kakao.sdk.template.Constants;
import com.squareup.picasso.s;
import com.squareup.picasso.y;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5296d extends y {

    /* renamed from: b, reason: collision with root package name */
    private static final UriMatcher f29782b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f29783a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f29782b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C5296d(Context context) {
        this.f29783a = context;
    }

    private InputStream h(w wVar) {
        ContentResolver contentResolver = this.f29783a.getContentResolver();
        Uri uriLookupContact = wVar.uri;
        int iMatch = f29782b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException("Invalid uri: " + uriLookupContact);
                    }
                }
            }
            return contentResolver.openInputStream(uriLookupContact);
        }
        uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
        if (uriLookupContact == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
    }

    @Override // com.squareup.picasso.y
    public boolean canHandleRequest(w wVar) {
        Uri uri = wVar.uri;
        return Constants.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f29782b.match(wVar.uri) != -1;
    }

    @Override // com.squareup.picasso.y
    public y.a load(w wVar, int i8) {
        InputStream inputStreamH = h(wVar);
        if (inputStreamH == null) {
            return null;
        }
        return new y.a(P7.n.source(inputStreamH), s.e.DISK);
    }
}
