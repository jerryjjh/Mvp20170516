package test.jiyun.com.mvp20170516.model;

import android.os.Handler;
import android.text.TextUtils;

import test.jiyun.com.mvp20170516.presenter.PresenterLenster;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/5/16
 */

public class ModelImpl implements ModelInterface {


    @Override
    public void chulishuju(final String name, final String psw, final PresenterLenster lenster) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(name)) {

                    lenster.failed();
                }
                if (TextUtils.isEmpty(psw)) {
                    lenster.failed();
                } else if(!TextUtils.isEmpty(name)&&!TextUtils.isEmpty(psw)){
                    lenster.success();
                }


            }
        }, 2000);
    }
}
