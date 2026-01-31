package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.kakao.sdk.template.Constants;
import com.squareup.picasso.s;
import com.squareup.picasso.y;

/* loaded from: classes.dex */
class n extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f29820b = {"orientation"};

    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);


        /* renamed from: a, reason: collision with root package name */
        final int f29822a;

        /* renamed from: b, reason: collision with root package name */
        final int f29823b;

        /* renamed from: c, reason: collision with root package name */
        final int f29824c;

        a(int i8, int i9, int i10) {
            this.f29822a = i8;
            this.f29823b = i9;
            this.f29824c = i10;
        }
    }

    n(Context context) {
        super(context);
    }

    static int i(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f29820b, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int i8 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i8;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    static a j(int i8, int i9) {
        a aVar = a.MICRO;
        if (i8 <= aVar.f29823b && i9 <= aVar.f29824c) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i8 > aVar2.f29823b || i9 > aVar2.f29824c) ? a.FULL : aVar2;
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.y
    public boolean canHandleRequest(w wVar) {
        Uri uri = wVar.uri;
        return Constants.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.y
    public y.a load(w wVar, int i8) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f29784a.getContentResolver();
        int i9 = i(contentResolver, wVar.uri);
        String type = contentResolver.getType(wVar.uri);
        boolean z8 = type != null && type.startsWith("video/");
        if (wVar.hasSize()) {
            a aVarJ = j(wVar.targetWidth, wVar.targetHeight);
            if (!z8 && aVarJ == a.FULL) {
                return new y.a(null, P7.n.source(h(wVar)), s.e.DISK, i9);
            }
            long id = ContentUris.parseId(wVar.uri);
            BitmapFactory.Options optionsC = y.c(wVar);
            optionsC.inJustDecodeBounds = true;
            y.a(wVar.targetWidth, wVar.targetHeight, aVarJ.f29823b, aVarJ.f29824c, optionsC, wVar);
            if (z8) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, aVarJ == a.FULL ? 1 : aVarJ.f29822a, optionsC);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, aVarJ.f29822a, optionsC);
            }
            if (thumbnail != null) {
                return new y.a(thumbnail, null, s.e.DISK, i9);
            }
        }
        return new y.a(null, P7.n.source(h(wVar)), s.e.DISK, i9);
    }
}
