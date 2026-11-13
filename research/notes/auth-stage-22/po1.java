package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.yandex.messaging.core.net.entities.ChatData;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class po1 implements rja, ui3, o {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public static final h1g e(po1 po1Var, p84 p84Var, ub9 ub9Var) {
        ueg uegVar = (ueg) po1Var.d;
        uegVar.getClass();
        i1g i1gVarU = uegVar.b.u();
        long j = p84Var.a;
        String str = p84Var.b;
        i1gVarU.getClass();
        mqd.z(str, "userId");
        Integer num = (Integer) h6i.M(i1gVarU.a, true, false, new mh2(j, str, 8));
        int iIntValue = num != null ? num.intValue() : -1;
        if (iIntValue != -1) {
            h1g.e.getClass();
            return new h1g(iIntValue);
        }
        if (ub9Var == null || !ub9Var.k) {
            h1g.e.getClass();
            return new h1g(fbi.i());
        }
        h1g.e.getClass();
        return (h1g) vvd.p(new h1g(fbi.i()), (wu1[]) null, new wu1[]{k1g.CanPromoteAdmin}, 1);
    }

    public static void o(po1 po1Var, pib pibVar) {
        po1Var.getClass();
        ue6 ue6Var = (ue6) po1Var.b;
        le6 le6Var = (le6) po1Var.c;
        mqd.z(le6Var, "context");
        lo7.z(ue6Var, le6Var, (ze6) null, new ih(po1Var, pibVar, null), 2);
    }

    public static void p(po1 po1Var, pib pibVar) {
        kn2 kn2Var = (kn2) po1Var.b;
        le6 le6Var = (le6) po1Var.c;
        mqd.z(le6Var, "context");
        lo7.z(kn2Var, le6Var, (ze6) null, new rz0(po1Var, pibVar, null), 2);
    }

    public void A() {
        synchronized (this) {
            ((AtomicInteger) this.c).decrementAndGet();
            if (((AtomicInteger) this.c).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void B(ChatData chatData) {
        mqd.z(chatData, "data");
        atl.n(((q9j) this.b).b, chatData.getChatId(), null);
        veg vegVarV = ((ueg) this.c).V();
        try {
            vegVarV.h0(chatData);
            vegVarV.O();
            vegVarV.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vd1.v(vegVarV, th);
                throw th2;
            }
        }
    }

    public void C(ky5 ky5Var) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = ky5Var.v0.size();
        for (int i = 0; i < size; i++) {
            jy5 jy5Var = (jy5) ky5Var.v0.get(i);
            iy5[] iy5VarArr = jy5Var.V;
            iy5 iy5Var = iy5VarArr[0];
            iy5 iy5Var2 = iy5.c;
            if (iy5Var == iy5Var2 || iy5VarArr[1] == iy5Var2) {
                arrayList.add(jy5Var);
            }
        }
        ky5Var.x0.b = true;
    }

    public Object D(lib libVar) {
        switch (this.a) {
            case 17:
                f90 f90Var = h6i.c;
                try {
                    return libVar.invoke((x35) this.c);
                } catch (NullPointerException e) {
                    if (f90Var.a()) {
                        h6i.s("ClipboardLinkHandler", "NullPointerException in clipboardManager: " + e);
                    }
                    return null;
                } catch (SecurityException e2) {
                    if (f90Var.a()) {
                        h6i.s("ClipboardLinkHandler", "SecurityException in clipboardManager: " + e2);
                    }
                    return null;
                }
            default:
                f90 f90Var2 = h6i.c;
                try {
                    return libVar.invoke((y35) this.c);
                } catch (NullPointerException e3) {
                    if (f90Var2.a()) {
                        h6i.s("ClipboardLinkHandler", "NullPointerException in clipboardManager: " + e3);
                    }
                    return null;
                } catch (SecurityException e4) {
                    if (f90Var2.a()) {
                        h6i.s("ClipboardLinkHandler", "SecurityException in clipboardManager: " + e4);
                    }
                    return null;
                }
        }
    }

    public na9 b() {
        return (na9) this.d;
    }

    public String c() {
        return "https://cloud-api.yandex.net";
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.rja
    public Object d(ic6 ic6Var) {
        no1 no1Var;
        evc evcVar;
        jyc jycVar;
        jyc jycVar2;
        jyc jycVar3;
        Object objB;
        String str;
        jlq jlqVar = (jlq) this.b;
        if (ic6Var instanceof no1) {
            no1Var = (no1) ic6Var;
            int i = no1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                no1Var.i = i - Integer.MIN_VALUE;
            } else {
                no1Var = new no1(this, (kc6) ic6Var);
            }
        } else {
            no1Var = new no1(this, (kc6) ic6Var);
        }
        Object objInvoke = no1Var.g;
        xe6 xe6Var = xe6.a;
        int i2 = no1Var.i;
        int i3 = 2;
        ic6 ic6Var2 = null;
        if (i2 == 0) {
            nzn.U(objInvoke);
            r2 r2Var = (r2) this.c;
            no1Var.i = 1;
            objInvoke = r2Var.invoke(no1Var);
            if (objInvoke != xe6Var) {
            }
            return xe6Var;
        }
        if (i2 == 1) {
            nzn.U(objInvoke);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nzn.U(objInvoke);
                return objInvoke;
            }
            jycVar3 = no1Var.f;
            jycVar2 = no1Var.e;
            evcVar = no1Var.d;
            nzn.U(objInvoke);
        }
        str = (String) objInvoke;
        if (str != null) {
            if (p0o.b0(str)) {
                str = null;
            }
            if (str != null) {
                List list = ixc.a;
                clm.c(jycVar3, "Authorization", "OAuth ".concat(str));
            }
        }
        jycVar = jycVar2;
        jycVar.d(sxc.b);
        b0d b0dVar = new b0d(jycVar, evcVar);
        oo1 oo1Var = new oo1(i3, 0, ic6Var2);
        no1Var.d = null;
        no1Var.e = null;
        no1Var.f = null;
        no1Var.i = 3;
        objB = b0dVar.b(oo1Var, no1Var);
        if (objB == xe6Var) {
            return xe6Var;
        }
        return objB;
        evcVar = (evc) objInvoke;
        jycVar = new jyc();
        tum.s(jycVar.a, jlqVar);
        if (t5c.z(jlqVar)) {
            lib libVar = (lib) this.d;
            no1Var.d = evcVar;
            no1Var.e = jycVar;
            no1Var.f = jycVar;
            no1Var.i = 2;
            Object objInvoke2 = libVar.invoke(no1Var);
            if (objInvoke2 != xe6Var) {
                jycVar2 = jycVar;
                objInvoke = objInvoke2;
                jycVar3 = jycVar2;
                str = (String) objInvoke;
                if (str != null) {
                    if (p0o.b0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        List list2 = ixc.a;
                        clm.c(jycVar3, "Authorization", "OAuth ".concat(str));
                    }
                }
                jycVar = jycVar2;
                jycVar.d(sxc.b);
                b0d b0dVar2 = new b0d(jycVar, evcVar);
                oo1 oo1Var2 = new oo1(i3, 0, ic6Var2);
                no1Var.d = null;
                no1Var.e = null;
                no1Var.f = null;
                no1Var.i = 3;
                objB = b0dVar2.b(oo1Var2, no1Var);
                if (objB == xe6Var) {
                    return objB;
                }
            }
        } else {
            jycVar.d(sxc.b);
            b0d b0dVar3 = new b0d(jycVar, evcVar);
            oo1 oo1Var3 = new oo1(i3, 0, ic6Var2);
            no1Var.d = null;
            no1Var.e = null;
            no1Var.f = null;
            no1Var.i = 3;
            objB = b0dVar3.b(oo1Var3, no1Var);
            if (objB == xe6Var) {
                return objB;
            }
        }
        return xe6Var;
    }

    public nrn f() {
        return (lok) this.d;
    }

    public boolean g() {
        synchronized (this) {
            if (((AtomicBoolean) this.d).get()) {
                return false;
            }
            ((AtomicInteger) this.c).incrementAndGet();
            return true;
        }
    }

    public String getToken() {
        String str;
        yj7 yj7Var = (yj7) this.b;
        nb1 nb1Var = (nb1) yj7Var.b;
        try {
            str = ((k0j) yj7Var.c).c(nb1Var).a;
        } catch (Exception e) {
            Log.e("TokenProvider", "Failed to retrieve user token for uid: " + nb1Var, e);
            str = null;
        }
        return str == null ? "" : str;
    }

    public String getUserAgent() {
        return ((m7s) this.c).getUserAgent();
    }

    public float h(on2 on2Var) {
        HashMap map = (HashMap) this.b;
        HashMap map2 = (HashMap) this.c;
        if (!(on2Var instanceof un2)) {
            if (on2Var instanceof qn2) {
                return ((qn2) on2Var).c();
            }
            return 0.0f;
        }
        String strB = ((un2) on2Var).b();
        if (map2.containsKey(strB)) {
            return ((ey5) map2.get(strB)).value();
        }
        if (map.containsKey(strB)) {
            return ((Integer) map.get(strB)).floatValue();
        }
        return 0.0f;
    }

    public lw3 i() {
        return ((rw3) this.d).a.c;
    }

    public long j() {
        ih7 ih7Var = (ih7) this.d;
        if (ih7Var != null) {
            return ih7Var.d;
        }
        return -1L;
    }

    public or7 k() {
        return ((rw3) this.d).a.a;
    }

    public wie l() {
        return ((rw3) this.d).a.b;
    }

    public long m() {
        return ((rw3) this.d).a.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fdq */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public void n(pz6 pz6Var, Uri uri, Map map, long j, long j2, e7k e7kVar) throws fdq {
        ih7 ih7Var = new ih7(pz6Var, j, j2);
        this.d = ih7Var;
        if (((ida) this.c) != null) {
            return;
        }
        ida[] idaVarArrD = ((lda) this.b).d(uri, map);
        int length = idaVarArrD.length;
        b9d b9dVar = f9d.b;
        biq.y(length, "expectedSize");
        a9d a9dVar = new a9d(length);
        boolean z = true;
        if (idaVarArrD.length == 1) {
            this.c = idaVarArrD[0];
        } else {
            for (ida idaVar : idaVarArrD) {
                try {
                    if (idaVar.a(ih7Var)) {
                        this.c = idaVar;
                        ih7Var.f = 0;
                        break;
                    }
                    a9dVar.c(idaVar.h());
                    boolean z2 = ((ida) this.c) != null || ih7Var.d == j;
                    bsm.s(z2);
                    ih7Var.f = 0;
                } catch (EOFException unused) {
                    if (((ida) this.c) != null || ih7Var.d == j) {
                    }
                } catch (Throwable th) {
                    if (((ida) this.c) == null && ih7Var.d != j) {
                        z = false;
                    }
                    bsm.s(z);
                    ih7Var.f = 0;
                    throw th;
                }
                bsm.s(z2);
                ih7Var.f = 0;
            }
            if (((ida) this.c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                lu luVar = new lu(", ", 2);
                Iterator it = h6i.T(f9d.l(idaVarArrD), new pn0(8)).iterator();
                StringBuilder sb2 = new StringBuilder();
                luVar.a(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                vwk vwkVarF = a9dVar.f();
                fdq fdqVar = new fdq(string, (Throwable) null, false, 1);
                f9d.k(vwkVarF);
                throw fdqVar;
            }
        }
        ((ida) this.c).k(e7kVar);
    }

    public ti3 q(Map map) {
        Long l = (Long) zb5.L0(map.values());
        if (l == null) {
            return (ti3) this.d;
        }
        long jLongValue = l.longValue();
        for (ti3 ti3Var : ti3.h) {
            Long l2 = (Long) map.get(ti3Var);
            if (l2 != null && l2.longValue() == jLongValue) {
                return ti3Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public boolean r(int i, a12 a12Var, jy5 jy5Var) {
        z02 z02Var = (z02) this.c;
        iy5[] iy5VarArr = jy5Var.V;
        int[] iArr = jy5Var.u;
        z02Var.a = iy5VarArr[0];
        z02Var.b = iy5VarArr[1];
        z02Var.c = jy5Var.s();
        z02Var.d = jy5Var.m();
        z02Var.i = false;
        z02Var.j = i;
        iy5 iy5Var = z02Var.a;
        iy5 iy5Var2 = iy5.c;
        boolean z = iy5Var == iy5Var2;
        boolean z2 = z02Var.b == iy5Var2;
        boolean z3 = z && jy5Var.Z > 0.0f;
        boolean z4 = z2 && jy5Var.Z > 0.0f;
        iy5 iy5Var3 = iy5.a;
        if (z3 && iArr[0] == 4) {
            z02Var.a = iy5Var3;
        }
        if (z4 && iArr[1] == 4) {
            z02Var.b = iy5Var3;
        }
        a12Var.b(jy5Var, z02Var);
        jy5Var.T(z02Var.e);
        jy5Var.O(z02Var.f);
        jy5Var.F = z02Var.h;
        jy5Var.K(z02Var.g);
        z02Var.j = 0;
        return z02Var.i;
    }

    public long s() {
        return ((Number) h6i.M(((ex4) this.d).a, true, false, new yw4(((q9j) this.b).a, 1))).longValue();
    }

    public void t(String str, Map map) {
        ne6.b((ne6) this.c);
        LinkedHashMap linkedHashMapP0 = (LinkedHashMap) this.d;
        linkedHashMapP0.put("event", str);
        if (map != null) {
            linkedHashMapP0 = xgf.p0(linkedHashMapP0, map);
        }
        ((x20) this.b).reportEvent("tech_message_for_incoming_call", linkedHashMapP0);
    }

    public void u(Throwable th) {
        String str = (String) this.c;
        if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
            try {
                String str2 = (String) this.b;
                if (h6i.c.a()) {
                    h6i.w(str2, str, th);
                }
                if (atl.u()) {
                    return;
                }
                atl.A(str, th);
            } catch (AssertionError | Exception | LinkageError unused) {
            }
        }
    }

    public void v(lw3 lw3Var) {
        ((rw3) this.d).a.c = lw3Var;
    }

    public void w(or7 or7Var) {
        ((rw3) this.d).a.a = or7Var;
    }

    public void x(wie wieVar) {
        ((rw3) this.d).a.b = wieVar;
    }

    public void y(long j) {
        ((rw3) this.d).a.d = j;
    }

    public void z(ky5 ky5Var, int i, int i2, int i3) {
        int i4 = ((jy5) ky5Var).e0;
        int i5 = ((jy5) ky5Var).f0;
        ((jy5) ky5Var).e0 = 0;
        ((jy5) ky5Var).f0 = 0;
        ky5Var.T(i2);
        ky5Var.O(i3);
        if (i4 < 0) {
            ((jy5) ky5Var).e0 = 0;
        } else {
            ((jy5) ky5Var).e0 = i4;
        }
        if (i5 < 0) {
            ((jy5) ky5Var).f0 = 0;
        } else {
            ((jy5) ky5Var).f0 = i5;
        }
        ky5 ky5Var2 = (ky5) this.d;
        ky5Var2.y0 = i;
        ky5Var2.a0();
    }

    public /* synthetic */ po1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ po1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public po1(long j) {
        this.a = 6;
        m0k m0kVar = new m0k(j);
        this.b = m0kVar;
        this.c = new m0k(j);
        ti3 ti3Var = ti3.f;
        this.d = ti3Var;
        m0kVar.p(ti3Var, j);
        ((m0k) this.c).p((ti3) this.d, j);
    }

    public po1(Context context, x35 x35Var, zuj zujVar) {
        this.a = 17;
        mqd.z(context, "context");
        mqd.z(x35Var, "clipboardController");
        mqd.z(zujVar, "preferencesManager");
        this.b = context;
        this.c = x35Var;
        this.d = zujVar;
    }

    public po1(Context context, y35 y35Var, dzd dzdVar) {
        this.a = 18;
        mqd.z(context, "context");
        mqd.z(y35Var, "clipboardController");
        mqd.z(dzdVar, "joinLinkPreferences");
        this.b = context;
        this.c = y35Var;
        this.d = dzdVar;
    }

    public po1(yj7 yj7Var, gsc gscVar, hnd hndVar, ljj ljjVar, hd6 hd6Var, ld5 ld5Var) {
        this.a = 20;
        mqd.z(gscVar, "userAgentProvider");
        mqd.z(hd6Var, "log");
        this.b = yj7Var;
        this.c = gscVar;
        na9 na9Var = new na9();
        na9Var.a = ljjVar;
        na9Var.b = new ngh(5);
        this.d = na9Var;
    }

    public po1(q9j q9jVar, qp0 qp0Var, ueg uegVar) {
        this.a = 11;
        mqd.z(qp0Var, "appDatabase");
        mqd.z(uegVar, "messengerCacheStorage");
        this.b = q9jVar;
        this.c = uegVar;
        this.d = qp0Var.A();
    }

    public po1(x20 x20Var, vq0 vq0Var, ne6 ne6Var, vo3 vo3Var) {
        Map mapK0;
        this.a = 7;
        mqd.z(x20Var, "analytics");
        mqd.z(vq0Var, "appForegroundStatusProvider");
        mqd.z(ne6Var, "dispatchers");
        this.b = x20Var;
        this.c = ne6Var;
        LinkedHashMap linkedHashMapN0 = xgf.n0(new ypi[]{new ypi("from_push", Boolean.valueOf(vo3Var.e() != null)), new ypi("in_foreground", Boolean.valueOf(vq0Var.a())), new ypi("message_type", ((uc) vo3Var).a), new ypi("ringing_id", vo3Var.b())});
        if (vo3Var instanceof to3) {
            to3 to3Var = (to3) vo3Var;
            uwf uwfVar = to3Var.c;
            ypi ypiVar = new ypi("meeting_id", uwfVar.a);
            ypi ypiVar2 = new ypi("chat_id", uwfVar.b);
            ypi ypiVar3 = new ypi("status", uwfVar.f);
            ypi ypiVar4 = new ypi("version", Long.valueOf(uwfVar.d));
            aek aekVar = to3Var.f;
            mapK0 = xgf.k0(new ypi[]{ypiVar, ypiVar2, ypiVar3, ypiVar4, new ypi("transit_id", aekVar != null ? aekVar.a : null), new ypi("time_elapsed_from_push", aekVar != null ? Long.valueOf(SystemClock.elapsedRealtime() - aekVar.b) : null)});
        } else {
            mapK0 = kc9.a;
        }
        linkedHashMapN0.putAll(mapK0);
        this.d = linkedHashMapN0;
    }

    public po1(String str, nb1 nb1Var, xc1 xc1Var) {
        this.a = 26;
        mqd.z(str, "personalGuid");
        this.b = str;
        this.c = nb1Var;
        this.d = xc1Var;
        boolean z = str.length() == 0;
        if (!atl.u() && z) {
            atl.y("Personal GUID must not be empty");
        }
    }

    public po1(dq5 dq5Var, pg4 pg4Var, ve6 ve6Var) {
        this.a = 15;
        mqd.z(dq5Var, "conferenceManager");
        mqd.z(pg4Var, "chatManager");
        mqd.z(ve6Var, "scopes");
        kn2 kn2VarC = ve6Var.c();
        lok lokVar = ((kh4) pg4Var).s;
        hb3 hb3Var = new hb3(lokVar, 29);
        Boolean bool = Boolean.FALSE;
        qsa qsaVar = h2n.a;
        this.b = hu0.X0(hb3Var, kn2VarC, qsaVar, bool);
        this.c = hu0.X0(new hx4(dq5Var.k(), 1), kn2VarC, qsaVar, bool);
        this.d = hu0.X0(new hx4(lokVar, 0), kn2VarC, qsaVar, bool);
    }

    public po1(String str, String str2) {
        this.a = 24;
        this.b = str;
        this.c = str2;
        this.d = new AtomicBoolean(false);
    }

    public po1(ne6 ne6Var, qp2 qp2Var, ueg uegVar, ysb ysbVar) {
        this.a = 13;
        mqd.z(ne6Var, "dispatchers");
        mqd.z(qp2Var, "cacheObserver");
        mqd.z(uegVar, "messengerCacheStorage");
        this.b = ne6Var;
        this.c = qp2Var;
        this.d = uegVar;
    }

    public po1(ue6 ue6Var) {
        this.a = 22;
        mqd.z(ue6Var, "scope");
        this.b = ue6Var;
        tk7 tk7Var = n08.a;
        this.c = li7.c.W(1);
        this.d = new z9h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public po1(String str, uc1 uc1Var) {
        this(str, (nb1) null, uc1Var);
        this.a = 26;
        mqd.z(str, "personalGuid");
    }

    public po1(kn2 kn2Var, TelephonyManager telephonyManager, re9 re9Var) {
        this.a = 5;
        this.b = telephonyManager;
        this.c = re9Var;
        this.d = hu0.X0(hu0.a0(new xo1(this, null, 24)), kn2Var, h2n.a, tfj.a);
    }

    public po1(un3 un3Var, String str, String str2) {
        this.a = 12;
        mqd.z(str, "chatId");
        this.d = un3Var;
        this.b = str;
        this.c = str2;
    }

    public po1(jlq jlqVar, r2 r2Var, lib libVar) {
        this.a = 0;
        mqd.z(libVar, "tokenProvider");
        this.b = jlqVar;
        this.c = r2Var;
        this.d = libVar;
    }

    public po1(kn2 kn2Var) {
        this.a = 23;
        tk7 tk7Var = n08.a;
        mqd.z(li7.c, "baseDispatcher");
        this.b = kn2Var;
        this.c = ucq.c.W(1);
        this.d = new z9h();
    }

    public po1(umi umiVar) {
        this.a = 19;
        this.b = umiVar;
        this.c = new AtomicInteger(0);
        this.d = new AtomicBoolean(false);
    }

    public po1(y76 y76Var, ne6 ne6Var, c2k c2kVar) {
        this.a = 14;
        mqd.z(y76Var, "searchLoader");
        this.b = y76Var;
        this.c = ne6Var;
        this.d = c2kVar;
    }

    public po1(rw3 rw3Var) {
        this.a = 9;
        this.d = rw3Var;
        this.b = new afs(this, 15);
    }

    public po1(ky5 ky5Var) {
        this.a = 2;
        this.b = new ArrayList();
        this.c = new z02();
        this.d = ky5Var;
    }

    public po1() {
        this.a = 21;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public po1(uq6 uq6Var, vq6 vq6Var) {
        this.a = 28;
        this.b = uq6Var;
        this.c = vq6Var;
        y8k y8kVar = vq6Var.r;
        this.d = lld.a(new zga(new pb5(new w1k(y8kVar, 20), new s3n(y8kVar, 1), vq6Var.R0, vq6Var.a1, vq6Var.q0)));
    }

    public po1(gjd gjdVar) {
        this.a = 8;
        this.d = gjdVar;
        this.c = new AtomicBoolean(false);
        this.b = ((uq3) gjdVar.c).d.schedule(new pq3(this, 0), 2000L, TimeUnit.MILLISECONDS);
    }
}
