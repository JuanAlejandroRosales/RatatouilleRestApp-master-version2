package ratatouillerestapp.upc.edu.pe.service;

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
public final class SyncInteractor_Factory implements Factory<SyncInteractor> {
  private final MembersInjector<SyncInteractor> syncInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public SyncInteractor_Factory(
      MembersInjector<SyncInteractor> syncInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert syncInteractorMembersInjector != null;
    this.syncInteractorMembersInjector = syncInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public SyncInteractor get() {
    return MembersInjectors.injectMembers(
        syncInteractorMembersInjector,
        new SyncInteractor(preferencesHelperProvider.get(), apiHelperProvider.get()));
  }

  public static Factory<SyncInteractor> create(
      MembersInjector<SyncInteractor> syncInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new SyncInteractor_Factory(
        syncInteractorMembersInjector, preferencesHelperProvider, apiHelperProvider);
  }
}
