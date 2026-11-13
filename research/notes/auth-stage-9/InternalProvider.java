package com.yandex.passport.internal.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.api.exception.e0;
import com.yandex.passport.api.exception.n;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.common.network.r;
import com.yandex.passport.data.network.core.s;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.analytics.x;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.methods.a1;
import com.yandex.passport.internal.methods.a2;
import com.yandex.passport.internal.methods.a3;
import com.yandex.passport.internal.methods.b1;
import com.yandex.passport.internal.methods.b2;
import com.yandex.passport.internal.methods.b3;
import com.yandex.passport.internal.methods.c1;
import com.yandex.passport.internal.methods.c2;
import com.yandex.passport.internal.methods.c3;
import com.yandex.passport.internal.methods.d2;
import com.yandex.passport.internal.methods.d3;
import com.yandex.passport.internal.methods.e1;
import com.yandex.passport.internal.methods.e2;
import com.yandex.passport.internal.methods.f1;
import com.yandex.passport.internal.methods.f2;
import com.yandex.passport.internal.methods.g1;
import com.yandex.passport.internal.methods.g2;
import com.yandex.passport.internal.methods.h1;
import com.yandex.passport.internal.methods.h2;
import com.yandex.passport.internal.methods.i1;
import com.yandex.passport.internal.methods.i2;
import com.yandex.passport.internal.methods.j1;
import com.yandex.passport.internal.methods.j2;
import com.yandex.passport.internal.methods.k0;
import com.yandex.passport.internal.methods.k1;
import com.yandex.passport.internal.methods.k2;
import com.yandex.passport.internal.methods.l0;
import com.yandex.passport.internal.methods.l1;
import com.yandex.passport.internal.methods.l2;
import com.yandex.passport.internal.methods.m0;
import com.yandex.passport.internal.methods.m1;
import com.yandex.passport.internal.methods.m2;
import com.yandex.passport.internal.methods.n0;
import com.yandex.passport.internal.methods.n1;
import com.yandex.passport.internal.methods.n2;
import com.yandex.passport.internal.methods.o0;
import com.yandex.passport.internal.methods.o1;
import com.yandex.passport.internal.methods.o2;
import com.yandex.passport.internal.methods.p0;
import com.yandex.passport.internal.methods.p1;
import com.yandex.passport.internal.methods.p2;
import com.yandex.passport.internal.methods.performer.d1;
import com.yandex.passport.internal.methods.q0;
import com.yandex.passport.internal.methods.q1;
import com.yandex.passport.internal.methods.q2;
import com.yandex.passport.internal.methods.r0;
import com.yandex.passport.internal.methods.r1;
import com.yandex.passport.internal.methods.r2;
import com.yandex.passport.internal.methods.s0;
import com.yandex.passport.internal.methods.s1;
import com.yandex.passport.internal.methods.s2;
import com.yandex.passport.internal.methods.t0;
import com.yandex.passport.internal.methods.t1;
import com.yandex.passport.internal.methods.t2;
import com.yandex.passport.internal.methods.u0;
import com.yandex.passport.internal.methods.u1;
import com.yandex.passport.internal.methods.u2;
import com.yandex.passport.internal.methods.u5;
import com.yandex.passport.internal.methods.v0;
import com.yandex.passport.internal.methods.v1;
import com.yandex.passport.internal.methods.v2;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.w0;
import com.yandex.passport.internal.methods.w1;
import com.yandex.passport.internal.methods.w2;
import com.yandex.passport.internal.methods.x0;
import com.yandex.passport.internal.methods.x1;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.methods.y0;
import com.yandex.passport.internal.methods.y1;
import com.yandex.passport.internal.methods.y2;
import com.yandex.passport.internal.methods.z0;
import com.yandex.passport.internal.methods.z1;
import com.yandex.passport.internal.methods.z2;
import com.yandex.passport.internal.util.o;
import defpackage.zgo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/internal/provider/InternalProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = zgo.FG_BG_ID_FIELD_NUMBER)
public final class InternalProvider extends ContentProvider {
    public static volatile boolean d;
    public d1 a;
    public x b;
    public boolean c;

    public InternalProvider() {
    }

    public final void a(long r5, String r7, String r8) {
        long r0 = SystemClock.elapsedRealtime() - r5;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L5;
        com.yandex.passport.common.logger.a.c(b.b, null, p.e + ": method=" + r7 + " time=" + r0, 8);
    L5:
        ypi r6 = new ypi("method", r7);
        ypi r1 = new ypi("execution_time", String.valueOf(r0));
        if (r8 == null) goto L8;
        ypi r9 = new ypi(Constants.KEY_EXCEPTION, r8);
    L9:
        Object[] r10 = Arrays.copyOf(new ypi[]{r6, r1, r9}, 3);
        mqd.z(r10, "elements");
        Map r11 = xgf.v0(tt0.x0(r10));
        x r12 = this.b;
        if (r12 == null) goto L13;
        r12.e(p.e, r11);
        return;
    L13:
        mqd.Y("appAnalyticsTracker");
        throw null;
    L8:
        r9 = null;
        goto L9
    }

    public final Bundle b(String r9, String r10, Bundle r11) {
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L6;
        b r1 = b.b;
        StringBuilder r4 = new StringBuilder("call: isInPassportProcess=");
        k87.q(" method='", r9, "' arg='", r4, d);
        r4.append(r10);
        r4.append("' extras=");
        r4.append(r11);
        com.yandex.passport.common.logger.a.c(r1, null, r4.toString(), 8);
    L6:
        if (this.c == true) goto L125;
        PassportProcessGlobalComponent r12 = com.yandex.passport.internal.di.a.a();
        mqd.y(r12, "getPassportProcessGlobalComponent(...)");
        this.a = r12.getMethodPerformDispatcher();
        this.b = r12.getAnalyticsTrackerWrapper();
        this.c = true;
    L125:
        v5 r2 = v5.valueOf(r9);     // Catch: IllegalArgumentException -> L115
        if (r11 == null) goto L12;
        r11.setClassLoader(o.class.getClassLoader());
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L23;
        com.yandex.passport.common.logger.a.c(b.b, null, "Going to performMethod " + r2, 8);
    L23:
        d1 r13 = this.a;
        if (r13 == null) goto L113;
        mqd.z(r2, "ref");
        switch(r2.ordinal()) {
            case 0: goto L107;
            case 1: goto L106;
            case 2: goto L105;
            case 3: goto L104;
            case 4: goto L103;
            case 5: goto L102;
            case 6: goto L101;
            case 7: goto L100;
            case 8: goto L99;
            case 9: goto L98;
            case 10: goto L97;
            case 11: goto L96;
            case 12: goto L95;
            case 13: goto L94;
            case 14: goto L93;
            case 15: goto L92;
            case 16: goto L91;
            case 17: goto L90;
            case 18: goto L89;
            case 19: goto L88;
            case 20: goto L87;
            case 21: goto L86;
            case 22: goto L85;
            case 23: goto L84;
            case 24: goto L83;
            case 25: goto L82;
            case 26: goto L81;
            case 27: goto L80;
            case 28: goto L79;
            case 29: goto L78;
            case 30: goto L77;
            case 31: goto L76;
            case 32: goto L75;
            case 33: goto L74;
            case 34: goto L73;
            case 35: goto L72;
            case 36: goto L71;
            case 37: goto L70;
            case 38: goto L69;
            case 39: goto L68;
            case 40: goto L67;
            case 41: goto L66;
            case 42: goto L65;
            case 43: goto L64;
            case 44: goto L63;
            case 45: goto L62;
            case 46: goto L61;
            case 47: goto L60;
            case 48: goto L59;
            case 49: goto L58;
            case 50: goto L57;
            case 51: goto L56;
            case 52: goto L55;
            case 53: goto L54;
            case 54: goto L53;
            case 55: goto L52;
            case 56: goto L51;
            case 57: goto L50;
            case 58: goto L49;
            case 59: goto L48;
            case 60: goto L47;
            case 61: goto L46;
            case 62: goto L45;
            case 63: goto L44;
            case 64: goto L43;
            case 65: goto L42;
            case 66: goto L41;
            case 67: goto L40;
            case 68: goto L39;
            case 69: goto L38;
            case 70: goto L37;
            case 71: goto L36;
            case 72: goto L35;
            case 73: goto L34;
            case 74: goto L33;
            case 75: goto L32;
            case 76: goto L31;
            case 77: goto L30;
            case 78: goto L29;
            default: goto L28;
        };
    L29:
        lib r14 = b3.b;
    L108:
        u5 r15 = (u5) r14.invoke(r11);
        mqd.z(r15, "method");
        udr r16 = new udr(7, r13, r15);
        r15.getClass();
        Object r17 = ((mel) r16.invoke()).a;
        Throwable r18 = mel.a(r17);
        if (r18 != null) goto L111;
        Bundle r19 = new Bundle();
        r15.c().d(r19, r17);
        return r19;
    L111:
        Bundle r20 = new Bundle();
        r20.putSerializable(Constants.KEY_EXCEPTION, r18);
        return r20;
    L30:
        r14 = a3.b;
        goto L108
    L31:
        r14 = z2.b;
        goto L108
    L32:
        r14 = x2.b;
        goto L108
    L33:
        r14 = v2.b;
        goto L108
    L34:
        r14 = u2.b;
        goto L108
    L35:
        r14 = t2.b;
        goto L108
    L36:
        r14 = q2.b;
        goto L108
    L37:
        r14 = p2.b;
        goto L108
    L38:
        r14 = o2.b;
        goto L108
    L39:
        r14 = new r(20);
        goto L108
    L40:
        r14 = new r(19);
        goto L108
    L41:
        r14 = n2.b;
        goto L108
    L42:
        r14 = m2.b;
        goto L108
    L43:
        r14 = new r(18);
        goto L108
    L44:
        r14 = l2.b;
        goto L108
    L45:
        r14 = k2.b;
        goto L108
    L46:
        r14 = i2.b;
        goto L108
    L47:
        r14 = h2.b;
        goto L108
    L48:
        r14 = g2.b;
        goto L108
    L49:
        r14 = f2.b;
        goto L108
    L50:
        r14 = e2.b;
        goto L108
    L51:
        r14 = d2.b;
        goto L108
    L52:
        r14 = c2.b;
        goto L108
    L53:
        r14 = new r(17);
        goto L108
    L54:
        r14 = b2.b;
        goto L108
    L55:
        r14 = a2.b;
        goto L108
    L56:
        r14 = y1.b;
        goto L108
    L57:
        r14 = x1.b;
        goto L108
    L58:
        r14 = w1.b;
        goto L108
    L59:
        r14 = v1.b;
        goto L108
    L60:
        r14 = u1.b;
        goto L108
    L61:
        r14 = t1.b;
        goto L108
    L62:
        r14 = s1.b;
        goto L108
    L63:
        r14 = r1.b;
        goto L108
    L64:
        r14 = q1.b;
        goto L108
    L65:
        r14 = p1.b;
        goto L108
    L66:
        r14 = n1.b;
        goto L108
    L67:
        r14 = m1.b;
        goto L108
    L68:
        r14 = c1.b;
        goto L108
    L69:
        r14 = l1.b;
        goto L108
    L70:
        r14 = k1.b;
        goto L108
    L71:
        r14 = j1.b;
        goto L108
    L72:
        r14 = i1.b;
        goto L108
    L73:
        r14 = new r(16);
        goto L108
    L74:
        r14 = h1.b;
        goto L108
    L75:
        r14 = new r(15);
        goto L108
    L76:
        r14 = y2.b;
        goto L108
    L77:
        r14 = g1.b;
        goto L108
    L78:
        r14 = e1.b;
        goto L108
    L79:
        r14 = w2.b;
        goto L108
    L80:
        r14 = com.yandex.passport.internal.methods.d1.b;
        goto L108
    L81:
        r14 = b1.b;
        goto L108
    L82:
        r14 = a1.b;
        goto L108
    L83:
        r14 = z0.b;
        goto L108
    L84:
        r14 = y0.b;
        goto L108
    L85:
        r14 = x0.b;
        goto L108
    L86:
        r14 = w0.b;
        goto L108
    L87:
        r14 = v0.b;
        goto L108
    L88:
        r14 = s0.b;
        goto L108
    L89:
        r14 = r0.b;
        goto L108
    L90:
        r14 = q0.b;
        goto L108
    L91:
        r14 = t0.b;
        goto L108
    L92:
        r14 = p0.b;
        goto L108
    L93:
        r14 = o0.b;
        goto L108
    L94:
        r14 = n0.b;
        goto L108
    L95:
        r14 = m0.b;
        goto L108
    L96:
        r14 = l0.b;
        goto L108
    L97:
        r14 = k0.b;
        goto L108
    L98:
        r14 = d3.b;
        goto L108
    L99:
        r14 = c3.b;
        goto L108
    L100:
        r14 = new r(14);
        goto L108
    L101:
        r14 = r2.b;
        goto L108
    L102:
        r14 = j2.b;
        goto L108
    L103:
        r14 = z1.b;
        goto L108
    L104:
        r14 = o1.b;
        goto L108
    L105:
        r14 = f1.b;
        goto L108
    L106:
        r14 = s2.b;
        goto L108
    L107:
        r14 = u0.b;
        goto L108
    L28:
        throw new mnh();
    L113:
        mqd.Y("methodPerformDispatcher");
        throw null;
    L12:
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L14;
        com.yandex.passport.common.logger.a.c(b.e, null, una.c("call: method='", r9, "': extras is null"), 8);
    L14:
        e0 r110 = new e0(okn.k('\'', "Extra is null for method '", r9));
        x r21 = this.b;
        if (r21 == null) goto L18;
        r21.d(w.a, r110);
        return s.i(r110);
    L18:
        mqd.Y("appAnalyticsTracker");
        throw null;
    L115:
        e = move-exception;
        d r3 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L119;
        com.yandex.passport.common.logger.a.b(b.e, null, okn.k('\'', "call: unknown method '", r9), e);
    L119:
        x r5 = this.b;
        if (r5 == null) goto L123;
        r5.d(w.a, e);
        return s.i(new e0(okn.k('\'', "Unknown provider method '", r9)));
    L123:
        mqd.Y("appAnalyticsTracker");
        throw null;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String r8, String r9, Bundle r10) {
        mqd.z(r8, "method");
        long r4 = SystemClock.elapsedRealtime();     // Catch: t -> L8 n -> L10 SecurityException -> L12 Throwable -> L14
        return b(r8, r9, r10);
    L6:
        th = th;
    L16:
        d r11 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L20;
        com.yandex.passport.common.logger.a.b(b.e, null, "call", th);
    L20:
        if ((th instanceof Exception) == false) goto L22;
        Exception r12 = th;
    L24:
        if (this.c == false) goto L43;
        if (r4 == 0) goto L28;
        a(r4, r8, th.getMessage());     // Catch: Throwable -> L30
    L61:
    L37:
        x r13 = this.b;
        if (r13 == null) goto L40;
        r13.d(w.a, r12);
    L66:
        return s.i(r12);
    L40:
        mqd.Y("appAnalyticsTracker");
        throw null;
    L28:
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L61;
        com.yandex.passport.common.logger.a.c(b.e, null, "reportExecutionTimeWithException: startTime is not initialized", 8);     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        d r14 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L37;
        com.yandex.passport.common.logger.a.b(b.e, null, "reportExecutionTimeWithException", th);
        goto L37
    L43:
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L66;
        com.yandex.passport.common.logger.a.c(b.e, null, "appAnalyticsTracker is not injected on " + th + " catch", 8);
        goto L66
    L22:
        r12 = new Exception(th);
    L14:
        th = th;
        r4 = 0;
    L10:
        e = move-exception;
        d r15 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L54;
        com.yandex.passport.common.logger.a.b(b.b, null, "call", e);
    L54:
        return s.i(e);
    L8:
        e = move-exception;
        d r16 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L67;
        com.yandex.passport.common.logger.a.b(b.b, null, "call", e);
    L67:
        return s.i(e);
    L12:
        e = move-exception;
        d r17 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L58;
        com.yandex.passport.common.logger.a.b(b.b, null, "call", e);
    L58:
        throw e;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        mqd.z(r1, "uri");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r2) {
        mqd.z(r2, "uri");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        mqd.z(r1, "uri");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L5;
        com.yandex.passport.common.logger.a.c(b.b, null, "onCreate", 8);
    L5:
        d = true;
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r1, String[] r2, String r3, String[] r4, String r5) {
        mqd.z(r1, "uri");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        mqd.z(r1, "uri");
        throw new UnsupportedOperationException();
    }
}
