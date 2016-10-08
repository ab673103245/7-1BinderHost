package qianfeng.a7_1binderhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Binder是一种架构，分为三个模块：Binder服务端、Binder驱动、 Binder客户端
 * 服务端：
 * 当初始化一个服务端的Binder之后，服务端会启动一个隐藏的线程，该线程用来接收客户端传递来的消息，当接收到消息之后，
 * 会回调服务端的onTranscat方法
 * 每当有一个服务端Binder启动，Binder驱动就会实例化一个mRemote对象，
 * mRemote对象是客户端Binder和服务端Binder之间通信的桥梁
 * mRemote对象就是客户端Binder和服务端Binder之间通信的桥梁
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
