package ratatouillerestapp.upc.edu.pe.ui.login;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.db.repository.UserRepository;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginInteractor_Factory implements Factory<LoginInteractor> {
  private final MembersInjector<LoginInteractor> loginInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public LoginInteractor_Factory(
      MembersInjector<LoginInteractor> loginInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<UserRepository> userRepositoryProvider) {
    assert loginInteractorMembersInjector != null;
    this.loginInteractorMembersInjector = loginInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
    assert userRepositoryProvider != null;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public LoginInteractor get() {
    return MembersInjectors.injectMembers(
        loginInteractorMembersInjector,
        new LoginInteractor(
            preferencesHelperProvider.get(),
            apiHelperProvider.get(),
            userRepositoryProvider.get()));
  }

  public static Factory<LoginInteractor> create(
      MembersInjector<LoginInteractor> loginInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new LoginInteractor_Factory(
        loginInteractorMembersInjector,
        preferencesHelperProvider,
        apiHelperProvider,
        userRepositoryProvider);
  }
}
