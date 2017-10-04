package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpView;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideSplashPresenterFactory
    implements Factory<SplashMvpPresenter<SplashMvpView, SplashMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<SplashPresenter<SplashMvpView, SplashMvpInteractor>> presenterProvider;

  public ActivityModule_ProvideSplashPresenterFactory(
      ActivityModule module,
      Provider<SplashPresenter<SplashMvpView, SplashMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public SplashMvpPresenter<SplashMvpView, SplashMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideSplashPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashMvpPresenter<SplashMvpView, SplashMvpInteractor>> create(
      ActivityModule module,
      Provider<SplashPresenter<SplashMvpView, SplashMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideSplashPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideSplashPresenter(SplashPresenter)}. */
  public static SplashMvpPresenter<SplashMvpView, SplashMvpInteractor> proxyProvideSplashPresenter(
      ActivityModule instance, SplashPresenter<SplashMvpView, SplashMvpInteractor> presenter) {
    return instance.provideSplashPresenter(presenter);
  }
}
