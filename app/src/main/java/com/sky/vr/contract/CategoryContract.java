package com.sky.vr.contract;

import com.sky.vr.base.BasePresenter;
import com.sky.vr.base.BaseView;
import com.sky.vr.model.CategoryModel;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

/**
 * Created by sky on 16-9-28.
 */

public interface CategoryContract {

    interface View extends BaseView<Presenter> {

        void setCategory(int resId, List<CategoryModel.SubCategory> subCategories);
    }

    interface Presenter extends BasePresenter {

        void loadCategory();
    }
}