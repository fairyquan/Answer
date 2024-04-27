import com.baidubce.qianfan.Qianfan;
import com.baidubce.qianfan.core.auth.Auth;
import com.baidubce.qianfan.model.chat.ChatResponse;

import java.io.*;
import java.util.*;


class Main{

    public static void main(String[] args) {
        Qianfan qianfan = new Qianfan(Auth.TYPE_OAUTH,"7FHwi01PApSOuu4OWQueYTAF", "qg9zR02g1fLZunRNpEBorDURsvTEpxet");
        ChatResponse response = qianfan.chatCompletion()
                .model("ERNIE-3.5-8K") // 使用model指定预置模型
                // .endpoint("completions_pro") // 也可以使用endpoint指定任意模型 (二选一)
                .addMessage("user", "写一首诗歌") // 添加用户消息 (此方法可以调用多次，以实现多轮对话的消息传递)
                .temperature(0.7) // 自定义超参数
                .execute(); // 发起请求
        System.out.println(response.getResult());
//        qianfan.chatCompletion()
//                .model("ERNIE-3.5-8K")
//                .addMessage("user", "你好")
//                .executeStream() // 发起流式请求
//                .forEachRemaining(chunk -> System.out.print(chunk.getResult())); // 流式迭代，并打印消息
    }


}