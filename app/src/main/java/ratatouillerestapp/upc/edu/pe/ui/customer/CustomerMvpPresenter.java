package ratatouillerestapp.upc.edu.pe.ui.customer;

import ratatouillerestapp.upc.edu.pe.di.PerActivity;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpView;
import ratatouillerestapp.upc.edu.pe.ui.base.MvpPresenter;

/**
 * Created by frank on 03/10/17.
 */
@PerActivity
public interface CustomerMvpPresenter <V extends CustomerMvpView,
        I extends CustomerMvpInteractor> extends MvpPresenter<V, I> {
}
