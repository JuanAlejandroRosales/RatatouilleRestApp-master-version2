package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpView;
import ratatouillerestapp.upc.edu.pe.ui.main.MainPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMainPresenterFactory
    implements Factory<MainMvpPresenter<MainMvpView, MainMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<MainPresenter<MainMvpView, MainMvpInteractor>> presenterProvider;

  public ActivityModule_ProvideMainPresenterFactory(
      ActivityModule module,
      Provider<MainPresenter<MainMvpView, MainMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public MainMvpPresenter<MainMvpView, MainMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideMainPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainMvpPresenter<MainMvpView, MainMvpInteractor>> create(
      ActivityModule module,
      Provider<MainPresenter<MainMvpView, MainMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideMainPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideMainPresenter(MainPresenter)}. */
  public static MainMvpPresenter<MainMvpView, MainMvpInteractor> proxyProvideMainPresenter(
      ActivityModule instance, MainPresenter<MainMvpView, MainMvpInteractor> presenter) {
    return instance.provideMainPresenter(presenter);
  }
}
