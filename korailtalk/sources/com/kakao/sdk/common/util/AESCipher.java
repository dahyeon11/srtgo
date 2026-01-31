package com.kakao.sdk.common.util;

import android.util.Base64;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ContextInfo;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.C5900f;

/* loaded from: classes.dex */
public final class AESCipher implements Cipher {
    private static final String ALGORITHM = "AES";
    public static final Companion Companion = new Companion(null);
    private static final int ITEM_COUNT = 2;
    private static final int KEY_LENGTH = 256;
    private final Charset charSet;
    private final String cipherAlgorithm;
    private final javax.crypto.Cipher decryptor;
    private final javax.crypto.Cipher encryptor;
    private final byte[] initVector;
    private final IvParameterSpec ivParameterSpec;
    private final String keyGenAlgorithm;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AESCipher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final String base64DecodeAndXor(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(source, Base64.DEFAULT)");
        return xorMessage(new String(bArrDecode, C5900f.UTF_8));
    }

    private final String xorMessage(String str) {
        return xorMessage(str, "com.kakao.api");
    }

    @Override // com.kakao.sdk.common.util.Cipher
    public String decrypt(String encrypted) throws BadPaddingException, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        byte[] bArrDoFinal = this.decryptor.doFinal(Base64.decode(encrypted, 2));
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "decryptor.doFinal(Base64.decode(encrypted, Base64.NO_WRAP))");
        return new String(bArrDoFinal, this.charSet);
    }

    @Override // com.kakao.sdk.common.util.Cipher
    public String encrypt(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        javax.crypto.Cipher cipher = this.encryptor;
        byte[] bytes = value.getBytes(this.charSet);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(encryptor.doFinal(value.toByteArray(charSet)), Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public AESCipher(ContextInfo contextInfo) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(contextInfo, "contextInfo");
        String strBase64DecodeAndXor = base64DecodeAndXor("My0oeSI1IzInbyA+LVFaW2wiNSokPAMiMipOLS4=");
        this.keyGenAlgorithm = strBase64DecodeAndXor;
        String strBase64DecodeAndXor2 = base64DecodeAndXor("Iio+ASgjKE4/ZSIjXDMOCUoCDww=");
        this.cipherAlgorithm = strBase64DecodeAndXor2;
        this.charSet = C5900f.UTF_8;
        byte[] bArr = {112, 78, 75, 55, -54, -30, -10, 44, 102, -126, -126, 92, -116, -48, -123, -55};
        this.initVector = bArr;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        this.ivParameterSpec = ivParameterSpec;
        String signingKeyHash = contextInfo.getSigningKeyHash();
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(strBase64DecodeAndXor);
        String strSubstring = signingKeyHash.substring(0, Math.min(signingKeyHash.length(), 16));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (strSubstring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        char[] charArray = strSubstring.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        SecretKey secretKeyGenerateSecret = secretKeyFactory.generateSecret(new PBEKeySpec(charArray, contextInfo.getSalt(), 2, 256));
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyGenerateSecret.getEncoded(), ALGORITHM);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(strBase64DecodeAndXor2);
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(cipherAlgorithm)");
        this.encryptor = cipher;
        javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance(strBase64DecodeAndXor2);
        Intrinsics.checkNotNullExpressionValue(cipher2, "getInstance(cipherAlgorithm)");
        this.decryptor = cipher2;
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            cipher2.init(2, secretKeySpec, ivParameterSpec);
        } catch (InvalidKeyException unused) {
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(Arrays.copyOfRange(secretKeyGenerateSecret.getEncoded(), 0, secretKeyGenerateSecret.getEncoded().length / 2), ALGORITHM);
            this.encryptor.init(1, secretKeySpec2, this.ivParameterSpec);
            this.decryptor.init(2, secretKeySpec2, this.ivParameterSpec);
        }
    }

    private final String xorMessage(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                char[] charArray = str2.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
                char[] charArray2 = str.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray2, "(this as java.lang.String).toCharArray()");
                int length = charArray2.length;
                int length2 = charArray.length;
                char[] cArr = new char[length];
                if (length > 0) {
                    int i8 = 0;
                    while (true) {
                        int i9 = i8 + 1;
                        cArr[i8] = (char) (charArray2[i8] ^ charArray[i8 % length2]);
                        if (i9 >= length) {
                            break;
                        }
                        i8 = i9;
                    }
                }
                return new String(cArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public /* synthetic */ AESCipher(ContextInfo contextInfo, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo);
    }
}
