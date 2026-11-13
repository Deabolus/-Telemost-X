package defpackage;

import android.animation.ValueAnimator;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.Log;
import android.view.ViewGroup;
import androidx.core.app.y;
import com.google.protobuf.DescriptorProtos;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.telemost.ringing.MessengerTelemostRingingService;
import com.yx360.push.websocket.model.RetryPolicy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.RefCounted;
import org.webrtc.VideoSink;
import ru.yandex.goloom.lib.model.signaling.Message;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class t1i implements rja, a1j, gjb, m1o, RefCounted, od1, cih, z6r, j3i, h88, RetryPolicy, mxc {
    public Object a;
    public Object b;

    public /* synthetic */ t1i(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static own D(t1i t1iVar) {
        kc9 kc9Var;
        Object objValueOf;
        String str = (String) t1iVar.b;
        jwn jwnVar = (jwn) t1iVar.a;
        ws2 ws2Var = jwnVar.c;
        ws2Var.getClass();
        mwn mwnVar = mwn.b;
        kxn kxnVar = (kxn) new us2(ws2Var, str, new xrm(26), 4).d();
        if (kxnVar == null) {
            return null;
        }
        long j = kxnVar.g;
        long j2 = kxnVar.d;
        if (0 > j2 || j2 > 2147483647L || 0 > j || j >= 2) {
            throw new IllegalStateException("Check failed.");
        }
        String str2 = kxnVar.b;
        Object obj = null;
        boolean z = false;
        for (Object obj2 : jxn.i) {
            if (((jxn) obj2).a.equals(kxnVar.c)) {
                if (z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                obj = obj2;
                z = true;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        jxn jxnVar = (jxn) obj;
        int i = (int) j2;
        String str3 = kxnVar.e;
        String str4 = kxnVar.f;
        boolean z2 = j == 1;
        ws2 ws2Var2 = jwnVar.d;
        String str5 = kxnVar.b;
        ws2Var2.getClass();
        mqd.z(str5, "transition_id");
        String str6 = (String) new ry2(ws2Var2, str, str5, new wxn(16)).d();
        if (str6 != null) {
            Map map = s2e.h(m1e.d.e(str6)).a;
            kc9 linkedHashMap = new LinkedHashMap(ygf.e0(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                z3e z3eVarI = s2e.i((q2e) entry.getValue());
                if (z3eVarI.b()) {
                    objValueOf = z3eVarI.a();
                } else {
                    Object objE = s2e.e(z3eVarI);
                    if (objE == null) {
                        try {
                            objValueOf = Long.valueOf(s2e.j(z3eVarI));
                        } catch (n2e unused) {
                            objValueOf = null;
                        }
                        if (objValueOf == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        objValueOf = objE;
                    }
                }
                linkedHashMap.put(key, objValueOf);
            }
            kc9Var = linkedHashMap;
        } else {
            kc9Var = null;
        }
        if (kc9Var == null) {
            kc9Var = kc9.a;
        }
        return new own(str2, jxnVar, i, str3, str4, z2, kc9Var);
    }

    public void A(Message message) {
        jfd jfdVar = (jfd) this.b;
        mqd.z(message, "message");
        if (message.getHello() != null) {
            ((jfd) this.a).a(oed.c);
        } else if (message.getSubscriber_sdp_answer() != null) {
            jfdVar.b(q5j.b, cfd.c);
        } else if (message.getPublisher_sdp_offer() != null) {
            jfdVar.b(q5j.a, ffd.c);
        }
    }

    public void B(zh1 zh1Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", zh1Var.a);
            jSONObject.put("Status", qq3.E(zh1Var.b));
            jSONObject.put("AuthToken", zh1Var.c);
            jSONObject.put("RefreshToken", zh1Var.d);
            jSONObject.put("TokenCreationEpochInSecs", zh1Var.f);
            jSONObject.put("ExpiresInSecs", zh1Var.e);
            jSONObject.put("FisError", zh1Var.g);
            lta ltaVar = (lta) this.b;
            ltaVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", ltaVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(y())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean C(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.containsKey(str)) {
            return ((omq) linkedHashMap.get(str)).e;
        }
        return false;
    }

    public zh1 E() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(y());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = qq3.F(5)[iOptInt];
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new zh1(strOptString, i2, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void F(xxj xxjVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.a;
        dyj dyjVar = new dyj(xxjVar.a, q05.class);
        if (!map.containsKey(dyjVar)) {
            map.put(dyjVar, xxjVar);
            return;
        }
        xxj xxjVar2 = (xxj) map.get(dyjVar);
        if (xxjVar2.equals(xxjVar) && xxjVar.equals(xxjVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + dyjVar);
    }

    public void G(iyj iyjVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.b;
        if (iyjVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsB = iyjVar.b();
        if (!map.containsKey(clsB)) {
            map.put(clsB, iyjVar);
            return;
        }
        iyj iyjVar2 = (iyj) map.get(clsB);
        if (!iyjVar2.equals(iyjVar) || !iyjVar.equals(iyjVar2)) {
            throw new GeneralSecurityException(wqh.g(clsB, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
        }
    }

    public void H(own ownVar) {
        z3e z3eVarB;
        jwn jwnVar = (jwn) this.a;
        ws2 ws2Var = jwnVar.d;
        String str = (String) this.b;
        String str2 = ownVar.a;
        Map map = ownVar.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ygf.e0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                z3eVarB = s2e.c((String) value);
            } else if (value instanceof Boolean) {
                z3eVarB = s2e.a((Boolean) value);
            } else {
                if (!(value instanceof Number)) {
                    throw new IllegalStateException("Unsupported telemetry context value");
                }
                z3eVarB = s2e.b((Number) value);
            }
            linkedHashMap.put(key, z3eVarB);
        }
        String string = new s3e(linkedHashMap).toString();
        ws2Var.getClass();
        mqd.z(str2, "transition_id");
        mqd.z(string, "context_json");
        ((rb0) ((vw1) ws2Var).b).c(-1956680787, "INSERT OR REPLACE INTO storage_transition_context VALUES (?, ?, ?)", new svm(str, str2, string, 10));
        ws2Var.x(-1956680787, new wxn(18));
        ws2 ws2Var2 = jwnVar.c;
        String str3 = ownVar.b.a;
        long j = ownVar.c;
        String str4 = ownVar.d;
        String str5 = ownVar.e;
        long j2 = ownVar.f ? 1L : 0L;
        ws2Var2.getClass();
        mqd.z(str2, "transition_id");
        ((rb0) ((vw1) ws2Var2).b).c(2019052612, "INSERT OR REPLACE INTO storage_transition_marker\nVALUES (?, ?, ?, ?, ?, ?, ?)", new lwn(str, str2, j, j2, str3, str4, str5));
        ws2Var2.x(2019052612, new xrm(27));
    }

    public void I(String str, tqm tqmVar, qmq qmqVar, gi1 gi1Var, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.containsKey(str)) {
            omq omqVar = new omq(tqmVar, qmqVar, gi1Var, list);
            omq omqVar2 = (omq) linkedHashMap.get(str);
            omqVar.e = omqVar2.e;
            omqVar.f = omqVar2.f;
            linkedHashMap.put(str, omqVar);
        }
    }

    public void a(int i) {
        int i2;
        bv5 bv5Var = (bv5) this.b;
        if (i >= 40) {
            bv5Var.r(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        synchronized (((qmm) ((bbn) bv5Var).g)) {
            i2 = ((bbn) bv5Var).c;
        }
        bv5Var.r(i2 / 2);
    }

    public void b(String str) {
        mqd.z(str, "message");
        lha lhaVar = (lha) this.a;
        n6f n6fVar = (n6f) this.b;
        lhaVar.getClass();
        mqd.z(n6fVar, "level");
        x8f x8fVar = (x8f) lhaVar.a;
        x8fVar.getClass();
        if (n6fVar.a > x8fVar.g.a) {
            return;
        }
        x8fVar.d(x8fVar.a, str.toString(), n6fVar, (String) null);
    }

    public synchronized void c(VideoSink videoSink) {
        mqd.z(videoSink, "sink");
        ((WeakHashMap) this.b).put(videoSink, fcq.a);
        ((z6r) this.a).c(videoSink);
    }

    @Override // defpackage.rja
    public Object d(ic6 ic6Var) {
        return new eja(xo7.s(((doa) this.a).V((u1j) this.b)), kc9.a);
    }

    public boolean e(int i) {
        return !((Boolean) ((j8l) this.a).invoke()).booleanValue() && ((RetryPolicy) this.b).e(i);
    }

    @Override // defpackage.cih
    public void f(bih bihVar) {
        int i = bihVar.d;
        a30 a30Var = (a30) this.b;
        String message = bihVar.getMessage();
        if (message == null) {
            message = "";
        }
        ypi ypiVar = new ypi("message", message);
        String str = bihVar.c;
        a30Var.a("Network error", xgf.k0(new ypi[]{ypiVar, new ypi("requestId", str != null ? str : ""), new ypi("statusCode", Integer.valueOf(i))}));
        if (i == 401 || i == 302) {
            ((g6m) this.a).a();
        }
    }

    public synchronized void g(VideoSink videoSink) {
        mqd.z(videoSink, "sink");
        ((WeakHashMap) this.b).remove(videoSink);
        ((z6r) this.a).g(videoSink);
    }

    public void h(ValueAnimator valueAnimator) {
        vnd vndVar = new vnd();
        valueAnimator.addListener((r45) this.b);
        ((ArrayList) this.a).add(vndVar);
    }

    public Notification i() {
        y yVar = new y((Context) this.a, "ringing_calls_v5");
        yVar.g(2, true);
        yVar.N = true;
        yVar.M.icon = 2131233900;
        yVar.l = -1;
        yVar.z = "call";
        ssh sshVar = (ssh) this.b;
        long j = mil.u;
        MessengerTelemostRingingService.h.getClass();
        sshVar.a(yVar, s19.n(j), null, MessengerTelemostRingingService.j);
        Notification notificationB = yVar.b();
        mqd.y(notificationB, "build(...)");
        return notificationB;
    }

    @Override // defpackage.a1j
    public void j(Object obj) {
        ((f1j) this.b).a((e1j) obj, false);
    }

    public long k(int i) {
        return ((RetryPolicy) this.b).k(i);
    }

    public n1g l(m1g m1gVar) {
        qpk qpkVar = (qpk) ((bv5) this.b).i(m1gVar);
        if (qpkVar != null) {
            return new n1g(qpkVar.a, qpkVar.b);
        }
        return null;
    }

    @Override // defpackage.j3i
    public void m(int i) {
        bgi bgiVar = (bgi) this.a;
        sv5 sv5Var = bgiVar.f2;
        int i2 = i - bgiVar.g2;
        ImageMessageData imageMessageData = (ImageMessageData) this.b;
        Point pointA = sv5Var.a(i2, imageMessageData.width, imageMessageData.height);
        ViewGroup.LayoutParams layoutParams = bgiVar.Y1.getLayoutParams();
        layoutParams.width = pointA.x;
        layoutParams.height = pointA.y;
        bgiVar.Y1.setLayoutParams(layoutParams);
    }

    public void n(List list) {
        Set set = (Set) this.a;
        if (!set.addAll(list)) {
            Log.d("t1i", "endpointsAddedUpdate: No new endpoints to add, not updating client.");
        } else {
            ((ukm) this.b).j(zb5.Y0(zb5.x0(set)));
        }
    }

    @Override // defpackage.a1j
    public String name() {
        return "getToken";
    }

    @Override // defpackage.a1j
    public Object o(k0j k0jVar) {
        return new e1j(k0jVar.c((nb1) this.a).a);
    }

    public void onFailure(Throwable th) {
        ((fo3) this.a).c(th);
    }

    public void onSuccess(Object obj) {
        ((fo3) this.a).b((av3) this.b);
    }

    @Override // defpackage.od1
    public void p() {
        sdl sdlVar = (sdl) this.b;
        cw3.T.getClass();
        sdlVar.d = hlk.b;
    }

    public void q() {
        rsk rskVar = (rsk) this.a;
        synchronized (rskVar) {
            rskVar.c = rskVar.a.length;
        }
    }

    public void r(n52 n52Var, Bitmap bitmap) throws IOException {
        IOException iOException = ((y5a) this.b).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            n52Var.f(bitmap);
            throw iOException;
        }
    }

    public void release() {
        Runnable runnable;
        int iDecrementAndGet = ((AtomicInteger) this.a).decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("release() called on an object with refcount < 1");
        }
        if (iDecrementAndGet != 0 || (runnable = (Runnable) this.b) == null) {
            return;
        }
        runnable.run();
    }

    public void retain() {
        if (((AtomicInteger) this.a).incrementAndGet() < 2) {
            throw new IllegalStateException("retain() called on an object with refcount < 1");
        }
    }

    public void s(List list) {
        Set set = (Set) this.a;
        if (!set.removeAll(zb5.q1(list))) {
            Log.d("t1i", "endpointsRemovedUpdate: No tracked endpoints were removed, not updating client.");
        } else {
            ((ukm) this.b).j(zb5.Y0(zb5.x0(set)));
        }
    }

    public sqm t() {
        sqm sqmVar = new sqm();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            omq omqVar = (omq) entry.getValue();
            if (omqVar.e) {
                sqmVar.b(omqVar.a);
                arrayList.add((String) entry.getKey());
            }
        }
        iym.F("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.a));
        return sqmVar;
    }

    public void u(m1g m1gVar, Bitmap bitmap, Map map) {
        int i;
        int iK = vx6.K(bitmap);
        bv5 bv5Var = (bv5) this.b;
        synchronized (((qmm) ((bbn) bv5Var).g)) {
            i = ((bbn) bv5Var).b;
        }
        if (iK <= i) {
            bv5Var.n(m1gVar, new qpk(bitmap, map, iK));
        } else {
            bv5Var.o(m1gVar);
            ((x42) this.a).a0(m1gVar, bitmap, map, iK);
        }
    }

    @Override // defpackage.od1
    public void v(Bucket bucket) {
        ((sdl) this.b).b((RestrictionsBucket) bucket);
    }

    public Collection w() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            if (((omq) entry.getValue()).e) {
                arrayList.add(((omq) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection x() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            if (((omq) entry.getValue()).e) {
                arrayList.add(((omq) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public File y() {
        if (((File) this.a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.a) == null) {
                        lta ltaVar = (lta) this.b;
                        ltaVar.a();
                        this.a = new File(ltaVar.a.getFilesDir(), "PersistedInstallation." + ((lta) this.b).e() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.a;
    }

    @Override // defpackage.od1
    public void z() {
        ((sdl) this.b).a(1, (String) this.a);
    }

    public t1i(ell ellVar, lfg lfgVar) {
        mqd.z(ellVar, "router");
        mqd.z(lfgVar, "messengerEnvironment");
        this.a = ellVar;
        this.b = lfgVar;
    }

    public t1i(int i) {
        switch (i) {
            case 8:
                this.a = new HashMap();
                this.b = new HashMap();
                break;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                this.a = new ArrayList();
                this.b = new r45(this);
                break;
            case 28:
                this.a = wom.i(hz8.b);
                this.b = new lri(0);
                break;
            default:
                this.a = new Object();
                this.b = new LinkedHashMap();
                break;
        }
    }

    public t1i(Runnable runnable) {
        this.a = new AtomicInteger(1);
        this.b = runnable;
    }

    public t1i(eyj eyjVar) {
        this.a = new HashMap(eyjVar.a);
        this.b = new HashMap(eyjVar.b);
    }
}
