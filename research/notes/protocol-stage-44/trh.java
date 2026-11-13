package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final /* synthetic */ class trh implements pib {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ trh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0308 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x030a A[Catch: all -> 0x02fd, LOOP:1: B:87:0x02c5->B:104:0x030a, LOOP_END, TryCatch #0 {all -> 0x02fd, blocks: (B:80:0x02a0, B:82:0x02b0, B:84:0x02b7, B:87:0x02c5, B:89:0x02d5, B:91:0x02e1, B:93:0x02ea, B:95:0x02f3, B:100:0x02ff, B:101:0x0302, B:104:0x030a, B:114:0x032f, B:105:0x030d, B:106:0x0313, B:108:0x0319, B:110:0x0321, B:113:0x032b), top: B:189:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0223  */
    public final Object invoke(Object obj, Object obj2) {
        fw3 fw3VarW;
        switch (this.a) {
            case 0:
                final psh pshVar = (psh) this.b;
                om5 om5Var = (fm5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                om5 om5Var2 = om5Var;
                if (om5Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yz8 yz8Var = yz8.a;
                    boolean zH = om5Var2.h(pshVar);
                    Object objP = om5Var2.P();
                    if (zH || objP == em5.a) {
                        final int i = 1;
                        objP = new kib() { // from class: qrh
                            public final Object invoke() {
                                switch (i) {
                                    case 0:
                                        pshVar.I(grh.a);
                                        break;
                                    default:
                                        pshVar.I(zqh.a);
                                        break;
                                }
                                return fcq.a;
                            }
                        };
                        om5Var2.m0(objP);
                    }
                    nr0.h(yz8Var, null, null, 0L, (kib) objP, null, null, null, null, om5Var2, 54, 492);
                } else {
                    om5Var2.V();
                }
                return fcq.a;
            case 1:
                ((Integer) obj2).getClass();
                as1.b((pui) this.b, (fm5) obj, hk3.P(1));
                return fcq.a;
            case 2:
                ((Integer) obj2).getClass();
                ((ffj) this.b).y(hk3.P(7), (fm5) obj);
                return fcq.a;
            case 3:
                cqj cqjVar = (cqj) this.b;
                Integer num = (Integer) obj;
                int iIntValue2 = num.intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean z = cqjVar.i;
                ArrayList arrayList = cqjVar.g;
                if (!z && !cqjVar.j) {
                    if (cqjVar.h) {
                        ((xpj) arrayList.get(iIntValue2)).d = true;
                        cqjVar.d.invoke(num);
                    } else {
                        ((xpj) arrayList.get(iIntValue2)).d = zBooleanValue;
                        cqjVar.e.invoke();
                    }
                }
                return fcq.a;
            case 4:
                azj azjVar = (azj) this.b;
                om5 om5Var3 = (fm5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                om5 om5Var4 = om5Var3;
                if (!om5Var4.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    om5Var4.V();
                } else if (azjVar.d) {
                    om5Var4.b0(40669737);
                    f3r.g(0.0f, 0, 7, 0L, om5Var4, (fug) null);
                    om5Var4.p(false);
                } else {
                    om5Var4.b0(40711060);
                    om5Var4.p(false);
                }
                return fcq.a;
            case 5:
                czg czgVar = (czg) this.b;
                om5 om5Var5 = (fm5) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                om5 om5Var6 = om5Var5;
                if (om5Var6.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z39.d.d(48, om5Var6, i2r.d(czgVar.b, om5Var6));
                } else {
                    om5Var6.V();
                }
                return fcq.a;
            case 6:
                ifl iflVar = (ifl) this.b;
                ((Integer) obj2).intValue();
                om5 om5Var7 = (fm5) obj;
                om5Var7.b0(-890630579);
                xpi xpiVar = iflVar.a;
                om5Var7.p(false);
                return xpiVar;
            case 7:
                ClientMessage clientMessage = (ClientMessage) this.b;
                mgn mgnVar = (mgn) obj;
                mqd.z(mgnVar, "$this$withRealConnection");
                mgnVar.l((c8q) obj2, clientMessage);
                return fcq.a;
            case 8:
                tgn tgnVar = (tgn) this.b;
                mgn mgnVar2 = (mgn) obj;
                mqd.z(mgnVar2, "$this$withRealConnection");
                mgnVar2.p(tgnVar);
                return fcq.a;
            case 9:
                dbk dbkVar = (dbk) this.b;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                dbkVar.e.l(fFloatValue);
                return fcq.a;
            case 10:
                ((Integer) obj2).getClass();
                ((bfk) this.b).y(hk3.P(7), (fm5) obj);
                return fcq.a;
            case 11:
                vnk vnkVar = (vnk) this.b;
                ra9 ra9Var = (ra9) obj;
                mqd.z(ra9Var, "reaction");
                lo7.z(ter.a(vnkVar), (ie6) null, ze6.d, new dqi(vnkVar, ra9Var, (f3f) obj2, null, 25), 1);
                return fcq.a;
            case 12:
                qqk qqkVar = (qqk) this.b;
                usl uslVar = (Set) obj;
                synchronized (qqkVar.b) {
                    try {
                        if (((nqk) qqkVar.t.getValue()).compareTo(nqk.e) >= 0) {
                            t8h t8hVar = qqkVar.g;
                            if (uslVar instanceof usl) {
                                t8h t8hVar2 = uslVar.a;
                                Object[] objArr = t8hVar2.b;
                                long[] jArr = t8hVar2.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((255 & j) < 128) {
                                                    Object obj3 = objArr[(i2 << 3) + i4];
                                                    if (!(obj3 instanceof hsn) || ((hsn) obj3).i(1)) {
                                                        t8hVar.a(obj3);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 == 8) {
                                                if (i2 != length) {
                                                    i2++;
                                                }
                                            }
                                        } else if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : (Iterable) uslVar) {
                                    if (!(obj4 instanceof hsn) || ((hsn) obj4).i(1)) {
                                        t8hVar.a(obj4);
                                    }
                                }
                            }
                            fw3VarW = qqkVar.w();
                        } else {
                            fw3VarW = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (fw3VarW != null) {
                    ((gw3) fw3VarW).f(fcq.a);
                }
                return fcq.a;
            case 13:
                ((Integer) obj2).getClass();
                ((r9l) this.b).y(hk3.P(7), (fm5) obj);
                return fcq.a;
            case 14:
                apl aplVar = (apl) this.b;
                int iIntValue5 = ((Integer) obj).intValue();
                lxd lxdVar = (ge6) obj2;
                he6 key = lxdVar.getKey();
                lxd lxdVarD1 = aplVar.e.d1(key);
                if (key == vnd.b) {
                    lxd lxdVar2 = lxdVarD1;
                    lxd parent = lxdVar;
                    while (true) {
                        if (parent == null) {
                            parent = null;
                        } else if (parent != lxdVar2 && (parent instanceof vzl)) {
                            ly4 ly4Var = (ly4) xxd.b.get((vzl) parent);
                            parent = ly4Var != null ? ly4Var.getParent() : null;
                        }
                    }
                    if (parent != lxdVar2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + lxdVar2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (lxdVar2 != null) {
                        iIntValue5++;
                    }
                } else if (lxdVar != lxdVarD1) {
                    iIntValue5 = Integer.MIN_VALUE;
                } else {
                    iIntValue5++;
                }
                return Integer.valueOf(iIntValue5);
            case 15:
                ydo ydoVar = (ydo) this.b;
                fm5 fm5Var = (fm5) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                fm5 fm5Var2 = (om5) fm5Var;
                if (fm5Var2.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((zdo) ydoVar).a(6, fm5Var2);
                } else {
                    fm5Var2.V();
                }
                return fcq.a;
            case 16:
                stl stlVar = (stl) this.b;
                dtl dtlVar = (dtl) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                mqd.z(dtlVar, "task");
                ltl ltlVar = new ltl(dtlVar, zBooleanValue2);
                lxd lxdVar3 = stlVar.k;
                if (lxdVar3 != null) {
                    lxdVar3.i((CancellationException) null);
                }
                stlVar.k = stlVar.E(new oqk(stlVar, ltlVar, (ic6) null, 7));
                return fcq.a;
            case 17:
                hul hulVar = (hul) this.b;
                dtl dtlVar2 = (dtl) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                mqd.z(dtlVar2, "task");
                hulVar.F(new jtl(dtlVar2, zBooleanValue3));
                return fcq.a;
            case 18:
                yvl yvlVar = (yvl) this.b;
                d4a d4aVar = (d4a) obj;
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                mqd.z(d4aVar, "event");
                yvlVar.H(new xul(d4aVar, zBooleanValue4));
                return fcq.a;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                iwl iwlVar = (iwl) this.b;
                om5 om5Var8 = (fm5) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                om5 om5Var9 = om5Var8;
                if (om5Var9.S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    y8p.b(awl.c(iwlVar.a, om5Var9), (fug) null, 0L, 0L, (u6b) null, 0L, (i5p) null, (v3p) null, 0L, 0, false, 0, 0, (lib) null, (qap) null, om5Var9, 0, 0, 262142);
                } else {
                    om5Var9.V();
                }
                return fcq.a;
            case 20:
                ((Integer) obj2).getClass();
                ((jyl) this.b).y(hk3.P(7), (fm5) obj);
                return fcq.a;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                p3m p3mVar = (p3m) this.b;
                lo7.z(p3mVar.M0(), (ie6) null, (ze6) null, new rt8(p3mVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), (ic6) null, 1), 3);
                return Boolean.TRUE;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                o7m o7mVar = (o7m) this.b;
                mqd.z((tzl) obj, "$this$single");
                mqd.z((dri) obj2, "it");
                return o7mVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                g6m g6mVar = (g6m) this.b;
                mqd.z((tzl) obj, "$this$single");
                mqd.z((dri) obj2, "it");
                return g6mVar;
            case 24:
                wkm wkmVar = (wkm) this.b;
                mqd.z((tzl) obj, "$this$single");
                mqd.z((dri) obj2, "it");
                return wkmVar;
            case 25:
                qno qnoVar = (qno) this.b;
                mqd.z((tzl) obj, "$this$single");
                mqd.z((dri) obj2, "it");
                return qnoVar;
            case 26:
                lno lnoVar = (lno) this.b;
                mqd.z((tzl) obj, "$this$single");
                mqd.z((dri) obj2, "it");
                return lnoVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                zx4 zx4Var = (zx4) this.b;
                mqd.z((tzl) obj, "$this$single");
                mqd.z((dri) obj2, "it");
                return zx4Var;
            case 28:
                ((l7m) this.b).H(new r6m(((Long) obj).longValue(), ((Boolean) obj2).booleanValue()));
                return fcq.a;
            default:
                ((Integer) obj2).getClass();
                ((lam) this.b).y(hk3.P(7), (fm5) obj);
                return fcq.a;
        }
    }

    public /* synthetic */ trh(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
