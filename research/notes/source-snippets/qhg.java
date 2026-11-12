package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class qhg implements mgn, z4k, qgn, t91 {
    public final aco a;
    public final bmc b;
    public boolean c;
    public nb1 d;
    public wc1 e;
    public boolean f;
    public f18 g;
    public final /* synthetic */ rhg h;

    public qhg(rhg rhgVar, aco acoVar) {
        this.h = rhgVar;
        this.a = acoVar;
        cmc cmcVar = rhgVar.b;
        cmcVar.getClass();
        this.b = new bmc(cmcVar, this, cmcVar.a, ((wck) cmcVar.d.get()).c);
        rhgVar.c.a(this);
    }

    @Override // defpackage.qgn
    public final cw3 a(lib libVar) {
        String strValueOf;
        String string;
        rhg rhgVar = this.h;
        Looper looper = rhgVar.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Build request on wrong thread");
        }
        atl.o(null, this.c);
        wc1 wc1Var = this.e;
        if (wc1Var == null) {
            cw3.T.getClass();
            return hlk.b;
        }
        nb1 nb1Var = this.d;
        if (nb1Var == null || (strValueOf = String.valueOf(nb1Var.b)) == null) {
            strValueOf = rhgVar.h.a;
        }
        if (wc1Var.h() && !this.f) {
            String strG = wc1Var.g();
            mqd.y(strG, "getRawValue(...)");
            libVar.invoke(new v4s(strValueOf, strG));
            return null;
        }
        c4s c4sVar = rhgVar.i;
        isd isdVar = new isd(12, libVar);
        c4sVar.getClass();
        mqd.z(strValueOf, "user");
        atl.s(c4sVar.d, Looper.myLooper(), null);
        SharedPreferences sharedPreferences = c4sVar.a;
        String string2 = sharedPreferences.getString("xiva_secret_user", null);
        w4s w4sVar = (string2 == null || (string = sharedPreferences.getString("xiva_secret_sign", null)) == null) ? null : new w4s(string2, string, sharedPreferences.getLong("xiva_secret_ts", 0L));
        if (w4sVar != null && w4sVar.a.equals(strValueOf)) {
            long j = w4sVar.c;
            c4sVar.b.getClass();
            if (j > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                isdVar.invoke(w4sVar);
                return null;
            }
        }
        c4sVar.e.b(isdVar);
        if (c4sVar.f == null) {
            y8q y8qVar = c4sVar.c;
            wzr wzrVar = new wzr(7, c4sVar, strValueOf);
            y8qVar.getClass();
            c4sVar.f = ((bf1) y8qVar.b).a(wq1.g("toString(...)"), new idl(y8qVar, strValueOf, wzrVar, 3), saa.c);
        }
        return new ew3(new udr(5, c4sVar, isdVar), 0);
    }

    @Override // defpackage.mgn
    public final void b(String str) {
        mqd.z(str, "reason");
        this.b.b(str);
    }

    @Override // defpackage.mgn
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.mgn
    public final void close() throws IOException {
        f18 f18Var = this.g;
        if (f18Var != null) {
            f18Var.close();
        }
        this.b.close();
    }

    @Override // defpackage.qgn
    public final boolean d() {
        aco acoVar = this.a;
        atl.s(acoVar.C, Looper.myLooper(), null);
        return !acoVar.D.isEmpty();
    }

    @Override // defpackage.z4k
    public final void e() throws IOException {
        Looper looper = this.h.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Profile removed on wrong thread");
        }
        this.c = true;
        f18 f18Var = this.g;
        if (f18Var != null) {
            f18Var.close();
        }
        this.b.close();
    }

    @Override // defpackage.mgn
    public final cw3 f(sgn sgnVar, taa taaVar) {
        Looper looper = this.h.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Call made on wrong thread");
        }
        if (!this.c) {
            return this.b.f(sgnVar, taaVar);
        }
        cw3.T.getClass();
        return hlk.b;
    }

    @Override // defpackage.t91
    public final void g(xc1 xc1Var, boolean z) {
        mqd.z(xc1Var, "header");
        rhg rhgVar = this.h;
        Looper looper = rhgVar.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Authorization header on wrong thread");
        }
        atl.o(null, this.c);
        wc1 wc1VarB = xc1Var.d() ? xc1Var.b() : null;
        this.e = wc1VarB;
        this.d = rhgVar.a;
        if (wc1VarB != null) {
            bmc bmcVar = this.b;
            bmcVar.b("Authorization restart");
            if (d()) {
                bmcVar.p(tgn.Restart);
            }
        }
    }

    @Override // defpackage.qgn
    public final Long h() {
        aco acoVar = this.a;
        atl.s(acoVar.C, Looper.myLooper(), null);
        if (acoVar.D.isEmpty()) {
            return Long.valueOf(acoVar.G);
        }
        return null;
    }

    @Override // defpackage.qgn
    public final void i() {
        rhg rhgVar = this.h;
        Looper looper = rhgVar.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Connected on wrong thread");
        }
        bmc bmcVar = this.b;
        mqd.z(bmcVar, "connection");
        g2e g2eVar = new g2e();
        g2eVar.a = bmcVar;
        aco acoVar = this.a;
        acoVar.y.reportEvent("tech_sync_socket_connected");
        atl.s(acoVar.C, Looper.myLooper(), null);
        qt5 qt5Var = acoVar.m;
        atl.s(qt5Var.a, Looper.myLooper(), null);
        if (qt5Var.f == 0) {
            qt5Var.b.getClass();
            qt5Var.f = SystemClock.elapsedRealtime();
        }
        acoVar.g.b(g2eVar);
        acoVar.g();
        b7j b7jVar = (b7j) rhgVar.e.get();
        atl.s(b7jVar.d, Looper.myLooper(), null);
        if (b7jVar.g) {
            return;
        }
        b7jVar.g = true;
        for (zaj zajVar : b7jVar.f.A()) {
            b7jVar.a(zajVar.a, (SeenMarkerEntity) zajVar.b);
        }
    }

    @Override // defpackage.mgn
    public final boolean j() {
        return false;
    }

    @Override // defpackage.mgn
    public final String k() {
        return this.b.k();
    }

    @Override // defpackage.mgn
    public final void l(c8q c8qVar, ClientMessage clientMessage) {
        Looper looper = this.h.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Message posted on wrong thread");
        }
        if (!atl.u() && c8qVar != null) {
            atl.y("Unexpected uid in single-user connection");
        }
        if (this.c) {
            return;
        }
        this.b.l(null, clientMessage);
    }

    @Override // defpackage.qgn
    public final void m(String str) {
        rhg rhgVar = this.h;
        Looper looper = rhgVar.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Auth failed on wrong thread");
        }
        atl.o(null, this.c);
        wc1 wc1Var = this.e;
        if (wc1Var == null) {
            return;
        }
        if (!wc1Var.h() || this.f) {
            c4s c4sVar = rhgVar.i;
            atl.s(c4sVar.d, Looper.myLooper(), null);
            c4sVar.a.edit().remove("xiva_secret_user").remove("xiva_secret_sign").remove("xiva_secret_ts").apply();
        } else {
            this.f = true;
        }
        if (d()) {
            this.b.p(tgn.Restart);
        }
    }

    @Override // defpackage.qgn
    public final void n(long j, ServerMessage serverMessage) {
        rhg rhgVar = this.h;
        Looper looper = rhgVar.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Message received on wrong thread");
        }
        rhgVar.d.f(serverMessage);
    }

    @Override // defpackage.qgn
    public final void o() {
        Looper looper = this.h.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Disconnected on wrong thread");
        }
        aco acoVar = this.a;
        acoVar.y.reportEvent("tech_sync_socket_disconnected");
        atl.s(acoVar.C, Looper.myLooper(), null);
        acoVar.b();
        lnn lnnVar = (lnn) acoVar.A.e;
        if (lnnVar != null) {
            lnnVar.i((CancellationException) null);
        }
        qt5 qt5Var = acoVar.m;
        atl.s(qt5Var.a, Looper.myLooper(), null);
        if (qt5Var.f != 0 && qt5Var.e != 0) {
            long j = qt5Var.g;
            qt5Var.b.getClass();
            qt5Var.g = (SystemClock.elapsedRealtime() - Math.max(qt5Var.e, qt5Var.f)) + j;
        }
        qt5Var.f = 0L;
        acoVar.k.a = false;
        acoVar.q.a = false;
        sc7 sc7Var = acoVar.r;
        rym rymVar = sc7Var.e;
        y5e[] y5eVarArr = sc7.g;
        rymVar.B(sc7Var, y5eVarArr[0], (cw3) null);
        sc7Var.f.B(sc7Var, y5eVarArr[1], (cw3) null);
        acoVar.s.a();
        t0g t0gVar = acoVar.z;
        ne6.b(t0gVar.b);
        t0gVar.c.B(t0g.d[0], (Closeable) null);
        acoVar.g.b(null);
    }

    @Override // defpackage.mgn
    public final void p(tgn tgnVar) {
        rhg rhgVar = this.h;
        Looper looper = rhgVar.f.a;
        Looper looperMyLooper = Looper.myLooper();
        if (!atl.u()) {
            atl.s(looper, looperMyLooper, "Connection started on wrong thread");
        }
        atl.o(null, this.c);
        bmc bmcVar = this.b;
        bmcVar.p(tgnVar);
        if (bmcVar.j() && this.g == null) {
            this.g = rhgVar.g.f(this);
        }
    }

    @Override // defpackage.qgn
    public final void q(boolean z) {
        aco acoVar = this.a;
        acoVar.y.reportEvent("tech_sync_connection_started");
        uu5 uu5Var = acoVar.i;
        uu5Var.i = true;
        uu5Var.f();
        uu5Var.n = lo7.z(uu5Var.f, (ie6) null, (ze6) null, new ah4(uu5Var, (ic6) null, 14), 3);
        uu5Var.h();
    }
}
