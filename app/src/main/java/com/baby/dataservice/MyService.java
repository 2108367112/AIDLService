package com.baby.dataservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    public MyService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return new BabyIBinder();
    }

    class BabyIBinder extends com.baby.dataservice.BabyAidlInterface.Stub {

        @Override
        public String getBabyName(int babyId) throws RemoteException {
            String name ;
            switch (babyId) {
                case 1:
                    name = "隔壁老黄";
                    break;
                case 2:
                    name = "大同";
                    break;
                case 3:
                    name = "小霞";
                    break;
                default:
                    name = "Id不存在";
                    break;
            }
            return name;
        }
    }

    //A同学加入开发
    //B同学加入开发
}
