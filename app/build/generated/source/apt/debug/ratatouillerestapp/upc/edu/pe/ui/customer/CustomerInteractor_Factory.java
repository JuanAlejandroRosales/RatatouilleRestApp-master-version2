package ratatouillerestapp.upc.edu.pe.ui.customer;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomerInteractor_Factory implements Factory<CustomerInteractor> {
  private final MembersInjector<CustomerInteractor> customerInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public CustomerInteractor_Factory(
      MembersInjector<CustomerInteractor> customerInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert customerInteractorMembersInjector != null;
    this.customerInteractorMembersInjector = customerInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public CustomerInteractor get() {
    return MembersInjectors.injectMembers(
        customerInteractorMembersInjector,
        new CustomerInteractor(preferencesHelperProvider.get(), apiHelperProvider.get()));
  }

  public static Factory<CustomerInteractor> create(
      MembersInjector<CustomerInteractor> customerInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new CustomerInteractor_Factory(
        customerInteractorMembersInjector, preferencesHelperProvider, apiHelperProvider);
  }
}
