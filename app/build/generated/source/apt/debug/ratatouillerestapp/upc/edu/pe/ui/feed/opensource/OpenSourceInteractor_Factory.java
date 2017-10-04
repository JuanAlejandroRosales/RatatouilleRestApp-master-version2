package ratatouillerestapp.upc.edu.pe.ui.feed.opensource;

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
public final class OpenSourceInteractor_Factory implements Factory<OpenSourceInteractor> {
  private final MembersInjector<OpenSourceInteractor> openSourceInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public OpenSourceInteractor_Factory(
      MembersInjector<OpenSourceInteractor> openSourceInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert openSourceInteractorMembersInjector != null;
    this.openSourceInteractorMembersInjector = openSourceInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public OpenSourceInteractor get() {
    return MembersInjectors.injectMembers(
        openSourceInteractorMembersInjector,
        new OpenSourceInteractor(preferencesHelperProvider.get(), apiHelperProvider.get()));
  }

  public static Factory<OpenSourceInteractor> create(
      MembersInjector<OpenSourceInteractor> openSourceInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new OpenSourceInteractor_Factory(
        openSourceInteractorMembersInjector, preferencesHelperProvider, apiHelperProvider);
  }
}
