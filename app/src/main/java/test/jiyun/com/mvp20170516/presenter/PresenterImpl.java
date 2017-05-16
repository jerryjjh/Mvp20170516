package test.jiyun.com.mvp20170516.presenter;

import test.jiyun.com.mvp20170516.model.ModelImpl;
import test.jiyun.com.mvp20170516.model.ModelInterface;
import test.jiyun.com.mvp20170516.view.ViewLenstner;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/5/16
 */

public class PresenterImpl implements PresenterLenster {
    private ViewLenstner viewLenstner;
    private ModelInterface modelInterface;

    public PresenterImpl(ViewLenstner viewLenstner) {
        this.viewLenstner = viewLenstner;
        this.modelInterface = new ModelImpl();
    }

    @Override
    public void dianjidenglu(String name, String psw) {

        modelInterface.chulishuju(name, psw, this);

    }

    @Override
    public void success() {

        viewLenstner.chengong();

    }

    @Override
    public void failed() {

        viewLenstner.shibai();
    }
}
