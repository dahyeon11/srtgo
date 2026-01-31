package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4372t4 {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f22775a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    private static int a(C4099qh0 c4099qh0) {
        int iZzg = c4099qh0.zzg();
        if (c4099qh0.zzg() == 1684108385) {
            c4099qh0.zzL(8);
            int i8 = iZzg - 16;
            if (i8 == 1) {
                return c4099qh0.zzm();
            }
            if (i8 == 2) {
                return c4099qh0.zzq();
            }
            if (i8 == 3) {
                return c4099qh0.zzo();
            }
            if (i8 == 4 && (c4099qh0.zzf() & 128) == 0) {
                return c4099qh0.zzp();
            }
        }
        AbstractC2834fc0.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static AbstractC2544d3 b(int i8, String str, C4099qh0 c4099qh0, boolean z8, boolean z9) {
        int iA = a(c4099qh0);
        if (z9) {
            iA = Math.min(1, iA);
        }
        if (iA >= 0) {
            return z8 ? new C3459l3(str, null, AbstractC2394bl0.zzn(Integer.toString(iA))) : new W2("und", str, Integer.toString(iA));
        }
        AbstractC2834fc0.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(C2317b4.zzf(i8)));
        return null;
    }

    private static C3459l3 c(int i8, String str, C4099qh0 c4099qh0) {
        int iZzg = c4099qh0.zzg();
        if (c4099qh0.zzg() == 1684108385 && iZzg >= 22) {
            c4099qh0.zzL(10);
            int iZzq = c4099qh0.zzq();
            if (iZzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzq);
                String string = sb.toString();
                int iZzq2 = c4099qh0.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new C3459l3(str, null, AbstractC2394bl0.zzn(string));
            }
        }
        AbstractC2834fc0.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(C2317b4.zzf(i8)));
        return null;
    }

    private static C3459l3 d(int i8, String str, C4099qh0 c4099qh0) {
        int iZzg = c4099qh0.zzg();
        if (c4099qh0.zzg() == 1684108385) {
            c4099qh0.zzL(8);
            return new C3459l3(str, null, AbstractC2394bl0.zzn(c4099qh0.zzz(iZzg - 16)));
        }
        AbstractC2834fc0.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(C2317b4.zzf(i8)));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x026b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:9:0x002c, B:13:0x0036, B:18:0x0042, B:19:0x004e, B:22:0x005a, B:25:0x0067, B:28:0x0076, B:31:0x0083, B:34:0x0091, B:36:0x009b, B:44:0x00b4, B:45:0x00ca, B:46:0x00dd, B:49:0x00e9, B:52:0x00f6, B:55:0x0103, B:58:0x0110, B:61:0x011d, B:64:0x012a, B:67:0x0137, B:70:0x0144, B:73:0x0154, B:76:0x0164, B:80:0x0178, B:82:0x017e, B:84:0x0192, B:85:0x0199, B:87:0x01a0, B:92:0x01ab, B:97:0x01b7, B:135:0x026b, B:98:0x01cc, B:100:0x01d3, B:102:0x01dd, B:103:0x01f1, B:116:0x021d, B:119:0x022a, B:122:0x0236, B:125:0x0242, B:128:0x024e, B:131:0x025a, B:134:0x0264, B:136:0x0284, B:137:0x028b), top: B:142:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.InterfaceC3894ot zza(com.google.android.gms.internal.ads.C4099qh0 r15) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4372t4.zza(com.google.android.gms.internal.ads.qh0):com.google.android.gms.internal.ads.ot");
    }
}
