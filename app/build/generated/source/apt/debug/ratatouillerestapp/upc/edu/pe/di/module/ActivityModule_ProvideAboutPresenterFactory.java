package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpView;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideAboutPresenterFactory
    implements Factory<AboutMvpPresenter<AboutMvpView, AboutMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<AboutPresenter<AboutMvpView, AboutMvpInteractor>> presenterProvider;

  public ActivityModule_ProvideAboutPresenterFactory(
      ActivityModule module,
      Provider<AboutPresenter<AboutMvpView, AboutMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public AboutMvpPresenter<AboutMvpView, AboutMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideAboutPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AboutMvpPresenter<AboutMvpView, AboutMvpInteractor>> create(
      ActivityModule module,
      Provider<AboutPresenter<AboutMvpView, AboutMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideAboutPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideAboutPresenter(AboutPresenter)}. */
  public static AboutMvpPresenter<AboutMvpView, AboutMvpInteractor> proxyProvideAboutPresenter(
      ActivityModule instance, AboutPresenter<AboutMvpView, AboutMvpInteractor> presenter) {
    return instance.provideAboutPresenter(presenter);
  }
}
