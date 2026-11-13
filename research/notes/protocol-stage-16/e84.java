package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.LongSparseArray;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReadMarker;
import com.yandex.messaging.core.net.entities.proto.message.Report;
import com.yandex.messaging.core.net.entities.proto.message.SeenMarker;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class e84 extends vx6 {
    public final /* synthetic */ int e;
    public long f;
    public Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ e84(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public final ClientMessage L() {
        switch (this.e) {
            case 0:
                ((r7j) ((pb5) this.g).d).getClass();
                this.f = SystemClock.elapsedRealtime();
                return new ClientMessage(null, null, null, null, null, null, null, null, (Report) this.h, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435199, null);
            case 1:
                ((r7j) ((b7j) this.g).b.get()).getClass();
                this.f = SystemClock.elapsedRealtime();
                SeenMarkerEntity seenMarkerEntity = (SeenMarkerEntity) this.h;
                String str = seenMarkerEntity.c;
                mqd.y(str, "chatId");
                return new ClientMessage(null, null, new SeenMarker(str, seenMarkerEntity.a, seenMarkerEntity.b, seenMarkerEntity.d), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435451, null);
            default:
                aok aokVar = (aok) this.h;
                atl.s(aokVar.b.getLooper(), Looper.myLooper(), null);
                atl.s(aokVar.b.getLooper(), Looper.myLooper(), null);
                ReadMarker readMarker = new ReadMarker();
                readMarker.chatId = aokVar.a;
                LongSparseArray longSparseArray = aokVar.c;
                readMarker.timestamps = new long[longSparseArray.size()];
                int size = longSparseArray.size();
                for (int i = 0; i < size; i++) {
                    readMarker.timestamps[i] = longSparseArray.keyAt(i);
                }
                this.g = readMarker;
                ((bok) this.i).c.getClass();
                this.f = SystemClock.elapsedRealtime();
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (ReadMarker) this.g, null, null, null, null, null, null, null, null, null, false, 0, false, 268402687, null);
        }
    }

    public final void S(PostMessageResponse postMessageResponse) {
        switch (this.e) {
            case 0:
                mqd.z(postMessageResponse, "response");
                ((r7j) ((pb5) this.g).d).c(this.f, "time2ack_report");
                ((xfg) this.i).run();
                return;
            case 1:
                mqd.z(postMessageResponse, "response");
                b7j b7jVar = (b7j) this.g;
                atl.s(b7jVar.d, Looper.myLooper(), null);
                ((r7j) b7jVar.b.get()).a(this.f, "time2ack_seen_marker");
                HashMap map = b7jVar.e;
                String str = (String) this.i;
                map.remove(str);
                b7jVar.f.F(str);
                return;
            default:
                mqd.z(postMessageResponse, "response");
                aok aokVar = (aok) this.h;
                aokVar.e = null;
                ReadMarker readMarker = (ReadMarker) this.g;
                if (readMarker == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                long j = this.f;
                LongSparseArray longSparseArray = aokVar.c;
                long[] jArr = readMarker.timestamps;
                mqd.y(jArr, "timestamps");
                for (long j2 : jArr) {
                    longSparseArray.remove(j2);
                }
                if (longSparseArray.size() == 0) {
                    return;
                }
                aokVar.f.c.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                Random random = new Random();
                int i = bok.e;
                int i2 = bok.d;
                long jMax = (long) Math.max(0.0d, ((long) (random.nextInt(i - i2) + i2)) - jElapsedRealtime);
                znk znkVar = new znk(aokVar, 1);
                aokVar.d = znkVar;
                aokVar.b.postDelayed(znkVar, jMax);
                return;
        }
    }

    public e84(aok aokVar, bok bokVar) {
        this.e = 2;
        this.h = aokVar;
        this.i = bokVar;
    }
}
