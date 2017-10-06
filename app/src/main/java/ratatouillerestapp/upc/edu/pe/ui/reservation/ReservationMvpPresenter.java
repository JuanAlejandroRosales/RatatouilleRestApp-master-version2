package ratatouillerestapp.upc.edu.pe.ui.reservation;

import ratatouillerestapp.upc.edu.pe.di.PerActivity;
import ratatouillerestapp.upc.edu.pe.ui.base.MvpPresenter;

/**
 * Created by Juan Alejandro on 6/10/2017.
 */
@PerActivity
public interface ReservationMvpPresenter<V extends ReservationMvpView,
        I extends ReservationMvpInteractor> extends MvpPresenter<V, I> {
}
