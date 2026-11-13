package defpackage;

import android.text.Spanned;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.s;
import com.yandex.passport.api.t0;
import com.yandex.passport.api.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public abstract class zum {
    public static b7d a;

    public static final void a(dtl r27, fug r28, int r29, kib r30, pib r31, fm5 r32, int r33) {
        dtl r1 = r27;
        mqd.z(r30, "onClick");
        mqd.z(r31, "onCheckboxClick");
        om5 r8 = (om5) r32;
        r8.d0(111844634);
        if (r8.f(r1) == false) goto L5;
        int r2 = 4;
    L6:
        int r3 = (r33 | r2) | 48;
        if (r8.d(r29) == false) goto L9;
        int r5 = 256;
    L10:
        int r4 = r3 | r5;
        if (r8.h(r30) == false) goto L13;
        int r6 = 2048;
    L14:
        int r7 = r4 | r6;
        if (r8.h(r31) == false) goto L17;
        int r9 = 16384;
    L18:
        int r12 = r7 | r9;
        if ((r12 & 9363) == 9362) goto L21;
        boolean r10 = true;
    L23:
        if (r8.S(r12 & 1, r10) == false) goto L94;
        boolean r11 = r8.f(r1.b);
        if ((r12 & 896) != 256) goto L27;
        boolean r13 = true;
    L28:
        boolean r14 = r11 | r13;
        Object r15 = r8.P();
        Object r16 = em5.a;
        if (r14 == true) goto L31;
        if (r15 == r16) goto L31;
    L32:
        a9h r17 = (a9h) r15;
        String r18 = y6i.v(r1.j, false, r8);
        String r19 = wlm.i(sf5.W0, r8, 6);
        String r110 = wlm.i(u03.v, r8, 6);
        fug r111 = cug.a;
        fug r20 = d.e(r111, 1.0f);
        ke8 r112 = ke8.a;
        ke8.f.getClass();
        fug r21 = a.g(a.b(t35.O(androidx.compose.foundation.layout.a.q(r20, fx8.h, 0.0f, 2), cym.c), ke8.d(r8).J(), xo7.e), false, r19, new gjl(0), r30, 9);
        boolean r22 = (r8.f(r18) | r8.f(r17)) | r8.f(r110);
        Object r23 = r8.P();
        if (r22 == true) goto L35;
        if (r23 == r16) goto L35;
    L36:
        fug r24 = njm.b(r21, false, (lib) r23);
        float r25 = fx8.g;
        float r113 = fx8.f;
        fug r26 = androidx.compose.foundation.layout.a.p(r24, r25, r113);
        jll r34 = ill.a(ys0.a, hnd.n, r8, 0);
        int r35 = Long.hashCode(r8.T);
        u9j r36 = r8.l();
        fug r37 = t35.W(r8, r26);
        wl5.V.getClass();
        yn5 r114 = vl5.b;
        r8.f0();
        if (r8.S == false) goto L39;
        r8.k(r114);
    L40:
        dd0 r38 = vl5.f;
        jym.h(r8, r38, r34);
        dd0 r39 = vl5.e;
        jym.h(r8, r39, r36);
        dd0 r40 = vl5.g;
        if (r8.S == false) goto L43;
    L44:
        qq3.z(r35, r8, r35, r40);
    L45:
        dd0 r41 = vl5.d;
        jym.h(r8, r41, r37);
        boolean r42 = ((Boolean) r17.getValue()).booleanValue();
        float r43 = dy4.a;
        cy4 r44 = dy4.a(ke8.h(r8).g, ke8.h(r8).g, r8);
        fug r45 = d.n(mb6.P(r111, 0.8f, 0.8f), 16);
        int r46 = r12 & 14;
        if (r46 != 4) goto L48;
        boolean r47 = true;
    L49:
        Object r48 = r8.P();
        if (r47 == true) goto L52;
        if (r48 == r16) goto L52;
    L53:
        fug r49 = njm.b(r45, false, (lib) r48);
        boolean r50 = r8.f(r17);
        if ((57344 & r12) != 16384) goto L56;
        boolean r51 = true;
    L57:
        boolean r52 = r50 | r51;
        if (r46 != 4) goto L60;
        boolean r53 = true;
    L61:
        boolean r54 = r52 | r53;
        Object r55 = r8.P();
        if (r54 == true) goto L64;
        if (r55 == r16) goto L64;
    L65:
        gy4.a(r42, (lib) r55, r49, false, r44, r8, 0, 40);
        hum.a(r8, d.r(r111, r113));
        if (1.0f > 0.0d) goto L69;
        egd.a("invalid weight; must be greater than zero");
    L69:
        LayoutWeightElement r56 = new LayoutWeightElement(1.0f, true);
        Object r57 = r8.P();
        if (r57 != r16) goto L72;
        r57 = new wxn(12);
        r8.m0(r57);
    L72:
        fug r58 = njm.a(r56, (lib) r57);
        rd5 r59 = pd5.a(ys0.c, hnd.q, r8, 0);
        int r60 = Long.hashCode(r8.T);
        u9j r61 = r8.l();
        fug r62 = t35.W(r8, r58);
        r8.f0();
        if (r8.S == false) goto L75;
        r8.k(r114);
    L76:
        jym.h(r8, r38, r59);
        jym.h(r8, r39, r61);
        if (r8.S == false) goto L79;
    L82:
        qq3.z(r60, r8, r60, r40);
    L83:
        jym.h(r8, r41, r62);
        r1 = r27;
        y8p.b(r1.c, null, ke8.d(r8).d0(), 0, null, 0, null, null, 0, 0, false, 0, 0, null, yy8.c(r8).h(r8), r8, 0, 0, 131066);
        hum.a(r8, d.f(r111, fx8.d));
        String r63 = r1.e;
        qap r210 = yy8.c(r8).f(r8);
        if (((Boolean) r17.getValue()).booleanValue() == false) goto L87;
        r8.b0(494382289);
        long r64 = ec5.c(0.6f, ke8.d(r8).d0());
        r8.p(false);
    L86:
        long r65 = r64;
        if (((Boolean) r17.getValue()).booleanValue() == false) goto L92;
        i5p r66 = i5p.d;
    L93:
        y8p.b(r63, null, r65, 0, null, 0, r66, null, 0, 0, false, 0, 0, null, r210, r8, 0, 0, 130554);
        r8 = r8;
        r8.p(true);
        r8.p(true);
        fug r67 = r111;
    L95:
        mqk r68 = r8.t();
        if (r68 == null) goto L99;
        r68.d = new koo(r1, r67, r29, r30, r31, r33);
        return;
    L99:
        return;
    L92:
        r66 = null;
        goto L93
    L87:
        r8.b0(494467942);
        r64 = ke8.d(r8).c0();
        r8.p(false);
        goto L86
    L79:
        if (mqd.s(r8.P(), Integer.valueOf(r60)) == true) goto L83;
    L75:
        r8.p0();
    L64:
        r55 = new svm(r17, r31, r1, 7);
        r8.m0(r55);
        goto L65
    L60:
        r53 = false;
        goto L61
    L56:
        r51 = false;
    L52:
        r48 = new d2n(r1, 21);
        r8.m0(r48);
        goto L53
    L48:
        r47 = false;
        goto L49
    L43:
        if (mqd.s(r8.P(), Integer.valueOf(r35)) == true) goto L45;
    L39:
        r8.p0();
    L35:
        r23 = new svm(r18, r17, r110, 6);
        r8.m0(r23);
    L31:
        r15 = wom.i(Boolean.valueOf(r1.i));
        r8.m0(r15);
        goto L32
    L27:
        r13 = false;
        goto L28
    L94:
        r8.V();
        r67 = r28;
        goto L95
    L21:
        r10 = false;
        goto L23
    L17:
        r9 = 8192;
        goto L18
    L13:
        r6 = 1024;
        goto L14
    L9:
        r5 = 128;
        goto L10
    L5:
        r2 = 2;
        goto L6
    }

    public static final d60 b(t4 r2, fre r3) {
        if (r3.b().compareTo(dre.a) <= 0) goto L7;
        v9 r0 = new v9(r2, 10);
        r3.a(r0);
        return new d60(23, r3, r0);
    L7:
        throw new IllegalStateException(("Cannot configure " + r2 + " to disposeComposition at Lifecycle ON_DESTROY: " + r3 + "is already destroyed").toString());
    }

    public static String c(ktr r7, List r8, ArrayList r9, String r10, String r11, Long r12) {
        mqd.z(r8, "subscriptions");
        mqd.z(r10, "sessionId");
        String r13 = zb5.I0(r8, StringUtils.COMMA, null, null, new y3s(1), 30);
        String r14 = zb5.I0(r9, StringUtils.COMMA, null, null, null, 62);
        String r0 = ((w3s) r7.e).a;
        String r2 = "?";
        if (p0o.M(r0, "?", false) == false) goto L5;
        r2 = "&";
    L5:
        StringBuilder r1 = new StringBuilder();
        r1.append(r0);
        r1.append(r2);
        r1.append("service=");
        r1.append(a0n.d(r13));
        r1.append("&user=");
        r1.append(a0n.d(r14));
        r1.append("&error_format=json&client=");
        r1.append(a0n.d(r7.a));
        r1.append("&session=");
        r1.append(a0n.d(r10));
        if (r11 == null) goto L8;
        r1.append("&sign=");
        r1.append(a0n.d(r11));
    L8:
        if (r12 == null) goto L11;
        r1.append("&ts=");
        r1.append(String.valueOf(r12.longValue()));
    L11:
        return r1.toString();
    }

    public static final boolean d(Spanned r2, Class r3) {
        if (r2.nextSpanTransition(-1, r2.length(), r3) == r2.length()) goto L6;
        return true;
    L6:
        return false;
    }

    public static final nb1 e(j2 r4) {
        mqd.z(r4, "<this>");
        t0 r2 = r4.q();
        mqd.z(r2, "<this>");
        if (r2.equals(v.a) == false) goto L5;
    L33:
        g91 r0 = g91.d;
    L35:
        return new nb1(r0, r4.getValue());
    L5:
        if (r2 == s.c) goto L33;
        if (r2.equals(v.e) == false) goto L10;
    L32:
        r0 = g91.h;
        goto L35
    L10:
        if (r2 == s.g) goto L32;
        if (r2.equals(v.c) == false) goto L15;
    L31:
        r0 = g91.f;
        goto L35
    L15:
        if (r2 == s.e) goto L31;
        if (r2.equals(v.b) == false) goto L20;
    L30:
        r0 = g91.e;
        goto L35
    L20:
        if (r2 == s.d) goto L30;
        if (r2.equals(v.d) == false) goto L25;
    L29:
        r0 = g91.g;
        goto L35
    L25:
        if (r2 == s.f) goto L29;
        throw new IllegalStateException(("Unknown environment: " + r2.b()).toString());
    }

    public static final k2 f(nb1 r4) {
        mqd.z(r4, "<this>");
        s r0 = fmh.M(r4.a);
        long r1 = r4.b;
        mqd.z(r0, "environment");
        b r3 = b.c;
        b r2 = b.a(r0.a.a);
        mqd.y(r2, "from(...)");
        return new k2(r2, r1);
    }

    public static String g(int r1) {
        if (r1 != 0) goto L6;
        return "Clamp";
    L6:
        if (r1 != 1) goto L10;
        return "Repeated";
    L10:
        if (r1 != 2) goto L14;
        return "Mirror";
    L14:
        if (r1 != 3) goto L17;
        return "Decal";
    L17:
        return "Unknown";
    }
}
