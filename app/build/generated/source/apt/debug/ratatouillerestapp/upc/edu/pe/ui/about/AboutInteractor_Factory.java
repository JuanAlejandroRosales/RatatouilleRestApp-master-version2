package ratatouillerestapp.upc.edu.pe.ui.about;

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
public final class AboutInteractor_Factory implements Factory<AboutInteractor> {
  private final MembersInjector<AboutInteractor> aboutInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public AboutInteractor_Factory(
      MembersInjector<AboutInteractor> aboutInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert aboutInteractorMembersInjector != null;
    this.aboutInteractorMembersInjector = aboutInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public AboutInteractor get() {
    return MembersInjectors.injectMembers(
        aboutInteractorMembersInjector,
        new AboutInteractor(preferencesHelperProvider.get(), apiHelperProvider.get()));
  }

  public static Factory<AboutInteractor> create(
      MembersInjector<AboutInteractor> aboutInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new AboutInteractor_Factory(
        aboutInteractorMembersInjector, preferencesHelperProvider, apiHelperProvider);
  }
}
