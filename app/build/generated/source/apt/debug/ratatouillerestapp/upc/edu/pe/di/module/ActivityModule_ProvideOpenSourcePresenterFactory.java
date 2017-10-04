package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourcePresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideOpenSourcePresenterFactory
    implements Factory<OpenSourceMvpPresenter<OpenSourceMvpView, OpenSourceMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<OpenSourcePresenter<OpenSourceMvpView, OpenSourceMvpInteractor>>
      presenterProvider;

  public ActivityModule_ProvideOpenSourcePresenterFactory(
      ActivityModule module,
      Provider<OpenSourcePresenter<OpenSourceMvpView, OpenSourceMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public OpenSourceMvpPresenter<OpenSourceMvpView, OpenSourceMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideOpenSourcePresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OpenSourceMvpPresenter<OpenSourceMvpView, OpenSourceMvpInteractor>> create(
      ActivityModule module,
      Provider<OpenSourcePresenter<OpenSourceMvpView, OpenSourceMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideOpenSourcePresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideOpenSourcePresenter(OpenSourcePresenter)}. */
  public static OpenSourceMvpPresenter<OpenSourceMvpView, OpenSourceMvpInteractor>
      proxyProvideOpenSourcePresenter(
          ActivityModule instance,
          OpenSourcePresenter<OpenSourceMvpView, OpenSourceMvpInteractor> presenter) {
    return instance.provideOpenSourcePresenter(presenter);
  }
}
