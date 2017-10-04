package ratatouillerestapp.upc.edu.pe.ui.splash;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.db.repository.OptionRepository;
import ratatouillerestapp.upc.edu.pe.data.db.repository.QuestionRepository;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashInteractor_Factory implements Factory<SplashInteractor> {
  private final MembersInjector<SplashInteractor> splashInteractorMembersInjector;

  private final Provider<Context> contextProvider;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<QuestionRepository> questionRepositoryProvider;

  private final Provider<OptionRepository> optionRepositoryProvider;

  public SplashInteractor_Factory(
      MembersInjector<SplashInteractor> splashInteractorMembersInjector,
      Provider<Context> contextProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<QuestionRepository> questionRepositoryProvider,
      Provider<OptionRepository> optionRepositoryProvider) {
    assert splashInteractorMembersInjector != null;
    this.splashInteractorMembersInjector = splashInteractorMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
    assert questionRepositoryProvider != null;
    this.questionRepositoryProvider = questionRepositoryProvider;
    assert optionRepositoryProvider != null;
    this.optionRepositoryProvider = optionRepositoryProvider;
  }

  @Override
  public SplashInteractor get() {
    return MembersInjectors.injectMembers(
        splashInteractorMembersInjector,
        new SplashInteractor(
            contextProvider.get(),
            preferencesHelperProvider.get(),
            apiHelperProvider.get(),
            questionRepositoryProvider.get(),
            optionRepositoryProvider.get()));
  }

  public static Factory<SplashInteractor> create(
      MembersInjector<SplashInteractor> splashInteractorMembersInjector,
      Provider<Context> contextProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<QuestionRepository> questionRepositoryProvider,
      Provider<OptionRepository> optionRepositoryProvider) {
    return new SplashInteractor_Factory(
        splashInteractorMembersInjector,
        contextProvider,
        preferencesHelperProvider,
        apiHelperProvider,
        questionRepositoryProvider,
        optionRepositoryProvider);
  }
}
