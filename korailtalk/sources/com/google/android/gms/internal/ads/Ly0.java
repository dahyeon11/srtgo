package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class Ly0 extends Jy0 {
    Ly0() {
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final int a(Map.Entry entry) {
        return ((Wy0) entry.getKey()).f17084b;
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final Oy0 b(Object obj) {
        return ((Vy0) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final Oy0 c(Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final Object d(Iy0 iy0, Pz0 pz0, int i8) {
        return iy0.zzc(pz0, i8);
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final Object e(Object obj, InterfaceC2444cA0 interfaceC2444cA0, Object obj2, Iy0 iy0, Oy0 oy0, Object obj3, BA0 ba0) {
        Object objValueOf;
        Object objZzf;
        ArrayList arrayList;
        Xy0 xy0 = (Xy0) obj2;
        Wy0 wy0 = xy0.f17321d;
        boolean z8 = wy0.f17086d;
        int i8 = wy0.f17084b;
        if (z8 && wy0.f17087e) {
            SA0 sa0 = SA0.zza;
            switch (wy0.f17085c.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzz(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzD(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzG(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzO(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzF(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzC(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzB(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzx(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(xy0.f17321d.f17085c)));
                case 12:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzN(arrayList);
                    break;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    interfaceC2444cA0.zzA(arrayList2);
                    Wy0 wy02 = xy0.f17321d;
                    int i9 = AbstractC3702nA0.zza;
                    InterfaceC2765ez0 interfaceC2765ez0 = wy02.f17083a;
                    if (interfaceC2765ez0 != null) {
                        int size = arrayList2.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            Integer num = (Integer) arrayList2.get(i11);
                            int iIntValue = num.intValue();
                            if (interfaceC2765ez0.zza(iIntValue) != null) {
                                if (i11 != i10) {
                                    arrayList2.set(i10, num);
                                }
                                i10++;
                            } else {
                                obj3 = AbstractC3702nA0.o(obj, i8, iIntValue, obj3, ba0);
                            }
                        }
                        if (i10 != size) {
                            arrayList2.subList(i10, size).clear();
                        }
                    }
                    arrayList = arrayList2;
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzI(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzJ(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzK(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    interfaceC2444cA0.zzL(arrayList);
                    break;
            }
            oy0.zzk(xy0.f17321d, arrayList);
        } else {
            SA0 sa02 = wy0.f17085c;
            if (sa02 != SA0.zzn) {
                switch (sa02.ordinal()) {
                    case 0:
                        objValueOf = Double.valueOf(interfaceC2444cA0.zza());
                        break;
                    case 1:
                        objValueOf = Float.valueOf(interfaceC2444cA0.zzb());
                        break;
                    case 2:
                        objValueOf = Long.valueOf(interfaceC2444cA0.zzl());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(interfaceC2444cA0.zzo());
                        break;
                    case 4:
                        objValueOf = Integer.valueOf(interfaceC2444cA0.zzg());
                        break;
                    case 5:
                        objValueOf = Long.valueOf(interfaceC2444cA0.zzk());
                        break;
                    case 6:
                        objValueOf = Integer.valueOf(interfaceC2444cA0.zzf());
                        break;
                    case 7:
                        objValueOf = Boolean.valueOf(interfaceC2444cA0.zzP());
                        break;
                    case 8:
                        objValueOf = interfaceC2444cA0.zzt();
                        break;
                    case 9:
                        Wy0 wy03 = xy0.f17321d;
                        if (!wy03.f17086d) {
                            Object objZzf2 = oy0.zzf(wy03);
                            if (objZzf2 instanceof Zy0) {
                                InterfaceC3360kA0 interfaceC3360kA0Zzb = Zz0.zza().zzb(objZzf2.getClass());
                                if (!((Zy0) objZzf2).T()) {
                                    Object objZze = interfaceC3360kA0Zzb.zze();
                                    interfaceC3360kA0Zzb.zzg(objZze, objZzf2);
                                    oy0.zzk(xy0.f17321d, objZze);
                                    objZzf2 = objZze;
                                }
                                interfaceC2444cA0.zzv(objZzf2, interfaceC3360kA0Zzb, iy0);
                                return obj3;
                            }
                        }
                        objValueOf = interfaceC2444cA0.zzr(xy0.f17320c.getClass(), iy0);
                        break;
                    case 10:
                        Wy0 wy04 = xy0.f17321d;
                        if (!wy04.f17086d) {
                            Object objZzf3 = oy0.zzf(wy04);
                            if (objZzf3 instanceof Zy0) {
                                InterfaceC3360kA0 interfaceC3360kA0Zzb2 = Zz0.zza().zzb(objZzf3.getClass());
                                if (!((Zy0) objZzf3).T()) {
                                    Object objZze2 = interfaceC3360kA0Zzb2.zze();
                                    interfaceC3360kA0Zzb2.zzg(objZze2, objZzf3);
                                    oy0.zzk(xy0.f17321d, objZze2);
                                    objZzf3 = objZze2;
                                }
                                interfaceC2444cA0.zzw(objZzf3, interfaceC3360kA0Zzb2, iy0);
                                return obj3;
                            }
                        }
                        objValueOf = interfaceC2444cA0.zzs(xy0.f17320c.getClass(), iy0);
                        break;
                    case 11:
                        objValueOf = interfaceC2444cA0.zzp();
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(interfaceC2444cA0.zzj());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        objValueOf = Integer.valueOf(interfaceC2444cA0.zzh());
                        break;
                    case 15:
                        objValueOf = Long.valueOf(interfaceC2444cA0.zzm());
                        break;
                    case 16:
                        objValueOf = Integer.valueOf(interfaceC2444cA0.zzi());
                        break;
                    case 17:
                        objValueOf = Long.valueOf(interfaceC2444cA0.zzn());
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iZzg = interfaceC2444cA0.zzg();
                if (xy0.f17321d.f17083a.zza(iZzg) == null) {
                    return AbstractC3702nA0.o(obj, i8, iZzg, obj3, ba0);
                }
                objValueOf = Integer.valueOf(iZzg);
            }
            Wy0 wy05 = xy0.f17321d;
            if (wy05.f17086d) {
                oy0.zzh(wy05, objValueOf);
            } else {
                int iOrdinal = wy05.f17085c.ordinal();
                if ((iOrdinal == 9 || iOrdinal == 10) && (objZzf = oy0.zzf(xy0.f17321d)) != null) {
                    byte[] bArr = AbstractC3793nz0.zzd;
                    objValueOf = ((Pz0) objZzf).zzcZ().zzaS((Pz0) objValueOf).zzbs();
                }
                oy0.zzk(xy0.f17321d, objValueOf);
            }
        }
        return obj3;
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final void f(Object obj) {
        ((Vy0) obj).zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final void g(InterfaceC2444cA0 interfaceC2444cA0, Object obj, Iy0 iy0, Oy0 oy0) {
        Xy0 xy0 = (Xy0) obj;
        oy0.zzk(xy0.f17321d, interfaceC2444cA0.zzs(xy0.f17320c.getClass(), iy0));
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final void h(AbstractC3677my0 abstractC3677my0, Object obj, Iy0 iy0, Oy0 oy0) {
        Xy0 xy0 = (Xy0) obj;
        Oz0 oz0ZzcY = xy0.f17320c.zzcY();
        AbstractC4816wy0 abstractC4816wy0Zzl = abstractC3677my0.zzl();
        oz0ZzcY.zzaW(abstractC4816wy0Zzl, iy0);
        oy0.zzk(xy0.f17321d, oz0ZzcY.zzbs());
        abstractC4816wy0Zzl.zzz(0);
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final void i(UA0 ua0, Map.Entry entry) {
        Wy0 wy0 = (Wy0) entry.getKey();
        if (!wy0.f17086d) {
            SA0 sa0 = SA0.zza;
            switch (wy0.f17085c.ordinal()) {
                case 0:
                    ua0.zzf(wy0.f17084b, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    ua0.zzo(wy0.f17084b, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    ua0.zzt(wy0.f17084b, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    ua0.zzK(wy0.f17084b, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    ua0.zzr(wy0.f17084b, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    ua0.zzm(wy0.f17084b, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    ua0.zzk(wy0.f17084b, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    ua0.zzb(wy0.f17084b, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    ua0.zzG(wy0.f17084b, (String) entry.getValue());
                    break;
                case 9:
                    ua0.zzq(wy0.f17084b, entry.getValue(), Zz0.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    ua0.zzv(wy0.f17084b, entry.getValue(), Zz0.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    ua0.zzd(wy0.f17084b, (AbstractC3677my0) entry.getValue());
                    break;
                case 12:
                    ua0.zzI(wy0.f17084b, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    ua0.zzr(wy0.f17084b, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    ua0.zzx(wy0.f17084b, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    ua0.zzz(wy0.f17084b, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    ua0.zzB(wy0.f17084b, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    ua0.zzD(wy0.f17084b, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        SA0 sa02 = SA0.zza;
        switch (wy0.f17085c.ordinal()) {
            case 0:
                AbstractC3702nA0.zzv(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 1:
                AbstractC3702nA0.zzz(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 2:
                AbstractC3702nA0.zzC(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 3:
                AbstractC3702nA0.zzK(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 4:
                AbstractC3702nA0.zzB(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 5:
                AbstractC3702nA0.zzy(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 6:
                AbstractC3702nA0.zzx(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 7:
                AbstractC3702nA0.zzt(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 8:
                AbstractC3702nA0.zzI(wy0.f17084b, (List) entry.getValue(), ua0);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    AbstractC3702nA0.zzA(wy0.f17084b, (List) entry.getValue(), ua0, Zz0.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    AbstractC3702nA0.zzD(wy0.f17084b, (List) entry.getValue(), ua0, Zz0.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                AbstractC3702nA0.zzu(wy0.f17084b, (List) entry.getValue(), ua0);
                break;
            case 12:
                AbstractC3702nA0.zzJ(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 13:
                AbstractC3702nA0.zzB(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 14:
                AbstractC3702nA0.zzE(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 15:
                AbstractC3702nA0.zzF(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 16:
                AbstractC3702nA0.zzG(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
            case 17:
                AbstractC3702nA0.zzH(wy0.f17084b, (List) entry.getValue(), ua0, wy0.f17087e);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Jy0
    final boolean j(Pz0 pz0) {
        return pz0 instanceof Vy0;
    }
}
