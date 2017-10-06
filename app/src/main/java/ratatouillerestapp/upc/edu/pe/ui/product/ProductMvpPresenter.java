package ratatouillerestapp.upc.edu.pe.ui.product;

import ratatouillerestapp.upc.edu.pe.di.PerActivity;
import ratatouillerestapp.upc.edu.pe.ui.base.MvpPresenter;

/**
 * Created by frank on 03/10/17.
 */
@PerActivity
public interface ProductMvpPresenter  <V extends ProductMvpView,
        I extends ProductMvpInteractor> extends MvpPresenter<V, I> {
}
