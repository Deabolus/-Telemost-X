package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.protobuf.DescriptorProtos;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.techprofile.accounts.AuthUid;
import com.yandex.messaging.ui.pollinfo.PollInfoActivity;
import com.yandex.messaging.ui.polloptioninfo.PollOptionInfoActivity;
import com.yandex.passport.api.j2;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class dqi extends lao implements pib {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqi(ic6 ic6Var, Object obj, Object obj2, int i) {
        super(2, ic6Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    private final Object v(Object obj) {
        AuthUid authUid = (AuthUid) this.h;
        xe6 xe6Var = xe6.a;
        int i = this.f;
        if (i == 0) {
            nzn.U(obj);
            pj pjVar = ((s4k) this.g).b;
            this.f = 1;
            LinkedHashMap linkedHashMap = pjVar.c;
            Object objA = linkedHashMap.get(authUid);
            if (objA == null) {
                objA = lq0.a();
                linkedHashMap.put(authUid, objA);
            }
            obj = ((pg5) objA).t(this);
            if (obj == xe6Var) {
                return xe6Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nzn.U(obj);
        }
        oj ojVar = (oj) obj;
        c8q c8qVarH = r8i.h(authUid.getValue(), ojVar.a);
        fcq fcqVar = fcq.a;
        if (c8qVarH != null) {
            ((pib) this.i).invoke(ojVar.b, new c8q(c8qVarH.a));
        }
        return fcqVar;
    }

    private final Object w(Object obj) {
        vnk vnkVar = (vnk) this.g;
        xe6 xe6Var = xe6.a;
        int i = this.f;
        if (i == 0) {
            nzn.U(obj);
            bb9 bb9Var = vnkVar.b;
            ra9 ra9Var = (ra9) this.h;
            f3f f3fVar = (f3f) this.i;
            ra9 ra9VarA = ra9.a(ra9Var, 0, f3fVar != null ? new Long(f3fVar.a) : null, 15);
            this.f = 1;
            obj = bb9Var.a(ra9VarA, this);
            if (obj == xe6Var) {
                return xe6Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nzn.U(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            vnkVar.c.c(new pmk((g3f) null));
        }
        return fcq.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.i
            xok r0 = (xok) r0
            xe6 r1 = xe6.a
            int r2 = r10.f
            r3 = 1
            if (r2 == 0) goto L21
            if (r2 != r3) goto L19
            java.lang.Object r2 = r10.g
            xh2 r2 = (xh2) r2
            java.lang.Object r4 = r10.h
            ue6 r4 = (ue6) r4
            nzn.U(r11)
            goto L41
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            nzn.U(r11)
            java.lang.Object r11 = r10.h
            ue6 r11 = (ue6) r11
            ci2 r2 = r0.d
            r2.getClass()
            xh2 r4 = new xh2
            r4.<init>(r2)
            r2 = r4
            r4 = r11
        L34:
            r10.h = r4
            r10.g = r2
            r10.f = r3
            java.lang.Object r11 = r2.b(r10)
            if (r11 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L91
            java.lang.Object r11 = r2.c()
            ypi r11 = (ypi) r11
            java.lang.Object r5 = r11.a
            ug5 r5 = (ug5) r5
            java.lang.Object r11 = r11.b
            pib r11 = (pib) r11
            qe6 r6 = new qe6
            java.util.concurrent.atomic.AtomicInteger r7 = r0.h
            java.lang.String r8 = "<this>"
            mqd.z(r7, r8)
            int r7 = r7.getAndAdd(r3)
            java.lang.String r8 = "orbit-intent-"
            java.lang.String r7 = okn.l(r7, r8)
            r6.<init>(r7)
            ie6 r6 = m51.I(r6, r5)
            jpk r7 = r0.a
            le6 r7 = r7.d
            ie6 r6 = r6.Z0(r7)
            dqi r7 = new dqi
            r8 = 26
            r9 = 0
            r7.<init>(r11, r0, r9, r8)
            r11 = 2
            lnn r11 = lo7.z(r4, r6, r9, r7, r11)
            sdi r6 = new sdi
            r7 = 24
            r6.<init>(r5, r7)
            r11.H0(r6)
            goto L34
        L91:
            fcq r11 = fcq.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqi.x(java.lang.Object):java.lang.Object");
    }

    private final Object y(Object obj) throws Throwable {
        jel jelVarE;
        xok xokVar = (xok) this.i;
        xe6 xe6Var = xe6.a;
        int i = this.f;
        jel jelVar = fcq.a;
        try {
            if (i == 0) {
                nzn.U(obj);
                ue6 ue6Var = (ue6) this.g;
                pib pibVar = (pib) this.h;
                p86 p86Var = xokVar.m;
                this.g = ue6Var;
                this.f = 1;
                if (pibVar.invoke(p86Var, this) == xe6Var) {
                    return xe6Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nzn.U(obj);
            }
            jelVarE = jelVar;
        } catch (Throwable th) {
            jelVarE = nzn.E(th);
        }
        Throwable thA = mel.a(jelVarE);
        if (thA == null) {
            return jelVar;
        }
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r0.a(r14, r13) == r2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object z(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqi.z(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 1:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 2:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 3:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 4:
                return q((ic6) obj2, (g1k) obj).t(fcq.a);
            case 5:
                return q((ic6) obj2, (xxa) obj).t(fcq.a);
            case 6:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 7:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 8:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 9:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 10:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 11:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 12:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 13:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 14:
                return q((ic6) obj2, (xxa) obj).t(fcq.a);
            case 15:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 16:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 17:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 18:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 20:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 24:
                return q((ic6) obj2, (ypi) obj).t(fcq.a);
            case 25:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 26:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 28:
                return q((ic6) obj2, (xxa) obj).t(fcq.a);
            default:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
        }
    }

    public final ic6 q(ic6 ic6Var, Object obj) {
        switch (this.e) {
            case 0:
                return new dqi((j7d) this.h, (ulq) this.i, ic6Var, 0);
            case 1:
                return new dqi((k0j) this.g, (nb1) this.h, (Uri) this.i, ic6Var, 1);
            case 2:
                return new dqi((Intent) this.g, (y0j) this.h, (idn) this.i, ic6Var, 2);
            case 3:
                dqi dqiVar = new dqi((y0j) this.h, (j2) this.i, ic6Var, 3);
                dqiVar.g = obj;
                return dqiVar;
            case 4:
                dqi dqiVar2 = new dqi((d7j) this.h, (MessageRef) this.i, ic6Var, 4);
                dqiVar2.g = obj;
                return dqiVar2;
            case 5:
                dqi dqiVar3 = new dqi((vdj) this.i, ic6Var, 5);
                dqiVar3.h = obj;
                return dqiVar3;
            case 6:
                return new dqi((ukm) this.h, (String) this.g, (ci2) this.i, ic6Var);
            case 7:
                return new dqi((amj) this.h, (List) this.i, ic6Var, 7);
            case 8:
                return new dqi((PollInfoActivity) this.h, (opj) this.i, ic6Var, 8);
            case 9:
                return new dqi((vpj) this.g, (PollInfoRequest) this.h, (g1k) this.i, ic6Var, 9);
            case 10:
                return new dqi((gqj) this.g, (PollInfoRequest) this.h, (fqj) this.i, ic6Var, 10);
            case 11:
                return new dqi((PollOptionInfoActivity) this.h, (hqj) this.i, ic6Var, 11);
            case 12:
                dqi dqiVar4 = new dqi(ic6Var, (brj) this.h, (PollInfoRequest) this.i, 12);
                dqiVar4.g = obj;
                return dqiVar4;
            case 13:
                return new dqi((zuk) this.h, (orj) this.i, ic6Var, 13);
            case 14:
                dqi dqiVar5 = new dqi((atj) this.i, ic6Var, 14);
                dqiVar5.h = obj;
                return dqiVar5;
            case 15:
                return new dqi((String) this.g, (j54) this.h, (String) this.i, ic6Var, 15);
            case 16:
                dqi dqiVar6 = new dqi((vzj) this.h, (qzj) this.i, ic6Var, 16);
                dqiVar6.g = obj;
                return dqiVar6;
            case 17:
                dqi dqiVar7 = new dqi((x3k) this.h, (q3k) this.i, ic6Var, 17);
                dqiVar7.g = obj;
                return dqiVar7;
            case 18:
                return new dqi((lib) this.h, (e4k) this.i, ic6Var, 18);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return new dqi((e4k) this.h, (pn7) this.i, ic6Var);
            case 20:
                dqi dqiVar8 = new dqi(ic6Var, (e4k) this.h, (pq4) this.i, 20);
                dqiVar8.g = obj;
                return dqiVar8;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                return new dqi((pn7) this.h, (l4k) this.i, ic6Var);
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return new dqi((s4k) this.g, (AuthUid) this.h, (y3k) this.i, ic6Var, 22);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new dqi((s4k) this.g, (AuthUid) this.h, (pib) this.i, ic6Var, 23);
            case 24:
                dqi dqiVar9 = new dqi((xdk) this.h, (j7d) this.i, ic6Var, 24);
                dqiVar9.g = obj;
                return dqiVar9;
            case 25:
                return new dqi((vnk) this.g, (ra9) this.h, (f3f) this.i, ic6Var, 25);
            case 26:
                dqi dqiVar10 = new dqi((pib) this.h, (xok) this.i, ic6Var, 26);
                dqiVar10.g = obj;
                return dqiVar10;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                dqi dqiVar11 = new dqi((xok) this.i, ic6Var, 27);
                dqiVar11.h = obj;
                return dqiVar11;
            case 28:
                dqi dqiVar12 = new dqi((e6d) this.h, (dpk) this.i, ic6Var, 28);
                dqiVar12.g = obj;
                return dqiVar12;
            default:
                dqi dqiVar13 = new dqi((f6d) this.h, (epk) this.i, ic6Var, 29);
                dqiVar13.g = obj;
                return dqiVar13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:383:0x0923  */
    /* JADX WARN: Code duplicated, block: B:385:0x0939  */
    /* JADX WARN: Code duplicated, block: B:532:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, mgn] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ic6] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.yandex.messaging.core.net.entities.proto.PollInfoResponse$AnswerVotes[]] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.yandex.messaging.core.net.entities.proto.PollInfoResponse$AnswerVotes[]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x0529 -> B:238:0x052c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:379:0x0911 -> B:381:0x0914). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object t(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 2996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqi.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqi(pn7 pn7Var, l4k l4kVar, ic6 ic6Var) {
        super(2, ic6Var);
        this.e = 21;
        this.h = (xxd) pn7Var;
        this.i = l4kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqi(e4k e4kVar, pn7 pn7Var, ic6 ic6Var) {
        super(2, ic6Var);
        this.e = 19;
        this.h = e4kVar;
        this.i = (xxd) pn7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqi(ukm ukmVar, String str, ci2 ci2Var, ic6 ic6Var) {
        super(2, ic6Var);
        this.e = 6;
        this.h = ukmVar;
        this.g = str;
        this.i = ci2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqi(Object obj, ic6 ic6Var, int i) {
        super(2, ic6Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqi(Object obj, Object obj2, ic6 ic6Var, int i) {
        super(2, ic6Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqi(Object obj, Object obj2, Object obj3, ic6 ic6Var, int i) {
        super(2, ic6Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
