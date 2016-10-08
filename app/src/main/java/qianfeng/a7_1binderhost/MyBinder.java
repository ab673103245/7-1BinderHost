package qianfeng.a7_1binderhost;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/**
 * Created by Administrator on 2016/10/8 0008.
 */
public class MyBinder extends Binder {

    //1.用来区分调用服务端的哪个方法
    //2.客户端传来的参数
    //3.服务端返回给客户端的参数
    //4. 0表示双向调用，1表示单向调用
    @Override
    protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {

        switch (code) {
            case 1:
                data.enforceInterface("MyBinder");
                int a = data.readInt();
                Log.d("google-my:", "onTransact: a:" + a);
                int b = data.readInt();
                Log.d("google-my:", "onTransact: b:"+b);
                int add = add(a, b);
                reply.writeInt(add);
                return true; // return true 证明事件已经完成了
        }

        return super.onTransact(code, data, reply, flags);
    }

    public int add(int a, int b) { // 注意这里的修饰符一定是public，外界要调用嘛
        Log.d("google-my:", "add: " + (a+b));
        return a + b;
    }


}
