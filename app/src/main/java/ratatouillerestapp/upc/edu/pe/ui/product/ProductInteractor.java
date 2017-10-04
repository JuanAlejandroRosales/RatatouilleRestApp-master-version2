package ratatouillerestapp.upc.edu.pe.ui.product;

import javax.inject.Inject;

import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;
import ratatouillerestapp.upc.edu.pe.ui.base.BaseInteractor;

/**
 * Created by frank on 03/10/17.
 */

public class ProductInteractor extends BaseInteractor implements ProductMvpInteractor {

    @Inject
    public ProductInteractor(PreferencesHelper preferencesHelper,
                              ApiHelper apiHelper) {

        super(preferencesHelper, apiHelper);
    }
}