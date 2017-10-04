package ratatouillerestapp.upc.edu.pe.ui.product;

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
public final class ProductInteractor_Factory implements Factory<ProductInteractor> {
  private final MembersInjector<ProductInteractor> productInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public ProductInteractor_Factory(
      MembersInjector<ProductInteractor> productInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert productInteractorMembersInjector != null;
    this.productInteractorMembersInjector = productInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public ProductInteractor get() {
    return MembersInjectors.injectMembers(
        productInteractorMembersInjector,
        new ProductInteractor(preferencesHelperProvider.get(), apiHelperProvider.get()));
  }

  public static Factory<ProductInteractor> create(
      MembersInjector<ProductInteractor> productInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new ProductInteractor_Factory(
        productInteractorMembersInjector, preferencesHelperProvider, apiHelperProvider);
  }
}
