package ratatouillerestapp.upc.edu.pe.ui.base;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseInteractor_Factory implements Factory<BaseInteractor> {
  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public BaseInteractor_Factory(
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public BaseInteractor get() {
    return new BaseInteractor(preferencesHelperProvider.get(), apiHelperProvider.get());
  }

  public static Factory<BaseInteractor> create(
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new BaseInteractor_Factory(preferencesHelperProvider, apiHelperProvider);
  }
}
