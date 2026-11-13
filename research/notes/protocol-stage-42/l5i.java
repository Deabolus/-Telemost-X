package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class l5i {
    public final Looper a = Looper.myLooper();
    public final gkp b;
    public final it4 c;
    public final mgn d;
    public cw3 e;

    public l5i(gkp gkpVar, it4 it4Var, mgn mgnVar) {
        this.b = gkpVar;
        this.c = it4Var;
        this.d = mgnVar;
    }

    public static void a(l5i l5iVar, HistoryResponse historyResponse) {
        ChatHistoryResponse chatHistoryResponse = null;
        atl.s(l5iVar.a, Looper.myLooper(), null);
        String str = l5iVar.b.a.b;
        l5iVar.e = null;
        ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
        if (chatHistoryResponseArr == null || chatHistoryResponseArr.length == 0) {
            return;
        }
        for (ChatHistoryResponse chatHistoryResponse2 : chatHistoryResponseArr) {
            if (chatHistoryResponse2.chatId.equals(str)) {
                chatHistoryResponse = chatHistoryResponse2;
                break;
            }
        }
        if (chatHistoryResponse == null) {
            return;
        }
        l5iVar.c.h(chatHistoryResponse);
    }
}
