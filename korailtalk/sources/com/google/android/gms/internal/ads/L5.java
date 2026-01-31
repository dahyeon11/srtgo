package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class L5 implements InterfaceC3349k5 {

    /* renamed from: b */
    private static final Pattern f14216b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c */
    private static final Pattern f14217c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d */
    private static final Pattern f14218d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e */
    static final Pattern f14219e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f */
    static final Pattern f14220f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: g */
    private static final Pattern f14221g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: h */
    private static final Pattern f14222h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i */
    private static final J5 f14223i = new J5(30.0f, 1, 1);

    /* renamed from: a */
    private final XmlPullParserFactory f14224a;

    public L5() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f14224a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long a(java.lang.String r13, com.google.android.gms.internal.ads.J5 r14) throws java.lang.NumberFormatException, com.google.android.gms.internal.ads.C2892g5 {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L5.a(java.lang.String, com.google.android.gms.internal.ads.J5):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment b(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.AbstractC2963gj0.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L5.b(java.lang.String):android.text.Layout$Alignment");
    }

    private static O5 c(O5 o52) {
        return o52 == null ? new O5() : o52;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:317:0x00c6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.O5 d(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.O5 r17) throws com.google.android.gms.internal.ads.C2892g5 {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L5.d(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.O5):com.google.android.gms.internal.ads.O5");
    }

    private static String[] e(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i8 = AbstractC2281am0.zza;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3349k5
    public final void zza(byte[] bArr, int i8, int i9, C3235j5 c3235j5, InterfaceC3462l40 interfaceC3462l40) {
        AbstractC2662e5.zza(zzb(bArr, i8, i9), c3235j5, interfaceC3462l40);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:568:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x01b6 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:497:0x0010, B:499:0x006f, B:501:0x0079, B:504:0x0084, B:507:0x0092, B:509:0x009a, B:516:0x00ac, B:519:0x00b8, B:523:0x00cb, B:525:0x00e7, B:527:0x00f5, B:529:0x00fc, B:531:0x0108, B:533:0x0113, B:566:0x01ad, B:586:0x020e, B:589:0x021c, B:591:0x0222, B:593:0x022a, B:595:0x0232, B:597:0x023a, B:599:0x0242, B:601:0x024a, B:603:0x0250, B:605:0x0258, B:607:0x0260, B:609:0x0266, B:611:0x026c, B:613:0x0272, B:615:0x027a, B:618:0x0283, B:923:0x0808, B:620:0x02b5, B:622:0x02bb, B:624:0x02c4, B:626:0x02d3, B:628:0x02de, B:630:0x02f2, B:632:0x02f8, B:785:0x05bd, B:634:0x0311, B:636:0x0319, B:638:0x031f, B:640:0x0328, B:642:0x0330, B:645:0x0341, B:649:0x0362, B:783:0x05b3, B:653:0x0381, B:655:0x0389, B:659:0x03a6, B:661:0x03ac, B:663:0x03b9, B:685:0x0426, B:687:0x042c, B:690:0x043b, B:692:0x0441, B:694:0x044e, B:713:0x04a1, B:715:0x04a9, B:735:0x04ef, B:737:0x04f7, B:763:0x053e, B:697:0x045f, B:699:0x0461, B:700:0x0462, B:701:0x046a, B:704:0x0474, B:707:0x047e, B:709:0x0484, B:711:0x048f, B:766:0x054c, B:768:0x054e, B:769:0x054f, B:770:0x0558, B:771:0x0563, B:666:0x03cf, B:668:0x03d1, B:669:0x03d2, B:670:0x03e0, B:673:0x03ec, B:677:0x0403, B:679:0x0409, B:681:0x0410, B:683:0x0416, B:775:0x0572, B:779:0x057c, B:778:0x057b, B:780:0x0585, B:781:0x0598, B:790:0x05f9, B:793:0x061b, B:827:0x0685, B:829:0x068d, B:848:0x06d7, B:836:0x06a4, B:839:0x06ae, B:843:0x06bc, B:896:0x077d, B:846:0x06c7, B:847:0x06cf, B:853:0x06e8, B:883:0x0754, B:885:0x0762, B:887:0x0767, B:874:0x0738, B:569:0x01b6, B:571:0x01c2, B:574:0x01cd, B:576:0x01d3, B:578:0x01de, B:580:0x01eb, B:582:0x01ed, B:583:0x01ee, B:537:0x012c, B:540:0x013a, B:543:0x0143, B:545:0x0149, B:547:0x0150, B:549:0x0156, B:555:0x016c, B:557:0x0173, B:565:0x01a4, B:561:0x0198, B:564:0x01a3, B:900:0x07a3, B:904:0x07b6, B:907:0x07ba, B:909:0x07c4, B:911:0x07ce, B:915:0x07de, B:913:0x07d9, B:918:0x07f8, B:921:0x0803, B:927:0x0829), top: B:964:0x0010, inners: #5, #12, #14, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:715:0x04a9 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:497:0x0010, B:499:0x006f, B:501:0x0079, B:504:0x0084, B:507:0x0092, B:509:0x009a, B:516:0x00ac, B:519:0x00b8, B:523:0x00cb, B:525:0x00e7, B:527:0x00f5, B:529:0x00fc, B:531:0x0108, B:533:0x0113, B:566:0x01ad, B:586:0x020e, B:589:0x021c, B:591:0x0222, B:593:0x022a, B:595:0x0232, B:597:0x023a, B:599:0x0242, B:601:0x024a, B:603:0x0250, B:605:0x0258, B:607:0x0260, B:609:0x0266, B:611:0x026c, B:613:0x0272, B:615:0x027a, B:618:0x0283, B:923:0x0808, B:620:0x02b5, B:622:0x02bb, B:624:0x02c4, B:626:0x02d3, B:628:0x02de, B:630:0x02f2, B:632:0x02f8, B:785:0x05bd, B:634:0x0311, B:636:0x0319, B:638:0x031f, B:640:0x0328, B:642:0x0330, B:645:0x0341, B:649:0x0362, B:783:0x05b3, B:653:0x0381, B:655:0x0389, B:659:0x03a6, B:661:0x03ac, B:663:0x03b9, B:685:0x0426, B:687:0x042c, B:690:0x043b, B:692:0x0441, B:694:0x044e, B:713:0x04a1, B:715:0x04a9, B:735:0x04ef, B:737:0x04f7, B:763:0x053e, B:697:0x045f, B:699:0x0461, B:700:0x0462, B:701:0x046a, B:704:0x0474, B:707:0x047e, B:709:0x0484, B:711:0x048f, B:766:0x054c, B:768:0x054e, B:769:0x054f, B:770:0x0558, B:771:0x0563, B:666:0x03cf, B:668:0x03d1, B:669:0x03d2, B:670:0x03e0, B:673:0x03ec, B:677:0x0403, B:679:0x0409, B:681:0x0410, B:683:0x0416, B:775:0x0572, B:779:0x057c, B:778:0x057b, B:780:0x0585, B:781:0x0598, B:790:0x05f9, B:793:0x061b, B:827:0x0685, B:829:0x068d, B:848:0x06d7, B:836:0x06a4, B:839:0x06ae, B:843:0x06bc, B:896:0x077d, B:846:0x06c7, B:847:0x06cf, B:853:0x06e8, B:883:0x0754, B:885:0x0762, B:887:0x0767, B:874:0x0738, B:569:0x01b6, B:571:0x01c2, B:574:0x01cd, B:576:0x01d3, B:578:0x01de, B:580:0x01eb, B:582:0x01ed, B:583:0x01ee, B:537:0x012c, B:540:0x013a, B:543:0x0143, B:545:0x0149, B:547:0x0150, B:549:0x0156, B:555:0x016c, B:557:0x0173, B:565:0x01a4, B:561:0x0198, B:564:0x01a3, B:900:0x07a3, B:904:0x07b6, B:907:0x07ba, B:909:0x07c4, B:911:0x07ce, B:915:0x07de, B:913:0x07d9, B:918:0x07f8, B:921:0x0803, B:927:0x0829), top: B:964:0x0010, inners: #5, #12, #14, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:727:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x04f7 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:497:0x0010, B:499:0x006f, B:501:0x0079, B:504:0x0084, B:507:0x0092, B:509:0x009a, B:516:0x00ac, B:519:0x00b8, B:523:0x00cb, B:525:0x00e7, B:527:0x00f5, B:529:0x00fc, B:531:0x0108, B:533:0x0113, B:566:0x01ad, B:586:0x020e, B:589:0x021c, B:591:0x0222, B:593:0x022a, B:595:0x0232, B:597:0x023a, B:599:0x0242, B:601:0x024a, B:603:0x0250, B:605:0x0258, B:607:0x0260, B:609:0x0266, B:611:0x026c, B:613:0x0272, B:615:0x027a, B:618:0x0283, B:923:0x0808, B:620:0x02b5, B:622:0x02bb, B:624:0x02c4, B:626:0x02d3, B:628:0x02de, B:630:0x02f2, B:632:0x02f8, B:785:0x05bd, B:634:0x0311, B:636:0x0319, B:638:0x031f, B:640:0x0328, B:642:0x0330, B:645:0x0341, B:649:0x0362, B:783:0x05b3, B:653:0x0381, B:655:0x0389, B:659:0x03a6, B:661:0x03ac, B:663:0x03b9, B:685:0x0426, B:687:0x042c, B:690:0x043b, B:692:0x0441, B:694:0x044e, B:713:0x04a1, B:715:0x04a9, B:735:0x04ef, B:737:0x04f7, B:763:0x053e, B:697:0x045f, B:699:0x0461, B:700:0x0462, B:701:0x046a, B:704:0x0474, B:707:0x047e, B:709:0x0484, B:711:0x048f, B:766:0x054c, B:768:0x054e, B:769:0x054f, B:770:0x0558, B:771:0x0563, B:666:0x03cf, B:668:0x03d1, B:669:0x03d2, B:670:0x03e0, B:673:0x03ec, B:677:0x0403, B:679:0x0409, B:681:0x0410, B:683:0x0416, B:775:0x0572, B:779:0x057c, B:778:0x057b, B:780:0x0585, B:781:0x0598, B:790:0x05f9, B:793:0x061b, B:827:0x0685, B:829:0x068d, B:848:0x06d7, B:836:0x06a4, B:839:0x06ae, B:843:0x06bc, B:896:0x077d, B:846:0x06c7, B:847:0x06cf, B:853:0x06e8, B:883:0x0754, B:885:0x0762, B:887:0x0767, B:874:0x0738, B:569:0x01b6, B:571:0x01c2, B:574:0x01cd, B:576:0x01d3, B:578:0x01de, B:580:0x01eb, B:582:0x01ed, B:583:0x01ee, B:537:0x012c, B:540:0x013a, B:543:0x0143, B:545:0x0149, B:547:0x0150, B:549:0x0156, B:555:0x016c, B:557:0x0173, B:565:0x01a4, B:561:0x0198, B:564:0x01a3, B:900:0x07a3, B:904:0x07b6, B:907:0x07ba, B:909:0x07c4, B:911:0x07ce, B:915:0x07de, B:913:0x07d9, B:918:0x07f8, B:921:0x0803, B:927:0x0829), top: B:964:0x0010, inners: #5, #12, #14, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x05b3 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:497:0x0010, B:499:0x006f, B:501:0x0079, B:504:0x0084, B:507:0x0092, B:509:0x009a, B:516:0x00ac, B:519:0x00b8, B:523:0x00cb, B:525:0x00e7, B:527:0x00f5, B:529:0x00fc, B:531:0x0108, B:533:0x0113, B:566:0x01ad, B:586:0x020e, B:589:0x021c, B:591:0x0222, B:593:0x022a, B:595:0x0232, B:597:0x023a, B:599:0x0242, B:601:0x024a, B:603:0x0250, B:605:0x0258, B:607:0x0260, B:609:0x0266, B:611:0x026c, B:613:0x0272, B:615:0x027a, B:618:0x0283, B:923:0x0808, B:620:0x02b5, B:622:0x02bb, B:624:0x02c4, B:626:0x02d3, B:628:0x02de, B:630:0x02f2, B:632:0x02f8, B:785:0x05bd, B:634:0x0311, B:636:0x0319, B:638:0x031f, B:640:0x0328, B:642:0x0330, B:645:0x0341, B:649:0x0362, B:783:0x05b3, B:653:0x0381, B:655:0x0389, B:659:0x03a6, B:661:0x03ac, B:663:0x03b9, B:685:0x0426, B:687:0x042c, B:690:0x043b, B:692:0x0441, B:694:0x044e, B:713:0x04a1, B:715:0x04a9, B:735:0x04ef, B:737:0x04f7, B:763:0x053e, B:697:0x045f, B:699:0x0461, B:700:0x0462, B:701:0x046a, B:704:0x0474, B:707:0x047e, B:709:0x0484, B:711:0x048f, B:766:0x054c, B:768:0x054e, B:769:0x054f, B:770:0x0558, B:771:0x0563, B:666:0x03cf, B:668:0x03d1, B:669:0x03d2, B:670:0x03e0, B:673:0x03ec, B:677:0x0403, B:679:0x0409, B:681:0x0410, B:683:0x0416, B:775:0x0572, B:779:0x057c, B:778:0x057b, B:780:0x0585, B:781:0x0598, B:790:0x05f9, B:793:0x061b, B:827:0x0685, B:829:0x068d, B:848:0x06d7, B:836:0x06a4, B:839:0x06ae, B:843:0x06bc, B:896:0x077d, B:846:0x06c7, B:847:0x06cf, B:853:0x06e8, B:883:0x0754, B:885:0x0762, B:887:0x0767, B:874:0x0738, B:569:0x01b6, B:571:0x01c2, B:574:0x01cd, B:576:0x01d3, B:578:0x01de, B:580:0x01eb, B:582:0x01ed, B:583:0x01ee, B:537:0x012c, B:540:0x013a, B:543:0x0143, B:545:0x0149, B:547:0x0150, B:549:0x0156, B:555:0x016c, B:557:0x0173, B:565:0x01a4, B:561:0x0198, B:564:0x01a3, B:900:0x07a3, B:904:0x07b6, B:907:0x07ba, B:909:0x07c4, B:911:0x07ce, B:915:0x07de, B:913:0x07d9, B:918:0x07f8, B:921:0x0803, B:927:0x0829), top: B:964:0x0010, inners: #5, #12, #14, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:784:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x05cd A[LOOP:1: B:622:0x02bb->B:788:0x05cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:869:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:887:0x0767 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, g5 -> 0x076b, TRY_LEAVE, TryCatch #8 {g5 -> 0x076b, blocks: (B:885:0x0762, B:887:0x0767), top: B:949:0x0762 }] */
    /* JADX WARN: Removed duplicated region for block: B:983:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.InterfaceC2777f5 zzb(byte[] r51, int r52, int r53) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException, com.google.android.gms.internal.ads.C2892g5 {
        /*
            Method dump skipped, instructions count: 2132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L5.zzb(byte[], int, int):com.google.android.gms.internal.ads.f5");
    }
}
