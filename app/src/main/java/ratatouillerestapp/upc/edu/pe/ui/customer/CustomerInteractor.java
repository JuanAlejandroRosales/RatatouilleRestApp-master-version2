package ratatouillerestapp.upc.edu.pe.ui.product;

import javax.inject.Inject;

import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.base.BaseInteractor;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpInteractor;


/**
 * Created by frank on 03/10/17.
 */

public class CustomerInteractor extends BaseInteractor implements CustomerMvpInteractor {

    @Inject
    public CustomerInteractor(PreferencesHelper preferencesHelper,
                           ApiHelper apiHelper) {

        super(preferencesHelper, apiHelper);
    }
}
