package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.core.net.entities.proto.message.HistoryTranslationDataFilter;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public abstract class kbg extends k8k {
    public final String k;
    public final tbg l;
    public final String m;
    public final String n;
    public final long o;
    public final x20 p;

    public kbg(String str, tbg tbgVar, String str2, String str3, long j, x20 x20Var) {
        mqd.z(str, "chatId");
        mqd.z(tbgVar, "range");
        mqd.z(x20Var, "analytics");
        this.k = str;
        this.l = tbgVar;
        this.m = str2;
        this.n = str3;
        this.o = j;
        this.p = x20Var;
    }

    public final ChatHistoryResponse R(HistoryResponse historyResponse) {
        mqd.z(historyResponse, "response");
        ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
        if (chatHistoryResponseArr != null) {
            for (ChatHistoryResponse chatHistoryResponse : chatHistoryResponseArr) {
                if (mqd.s(chatHistoryResponse.chatId, this.k)) {
                    return chatHistoryResponse;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: mnh */
    @Override // 
    /* JADX INFO: renamed from: S */
    public HistoryRequest v(int i, int i2) throws mnh {
        HistoryRequest historyRequest = new HistoryRequest();
        historyRequest.chatId = this.k;
        tbg tbgVar = this.l;
        sbg sbgVar = tbgVar.c;
        long j = tbgVar.a;
        long j2 = tbgVar.b;
        int iOrdinal = sbgVar.ordinal();
        long j3 = this.o;
        if (iOrdinal == 0) {
            historyRequest.limit = 1 + j3;
            historyRequest.offset = j3;
            historyRequest.maxTimestamp = j2;
            historyRequest.minTimestamp = j2;
        } else if (iOrdinal == 1) {
            historyRequest.limit = j3;
            historyRequest.offset = 0L;
            historyRequest.maxTimestamp = j + 1;
            historyRequest.minTimestamp = j2;
        } else {
            if (iOrdinal != 2) {
                throw new mnh();
            }
            historyRequest.limit = ((long) 2) * j3;
            historyRequest.offset = j3 + 1;
            historyRequest.maxTimestamp = j + 1;
            historyRequest.minTimestamp = j2;
        }
        historyRequest.inviteHash = this.m;
        String str = this.n;
        if (str != null) {
            historyRequest.translationDataFilter = new HistoryTranslationDataFilter(str, null);
        }
        historyRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        return historyRequest;
    }

    public void x(HistoryResponse historyResponse) {
        String chatId;
        ChatHistoryResponse chatHistoryResponse;
        mqd.z(historyResponse, "response");
        ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
        int length = chatHistoryResponseArr != null ? chatHistoryResponseArr.length : 0;
        boolean z = length <= 1;
        boolean zU = atl.u();
        String str = this.k;
        if (!zU && !z) {
            atl.y("queried messages for single chat " + str + ", but loaded history for " + length + " chats");
        }
        String str2 = null;
        x20 x20Var = this.p;
        if (length > 1) {
            ChatHistoryResponse[] chatHistoryResponseArr2 = historyResponse.chats;
            x20Var.reportEvent("tech_9225_multiple_chats_in_history", xgf.k0(new ypi[]{new ypi("chatsCount", Integer.valueOf(length)), new ypi("chats", chatHistoryResponseArr2 != null ? tt0.K0(chatHistoryResponseArr2, (String) null, new r1g(12), 31) : null), new ypi("queriedChat", str)}));
        }
        if (length == 1) {
            ChatHistoryResponse[] chatHistoryResponseArr3 = historyResponse.chats;
            if (chatHistoryResponseArr3 != null && (chatHistoryResponse = (ChatHistoryResponse) tt0.z0(chatHistoryResponseArr3)) != null) {
                str2 = chatHistoryResponse.chatId;
            }
            if (!atl.u()) {
                atl.n(str2, str, "chatIds must be same");
            }
            if (!mqd.s(str2, str)) {
                x20Var.reportEvent("tech_9225_incorrect_chat_answer", xgf.k0(new ypi[]{new ypi("queriedChatId", str), new ypi("responseChatId", str2)}));
            }
        }
        ChatHistoryResponse[] chatHistoryResponseArr4 = historyResponse.chats;
        if (chatHistoryResponseArr4 != null) {
            for (ChatHistoryResponse chatHistoryResponse2 : chatHistoryResponseArr4) {
                ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse2.messages;
                if (outMessageArr != null) {
                    for (ChatHistoryResponse.OutMessage outMessage : outMessageArr) {
                        PlainMessage plainMessage = outMessage.serverMessage.clientMessage.plain;
                        if (plainMessage != null && (chatId = plainMessage.getChatId()) != null) {
                            String str3 = chatHistoryResponse2.chatId;
                            if (!atl.u()) {
                                atl.n(str3, chatId, "ChatIds must be same");
                            }
                            if (!mqd.s(chatHistoryResponse2.chatId, chatId)) {
                                x20Var.reportEvent("tech_9225_incorrect_chat_id_in_messages", xgf.k0(new ypi[]{new ypi("queriedChatId", str), new ypi("responseChatId", chatHistoryResponse2.chatId), new ypi("msgChatId", chatId)}));
                            }
                        }
                    }
                }
            }
        }
    }
}
