package ratatouillerestapp.upc.edu.pe.ui.reservation;

import javax.inject.Inject;

import ratatouillerestapp.upc.edu.pe.data.db.repository.UserRepository;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;
import ratatouillerestapp.upc.edu.pe.ui.base.BaseInteractor;

/**
 * Created by Juan Alejandro on 6/10/2017.
 */

public class ReservationInteractor extends BaseInteractor implements ReservationMvpInteractor {

    private UserRepository mUserRepository;

    @Inject
    public ReservationInteractor(PreferencesHelper preferencesHelper,
                           ApiHelper apiHelper,
                           UserRepository userRepository) {

        super(preferencesHelper, apiHelper);
        mUserRepository = userRepository;
    }

}
